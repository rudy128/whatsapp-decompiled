package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1gc  reason: invalid class name and case insensitive filesystem */
public final class C32091gc {
    public static final Pattern A0D = Pattern.compile("(@\\d+(?:(?:-\\d+)?@g\\.us)?)");
    public static final boolean A0E = Character.isDefined(8296);
    public static final boolean A0F = Character.isDefined(8297);
    public final AnonymousClass11S A00;
    public final AnonymousClass18O A01;
    public final C203411t A02;
    public final AnonymousClass1M9 A03;
    public final C24921Me A04;
    public final AnonymousClass118 A05;
    public final AnonymousClass1CJ A06;
    public final AnonymousClass1MZ A07;
    public final AnonymousClass1KW A08;
    public final C18030ve A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;

    public CharSequence A02(Context context, AnonymousClass206 r8, CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        List list = r8.A0h;
        if (list == null || list.isEmpty()) {
            return charSequence2;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        A06(context, valueOf, r8.A0v.A00, list, false);
        return valueOf;
    }

    public void A05(Context context, SpannableStringBuilder spannableStringBuilder, AnonymousClass1BI r36, List list, int i, boolean z, boolean z2, boolean z3) {
        C32091gc r8 = null;
        Context context2 = null;
        int i2 = 0;
        AnonymousClass1BI r29 = null;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        Context context3 = context;
        if (z) {
            z6 = true;
            r8 = this;
            context2 = context3;
            i2 = i;
            r29 = r36;
            z4 = z3;
            z5 = z2;
        }
        if (list != null && !list.isEmpty()) {
            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
            if (!TextUtils.isEmpty(spannableStringBuilder2)) {
                HashMap hashMap = new HashMap();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C70503Bi r3 = (C70503Bi) it.next();
                    if (r3 != null) {
                        hashMap.put(AnonymousClass4aJ.A00(r3), new C19760yx(r3, (Object) null));
                    }
                }
                Matcher matcher = A0D.matcher(spannableStringBuilder2);
                int i3 = 0;
                while (matcher.find()) {
                    String group = matcher.group();
                    C19760yx A002 = A00(this, group, hashMap);
                    if (A002 != null) {
                        Object obj = A002.A00;
                        if (obj == null) {
                            C17960vV.A0F(false, "Mentions/null mention after map population");
                        } else {
                            int start = matcher.start() + i3;
                            CharSequence A0F2 = AnonymousClass1EG.A0F((String) A002.A01, this.A01.A04(AnonymousClass18O.A1O));
                            if (context != null) {
                                A0F2 = C43251zV.A05(context3, this.A08, A0F2);
                            }
                            int length = group.length();
                            spannableStringBuilder2.replace(start, length + start, A0F2);
                            i3 += A0F2.length() - length;
                            if (z6) {
                                int length2 = A0F2.length() + start;
                                C18030ve r15 = r8.A09;
                                AnonymousClass11S r14 = r8.A00;
                                AnonymousClass1CJ r13 = r8.A06;
                                AnonymousClass00H r12 = r8.A0A;
                                spannableStringBuilder2.setSpan(new C45692Bb(context2, r14, r8.A02, (C40371ub) r8.A0B.get(), r13, r8.A07, (C70503Bi) obj, r15, r29, r12, i2, z4), start, length2, 33);
                                if (z5) {
                                    context2.getApplicationContext();
                                    spannableStringBuilder2.setSpan(new C22628BGo(), start + 1, length2, 33);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void A06(Context context, SpannableStringBuilder spannableStringBuilder, AnonymousClass1BI r13, List list, boolean z) {
        A05(context, spannableStringBuilder, r13, list, AnonymousClass1YL.A00(context, 2130970499, 2131101293), z, false, false);
    }

    public C42751yg A01(AnonymousClass1E7 r5, GroupJid groupJid) {
        String str;
        C24921Me r3 = this.A04;
        C42751yg A0F2 = r3.A0F(r5, r3.A08(r5, groupJid), false, true);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (A0E) {
            str = "⁨";
        } else {
            str = str2;
        }
        sb.append(str);
        sb.append(A0F2.A01);
        if (A0F) {
            str2 = "⁩";
        }
        sb.append(str2);
        return new C42751yg(sb.toString(), A0F2.A00);
    }

    public String A03(C70503Bi r9) {
        String str;
        String A022;
        String str2;
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        if (A0E) {
            str = "⁨";
        } else {
            str = str3;
        }
        sb.append(str);
        AnonymousClass1BI r1 = r9.A00;
        if (!(r1 instanceof GroupJid) || (str2 = r9.A01) == null) {
            AnonymousClass1M9 r0 = this.A03;
            AnonymousClass1E7 A0F2 = r0.A0F(r1);
            if (A0F2 == null) {
                A0F2 = r0.A0H(r1);
            }
            if (A0F2.A0F()) {
                A022 = this.A04.A0I(A0F2);
                if (A022 == null) {
                    A022 = this.A05.A01(2131891156);
                }
            } else if (A0F2.A0O()) {
                A022 = this.A04.A0W(A0F2, false);
            } else if (!TextUtils.isEmpty(A0F2.A0K()) && (!(A0F2.A0J instanceof AnonymousClass1E2) || A0F2.A0I != null || TextUtils.isEmpty(A0F2.A0c))) {
                A022 = A0F2.A0K();
            } else if (TextUtils.isEmpty(A0F2.A0c)) {
                A022 = AnonymousClass17K.A02(A0F2);
            } else if (!this.A00.A0O(A0F2.A0J)) {
                A022 = this.A05.A02(2131898921, A0F2.A0c);
            } else {
                A022 = A0F2.A0c;
            }
        } else {
            A022 = str2.trim();
        }
        sb.append(A022);
        if (A0F) {
            str3 = "⁩";
        }
        sb.append(str3);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A04(com.whatsapp.jid.GroupJid r11) {
        /*
            r10 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.00H r0 = r10.A0C
            java.lang.Object r9 = r0.get()
            X.1kb r9 = (X.C34511kb) r9
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r1 = X.C42941yz.A00(r11)
            if (r1 == 0) goto L_0x0072
            X.1MG r0 = r9.A08
            r0.A04()
            java.util.Map r0 = r0.A02
            java.lang.Object r8 = r0.get(r1)
            X.1EC r8 = (X.AnonymousClass1EC) r8
            if (r8 == 0) goto L_0x0072
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.HashSet r0 = r9.A08(r8)
            java.util.Iterator r2 = r0.iterator()
            r5 = 0
        L_0x0037:
            boolean r0 = r2.hasNext()
            r3 = 3
            if (r0 == 0) goto L_0x004e
            java.lang.Object r1 = r2.next()
            X.A2B r1 = (X.A2B) r1
            int r0 = r1.A00
            if (r0 != r3) goto L_0x004a
            r5 = r1
            goto L_0x0037
        L_0x004a:
            r7.add(r1)
            goto L_0x0037
        L_0x004e:
            java.util.HashSet r0 = r9.A07(r8)
            java.util.Iterator r2 = r0.iterator()
        L_0x0056:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.Object r1 = r2.next()
            X.A2B r1 = (X.A2B) r1
            int r0 = r1.A00
            if (r0 != r3) goto L_0x0068
            r5 = r1
            goto L_0x0056
        L_0x0068:
            r6.add(r1)
            goto L_0x0056
        L_0x006c:
            X.2rR r9 = new X.2rR
            r9.<init>(r5, r8, r7, r6)
            goto L_0x007a
        L_0x0072:
            r1 = 0
            X.0wS r0 = X.C18460wS.A00
            X.2rR r9 = new X.2rR
            r9.<init>(r1, r1, r0, r0)
        L_0x007a:
            X.A2B r1 = r9.A00
            if (r1 == 0) goto L_0x0090
            com.whatsapp.jid.GroupJid r2 = r1.A02
            boolean r0 = X.C42171xk.A00(r11, r2)
            if (r0 != 0) goto L_0x0090
            java.lang.String r1 = r1.A06
            X.3Bi r0 = new X.3Bi
            r0.<init>(r2, r1)
            r4.add(r0)
        L_0x0090:
            java.util.List r0 = r9.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x0096:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r1 = r3.next()
            X.A2B r1 = (X.A2B) r1
            com.whatsapp.jid.GroupJid r2 = r1.A02
            boolean r0 = X.C42171xk.A00(r11, r2)
            if (r0 != 0) goto L_0x0096
            java.lang.String r1 = r1.A06
            X.3Bi r0 = new X.3Bi
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x0096
        L_0x00b5:
            java.util.List r0 = r9.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x00bb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00da
            java.lang.Object r1 = r3.next()
            X.A2B r1 = (X.A2B) r1
            com.whatsapp.jid.GroupJid r2 = r1.A02
            boolean r0 = X.C42171xk.A00(r11, r2)
            if (r0 != 0) goto L_0x00bb
            java.lang.String r1 = r1.A06
            X.3Bi r0 = new X.3Bi
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x00bb
        L_0x00da:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32091gc.A04(com.whatsapp.jid.GroupJid):java.util.ArrayList");
    }

    public C32091gc(AnonymousClass11S r1, AnonymousClass18O r2, C203411t r3, AnonymousClass1M9 r4, C24921Me r5, AnonymousClass118 r6, AnonymousClass1CJ r7, AnonymousClass1MZ r8, AnonymousClass1KW r9, C18030ve r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        this.A09 = r10;
        this.A00 = r1;
        this.A05 = r6;
        this.A06 = r7;
        this.A08 = r9;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A0A = r11;
        this.A0C = r12;
        this.A0B = r13;
        this.A02 = r3;
        this.A07 = r8;
    }

    public static C19760yx A00(C32091gc r4, String str, Map map) {
        C19760yx r3 = (C19760yx) map.get(str);
        if (r3 == null) {
            return null;
        }
        if (r3.A01 != null) {
            return r3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("@");
        C70503Bi r1 = (C70503Bi) r3.A00;
        sb.append(r4.A03(r1));
        C19760yx r32 = new C19760yx(r1, sb.toString());
        map.put(str, r32);
        return r32;
    }
}
