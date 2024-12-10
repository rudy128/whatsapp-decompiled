package X;

import android.content.Context;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1zf  reason: invalid class name and case insensitive filesystem */
public abstract class C43351zf {
    public static final C43351zf A00 = new AnonymousClass2PD(1);
    public static final C43351zf A01 = new AnonymousClass2PD(2);
    public static final C43351zf A02 = new AnonymousClass2PD(3);
    public static final C43351zf A03 = new AnonymousClass2PD(0);
    public static final Map A04 = new ConcurrentHashMap();

    public void A04(Context context, Spannable spannable, int i, int i2) {
        int i3;
        int i4;
        int i5;
        switch (((AnonymousClass2PD) this).A00) {
            case 0:
                spannable.setSpan(new ForegroundColorSpan(C19740yt.A00(context, AnonymousClass1YL.A00(context, 2130971108, 2131102434))), i, i2, 33);
                return;
            case 1:
                i3 = 33;
                spannable.setSpan(new BackgroundColorSpan(C19740yt.A00(context, AnonymousClass1YL.A00(context, 2130969256, 2131100267))), i, i2, 33);
                i4 = 2130969257;
                i5 = 2131100268;
                break;
            case 2:
                i3 = 33;
                spannable.setSpan(new C22628BGo(), i, i2, 33);
                i4 = 2130969981;
                i5 = 2131101067;
                break;
            default:
                return;
        }
        spannable.setSpan(new ForegroundColorSpan(C19740yt.A00(context, AnonymousClass1YL.A00(context, i4, i5))), i, i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e8, code lost:
        r17 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ea, code lost:
        if (r0 == 0) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0142, code lost:
        if (r8 == null) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ca, code lost:
        r8 = r8;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C43361zg A00(android.content.Context r21, X.C18000vb r22, X.C43351zf r23, java.lang.CharSequence r24, java.util.List r25, boolean r26) {
        /*
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r20 = r24
            if (r24 == 0) goto L_0x014c
            r13 = r25
            if (r25 == 0) goto L_0x0144
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0144
            java.util.regex.Pattern r1 = X.C20103A7h.A01
            r0 = r20
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.lang.String r0 = " "
            java.lang.String r11 = r1.replaceAll(r0)
            java.text.BreakIterator r19 = X.C20103A7h.A02(r22)
            r0 = r19
            r0.setText(r11)
            int r10 = r19.first()
            int r9 = r19.next()
            r1 = -1
            r8 = 0
            r5 = 0
            r7 = -1
            r6 = 0
        L_0x0037:
            if (r9 == r1) goto L_0x0142
            java.lang.String r18 = r11.substring(r10, r9)
            r17 = 1
            if (r5 != 0) goto L_0x008b
            java.util.Locale r2 = r22.A0N()
            java.util.Map r1 = A04
            java.lang.Object r0 = r1.get(r2)
            java.lang.ThreadLocal r0 = (java.lang.ThreadLocal) r0
            if (r0 != 0) goto L_0x0057
            X.3Ed r0 = new X.3Ed
            r0.<init>(r2)
            r1.put(r2, r0)
        L_0x0057:
            java.lang.Object r5 = r0.get()
            X.C17960vV.A07(r5)
            java.text.Collator r5 = (java.text.Collator) r5
            int r0 = r13.size()
            java.text.CollationKey[] r6 = new java.text.CollationKey[r0]
            int r0 = r13.size()
            int r2 = r0 + -1
        L_0x006c:
            if (r2 < 0) goto L_0x008b
            java.lang.Object r1 = r13.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r13.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.text.CollationKey r0 = r5.getCollationKey(r0)
            r6[r2] = r0
            int r0 = r1.length()
            int r7 = java.lang.Math.max(r7, r0)
            int r2 = r2 + -1
            goto L_0x006c
        L_0x008b:
            X.1zf r0 = A01
            r1 = 0
            r14 = r23
            if (r14 == r0) goto L_0x00d1
            X.1zf r0 = A00
            if (r14 == r0) goto L_0x00d1
            int r0 = r18.length()
            int r16 = java.lang.Math.min(r0, r7)
            r4 = 1
            r17 = 0
        L_0x00a1:
            r0 = r16
            if (r4 > r0) goto L_0x00f7
            r0 = r18
            java.lang.String r0 = r0.substring(r1, r4)
            java.text.CollationKey r15 = r5.getCollationKey(r0)
            int r3 = r6.length
            r2 = 0
        L_0x00b1:
            if (r2 >= r3) goto L_0x00cd
            r0 = r6[r2]
            int r0 = r15.compareTo(r0)
            if (r0 != 0) goto L_0x00ca
            if (r8 != 0) goto L_0x00c1
            android.text.SpannableString r8 = android.text.SpannableString.valueOf(r20)
        L_0x00c1:
            int r1 = r10 + r4
            r0 = r21
            r14.A04(r0, r8, r10, r1)
            r17 = 1
        L_0x00ca:
            int r2 = r2 + 1
            goto L_0x00b1
        L_0x00cd:
            int r4 = r4 + 1
            r1 = 0
            goto L_0x00a1
        L_0x00d1:
            java.lang.String r4 = X.AnonymousClass1EG.A06(r18)
            r2 = 0
        L_0x00d6:
            int r0 = r6.length
            int r0 = r0 + -1
            if (r2 >= r0) goto L_0x0117
            r1 = r6[r2]
            java.text.CollationKey r0 = r5.getCollationKey(r4)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0114
            r0 = 1
        L_0x00e8:
            r17 = r0
            if (r0 == 0) goto L_0x00f7
        L_0x00ec:
            if (r8 != 0) goto L_0x00f2
            android.text.SpannableString r8 = android.text.SpannableString.valueOf(r20)
        L_0x00f2:
            r0 = r21
            r14.A04(r0, r8, r10, r9)
        L_0x00f7:
            if (r26 == 0) goto L_0x010b
            if (r17 == 0) goto L_0x010b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            X.0yx r0 = new X.0yx
            r0.<init>(r2, r1)
            r12.add(r0)
        L_0x010b:
            int r0 = r19.next()
            r10 = r9
            r1 = -1
            r9 = r0
            goto L_0x0037
        L_0x0114:
            int r2 = r2 + 1
            goto L_0x00d6
        L_0x0117:
            r0 = 0
            int r1 = r6.length
            int r1 = r1 + -1
            r3 = r6[r1]
            int r2 = r4.length()
            java.lang.String r1 = r3.getSourceString()
            int r1 = r1.length()
            int r2 = java.lang.Math.min(r2, r1)
            r1 = 1
        L_0x012e:
            if (r1 > r2) goto L_0x00e8
            java.lang.String r0 = r4.substring(r0, r1)
            java.text.CollationKey r0 = r5.getCollationKey(r0)
            int r0 = r0.compareTo(r3)
            if (r0 == 0) goto L_0x00ec
            int r1 = r1 + 1
            r0 = 0
            goto L_0x012e
        L_0x0142:
            if (r8 != 0) goto L_0x0146
        L_0x0144:
            r8 = r20
        L_0x0146:
            X.1zg r0 = new X.1zg
            r0.<init>(r8, r12)
            return r0
        L_0x014c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43351zf.A00(android.content.Context, X.0vb, X.1zf, java.lang.CharSequence, java.util.List, boolean):X.1zg");
    }

    public static CharSequence A01(Context context, C18000vb r7, CharSequence charSequence, List list) {
        C43361zg A002 = A00(context, r7, A00, charSequence, list, false);
        if (A002 != null) {
            return (CharSequence) A002.A00;
        }
        return null;
    }

    public static CharSequence A02(Context context, C18000vb r7, CharSequence charSequence, List list) {
        return (CharSequence) A00(context, r7, A01, charSequence, list, true).A00;
    }

    public static CharSequence A03(Context context, C18000vb r7, CharSequence charSequence, List list) {
        C43361zg A002 = A00(context, r7, A03, charSequence, list, false);
        if (A002 != null) {
            return (CharSequence) A002.A00;
        }
        return null;
    }
}
