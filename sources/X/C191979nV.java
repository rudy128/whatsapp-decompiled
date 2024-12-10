package X;

import android.text.SpannableString;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9nV  reason: invalid class name and case insensitive filesystem */
public final class C191979nV {
    public final int A00;
    public final long A01;
    public final SpannableString A02;
    public final C18000vb A03;
    public final AnonymousClass1E7 A04;
    public final C184479b1 A05;
    public final ARR A06;
    public final AW0 A07;
    public final AnonymousClass1BI A08;
    public final ADQ A09;
    public final BD6 A0A;
    public final AnonymousClass21K A0B;
    public final CharSequence A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final HashMap A0N;
    public final List A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;

    public void A00(String str) {
        int i = 0;
        while (true) {
            List list = this.A0O;
            if (i >= list.size()) {
                return;
            }
            if (!str.equals(((AEZ) list.get(i)).A0A)) {
                i++;
            } else if (i > -1) {
                list.remove(i);
                return;
            } else {
                return;
            }
        }
    }

    public C191979nV(SpannableString spannableString, C18000vb r4, AnonymousClass1E7 r5, C184479b1 r6, ARR arr, AW0 aw0, AnonymousClass1BI r9, ADQ adq, BD6 bd6, AnonymousClass21K r12, CharSequence charSequence, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, HashMap hashMap, List list, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A0A = bd6;
        this.A0H = str3;
        this.A08 = r9;
        this.A00 = i;
        this.A01 = j;
        this.A06 = arr;
        this.A02 = spannableString;
        this.A0M = str4;
        this.A03 = r4;
        this.A0E = str5;
        this.A0K = str;
        this.A04 = r5;
        this.A0D = str2;
        this.A0J = str6;
        this.A0B = r12;
        this.A0S = z;
        this.A0C = charSequence;
        this.A0R = z2;
        this.A0Q = z3;
        this.A0O = list;
        this.A0L = str7;
        this.A0T = z4;
        this.A0V = z5;
        this.A0W = z6;
        this.A0G = str8;
        this.A0I = str9;
        this.A0F = str10;
        this.A07 = aw0;
        this.A0U = z7;
        this.A0N = hashMap;
        this.A0P = z8;
        this.A09 = adq;
        this.A05 = r6;
    }
}
