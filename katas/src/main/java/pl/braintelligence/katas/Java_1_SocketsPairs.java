package pl.braintelligence.katas;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java_1_SocketsPairs {

    public int countNumberOfPairsLongVersion(int[] socketsColors) {
        List<Integer> colors = primitiveToIntegerList(socketsColors);

        var groupedColors = groupByColors(colors);

        var eachPairsGroupCounted = groupedColors.values()
                .stream()
                .map(countPairs())
                .mapToInt(Integer::intValue);

        return eachPairsGroupCounted.sum();
    }

    public int countNumberOfPairsShortVersion(int[] socketsColors) {
        return IntStream.of(socketsColors)
                .boxed()
                .collect(
                        Collectors.collectingAndThen(
                                Collectors.groupingBy(Integer::intValue),
                                map -> map.values().stream()))
                .mapToInt(list -> list.size() / 2)
                .sum();
    }

    private static List<Integer> primitiveToIntegerList(int[] socksColors) {
        return IntStream.of(socksColors)
                .boxed()
                .collect(Collectors.toList());
    }

    private static Function<List<Integer>, Integer> countPairs() {
        return e -> e.size() / 2;
    }

    private static Map<Integer, List<Integer>> groupByColors(List<Integer> integers) {
        return integers.stream()
                .collect(
                        Collectors.groupingBy(
                                Integer::intValue
                        )
                );
    }
}

