package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AccountTest {

    @Test
    public void newAccountHasZeroBalance() {
		assertThat(new Account().getBalance(), is(0));
	}
}
