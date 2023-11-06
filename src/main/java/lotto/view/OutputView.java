package lotto.view;

import lotto.domain.Lottos;
import lotto.domain.Money;

public class OutputView {
    private static final String OUTPUT_BUY_MESSAGE = "%d개를 구매했습니다.";

    public static void printBuyLotto(Money money) {
        System.out.printf((OUTPUT_BUY_MESSAGE) + "%n", money.getTicket());
    }

    public static void printLottos(Lottos lottos) {
        lottos.getLottos().forEach(System.out::println);
        System.out.println();
    }
}
