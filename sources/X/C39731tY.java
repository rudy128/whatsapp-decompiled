package X;

import android.view.View;

/* renamed from: X.1tY  reason: invalid class name and case insensitive filesystem */
public final class C39731tY {
    public static final Integer A00(int i) {
        if (i == 0) {
            return AnonymousClass00R.A01;
        }
        if (i == 4) {
            return AnonymousClass00R.A0N;
        }
        if (i == 8) {
            return AnonymousClass00R.A0C;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown visibility ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final Integer A01(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return AnonymousClass00R.A0N;
        }
        return A00(view.getVisibility());
    }
}
