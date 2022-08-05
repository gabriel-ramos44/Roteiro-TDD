assertEquals(Money.franc(10), five.times(2));
assertEquals(Money.franc(15), five.times(3));
}

@Test
public void testCurrency() {
assertEquals("USD", Money.dollar(1).currency());
assertEquals("CHF", Money.franc(1).currency());
}
}

