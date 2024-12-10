package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.jid.UserJid;
import java.io.File;

/* renamed from: X.72W  reason: invalid class name */
public abstract class AnonymousClass72W {
    public static String A02(Context context, AnonymousClass1M9 r14, C24921Me r15, AnonymousClass11P r16, C18000vb r17, C441822l r18) {
        Object[] objArr;
        int i;
        AnonymousClass1E7 A0H;
        int i2;
        Object[] A1a;
        int i3;
        int i4;
        C441822l r6 = r18;
        C18000vb r5 = r17;
        String A07 = C64052u8.A07(r5, (long) Math.max(0, r6.A0D * 1000));
        String A00 = A8I.A00(r5, r16.A09(r6.A0I));
        boolean A1T = AnonymousClass000.A1T(r6.A09, 1);
        AnonymousClass205 r1 = r6.A0v;
        if (r1.A02) {
            int A0D = r6.A0D();
            if (A0D == 1) {
                i2 = 2131886782;
                if (A1T) {
                    i2 = 2131898057;
                }
            } else if (A0D == 5) {
                if (A1T) {
                    String string = context.getString(2131898070);
                    boolean A1T2 = AnonymousClass000.A1T(r6.A0C(), 1);
                    boolean A1T3 = AnonymousClass000.A1T(C63892tr.A00(r6), 1);
                    boolean z = r6.A0q;
                    if ((A1T2 && A1T3) || (z && A1T3)) {
                        i = 2131898067;
                        objArr = new Object[5];
                        objArr[0] = A07;
                        int i5 = 2131898069;
                        if (A1T2) {
                            i5 = 2131898061;
                        }
                        objArr[1] = context.getString(i5);
                        objArr[2] = context.getString(2131898064);
                        objArr[3] = A00;
                        objArr[4] = string;
                        return context.getString(i, objArr);
                    } else if (!A1T2 && !A1T3 && !z) {
                        return C17880vN.A0q(context, string, C108945cZ.A1a(A07, A00, 3, 1), 2, 2131898065);
                    } else {
                        i = 2131898066;
                        objArr = new Object[4];
                        objArr[0] = A07;
                        if (A1T2) {
                            i4 = 2131898061;
                        } else {
                            i4 = 2131898069;
                            if (A1T3) {
                                i4 = 2131898064;
                            }
                        }
                        objArr[1] = context.getString(i4);
                        objArr[2] = A00;
                        objArr[3] = string;
                        return context.getString(i, objArr);
                    }
                } else {
                    i2 = 2131886781;
                }
            } else if (A0D == 13) {
                i2 = 2131886783;
                if (A1T) {
                    i2 = 2131898059;
                }
            } else if (A0D == 8) {
                i2 = 2131898058;
            } else {
                i2 = 2131886780;
                if (A1T) {
                    i2 = 2131898056;
                }
            }
            A1a = C108945cZ.A1a(A07, A00, 2, 1);
        } else {
            if (r6.A0w()) {
                A0H = new AnonymousClass1E7(r1.A00);
            } else {
                UserJid A0I = r6.A0I();
                C17960vV.A07(A0I);
                A0H = r14.A0H(A0I);
            }
            String A0O = r15.A0O(A0H);
            int A0D2 = r6.A0D();
            if (A0D2 == 9 || A0D2 == 10) {
                int i6 = 2131886779;
                if (A1T) {
                    i6 = 2131898055;
                }
                A1a = C108945cZ.A1a(A0O, A07, 3, 1);
                A1a[2] = A00;
            } else if (A1T) {
                boolean A1T4 = AnonymousClass000.A1T(r6.A0C(), 1);
                boolean A1T5 = AnonymousClass000.A1T(C63892tr.A00(r6), 1);
                boolean z2 = r6.A0q;
                if (r6.A02.A0G == null) {
                    Object[] A1a2 = C108945cZ.A1a(A0O, A07, 4, 1);
                    A1a2[2] = A00;
                    return C17880vN.A0q(context, AnonymousClass25A.A0C(r5, r6.A01), A1a2, 3, 2131898060);
                } else if ((A1T4 && A1T5) || (z2 && A1T5)) {
                    i = 2131898073;
                    objArr = C108945cZ.A1a(A0O, A07, 5, 1);
                    int i7 = 2131898069;
                    if (A1T4) {
                        i7 = 2131898061;
                    }
                    objArr[2] = context.getString(i7);
                    objArr[3] = context.getString(2131898064);
                    objArr[4] = A00;
                    return context.getString(i, objArr);
                } else if (A1T4 || A1T5 || z2) {
                    i = 2131898063;
                    objArr = C108945cZ.A1a(A0O, A07, 4, 1);
                    if (A1T4) {
                        i3 = 2131898061;
                    } else {
                        i3 = 2131898069;
                        if (A1T5) {
                            i3 = 2131898064;
                        }
                    }
                    objArr[2] = context.getString(i3);
                    objArr[3] = A00;
                    return context.getString(i, objArr);
                } else {
                    i = 2131898054;
                    objArr = C108945cZ.A1a(A0O, A07, 3, 1);
                    objArr[2] = A00;
                    return context.getString(i, objArr);
                }
            } else if (r6.A02.A0G != null) {
                return C17880vN.A0q(context, A00, C108945cZ.A1a(A0O, A07, 3, 1), 2, 2131886778);
            } else {
                Object[] A1a3 = C108945cZ.A1a(A0O, A07, 4, 1);
                A1a3[2] = A00;
                return C17880vN.A0q(context, AnonymousClass25A.A0C(r5, r6.A01), A1a3, 3, 2131886784);
            }
        }
        return context.getString(i2, A1a);
    }

    public static int A00(C441822l r2) {
        File file;
        C62572rc A00 = AnonymousClass206.A00(r2);
        if (A00.A0f) {
            return 0;
        }
        if (A00.A07 == 1) {
            return 1;
        }
        if (!A00.A0V || (file = A00.A0G) == null) {
            return 3;
        }
        File A17 = C108945cZ.A17(Uri.fromFile(file).getPath());
        if (!A17.exists() || !A17.canRead()) {
            return 2;
        }
        return 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r1 == 10) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r6.A09 != 1) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r6.A0D() == 8) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable A01(android.content.Context r5, X.C441822l r6) {
        /*
            boolean r0 = r6.A0w()
            if (r0 == 0) goto L_0x0046
            int r0 = r6.A09
            r4 = 1
            if (r0 == r4) goto L_0x0046
        L_0x000b:
            X.205 r0 = r6.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0033
            int r2 = r6.A0D()
            r0 = 8
            r1 = 2131101888(0x7f0608c0, float:1.7816198E38)
            if (r2 != r0) goto L_0x0026
        L_0x001c:
            r3 = 2130970568(0x7f0407c8, float:1.754985E38)
            r2 = 2131101887(0x7f0608bf, float:1.7816196E38)
        L_0x0022:
            int r1 = X.AnonymousClass1YL.A00(r5, r3, r2)
        L_0x0026:
            r0 = 2131232104(0x7f080568, float:1.8080308E38)
            if (r4 == 0) goto L_0x002e
            r0 = 2131231963(0x7f0804db, float:1.8080022E38)
        L_0x002e:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r5, r0, r1)
            return r0
        L_0x0033:
            int r1 = r6.A0D()
            r0 = 9
            if (r1 == r0) goto L_0x001c
            r0 = 10
            r3 = 2130970570(0x7f0407ca, float:1.7549854E38)
            r2 = 2131101889(0x7f0608c1, float:1.78162E38)
            if (r1 != r0) goto L_0x0022
            goto L_0x001c
        L_0x0046:
            r4 = 0
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72W.A01(android.content.Context, X.22l):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (r6 == 10) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C441822l r7, com.whatsapp.search.views.itemviews.AudioPlayerView r8, com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r9) {
        /*
            android.content.Context r5 = r9.getContext()
            X.205 r3 = r7.A0v
            boolean r2 = r3.A02
            int r6 = r7.A0D()
            if (r2 == 0) goto L_0x0061
            r0 = 8
            if (r6 != r0) goto L_0x004c
            boolean r0 = r7.A0w()
            if (r0 != 0) goto L_0x004c
        L_0x0018:
            r4 = 2130971735(0x7f040c57, float:1.7552217E38)
            r1 = 2131102862(0x7f060c8e, float:1.7818174E38)
        L_0x001e:
            int r0 = X.AnonymousClass1YL.A00(r5, r4, r1)
            r4 = r0
        L_0x0023:
            r9.setIconColorTint(r4)
            int r0 = X.C19740yt.A00(r5, r0)
            r8.setSeekbarColor(r0)
            X.2rc r1 = X.AnonymousClass206.A00(r7)
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x004b
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x004b
            boolean r0 = r7.A0l
            if (r0 == 0) goto L_0x0047
            if (r2 == 0) goto L_0x0047
            X.1BI r0 = r3.A00
            boolean r0 = X.C22971Dz.A0N(r0)
            if (r0 == 0) goto L_0x004b
        L_0x0047:
            r0 = 0
            r8.setSeekbarColor(r0)
        L_0x004b:
            return
        L_0x004c:
            r1 = 2130971736(0x7f040c58, float:1.7552219E38)
            r0 = 2131102863(0x7f060c8f, float:1.7818176E38)
            int r4 = X.AnonymousClass1YL.A00(r5, r1, r0)
            r1 = 2130968700(0x7f04007c, float:1.7546061E38)
            r0 = 2131099787(0x7f06008b, float:1.7811937E38)
            int r0 = X.AnonymousClass1YL.A00(r5, r1, r0)
            goto L_0x0023
        L_0x0061:
            r0 = 9
            if (r6 == r0) goto L_0x0018
            r0 = 10
            r4 = 2130971734(0x7f040c56, float:1.7552215E38)
            r1 = 2131102861(0x7f060c8d, float:1.7818172E38)
            if (r6 != r0) goto L_0x001e
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72W.A03(X.22l, com.whatsapp.search.views.itemviews.AudioPlayerView, com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView):void");
    }
}
