package lotto.domain;

import java.util.function.BiPredicate;

public enum Prize {
    FIFTH(5_000,
            3,
            (matchedLottoNumber, containBonusNumber) -> matchedLottoNumber == 3),
    FOURTH(50_000,
            4,
            (matchLottoNumber, containBonusNumber) -> matchLottoNumber == 4),
    THIRD(1_500_000,
            5,
            (matchLottoNumber, containBonusNumber) -> matchLottoNumber == 5 && !containBonusNumber),
    SECOND(30_000_000,
            5,
            (matchLottoNumber, containBonusNumber) -> matchLottoNumber == 5 && containBonusNumber),
    FIRST(2_000_000_000,
            6,
            (matchLottoNumber, containBonusNumber) -> matchLottoNumber == 6);


    private final int money;
    private final int matchedLottoNumber;
    private final BiPredicate<Integer, Boolean> isMatch;

    Prize(final int money, final int matchedLottoNumber, final BiPredicate<Integer, Boolean> isMatch) {
        this.money = money;
        this.matchedLottoNumber = matchedLottoNumber;
        this.isMatch = isMatch;
    }


}
