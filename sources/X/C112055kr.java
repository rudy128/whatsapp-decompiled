package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.5kr  reason: invalid class name and case insensitive filesystem */
public class C112055kr extends C38391rD {
    public final List A00;
    public final boolean A01;
    public final /* synthetic */ C143087By A02;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        int i2;
        if (i == 0) {
            i2 = 2131625906;
        } else if (i == 1) {
            i2 = 2131625907;
        } else if (i != 3) {
            i2 = 2131625905;
            if (i != 4) {
                i2 = 2131625908;
            }
        } else {
            i2 = 2131625909;
        }
        C143087By r2 = this.A02;
        View A09 = AnonymousClass3MX.A09(r2.A05.getLayoutInflater(), viewGroup, i2);
        if (i == 2) {
            return new AnonymousClass68C(A09, r2);
        }
        if (i == 3) {
            return new AnonymousClass68A(A09, r2);
        }
        if (i != 4) {
            return new AnonymousClass68D(A09, r2);
        }
        return new AnonymousClass68B(A09, r2);
    }

    public C112055kr(C143087By r1, List list, boolean z) {
        this.A02 = r1;
        this.A00 = list;
        this.A01 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r3.A01 != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0Q() {
        /*
            r3 = this;
            java.util.List r0 = r3.A00
            int r2 = r0.size()
            X.7By r1 = r3.A02
            X.2nL r0 = r1.A0P
            if (r0 != 0) goto L_0x0015
            X.2nL r0 = r1.A0O
            if (r0 != 0) goto L_0x0015
            boolean r1 = r3.A01
            r0 = 1
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            int r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112055kr.A0Q():int");
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r14, int i) {
        List list;
        String A0q;
        int i2;
        TextView textView;
        String A0q2;
        TextUtils.TruncateAt truncateAt;
        C112965mK r142 = (C112965mK) r14;
        C143087By r1 = this.A02;
        if (r1.A0P != null || r1.A0O != null || this.A01) {
            list = this.A00;
        } else if (i != 0) {
            list = this.A00;
            i--;
        } else {
            return;
        }
        C60072nL r3 = (C60072nL) list.get(i);
        AnonymousClass1E7 A0E = r1.A0z.A0E(r3.A06);
        if (A0E == null) {
            return;
        }
        if (r142 instanceof AnonymousClass68C) {
            AnonymousClass68C r143 = (AnonymousClass68C) r142;
            r143.A00 = A0E;
            AnonymousClass3MZ.A1O(r143.A0H, r143, r3, 8);
            AnonymousClass1E7 r12 = r143.A00;
            C143087By r4 = r143.A04;
            AnonymousClass11S r0 = r4.A0y;
            r0.A0I();
            boolean equals = r12.equals(r0.A0D);
            TextEmojiLabel textEmojiLabel = r143.A02;
            if (equals) {
                textEmojiLabel.setText(2131898595);
                String A09 = C64052u8.A09(r4.A12, r4.A14.A0H(r4.A0I) - AnonymousClass11P.A01(r4.A11));
                TextEmojiLabel textEmojiLabel2 = r143.A03;
                textEmojiLabel2.setText(A09);
                textEmojiLabel2.setVisibility(0);
            } else {
                C24921Me r2 = r4.A10;
                textEmojiLabel.A0R(r2.A0I(r143.A00));
                boolean A0j = r2.A0j(r143.A00, -1);
                TextEmojiLabel textEmojiLabel3 = r143.A03;
                if (A0j) {
                    textEmojiLabel3.setVisibility(0);
                    textEmojiLabel3.A0R(AnonymousClass3MX.A17(r2, r143.A00));
                } else {
                    textEmojiLabel3.setVisibility(8);
                }
            }
            r4.A0H.A0C(r143.A01, r143.A00, false);
        } else if (r142 instanceof AnonymousClass68D) {
            AnonymousClass68D r144 = (AnonymousClass68D) r142;
            r144.A00 = A0E;
            AnonymousClass3MZ.A1O(r144.A0H, r144, r3, 7);
            C143087By r7 = r144.A06;
            AnonymousClass11P r10 = r7.A11;
            long A012 = AnonymousClass11P.A01(r10);
            AnonymousClass1E7 r13 = r144.A00;
            AnonymousClass11S r02 = r7.A0y;
            r02.A0I();
            boolean equals2 = r13.equals(r02.A0D);
            TextEmojiLabel textEmojiLabel4 = r144.A04;
            if (equals2) {
                textEmojiLabel4.setText(2131898595);
                AnonymousClass3Ma.A1D(r144.A02, r144, 2);
                long A0H = r7.A14.A0H(r7.A0I) - A012;
                if (A0H >= 0) {
                    String A092 = C64052u8.A09(r7.A12, A0H);
                    TextView textView2 = r144.A03;
                    textView2.setText(A092);
                    textView2.setVisibility(0);
                } else {
                    textView = r144.A03;
                    textView.setVisibility(8);
                }
            } else {
                C24921Me r9 = r7.A10;
                textEmojiLabel4.A0R(r9.A0P(r144.A00));
                long j = r3.A05;
                if (A012 - j < 60000) {
                    A0q2 = r7.A05.getString(2131891806);
                } else {
                    A0q2 = C17880vN.A0q(r7.A05, A8I.A00(r7.A12, r10.A09(j)), AnonymousClass3MW.A1a(), 0, 2131891773);
                }
                r144.A02.setText(A0q2);
                boolean A0j2 = r9.A0j(r144.A00, -1);
                TextEmojiLabel textEmojiLabel5 = r144.A05;
                textView = textEmojiLabel5;
                if (A0j2) {
                    textEmojiLabel5.setVisibility(0);
                    boolean A05 = C18020vd.A05(C18040vf.A02, r7.A13, 8000);
                    AnonymousClass1E7 r03 = r144.A00;
                    if (A05) {
                        textEmojiLabel5.A0R(r9.A0I(r03));
                        truncateAt = TextUtils.TruncateAt.END;
                    } else {
                        textEmojiLabel5.A0R(AnonymousClass3MX.A17(r9, r03));
                        truncateAt = null;
                    }
                    textEmojiLabel5.setEllipsize(truncateAt);
                }
                textView.setVisibility(8);
            }
            r7.A0H.A0C(r144.A01, r144.A00, false);
        } else if (r142 instanceof AnonymousClass68B) {
            AnonymousClass68B r145 = (AnonymousClass68B) r142;
            TextView textView3 = r145.A00;
            C143087By r102 = r145.A01;
            AnonymousClass11P r22 = r102.A11;
            long A093 = r22.A09(r3.A05);
            int A002 = A87.A00(30, AnonymousClass11P.A01(r22), A093);
            if (A002 <= 6) {
                if (A002 != 0) {
                    if (A002 != 1) {
                        Calendar instance = Calendar.getInstance();
                        instance.setTimeInMillis(A093);
                        switch (instance.get(7)) {
                            case 1:
                                i2 = 2131891765;
                                break;
                            case 2:
                                i2 = 2131891763;
                                break;
                            case 3:
                                i2 = 2131891768;
                                break;
                            case 4:
                                i2 = 2131891769;
                                break;
                            case 5:
                                i2 = 2131891766;
                                break;
                            case 6:
                                i2 = 2131891762;
                                break;
                            case 7:
                                i2 = 2131891764;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                    } else {
                        i2 = 2131891770;
                    }
                } else {
                    i2 = 2131891767;
                }
                C18000vb r5 = r102.A12;
                A0q = A8I.A01(r5, C17880vN.A0q(r102.A05, A8I.A00(r5, A093), new Object[1], 0, i2), A093);
            } else {
                A0q = C17880vN.A0q(r102.A05, C64052u8.A03(r102.A12, A002, A093), new Object[1], 0, 2131891761);
            }
            textView3.setText(A0q);
        }
    }

    public int getItemViewType(int i) {
        if (this.A01) {
            return 2;
        }
        C143087By r3 = this.A02;
        if (r3.A0P == null && r3.A0O == null) {
            if (i == 0) {
                return 3;
            }
            i--;
        }
        List list = this.A00;
        if (list.get(i) == r3.A0O) {
            return 4;
        }
        if (list.get(i) == r3.A0P) {
            return 0;
        }
        return 1;
    }
}
