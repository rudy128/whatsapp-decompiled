package com.google.android.recaptcha;

import X.AnonymousClass000;
import X.AnonymousClass1Y1;
import X.AnonymousClass8BU;
import X.C18070vi;

public final class RecaptchaAction {
    public static final Companion Companion = new Object();
    public static final RecaptchaAction LOGIN = new RecaptchaAction("login");
    public static final RecaptchaAction SIGNUP = new RecaptchaAction("signup");
    public final String action;

    public final class Companion {
        public Companion() {
        }

        public final RecaptchaAction custom(String str) {
            return new RecaptchaAction(str);
        }

        public /* synthetic */ Companion(AnonymousClass1Y1 r1) {
        }
    }

    public RecaptchaAction(String str) {
        this.action = str;
    }

    public /* synthetic */ RecaptchaAction(String str, AnonymousClass1Y1 r2) {
        this(str);
    }

    public final String component1() {
        return this.action;
    }

    public final RecaptchaAction copy(String str) {
        return new RecaptchaAction(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RecaptchaAction) && C18070vi.A18(this.action, ((RecaptchaAction) obj).action));
    }

    public final String getAction() {
        return this.action;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    public static /* synthetic */ RecaptchaAction copy$default(RecaptchaAction recaptchaAction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recaptchaAction.action;
        }
        return new RecaptchaAction(str);
    }

    public static final RecaptchaAction custom(String str) {
        return new RecaptchaAction(str);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RecaptchaAction(action=");
        A10.append(this.action);
        return AnonymousClass8BU.A0q(A10);
    }
}
