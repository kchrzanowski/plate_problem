package pl.codemode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlateUtilsTest {

    @Test
    void shouldThrowExceptionWhenIndexNegative() {
        var index = -1;
        var length = 6;
        Assertions.assertThrows(IllegalArgumentException.class, () -> PlateUtils.generate(length, index));
    }

    @Test
    void shouldThrowExceptionWhenLengthIsZero() {
        var index = -1;
        var length = 0;
        Assertions.assertThrows(IllegalArgumentException.class, () -> PlateUtils.generate(length, index));
    }

    @Test
    void shouldThrowExceptionWhenIndexIsGreaterThanPossibleCombinations() {
        var index = 36;
        var length = 1;
        Assertions.assertThrows(IllegalArgumentException.class, () -> PlateUtils.generate(length, index));
    }

    @Test
    void shouldGeneratePlateForIndex0AndLength6() {
        var expected = "000000";
        var length = 6;
        var index = 0;
        var result = PlateUtils.generate(length, index);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldGeneratePlateForIndex35AndLength6() {
        var expected = "00000Z";
        var length = 6;
        var index = 35;
        var result = PlateUtils.generate(length, index);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldGeneratePlateForIndex36AndLength6() {
        var expected = "00001Z";
        var length = 6;
        var index = 36;
        var result = PlateUtils.generate(length, index);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldGeneratePlateForIndex70AndLength6() {
        var expected = "0000ZZ";
        var length = 6;
        var index = 70;
        var result = PlateUtils.generate(length, index);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldGeneratePlateForIndex71AndLength6() {
        var expected = "0001ZZ";
        var length = 6;
        var index = 71;
        var result = PlateUtils.generate(length, index);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldGeneratePlateForIndex105AndLength6() {
        var expected = "000ZZZ";
        var length = 6;
        var index = 105;
        var result = PlateUtils.generate(length, index);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldGeneratePlateForIndex106AndLength6() {
        var expected = "001ZZZ";
        var length = 6;
        var index = 106;
        var result = PlateUtils.generate(length, index);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldGeneratePlateForIndex140AndLength6() {
        var expected = "00ZZZZ";
        var length = 6;
        var index = 140;
        var result = PlateUtils.generate(length, index);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldGeneratePlateForIndex141AndLength6() {
        var expected = "01ZZZZ";
        var length = 6;
        var index = 141;
        var result = PlateUtils.generate(length, index);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldGeneratePlateForIndex174AndLength6() {
        var expected = "0YZZZZ";
        var length = 6;
        var index = 174;
        var result = PlateUtils.generate(length, index);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldGeneratePlateForIndex175AndLength6() {
        var expected = "0ZZZZZ";
        var length = 6;
        var index = 175;
        var result = PlateUtils.generate(length, index);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldGeneratePlateForIndex176AndLength6() {
        var expected = "1ZZZZZ";
        var length = 6;
        var index = 176;
        var result = PlateUtils.generate(length, index);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldGeneratePlateForIndex210AndLength6() {
        var expected = "ZZZZZZ";
        var length = 6;
        var index = 176;
        var result = PlateUtils.generate(length, index);
        Assertions.assertEquals(expected, result);
    }
}