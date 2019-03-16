package com.rmurugaian.java;

import com.google.common.collect.ImmutableMap;

import java.util.function.BiFunction;

import static com.google.common.base.Verify.verify;

public class Calculator {

    private static final ImmutableMap<String, BiFunction<Long, Long, Long>> CALCULATOR =
            ImmutableMap.<String, BiFunction<Long, Long, Long>>builder()
                    .put("+", (first, second) -> first + second)
                    .put("-", (first, second) -> first - second)
                    .put("*", (first, second) -> first * second)
                    .put("/", (first, second) -> first / second)
                    .build();

    public static void main(String[] args) {

        verify(args.length == 3, "Calculator Need three arguments");

        String operation = args[0];
        verify(!CALCULATOR.containsKey(operation), "operation is not supported");

        final Long first = Long.valueOf(args[1]);
        final Long second = Long.valueOf(args[2]);

        System.out.println(CALCULATOR.get(operation).apply(first, second));

    }


}
