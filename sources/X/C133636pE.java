package X;

import java.util.regex.Matcher;

/* renamed from: X.6pE  reason: invalid class name and case insensitive filesystem */
public final class C133636pE {
    public final Matcher A00;
    public final AnonymousClass7TC A01 = new AnonymousClass7TC(this);
    public final CharSequence A02;

    public C25411Oc A00() {
        Matcher matcher = this.A00;
        return C28851b7.A08(matcher.start(), matcher.end());
    }

    public C133636pE A01() {
        Matcher matcher = this.A00;
        int end = matcher.end() + (AnonymousClass000.A1T(matcher.end(), matcher.start()) ? 1 : 0);
        CharSequence charSequence = this.A02;
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        C18070vi.A0X(matcher2);
        if (matcher2.find(end)) {
            return new C133636pE(charSequence, matcher2);
        }
        return null;
    }

    public C133636pE(CharSequence charSequence, Matcher matcher) {
        this.A00 = matcher;
        this.A02 = charSequence;
    }
}
