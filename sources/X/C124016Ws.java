package X;

/* renamed from: X.6Ws  reason: invalid class name and case insensitive filesystem */
public abstract class C124016Ws {
    public static final C122716Rq A00(String str, String str2) {
        C18070vi.A0d(str, 0);
        if (str2.equals("en")) {
            int hashCode = str.hashCode();
            if (hashCode != 3121) {
                if (hashCode != 3246) {
                    if (hashCode != 3329) {
                        if (hashCode != 3588) {
                            if (hashCode == 3651 && str.equals("ru")) {
                                return C122716Rq.TRANSLATION_RU_TO_EN;
                            }
                        } else if (str.equals("pt")) {
                            return C122716Rq.TRANSLATION_PT_TO_EN;
                        }
                    } else if (str.equals("hi")) {
                        return C122716Rq.TRANSLATION_HI_TO_EN;
                    }
                } else if (str.equals("es")) {
                    return C122716Rq.TRANSLATION_ES_TO_EN;
                }
            } else if (str.equals("ar")) {
                return C122716Rq.TRANSLATION_AR_TO_EN;
            }
            throw AnonymousClass000.A0n("Unsupported language");
        } else if (str.equals("en")) {
            int hashCode2 = str2.hashCode();
            if (hashCode2 != 3121) {
                if (hashCode2 != 3246) {
                    if (hashCode2 != 3329) {
                        if (hashCode2 != 3588) {
                            if (hashCode2 == 3651 && str2.equals("ru")) {
                                return C122716Rq.TRANSLATION_EN_TO_RU;
                            }
                        } else if (str2.equals("pt")) {
                            return C122716Rq.TRANSLATION_EN_TO_PT;
                        }
                    } else if (str2.equals("hi")) {
                        return C122716Rq.TRANSLATION_EN_TO_HI;
                    }
                } else if (str2.equals("es")) {
                    return C122716Rq.TRANSLATION_EN_TO_ES;
                }
            } else if (str2.equals("ar")) {
                return C122716Rq.TRANSLATION_EN_TO_AR;
            }
            throw AnonymousClass000.A0n("Unsupported language");
        } else {
            throw AnonymousClass000.A0n("Unsupported language");
        }
    }
}
