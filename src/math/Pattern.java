package math;


//import gnu.trove.list.TIntList;;

import sun.security.ssl.SSLContextImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

//import org.numenta.nupic.util.MersenneTwister;


public class Pattern {

	//public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

	protected int numPatterns = 100;
	protected int n;
	protected int w;

	//protected TIntList wList;

	protected Random random;

	protected Map<Integer, LinkedHashSet<Integer>> patterns;

	protected static final int SEED = 42;
	protected static final int NUM_PATTERNS = 100;


	/**
	 * @param n   Number of available bits in pattern
	 * @param w   Number of on bits in pattern
	 *
	 * Constructs a new {@code PatternMachine}
	 */
	/*public PatternMachine(int n, int w) {
		this(n, w, NUM_PATTERNS, SEED);
	}

	/**
	 * @param n   Number of available bits in pattern
	 * @param w   Number of on bits in pattern
	 * @param num Number of available patterns
	 * @param seed Random seed
	 *
	 * Constructs a new {@code PatternMachine}
	 */
	/*public PatternMachine(int n, int w, int num, int seed) {
		this.n = n;
		this.w = w;
		this.numPatterns = num;
		random = new MersenneTwister(new int[] { seed });
		patterns = new LinkedHashMap<Integer, LinkedHashSet<Integer>>();

		generate();
	}

	/**
	 * @param n     Number of available bits in pattern
	 * @param w     Number of on bits in pattern, each pattern
	 *              will have a `w` randomly selected from the list.
	 * @param num   Number of available patterns
	 *
	 * Constructs a new {@code PatternMachine}
	 */
	/*public PatternMachine(int n, TIntList w, int num) {
		this(n, w, num, SEED);
	}

	/**
	 * @param n     Number of available bits in pattern
	 * @param w     Number of on bits in pattern, each pattern
	 *              will have a `w` randomly selected from the list.
	 * @param num   Number of available patterns
	 * @param seed  Random seed
	 *
	 * Constructs a new {@code PatternMachine}
	 */
	/*public PatternMachine(int n, TIntList w, int num, int seed) {
		this.n = n;
		this.wList = w;
		random = new MersenneTwister(new int[] { seed });
		patterns = new LinkedHashMap<Integer, LinkedHashSet<Integer>>();
		this.numPatterns = num;

		generate();
	}

	/**
	 * Generates a canned set of sequences
	 *
	 * @param n
	 * @param w
	 * @param num
	 * @param canned
	 */
	/*public PatternMachine(int n, int w, int num, boolean canned) {
		this.n = n;
		this.w = w;
		random = new MersenneTwister(new int[] { SEED });
		patterns = new LinkedHashMap<Integer, LinkedHashSet<Integer>>();
		this.numPatterns = num;

		generateCanned();
	}

	/**
	 * Instructs the PatternMachine to construct the internal patterns.
	 */
	/*public void generate() {
		LinkedHashSet<Integer> pattern;
		for(int i = 0;i < numPatterns;i++) {
			pattern = sortedMap(new ArrayList<Integer>((0, n)), w);
			patterns.put(i, pattern);
		}
	}

	/**
	 * Gets a value of "w" for use in generating a pattern.
	 * @return
	 */
	/*public int getW() {
		if(wList != null) {
			return wList.get(random.nextInt(wList.size()));
		}

		return w;
	}

	/**
	 * Returns the ordered set of indices of on bits.
	 *
	 * @param key
	 * @return
	 */
	public LinkedHashSet<Integer> get(int key) {
		return patterns.get(key);
	}

	/**
	 * Add noise to pattern
	 *
	 * @param bits      Indices of on bits
	 * @param amount    Probability of switching an on bit with a random bit
	 * @return  pattern with noise added
	 */
	public Set<Integer> addNoise(Set<Integer> bits, double amount) {
		LinkedHashSet<Integer> newBits = new LinkedHashSet<>();

		for(Integer bit : bits) {
			if(random.nextDouble() < amount) {
				newBits.add(random.nextInt(n));
			}else{
				newBits.add(bit);
			}
		}

		return newBits;
	}

	/**
	 * Returns a {@link Set} of indexes mapped to patterns
	 * which contain the specified bit.
	 *
	 * @param bit
	 * @return
	 */
	public LinkedHashSet<Integer> numbersForBit(int bit) {
		LinkedHashSet<Integer> retVal = new LinkedHashSet<Integer>();
		for(Integer i : patterns.keySet()) {
			if(patterns.get(i).contains(bit)) {
				retVal.add(i);
			}
		}

		return retVal;
	}

	/**
	 * Return a map from number to matching on bits,
	 * for all numbers that match a set of bits.
	 *
	 * @param bits
	 * @return
	 */
	public Map<Integer, Set<Integer>> numberMapForBits(Set<Integer> bits) {
		Map<Integer, Set<Integer>> numberMap = new TreeMap<Integer, Set<Integer>>();

		for(Integer bit : bits) {
			Set<Integer> numbers = numbersForBit(bit);

			for(Integer number : numbers) {
				Set<Integer> set = null;
				if((set = numberMap.get(number)) == null) {
					numberMap.put(number, set = new HashSet<Integer>());
				}
				set.add(bit);
			}
		}

		return numberMap;
	}

	public String prettyPrintPattern(Set<Integer> bits, int verbosity) {
		Map<Integer, Set<Integer>> numberMap = numberMapForBits(bits);
		String text = null;
		List<String> numberList = new ArrayList<String>();
		LinkedHashMap<Integer, LinkedHashSet<Integer>> numberItems = sortedMap(numberMap);
		for(Integer number : numberItems.keySet()) {
			String numberText = null;
			if(verbosity > 2) {
				numberText = number + " (bits: " + numberItems.get(number) + ")";
			}else if(verbosity > 1) {
				numberText = number + " (" + numberItems.get(number).size() + "bits)";
			}else{
				numberText = "" + number;
			}

			numberList.add(numberText);
		}

		text = numberList.toString();
		return text;
	}

	/**
	 * Returns a sorted map whose set entries are also sorted.
	 *
	 * @param map
	 * @return
	 */
	public LinkedHashMap<Integer, LinkedHashSet<Integer>> sortedMap(final Map<Integer, Set<Integer>> map) {
		LinkedHashMap<Integer, LinkedHashSet<Integer>> retVal = new LinkedHashMap<Integer, LinkedHashSet<Integer>>();

		List<Integer> sortByKeys = new ArrayList<Integer>(map.keySet());
		Collections.sort(sortByKeys, new Comparator<Integer>() {
			@Override public int compare(Integer arg0, Integer arg1) {
				int len0 = map.get(arg0).size();
				int len1 = map.get(arg1).size();
				return len0 == len1 ? 0 : len0 > len1 ? -1 : 1;
			}

		});
		for(Integer key : sortByKeys) {
			retVal.put(key, new LinkedHashSet<Integer>(map.get(key)));
		}

		return retVal;
	}}

