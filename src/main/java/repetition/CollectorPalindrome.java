package repetition;

import java.util.*;
import java.util.stream.Collectors;

class CollectorPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Map<Boolean, List<String>> palindromeOrNo = Arrays.stream(words)
                .collect(Collectors.partitioningBy(a -> new StringBuilder(a).reverse().toString().equals(a)));

        palindromeOrNo = new LinkedHashMap<>(palindromeOrNo);

        System.out.println(palindromeOrNo);
    }
}
