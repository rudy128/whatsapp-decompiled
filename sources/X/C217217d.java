package X;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.notification.AndroidWear;
import com.whatsapp.permissions.NotificationPermissionBottomSheet;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.17d  reason: invalid class name and case insensitive filesystem */
public final class C217217d implements C201511a {
    public static final HashMap A0X = new HashMap();
    public static final List A0Y = Arrays.asList(new String[]{"facebook.com", "www.facebook.com", "m.facebook.com"});
    public static final List A0Z = Arrays.asList(new String[]{"fbwat.ch", "www.fbwat.ch", "fb.watch", "www.fb.watch"});
    public static final List A0a = Arrays.asList(new String[]{"instagram.com", "www.instagram.com"});
    public static final List A0b = Arrays.asList(new String[]{"lassovideos.com", "www.lassovideos.com"});
    public static final List A0c = Arrays.asList(new String[]{"netflix.com", "www.netflix.com"});
    public static final List A0d = Arrays.asList(new String[]{"sharechat.com", "www.sharechat.com"});
    public static final List A0e = Arrays.asList(new String[]{"streamable.com", "www.streamable.com"});
    public static final List A0f = Arrays.asList(new String[]{"youtube.com", "youtu.be", "www.youtube.com", "m.youtube.com"});
    public static final String[] A0g = {"_id"};
    public C136826uT A00;
    public final C218617r A01;
    public final C32191gn A02;
    public final AnonymousClass1M9 A03;
    public final C24921Me A04;
    public final AnonymousClass11C A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass118 A07;
    public final C18030ve A08;
    public final C219317y A09;
    public final AnonymousClass1LU A0A;
    public final WamediaManager A0B;
    public final C26061Qr A0C;
    public final AnonymousClass1Nb A0D;
    public final C26611Su A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass11S A0I;
    public final AnonymousClass1VW A0J;
    public final C27201Vd A0K;
    public final C18000vb A0L;
    public final AnonymousClass1CJ A0M;
    public final AnonymousClass122 A0N;
    public final AnonymousClass1NJ A0O;
    public final AnonymousClass12L A0P;
    public final C32011gU A0Q;
    public final C32091gc A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;
    public final AnonymousClass00H A0U;
    public final AnonymousClass00H A0V;
    public final AnonymousClass00H A0W;

    public static C1409673t A03(Context context) {
        C1409673t r2 = new C1409673t(context, (String) null);
        r2.A00 = context.getResources().getColor(2131103150);
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r0.booleanValue() != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(android.content.Context r10, android.net.Uri r11, X.C1409673t r12, X.AnonymousClass11C r13, X.C27231Vg r14, X.AnonymousClass16P r15) {
        /*
            r5 = r11
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 >= r0) goto L_0x001f
            android.net.Uri r0 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x001f
            java.util.HashMap r3 = A0X
            java.lang.Object r0 = r3.get(r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0042
        L_0x001f:
            boolean r0 = r15.A00
            if (r0 != 0) goto L_0x008a
            r0 = 26
            if (r1 >= r0) goto L_0x008a
            java.io.File r2 = X.C64062u9.A04(r11)
            if (r2 == 0) goto L_0x007b
            r0 = 24
            if (r1 < r0) goto L_0x007b
            goto L_0x0071
        L_0x0032:
            X.11B r4 = r13.A0O()
            if (r4 != 0) goto L_0x0046
            java.lang.String r0 = "messagenotification/is-notification-tone cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x003d:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.put(r11, r0)
        L_0x0042:
            r14.A02(r11)
            return
        L_0x0046:
            java.lang.String[] r6 = A0g     // Catch:{ Exception -> 0x003d }
            java.lang.String r7 = "is_notification=1"
            java.lang.String r9 = "title_key"
            r8 = 0
            android.database.Cursor r2 = r4.A03(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x003d }
            if (r2 == 0) goto L_0x003d
            int r0 = r2.getCount()     // Catch:{ all -> 0x0067 }
            if (r0 <= 0) goto L_0x0063
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0067 }
            r3.put(r11, r0)     // Catch:{ all -> 0x0067 }
            r2.close()     // Catch:{ Exception -> 0x003d }
            goto L_0x001f
        L_0x0063:
            r2.close()     // Catch:{ Exception -> 0x003d }
            goto L_0x003d
        L_0x0067:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x006c }
            goto L_0x0070
        L_0x006c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x003d }
        L_0x0070:
            throw r1     // Catch:{ Exception -> 0x003d }
        L_0x0071:
            android.net.Uri r5 = X.C64062u9.A02(r10, r2)     // Catch:{ IllegalArgumentException -> 0x0081 }
            java.lang.String r1 = "com.android.systemui"
            r0 = 1
            r10.grantUriPermission(r1, r5, r0)     // Catch:{ IllegalArgumentException -> 0x0081 }
        L_0x007b:
            if (r5 == 0) goto L_0x008a
            r12.A0A(r5)
            return
        L_0x0081:
            r1 = move-exception
            java.lang.String r0 = "notification/"
            com.whatsapp.util.Log.w(r0, r1)
            r14.A02(r5)
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C217217d.A07(android.content.Context, android.net.Uri, X.73t, X.11C, X.1Vg, X.16P):void");
    }

    public static boolean A09(Uri uri, List list) {
        if (!(uri == null || uri.getHost() == null)) {
            String host = uri.getHost();
            for (int i = 0; i < list.size(); i++) {
                if (host.equalsIgnoreCase((String) list.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public C53642cr A0H(AnonymousClass1E7 r9, AnonymousClass206 r10) {
        CharSequence charSequence;
        AnonymousClass206 A0K2;
        AnonymousClass206 r4 = r10;
        if (r10 == null) {
            return new C53642cr("", "");
        }
        AnonymousClass1E7 r3 = r9;
        if (AnonymousClass4aJ.A05(this.A0I, r10.A0h) || (C22971Dz.A0e(r10.A0v.A00) && (A0K2 = r10.A0K()) != null && A0K2.A0v.A02)) {
            charSequence = A0I(r3, r4, false, false, false);
        } else {
            charSequence = A0J(r10);
        }
        return new C53642cr(A0K(r9, r10), charSequence);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (A0A(r5) == false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0P(X.C60182nW r18, boolean r19) {
        /*
            r17 = this;
            r3 = 0
            r0 = r18
            if (r18 == 0) goto L_0x001d
            X.206 r5 = r0.A00
            r11 = r17
            X.1Qr r0 = r11.A0C
            java.lang.Integer r1 = r5.A0S
            if (r1 == 0) goto L_0x001e
            X.0vl r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            return r3
        L_0x001e:
            int r1 = r5.A0u
            r0 = 36
            if (r1 == r0) goto L_0x001d
            r0 = 77
            if (r1 == r0) goto L_0x001d
            r0 = 90
            if (r1 == r0) goto L_0x001d
            r0 = 98
            if (r1 == r0) goto L_0x001d
            r0 = 100
            if (r1 != r0) goto L_0x003e
            r0 = r5
            X.24R r0 = (X.AnonymousClass24R) r0
            X.9Jt r2 = r0.A00
            X.9Jt r0 = X.C179749Jt.CONTROL_PASSED
            if (r2 == r0) goto L_0x003e
            return r3
        L_0x003e:
            X.12L r4 = r11.A0P
            X.205 r0 = r5.A0v
            X.1BI r2 = r0.A00
            boolean r0 = X.C42761yh.A01(r4, r2)
            if (r0 != 0) goto L_0x001d
            if (r19 != 0) goto L_0x0055
            X.1CJ r0 = r11.A0M
            boolean r0 = r0.A0S(r2)
            if (r0 == 0) goto L_0x0055
            return r3
        L_0x0055:
            boolean r0 = r11.A0B(r5)
            r16 = 1
            if (r0 != 0) goto L_0x0063
            boolean r0 = A0C(r5)
            if (r0 == 0) goto L_0x006a
        L_0x0063:
            boolean r0 = r11.A0A(r5)
            r6 = 1
            if (r0 != 0) goto L_0x006b
        L_0x006a:
            r6 = 0
        L_0x006b:
            if (r2 == 0) goto L_0x0076
            X.1CJ r0 = r11.A0M
            boolean r0 = r0.A0Q(r2)
            if (r0 == 0) goto L_0x0076
        L_0x0075:
            return r6
        L_0x0076:
            boolean r0 = X.C22971Dz.A0V(r2)
            if (r0 == 0) goto L_0x009e
            X.1CJ r0 = r11.A0M
            X.1ci r2 = r0.A0A(r2)
            X.2Dk r2 = (X.C46162Dk) r2
            if (r2 == 0) goto L_0x001d
            X.9Ig r1 = r2.A02
            X.9Ig r0 = X.C179509Ig.A03
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            if (r0 != 0) goto L_0x001d
            boolean r0 = r2.A0B
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = r2.A0T
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001d
            r3 = 1
            return r3
        L_0x009e:
            r0 = 95
            if (r1 == r0) goto L_0x001d
            java.lang.Class<X.36b> r0 = X.C691436b.class
            X.229 r0 = X.AnonymousClass206.A01(r5, r0)
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r0 != 0) goto L_0x001d
            X.1Nb r4 = r11.A0D
            X.C17960vV.A07(r2)
            X.1yM r1 = r4.A0a(r2)
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x0075
            X.201 r1 = r1.A0A
            X.201 r0 = X.AnonymousClass201.RELEVANT_MESSAGES
            if (r1 == r0) goto L_0x00c7
            X.201 r0 = X.AnonymousClass201.DEFAULT_RELEVANT_MESSAGES
            if (r1 != r0) goto L_0x01bf
        L_0x00c7:
            X.0ve r7 = r11.A08
            r0 = 11087(0x2b4f, float:1.5536E-41)
            X.0vf r6 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r6, r7, r0)
            if (r0 == 0) goto L_0x01bf
            boolean r15 = r11.A0A(r5)
            boolean r14 = A0C(r5)
            boolean r13 = r11.A0B(r5)
            X.1BI r1 = r5.A0H()
            if (r1 != 0) goto L_0x01b1
            r12 = 0
        L_0x00e6:
            X.1yM r0 = r4.A0a(r2)
            long r4 = r0.A05
            r0 = 11941(0x2ea5, float:1.6733E-41)
            int r0 = X.C18020vd.A00(r6, r7, r0)
            long r7 = (long) r0
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 1
            long r0 = r9.toMillis(r0)
            long r7 = r7 * r0
            X.11P r0 = r11.A06
            long r9 = X.AnonymousClass11P.A01(r0)
            long r9 = r9 - r4
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r10 = 0
            if (r0 >= 0) goto L_0x0109
            r10 = 1
        L_0x0109:
            if (r15 == 0) goto L_0x01ae
            if (r14 != 0) goto L_0x0113
            if (r13 != 0) goto L_0x0113
            if (r12 != 0) goto L_0x0113
            if (r10 == 0) goto L_0x01ae
        L_0x0113:
            r9 = 1
        L_0x0114:
            X.00H r0 = r11.A0G
            java.lang.Object r8 = r0.get()
            X.2k0 r8 = (X.C58012k0) r8
            X.C18070vi.A0d(r2, r3)
            X.0ve r1 = r8.A01
            r0 = 12014(0x2eee, float:1.6835E-41)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            if (r0 == 0) goto L_0x017c
            X.2Hj r7 = new X.2Hj
            r7.<init>()
            X.1Nl r1 = r8.A03
            java.lang.String r0 = r2.getRawString()
            java.lang.String r0 = r1.A05(r0)
            r7.A09 = r0
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r1 = X.C42941yz.A00(r2)
            if (r1 != 0) goto L_0x0182
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r7.A00 = r0
        L_0x0148:
            if (r9 == 0) goto L_0x017d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L_0x014e:
            r7.A06 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            r7.A03 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r7.A01 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r7.A04 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r7.A02 = r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 1
            long r0 = r2.toMillis(r0)
            long r4 = r4 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r7.A08 = r0
            X.18K r0 = r8.A02
            r0.CC7(r7)
        L_0x017c:
            return r9
        L_0x017d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            goto L_0x014e
        L_0x0182:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            r7.A00 = r0
            X.1PU r0 = r8.A04
            int r0 = r0.A00(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.A05 = r0
            X.1MZ r0 = r8.A00
            X.1MW r0 = r0.A08
            int r6 = r0.A0A(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r1 = -1
            r0 = 0
            if (r6 == r1) goto L_0x01ab
            if (r2 == 0) goto L_0x01ab
            long r0 = (long) r6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x01ab:
            r7.A07 = r0
            goto L_0x0148
        L_0x01ae:
            r9 = 0
            goto L_0x0114
        L_0x01b1:
            X.1M9 r0 = r11.A03
            X.1E7 r0 = r0.A0H(r1)
            X.2lf r0 = r0.A0H
            r12 = 0
            if (r0 == 0) goto L_0x00e6
            r12 = 1
            goto L_0x00e6
        L_0x01bf:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C217217d.A0P(X.2nW, boolean):boolean");
    }

    public static Uri A00(AnonymousClass206 r1) {
        if (!(r1 instanceof AnonymousClass210)) {
            return null;
        }
        String str = ((AnonymousClass210) r1).A07;
        if (!TextUtils.isEmpty(str)) {
            return Uri.parse(C32011gU.A00(str));
        }
        return null;
    }

    public static SpannableStringBuilder A01(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, charSequence.length(), 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder A02(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new StyleSpan(2), 0, charSequence.length(), 0);
        return spannableStringBuilder;
    }

    public static Integer A05(String str) {
        int i;
        if (str == null) {
            return null;
        }
        try {
            i = Integer.parseInt(str, 16);
        } catch (NumberFormatException unused) {
            i = 16777215;
        }
        int i2 = i | -16777216;
        if (i2 != -16777216) {
            return Integer.valueOf(i2);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (X.AnonymousClass4aJ.A05(r4.A0I, r1) == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0B(X.AnonymousClass206 r5) {
        /*
            r4 = this;
            java.util.List r1 = r5.A0h
            r3 = 1
            if (r1 == 0) goto L_0x000e
            X.11S r0 = r4.A0I
            boolean r0 = X.AnonymousClass4aJ.A05(r0, r1)
            r2 = 1
            if (r0 != 0) goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            X.205 r1 = r5.A0v
            X.1BI r0 = r1.A00
            boolean r0 = X.C22971Dz.A0e(r0)
            if (r0 == 0) goto L_0x0020
            if (r2 == 0) goto L_0x0020
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0020
            return r3
        L_0x0020:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C217217d.A0B(X.206):boolean");
    }

    public static long[] A0D(String str) {
        int i;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    i = 0;
                    break;
                } else {
                    return null;
                }
            case 50:
                if (str.equals("2")) {
                    i = 1;
                    break;
                } else {
                    return null;
                }
            case 51:
                if (str.equals("3")) {
                    i = 2;
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        long[] jArr = {0, 750, 250, 750, 250};
        if (2 - i != 0) {
            // fill-array-data instruction
            jArr[0] = 0;
            jArr[1] = 300;
            jArr[2] = 200;
            jArr[3] = 300;
            jArr[4] = 200;
            return jArr;
        }
        return jArr;
    }

    public int A0E(int i, int i2) {
        Point point = new Point();
        this.A05.A0L().getDefaultDisplay().getSize(point);
        int i3 = point.x;
        int i4 = point.y / 3;
        int i5 = 1;
        if (i != 0 && i2 != 0) {
            while (true) {
                if (i2 <= i4 && i <= i3) {
                    break;
                }
                i5 *= 2;
                i2 = (i2 + 1) / 2;
                i = (i + 1) / 2;
            }
        }
        return i5;
    }

    public Bitmap A0F(AnonymousClass1E7 r9) {
        float f;
        AnonymousClass1EC A052;
        AnonymousClass1E7 A0E2;
        Context context = this.A07.A00;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(17104901);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(17104902);
        AnonymousClass1BI r3 = r9.A0J;
        boolean z = false;
        if ((r3 instanceof GroupJid) && this.A0M.A06((GroupJid) r3) == 1) {
            z = true;
        }
        boolean A0R2 = this.A0M.A0R(r3);
        if (!(!A0R2 || (A052 = ((C34511kb) this.A0T.get()).A05((AnonymousClass1EC) r3)) == null || (A0E2 = this.A03.A0E(A052)) == null)) {
            r9 = A0E2;
        }
        Bitmap A032 = this.A0K.A03(context, r9, dimensionPixelSize, dimensionPixelSize2);
        if (A032 != null) {
            return A032;
        }
        AnonymousClass1VW r32 = this.A0J;
        int min = Math.min(dimensionPixelSize, dimensionPixelSize2);
        if (A0R2 || z) {
            f = -2.14748365E9f;
        } else {
            f = context.getResources().getDimension(2131168737);
        }
        return r32.A07(r9, f, min);
    }

    public C136826uT A0G() {
        C136826uT r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        String string = this.A07.A00.getString(2131891155);
        AnonymousClass11S r02 = this.A0I;
        r02.A0I();
        AnonymousClass1E8 r03 = r02.A0D;
        C17960vV.A07(r03);
        C136826uT r04 = new C136826uT(IconCompat.A03(A0F(r03)), string, (String) null, (String) null, false, false);
        this.A00 = r04;
        return r04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001f, code lost:
        if (r21 != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0192, code lost:
        if (r0 != null) goto L_0x01e2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence A0I(X.AnonymousClass1E7 r19, X.AnonymousClass206 r20, boolean r21, boolean r22, boolean r23) {
        /*
            r18 = this;
            r11 = r20
            X.205 r10 = r11.A0v
            X.1BI r9 = r10.A00
            r8 = r18
            X.1Me r7 = r8.A04
            int r6 = r7.A0B(r9)
            X.118 r0 = r8.A07
            android.content.Context r5 = r0.A00
            java.lang.CharSequence r4 = r8.A0J(r11)
            boolean r0 = r11 instanceof X.C436420i
            java.lang.String r3 = ": "
            r2 = 0
            r12 = r19
            if (r0 == 0) goto L_0x003e
            if (r21 == 0) goto L_0x0037
        L_0x0021:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x0026:
            java.lang.String r0 = r7.A0U(r12, r6, r2)
        L_0x002a:
            r1.append(r0)
            r1.append(r3)
        L_0x0030:
            r1.append(r4)
            java.lang.String r4 = r1.toString()
        L_0x0037:
            X.1gc r0 = r8.A0R
            java.lang.CharSequence r0 = r0.A02(r5, r11, r4)
            return r0
        L_0x003e:
            int r14 = r11.A0u
            java.lang.String r13 = " @ "
            java.lang.String r1 = " "
            r0 = 2
            r17 = 1
            if (r14 != 0) goto L_0x0109
            boolean r14 = r12.A0F()
            if (r14 == 0) goto L_0x0069
            if (r21 == 0) goto L_0x009a
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x0021
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            X.1BI r0 = r11.A0H()
            java.lang.String r0 = r8.A0L(r0, r9)
            r1.append(r0)
            r1.append(r13)
            goto L_0x0026
        L_0x0069:
            if (r21 != 0) goto L_0x0021
            if (r22 == 0) goto L_0x0037
            boolean r3 = r10.A02
            if (r3 != 0) goto L_0x0081
            java.lang.CharSequence[] r13 = new java.lang.CharSequence[r0]
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = r7.A0U(r12, r6, r2)
            java.lang.String r0 = X.C63462t7.A02(r0)
            goto L_0x008f
        L_0x0081:
            java.lang.CharSequence[] r13 = new java.lang.CharSequence[r0]
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r0 = 2131898595(0x7f1230e3, float:1.9432112E38)
            java.lang.String r0 = r5.getString(r0)
        L_0x008f:
            r10.append(r0)
            r10.append(r1)
        L_0x0095:
            java.lang.String r0 = r10.toString()
            goto L_0x00bd
        L_0x009a:
            boolean r6 = r10.A02
            if (r22 == 0) goto L_0x00cb
            if (r6 != 0) goto L_0x0081
            java.lang.CharSequence[] r13 = new java.lang.CharSequence[r0]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            X.1BI r0 = r11.A0H()
            java.lang.String r0 = r8.A0L(r0, r9)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = X.C63462t7.A02(r0)
        L_0x00bd:
            if (r23 == 0) goto L_0x00c5
            if (r0 == 0) goto L_0x00c5
            android.text.SpannableStringBuilder r0 = A01(r0)
        L_0x00c5:
            r13[r2] = r0
            r13[r17] = r4
            goto L_0x01f4
        L_0x00cb:
            if (r6 != 0) goto L_0x00e3
            java.lang.CharSequence[] r13 = new java.lang.CharSequence[r0]
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            X.1BI r0 = r11.A0H()
            java.lang.String r0 = r8.A0L(r0, r9)
            r10.append(r0)
            r10.append(r3)
            goto L_0x0095
        L_0x00e3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "messagePreview/missing_rmt_src:"
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass25A.A0D(r11)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 2131888741(0x7f120a65, float:1.9412126E38)
            java.lang.String r0 = r5.getString(r0)
            goto L_0x002a
        L_0x0109:
            r15 = 12
            r16 = 0
            if (r14 != r15) goto L_0x0111
            r16 = 1
        L_0x0111:
            boolean r14 = r12.A0F()
            if (r14 == 0) goto L_0x01c1
            if (r21 == 0) goto L_0x0142
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x020f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            X.1BI r0 = r11.A0H()
            java.lang.String r0 = r8.A0L(r0, r9)
            r1.append(r0)
            r1.append(r13)
        L_0x0130:
            java.lang.String r0 = r7.A0U(r12, r6, r2)
            r1.append(r0)
            r1.append(r3)
            if (r16 == 0) goto L_0x0030
            android.text.SpannableStringBuilder r4 = A02(r4)
            goto L_0x0030
        L_0x0142:
            if (r22 == 0) goto L_0x0195
            boolean r6 = r10.A02
            java.lang.CharSequence[] r13 = new java.lang.CharSequence[r0]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            if (r6 != 0) goto L_0x017c
            r3.<init>()
            X.1BI r0 = r11.A0H()
            java.lang.String r0 = r8.A0L(r0, r9)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = X.C63462t7.A02(r0)
            if (r23 == 0) goto L_0x016d
            if (r0 == 0) goto L_0x016d
            android.text.SpannableStringBuilder r0 = A01(r0)
        L_0x016d:
            r13[r2] = r0
            java.lang.String r0 = X.C63462t7.A02(r4)
            if (r16 == 0) goto L_0x0179
            android.text.SpannableStringBuilder r0 = A02(r0)
        L_0x0179:
            r13[r17] = r0
            goto L_0x01f4
        L_0x017c:
            r3.<init>()
            r0 = 2131898595(0x7f1230e3, float:1.9432112E38)
            java.lang.String r0 = r5.getString(r0)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            if (r23 == 0) goto L_0x01e6
            if (r0 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x0195:
            java.lang.CharSequence[] r13 = new java.lang.CharSequence[r0]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            X.1BI r0 = r11.A0H()
            java.lang.String r0 = r8.A0L(r0, r9)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            if (r23 == 0) goto L_0x01b6
            if (r0 == 0) goto L_0x01b6
            android.text.SpannableStringBuilder r0 = A01(r0)
        L_0x01b6:
            r13[r2] = r0
            if (r16 == 0) goto L_0x01be
            android.text.SpannableStringBuilder r4 = A02(r4)
        L_0x01be:
            r13[r17] = r4
            goto L_0x01f4
        L_0x01c1:
            if (r21 != 0) goto L_0x020f
            if (r22 == 0) goto L_0x0216
            boolean r9 = r10.A02
            java.lang.CharSequence[] r13 = new java.lang.CharSequence[r0]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            if (r9 != 0) goto L_0x01fa
            r3.<init>()
            java.lang.String r0 = r7.A0U(r12, r6, r2)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = X.C63462t7.A02(r0)
        L_0x01e2:
            android.text.SpannableStringBuilder r0 = A01(r0)
        L_0x01e6:
            r13[r2] = r0
            java.lang.String r0 = X.C63462t7.A02(r4)
            if (r16 == 0) goto L_0x01f2
            android.text.SpannableStringBuilder r0 = A02(r0)
        L_0x01f2:
            r13[r17] = r0
        L_0x01f4:
            java.lang.CharSequence r4 = android.text.TextUtils.concat(r13)
            goto L_0x0037
        L_0x01fa:
            r3.<init>()
            r0 = 2131898595(0x7f1230e3, float:1.9432112E38)
            java.lang.String r0 = r5.getString(r0)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            goto L_0x01e2
        L_0x020f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x0130
        L_0x0216:
            if (r16 == 0) goto L_0x0037
            android.text.SpannableStringBuilder r4 = A02(r4)
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C217217d.A0I(X.1E7, X.206, boolean, boolean, boolean):java.lang.CharSequence");
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence A0J(X.AnonymousClass206 r18) {
        /*
            r17 = this;
            r3 = r17
            X.00H r0 = r3.A0V
            java.lang.Object r8 = r0.get()
            X.2fn r8 = (X.C55452fn) r8
            r0 = 0
            r4 = r18
            X.C18070vi.A0d(r4, r0)
            X.0vl r0 = r8.A03
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0021:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C53672cu
            if (r0 == 0) goto L_0x0021
            r6.add(r1)
            goto L_0x0021
        L_0x0033:
            r0 = 10
            int r0 = X.C29351c6.A0C(r6, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L_0x0042:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0089
            java.lang.Object r2 = r6.next()
            X.2cu r2 = (X.C53672cu) r2
            X.AW0 r0 = X.AnonymousClass25B.A00(r4)
            if (r0 == 0) goto L_0x0086
            int r1 = r0.A03
            r0 = 5
            if (r1 != r0) goto L_0x0071
            X.118 r1 = r2.A00
            r0 = 2131893015(0x7f121b17, float:1.9420795E38)
        L_0x005e:
            java.lang.String r0 = r1.A01(r0)
        L_0x0062:
            java.lang.CharSequence r0 = X.AnonymousClass1EG.A02(r0)
            if (r0 == 0) goto L_0x0086
            X.35q r1 = new X.35q
            r1.<init>(r0)
        L_0x006d:
            r5.add(r1)
            goto L_0x0042
        L_0x0071:
            boolean r0 = r4 instanceof X.C439721q
            if (r0 != 0) goto L_0x0080
            boolean r0 = r4 instanceof X.AnonymousClass23U
            if (r0 != 0) goto L_0x0080
            X.1R2 r0 = r2.A01
            java.lang.String r0 = r0.A0d(r4)
            goto L_0x0062
        L_0x0080:
            X.118 r1 = r2.A00
            r0 = 2131893596(0x7f121d5c, float:1.9421973E38)
            goto L_0x005e
        L_0x0086:
            X.35p r1 = X.C690235p.A00
            goto L_0x006d
        L_0x0089:
            java.util.Iterator r1 = r5.iterator()
        L_0x008d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0276
            java.lang.Object r7 = r1.next()
            boolean r0 = r7 instanceof X.C690235p
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x008d
        L_0x009d:
            X.3KT r7 = (X.AnonymousClass3KT) r7
            X.0vl r0 = r8.A04
            java.lang.Object r0 = r0.getValue()
            X.20Z r0 = (X.AnonymousClass20Z) r0
            int r2 = r4.A0u
            X.20A r0 = r0.A00(r2)
            X.20t r0 = (X.C437420t) r0
            if (r7 != 0) goto L_0x00b5
            X.3KT r7 = r0.BXU(r4)
        L_0x00b5:
            boolean r0 = r7 instanceof X.C690335q
            if (r0 == 0) goto L_0x0150
            X.17c r6 = r8.A01
            X.118 r0 = r8.A00
            android.content.Context r5 = r0.A00
            X.C18070vi.A0X(r5)
            X.00H r0 = r8.A02
            java.lang.Object r8 = r0.get()
            X.2pp r8 = (X.C61522pp) r8
            X.35q r7 = (X.C690335q) r7
            java.lang.CharSequence r11 = r7.A00
            X.205 r1 = r4.A0v
            boolean r0 = r1.A02
            r15 = 0
            if (r0 != 0) goto L_0x00e8
            X.1BI r0 = r1.A00
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 != 0) goto L_0x00e7
            com.whatsapp.jid.UserJid r0 = r4.A0I()
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x00e8
        L_0x00e7:
            r15 = 1
        L_0x00e8:
            java.lang.String r7 = ""
            r16 = r7
            X.00H r0 = r8.A02
            java.lang.Object r10 = r0.get()
            X.11C r10 = (X.AnonymousClass11C) r10
            X.00H r0 = r8.A01
            java.lang.Object r9 = r0.get()
            X.0vc r9 = (X.C18010vc) r9
            int r0 = r11.length()
            long r0 = (long) r0
            r13 = 1024(0x400, double:5.06E-321)
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x011f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r1 = 0
            r0 = 1020(0x3fc, float:1.43E-42)
            java.lang.CharSequence r0 = r11.subSequence(r1, r0)
            r12.append(r0)
            r0 = 8230(0x2026, float:1.1533E-41)
            r12.append(r0)
            java.lang.String r11 = r12.toString()
        L_0x011f:
            java.lang.String r1 = X.C63462t7.A02(r11)
            if (r15 == 0) goto L_0x0270
            X.00H r0 = r8.A00
            java.lang.Object r0 = r0.get()
            X.0ve r0 = (X.C18030ve) r0
            java.lang.CharSequence r0 = X.C26302CxJ.A0B(r10, r0, r9, r1)
        L_0x0131:
            if (r0 == 0) goto L_0x0134
            r7 = r0
        L_0x0134:
            X.00H r0 = r6.A00
            java.lang.Object r0 = r0.get()
            X.1gc r0 = (X.C32091gc) r0
            java.lang.CharSequence r0 = r0.A02(r5, r4, r7)
            X.C18070vi.A0X(r0)
            java.lang.CharSequence r0 = X.AnonymousClass1EG.A02(r0)
            if (r0 != 0) goto L_0x014b
            r0 = r16
        L_0x014b:
            X.35q r7 = new X.35q
            r7.<init>(r0)
        L_0x0150:
            boolean r0 = r7 instanceof X.C690335q
            if (r0 == 0) goto L_0x0279
            X.206 r1 = r4.A0K()
            X.35q r7 = (X.C690335q) r7
            java.lang.CharSequence r6 = r7.A00
            r11 = 0
            r5 = 1
            if (r1 == 0) goto L_0x01a3
            r0 = 103(0x67, float:1.44E-43)
            if (r2 == r0) goto L_0x01a3
            X.205 r0 = r1.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C22971Dz.A0a(r0)
            if (r0 == 0) goto L_0x01a3
            X.0ve r2 = r3.A08
            r1 = 9413(0x24c5, float:1.319E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01a3
            X.118 r2 = r3.A07
            r1 = 2131896385(0x7f122841, float:1.942763E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r11] = r6
            java.lang.String r6 = r2.A02(r1, r0)
        L_0x0187:
            X.00H r0 = r3.A0S
            r0.get()
            boolean r0 = X.C87494Vu.A00(r4)
            if (r0 == 0) goto L_0x01a2
            X.0ve r0 = r3.A08
            boolean r0 = X.C26302CxJ.A0W(r0)
            if (r0 == 0) goto L_0x01a2
            java.lang.String r0 = r6.toString()
            java.lang.String r6 = X.C26302CxJ.A0F(r0)
        L_0x01a2:
            return r6
        L_0x01a3:
            boolean r0 = r4 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x0187
            X.0ve r9 = r3.A08
            r0 = 10042(0x273a, float:1.4072E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r9, r0)
            if (r0 == 0) goto L_0x0187
            r8 = r4
            X.210 r8 = (X.AnonymousClass210) r8
            java.lang.String r0 = r8.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0187
            X.1gU r2 = r3.A0Q
            java.lang.String r0 = r8.A17()
            java.lang.String r0 = r2.A02(r0)
            if (r0 == 0) goto L_0x0187
            android.net.Uri r2 = A00(r8)
            java.lang.String r10 = r8.A07
            java.lang.String r7 = "🔗 "
            if (r10 == 0) goto L_0x024d
            if (r2 == 0) goto L_0x024d
            java.lang.String r0 = r8.A17()
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x024d
            java.util.List r0 = A0Y
            boolean r0 = A09(r2, r0)
            if (r0 != 0) goto L_0x0221
            java.util.List r0 = A0Z
            boolean r0 = A09(r2, r0)
            if (r0 != 0) goto L_0x0221
            java.util.List r0 = A0a
            boolean r0 = A09(r2, r0)
            if (r0 != 0) goto L_0x0221
            java.util.List r0 = A0f
            boolean r0 = A09(r2, r0)
            if (r0 != 0) goto L_0x0221
            java.util.List r0 = A0e
            boolean r0 = A09(r2, r0)
            if (r0 != 0) goto L_0x0221
            java.util.List r0 = A0b
            boolean r0 = A09(r2, r0)
            if (r0 != 0) goto L_0x0221
            java.util.List r0 = A0c
            boolean r0 = A09(r2, r0)
            if (r0 != 0) goto L_0x0221
            java.util.List r0 = A0d
            boolean r0 = A09(r2, r0)
            if (r0 == 0) goto L_0x024d
        L_0x0221:
            r0 = 10296(0x2838, float:1.4428E-41)
            boolean r0 = X.C18020vd.A05(r1, r9, r0)
            if (r0 == 0) goto L_0x024d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r0 = r8.A06
            r1.append(r0)
            java.lang.String r0 = " ("
            r1.append(r0)
            java.lang.String r0 = r2.getHost()
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            goto L_0x0187
        L_0x024d:
            r0 = 2
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r0]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r0 = r8.A06
            r1.append(r0)
            java.lang.String r0 = " | "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2[r11] = r0
            r2[r5] = r6
            java.lang.CharSequence r6 = android.text.TextUtils.concat(r2)
            goto L_0x0187
        L_0x0270:
            java.lang.CharSequence r0 = X.C26302CxJ.A0C(r10, r9, r1)
            goto L_0x0131
        L_0x0276:
            r7 = 0
            goto L_0x009d
        L_0x0279:
            java.lang.String r6 = ""
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C217217d.A0J(X.206):java.lang.CharSequence");
    }

    public String A0K(AnonymousClass1E7 r6, AnonymousClass206 r7) {
        AnonymousClass1BI A0H2;
        C24921Me r4 = this.A04;
        AnonymousClass1BI r1 = r7.A0v.A00;
        int A092 = r4.A09(r6, r1);
        if (!r6.A0F() || (r7 instanceof C436420i) || (A0H2 = r7.A0H()) == null) {
            return r4.A0U(r6, A092, false);
        }
        String A0L2 = A0L(A0H2, r1);
        StringBuilder sb = new StringBuilder();
        sb.append(A0L2);
        sb.append(" @ ");
        sb.append(r4.A0U(r6, A092, false));
        return sb.toString();
    }

    public String A0L(AnonymousClass1BI r5, AnonymousClass1BI r6) {
        if (r5 == null) {
            Log.w("notification/messagepreview/getname remote_resource null");
            return "";
        }
        AnonymousClass1E7 A0H2 = this.A03.A0H(r5);
        C24921Me r2 = this.A04;
        return r2.A0U(A0H2, r2.A09(A0H2, r6), false);
    }

    public void A0M(C1409673t r17, AnonymousClass1E7 r18, C60182nW r19, boolean z, boolean z2, boolean z3, boolean z4) {
        Bitmap bitmap;
        C60182nW r10 = r19;
        if (A0P(r10, this.A0M.A0S(r10.A00.A0v.A00))) {
            Context context = this.A07.A00;
            C18030ve r9 = this.A08;
            AnonymousClass1NJ r7 = this.A0O;
            C24921Me r4 = this.A04;
            C18000vb r5 = this.A0L;
            AnonymousClass122 r6 = this.A0N;
            AnonymousClass1W6 r12 = (AnonymousClass1W6) this.A0U.get();
            AnonymousClass1E7 r8 = r18;
            boolean z5 = z3;
            if (!z3 || !z2) {
                bitmap = null;
            } else {
                bitmap = this.A0K.A03(context, r8, 400, 400);
            }
            AndroidWear.A02(context, bitmap, r4, r5, r6, r7, r8, r9, r10, this, r12, z, z5, z4).A04(r17);
        }
    }

    public boolean A0N(UserJid userJid) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ((C43551zz) this.A0D.A0a(userJid)).A0G();
        }
        return false;
    }

    public StatusBarNotification[] A0Q() {
        NotificationManager A072 = this.A05.A07();
        if (A072 != null) {
            try {
                return A072.getActiveNotifications();
            } catch (Exception e) {
                Log.w("notification-utils/failed to get active notifications: ", e);
            }
        }
        return new StatusBarNotification[0];
    }

    public C217217d(C218617r r2, AnonymousClass11S r3, C32191gn r4, AnonymousClass1VW r5, AnonymousClass1M9 r6, C24921Me r7, C27201Vd r8, AnonymousClass11C r9, AnonymousClass11P r10, AnonymousClass118 r11, C18000vb r12, AnonymousClass1CJ r13, AnonymousClass122 r14, AnonymousClass1NJ r15, C18030ve r16, AnonymousClass12L r17, C219317y r18, AnonymousClass1LU r19, C32011gU r20, WamediaManager wamediaManager, C32091gc r22, C26061Qr r23, AnonymousClass1Nb r24, C26611Su r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33) {
        this.A07 = r11;
        this.A0A = r19;
        this.A06 = r10;
        this.A08 = r16;
        this.A0R = r22;
        this.A0I = r3;
        this.A0M = r13;
        this.A01 = r2;
        this.A0Q = r20;
        this.A0O = r15;
        this.A0F = r26;
        this.A0P = r17;
        this.A0K = r8;
        this.A0J = r5;
        this.A03 = r6;
        this.A0H = r27;
        this.A05 = r9;
        this.A04 = r7;
        this.A0B = wamediaManager;
        this.A0L = r12;
        this.A0E = r25;
        this.A0N = r14;
        this.A0U = r28;
        this.A0W = r29;
        this.A0D = r24;
        this.A0T = r30;
        this.A0C = r23;
        this.A0V = r31;
        this.A02 = r4;
        this.A0G = r32;
        this.A09 = r18;
        this.A0S = r33;
    }

    public static NotificationPermissionBottomSheet A04() {
        int i = 2131894341;
        int i2 = 2131893047;
        int i3 = 2131893049;
        int i4 = 2131232282;
        int i5 = 2131232143;
        int i6 = 2131232358;
        if (AnonymousClass112.A03()) {
            i = 2131893045;
            i2 = 2131893046;
            i3 = 2131893048;
            i4 = 2131231627;
            i5 = 2131231950;
            i6 = 2131232282;
        }
        NotificationPermissionBottomSheet notificationPermissionBottomSheet = new NotificationPermissionBottomSheet();
        Bundle bundle = new Bundle();
        bundle.putInt("icon_id", 2131232143);
        bundle.putInt("title_id", 2131893051);
        bundle.putInt("message_id", 2131893050);
        bundle.putInt("line1_icon_id", i4);
        bundle.putInt("line2_icon_id", i5);
        bundle.putInt("line3_icon_id", i6);
        bundle.putString("permission_requestor_screen_type", (String) null);
        bundle.putStringArray("permissions", (String[]) null);
        bundle.putBoolean("is_first_time_request", true);
        bundle.putInt("nth_details_id", 0);
        bundle.putInt("line1_message_id", i);
        bundle.putInt("line2_message_id", i2);
        bundle.putInt("line3_message_id", i3);
        bundle.putBoolean("should_disable_cancel_on_outside_click", false);
        bundle.putBoolean("should_hide_cancel_button_on_1st_time", false);
        notificationPermissionBottomSheet.A1R(bundle);
        return notificationPermissionBottomSheet;
    }

    public static String A06(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return context.getString(2131896011);
        }
        Ringtone ringtone = RingtoneManager.getRingtone(context, Uri.parse(str));
        if (ringtone == null) {
            return null;
        }
        try {
            return ringtone.getTitle(context);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void A08(Context context, C1409673t r4, AnonymousClass1E7 r5, AnonymousClass1LU r6, int i) {
        Intent A1v = r6.A1v(context, r5, Integer.valueOf(i));
        A1v.addFlags(335544320);
        A1v.putExtra("should_show_block_report_dialog", true);
        r4.A08(2131231719, context.getString(2131893059), C1408573i.A00(context, 0, A1v, 134217728));
    }

    private boolean A0A(AnonymousClass206 r4) {
        AnonymousClass1BI A0H2 = r4.A0H();
        if (A0H2 == null) {
            Log.e("NotificationUtils/canSenderShowNotifications/senderJid is null");
            return false;
        } else if (!C22971Dz.A0T(A0H2) || (A0H2 = ((C24751Ln) this.A0W.get()).A0D((AnonymousClass1E1) A0H2)) != null) {
            return this.A0D.A0a(A0H2).A0B();
        } else {
            Log.w("NotificationUtils/canSenderShowNotifications/senderJid lid not map to pn");
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0.A0H() != null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0C(X.AnonymousClass206 r4) {
        /*
            X.206 r0 = r4.A0K()
            r3 = 1
            if (r0 == 0) goto L_0x000e
            X.1BI r0 = r0.A0H()
            r2 = 1
            if (r0 == 0) goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            X.205 r1 = r4.A0v
            X.1BI r0 = r1.A00
            boolean r0 = X.C22971Dz.A0e(r0)
            if (r0 == 0) goto L_0x0020
            if (r2 == 0) goto L_0x0020
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0020
            return r3
        L_0x0020:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C217217d.A0C(X.206):boolean");
    }

    public boolean A0O(UserJid userJid) {
        int currentInterruptionFilter;
        Cursor A032;
        C17960vV.A01();
        AnonymousClass1M9 r4 = this.A03;
        AnonymousClass1E7 A0H2 = r4.A0H(userJid);
        AnonymousClass11C r6 = this.A05;
        NotificationManager A072 = r6.A07();
        if (!(A072 == null || Build.VERSION.SDK_INT < 28 || (currentInterruptionFilter = A072.getCurrentInterruptionFilter()) == 1 || currentInterruptionFilter == 0)) {
            NotificationManager.Policy notificationPolicy = A072.getNotificationPolicy();
            if (notificationPolicy == null) {
                Log.i("NotificationUtils/shouldCallBeSilencedByDNDMode NotificationManager policy is null");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("NotificationUtils/shouldCallBeSilencedByDNDMode NotificationManager policy ");
                sb.append(notificationPolicy);
                Log.i(sb.toString());
                if ((notificationPolicy.priorityCategories & 8) == 0) {
                    Log.i("NotificationUtils/shouldCallBeSilencedByDNDMode Calls not allowed in DND");
                    return true;
                }
                int i = notificationPolicy.priorityCallSenders;
                if (i == 1) {
                    if (A0H2.A0H == null) {
                        return true;
                    }
                } else if (i == 2) {
                    AnonymousClass11B A0O2 = r6.A0O();
                    C17960vV.A01();
                    Uri A092 = r4.A09(A0H2, A0O2);
                    boolean z = false;
                    if (A092 == null || (A032 = A0O2.A03(A092, (String[]) null, "starred==1", (String[]) null, (String) null)) == null) {
                        return true;
                    }
                    try {
                        if (A032.moveToNext()) {
                            z = true;
                        }
                        A032.close();
                        if (!z) {
                            return true;
                        }
                    } catch (Throwable th) {
                        AnonymousClass0DT.A00(th, th);
                        throw th;
                    }
                }
            }
        }
        return false;
    }

    public C217217d() {
    }
}
