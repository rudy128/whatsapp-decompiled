package X;

import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.2td  reason: invalid class name and case insensitive filesystem */
public class C63752td {
    public final AnonymousClass11C A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass1KW A02;
    public final C18030ve A03;
    public final C53542ch A04;
    public final C18010vc A05;
    public final AnonymousClass11S A06;
    public final C86224Qu A07;
    public final AnonymousClass1M9 A08;
    public final C25181Nf A09;
    public final AnonymousClass126 A0A;
    public final C24901Mc A0B;

    public static String A01(Context context, C18000vb r7, AnonymousClass22U r8) {
        BigDecimal bigDecimal;
        String str = r8.A06;
        if (str == null || (bigDecimal = r8.A0B) == null) {
            return null;
        }
        return C17880vN.A0q(context, new A6S(str).A03(r7, bigDecimal, true), new Object[1], 0, 2131887953);
    }

    public boolean A04(AnonymousClass206 r9) {
        AnonymousClass1E7 r5;
        AnonymousClass205 r2 = r9.A0v;
        if (!r2.A02) {
            C24901Mc r1 = this.A0B;
            AnonymousClass1BI r52 = r2.A00;
            C17960vV.A07(r52);
            C18070vi.A0d(r52, 0);
            if (C24901Mc.A00(r52, r1) != 1) {
                C86224Qu r22 = this.A07;
                C18030ve r12 = r22.A02;
                C18040vf r3 = C18040vf.A02;
                if ((!C18020vd.A05(r3, r12, 12134) || !r22.A00(r52)) && !(!AnonymousClass1EG.A0H(C20120A8f.A04(r9)))) {
                    if (r9.A11(4194304)) {
                        C18030ve r13 = this.A03;
                        if (C18020vd.A05(r3, r13, 9804) && C18020vd.A05(r3, r13, 10336)) {
                            return true;
                        }
                    }
                    AnonymousClass1E7 A012 = this.A09.A01(r52);
                    if (A012.A0F()) {
                        AnonymousClass1BI A0H = r9.A0H();
                        if (A0H == null) {
                            return false;
                        }
                        AnonymousClass1M9 r32 = this.A08;
                        AnonymousClass1E7 A0H2 = r32.A0H(A0H);
                        Class<AnonymousClass1EC> cls = AnonymousClass1EC.class;
                        UserJid A0K = r32.A0K((GroupJid) A012.A06(cls));
                        if (A0K != null) {
                            r5 = r32.A0H(A0K);
                        } else {
                            r5 = null;
                        }
                        PhoneUserJid A013 = AnonymousClass11S.A01(this.A06);
                        AnonymousClass126 r0 = this.A0A;
                        Jid A062 = A012.A06(cls);
                        C17960vV.A07(A062);
                        if (r0.A0O.A0O((AnonymousClass1EC) A062) || ((r5 != null && (r5.A0H != null || A013.equals(r5.A0J))) || A0H2.A0H != null || A0H2.A0A == 3)) {
                            return true;
                        }
                        return false;
                    } else if (A012.A0H == null && A012.A0A != 3) {
                        if (C22971Dz.A0V(A012.A0J)) {
                            C46162Dk r23 = (C46162Dk) this.A01.A0A(A012.A0J);
                            if (r23 == null) {
                                return false;
                            }
                            if (AnonymousClass000.A1Z(r23.A05, AnonymousClass9IW.VERIFIED) || !AnonymousClass000.A1Z(r23.A02, C179509Ig.GUEST)) {
                                return true;
                            }
                            return C18020vd.A05(r3, this.A03, 3209);
                        } else if (C22971Dz.A00) {
                            int type = r52.getType();
                            if (type == 8 || type == 7) {
                                return true;
                            }
                            return false;
                        } else if ((r52 instanceof C173458v6) || (r52 instanceof C42541yL)) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public C63752td(AnonymousClass11S r1, C86224Qu r2, AnonymousClass1M9 r3, AnonymousClass11C r4, AnonymousClass1CJ r5, C25181Nf r6, AnonymousClass1KW r7, C18030ve r8, AnonymousClass126 r9, C53542ch r10, C18010vc r11, C24901Mc r12) {
        this.A03 = r8;
        this.A06 = r1;
        this.A01 = r5;
        this.A02 = r7;
        this.A0B = r12;
        this.A08 = r3;
        this.A00 = r4;
        this.A0A = r9;
        this.A04 = r10;
        this.A05 = r11;
        this.A09 = r6;
        this.A07 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.5c3, java.lang.Object] */
    public static C108645c3 A00(Context context) {
        C108645c3 inlineVideoPlaybackHandler;
        C108885cS A012 = C88404Zo.A01(context);
        if (A012 == null || (inlineVideoPlaybackHandler = A012.getInlineVideoPlaybackHandler()) == null) {
            return new Object();
        }
        return inlineVideoPlaybackHandler;
    }

    public static String A02(C18000vb r5, AnonymousClass22U r6) {
        int i = r6.A00;
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, i);
        return r5.A0K(objArr, 2131755459, (long) i);
    }

    public static void A03(Context context, AnonymousClass1KB r11, AnonymousClass11S r12, AnonymousClass1M9 r13, C24921Me r14, AnonymousClass11C r15, C18000vb r16, C18030ve r17, C32091gc r18, C18010vc r19, C42341y1 r20, Collection collection) {
        String A0P;
        String A0I;
        HashSet A12 = C17880vN.A12();
        StringBuilder A10 = AnonymousClass000.A10();
        StringBuilder A102 = AnonymousClass000.A10();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            if (!TextUtils.isEmpty(A0Y.A0S())) {
                A0P = A0Y.A0S();
            } else if (!A0Y.A0z(8) || A0Y.A0L().A00 == null) {
                int i = A0Y.A0u;
                if (i == 0 || i == 32 || i == 46) {
                    A0P = A0Y.A0P();
                } else {
                    A0P = null;
                    if (A0Y instanceof AnonymousClass21K) {
                        C20083A6j A012 = r20.A01((AnonymousClass21K) A0Y);
                        if (A012 != null) {
                            A0P = A012.A0A();
                        }
                    } else if (A0Y instanceof AnonymousClass22Q) {
                        A0P = ((AnonymousClass22Q) A0Y).A1G();
                    } else if (A0Y instanceof C438921i) {
                        A0P = ((C438921i) A0Y).A01;
                    } else if (A0Y instanceof AnonymousClass21V) {
                        A0P = ((AnonymousClass21V) A0Y).A18();
                    } else if (A0Y instanceof C439521o) {
                        A0P = ((C439521o) A0Y).A1B();
                    }
                }
            } else {
                A0P = C20097A7a.A03(A0Y.A0L().A00, A0Y.A0P());
            }
            if (!TextUtils.isEmpty(A0P)) {
                if (C87494Vu.A00(A0Y) && C26302CxJ.A0W(r17)) {
                    A0P = C26302CxJ.A0F(A0P);
                }
                StringBuilder A103 = AnonymousClass000.A10();
                if (A10.length() != 0) {
                    A103.append(10);
                }
                if (collection.size() > 1) {
                    A103.append('[');
                    A103.append(DateUtils.formatDateTime(context, A0Y.A0I, 655377));
                    A103.append("] ");
                    if (A0Y.A0v.A02) {
                        A0I = r12.A0D();
                    } else {
                        A0I = r14.A0I(r13.A0H(A0Y.A0I()));
                    }
                    A103.append(A0I);
                    A103.append(": ");
                }
                A10.append(A103);
                A102.append(A103);
                A102.append(A0P);
                if (A0Y.A0h != null) {
                    A10.append(r18.A02(context, A0Y, A0P));
                    A12.addAll(A0Y.A0h);
                } else {
                    A10.append(A0P);
                }
            }
        }
        String obj = A10.toString();
        SharedPreferences.Editor edit = r19.A05(C19620yd.A09).edit();
        if (!A12.isEmpty()) {
            edit.putString("copied_message", obj);
            edit.putString("copied_message_without_mentions", A102.toString());
            edit.putString("copied_message_jids", AnonymousClass4aJ.A01(A12));
        } else {
            edit.remove("copied_message");
            edit.remove("copied_message_without_mentions");
            edit.remove("copied_message_jids");
        }
        edit.apply();
        try {
            r15.A09().setPrimaryClip(ClipData.newPlainText(obj, obj));
            if (collection.size() == 1) {
                r11.A08(2131892051, 0);
                return;
            }
            long size = (long) collection.size();
            Object[] objArr = new Object[1];
            C17880vN.A1T(objArr, collection.size(), 0);
            r11.A0G(r16.A0K(objArr, 2131755232, size), 0);
        } catch (NullPointerException | SecurityException e) {
            Log.e("conversation/copymessage/npe", e);
            r11.A08(2131897878, 0);
        }
    }
}
