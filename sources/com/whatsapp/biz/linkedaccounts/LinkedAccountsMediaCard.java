package com.whatsapp.biz.linkedaccounts;

import X.AEB;
import X.AEW;
import X.AVS;
import X.AnonymousClass000;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1HF;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass72R;
import X.AnonymousClass7I8;
import X.AnonymousClass9AV;
import X.C108945cZ;
import X.C108965cb;
import X.C115525vC;
import X.C136376ti;
import X.C1417376t;
import X.C18000vb;
import X.C196089uR;
import X.C20248ADg;
import X.C20467AMe;
import X.C21070Ae0;
import X.C27691Xc;
import X.C56452hU;
import X.C77523qH;
import X.C85774Or;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.ui.media.MediaCard;
import java.text.NumberFormat;
import java.util.Set;

public class LinkedAccountsMediaCard extends MediaCard {
    public AnonymousClass1L9 A00;
    public C56452hU A01;
    public AVS A02;
    public UserJid A03;
    public C196089uR A04;
    public AnonymousClass9AV A05;
    public int A06;
    public boolean A07;

    public void A01() {
        if (!this.A07) {
            this.A07 = true;
            C27691Xc r2 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r2.A10;
            this.A03 = AnonymousClass10E.A6Q(r1);
            this.A00 = AnonymousClass3MZ.A0N(r1);
            AnonymousClass10G r12 = r1.A00;
            this.A04 = (C196089uR) r12.ACu.get();
            this.A05 = (AnonymousClass9AV) r12.ACv.get();
            this.A01 = (C56452hU) r2.A0z.A2v.get();
        }
    }

    public void A06(AttributeSet attributeSet) {
        if (this.A00 == null) {
            super.A06(attributeSet);
            ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
            layoutParams.height = getThumbnailPixelSize();
            this.A00.setLayoutParams(layoutParams);
            this.A06 = getThumbnailPixelSize();
            TextView A0J = AnonymousClass3MW.A0J(this, 2131432374);
            TextView A0J2 = AnonymousClass3MW.A0J(this, 2131432369);
            A0J.setAllCaps(false);
            A0J2.setAllCaps(false);
            this.A04.A00 = this.A06;
        }
    }

    public void A09() {
        AnonymousClass7I8 r1;
        C196089uR r3 = this.A04;
        if (!r3.A02) {
            Set<C20467AMe> set = r3.A03;
            for (C20467AMe A022 : set) {
                r3.A02(A022);
            }
            set.clear();
            C115525vC r12 = r3.A01;
            if (r12 != null) {
                r12.A04(false);
                r3.A01 = null;
            }
            r3.A02 = true;
        }
        AVS avs = this.A02;
        if (avs != null && (r1 = avs.A00) != null && avs.equals(r1.A00)) {
            r1.A00 = null;
        }
    }

    public void setup(UserJid userJid, boolean z, AEW aew, int i, Integer num, C1417376t r30, boolean z2, boolean z3, AnonymousClass72R r33) {
        AEB aeb;
        UserJid userJid2 = userJid;
        if (!userJid2.equals(this.A03)) {
            this.A03 = userJid2;
            AnonymousClass1L9 r13 = this.A00;
            C18000vb r1 = this.A03;
            C1417376t r17 = r30;
            AnonymousClass72R r16 = r33;
            C18000vb r19 = r1;
            AnonymousClass9AV r20 = this.A05;
            this.A02 = new AVS(r13, this.A01, this, r16, r17, aew, r19, r20, num, i, z3);
            this.A00.removeAllViews();
            if (!z || !this.A02.A02(userJid2)) {
                AVS avs = this.A02;
                LinkedAccountsMediaCard linkedAccountsMediaCard = avs.A05;
                int i2 = avs.A02;
                Context context = avs.A03;
                int i3 = 2131899087;
                if (i2 == 0) {
                    i3 = 2131899027;
                }
                linkedAccountsMediaCard.setTitle(context.getString(i3));
                C20248ADg aDg = avs.A08.A06;
                if (aDg != null) {
                    if (i2 == 0) {
                        aeb = aDg.A00;
                    } else if (i2 == 1) {
                        aeb = aDg.A01;
                    }
                    if (aeb != null) {
                        int i4 = aeb.A00;
                        String str = aeb.A01;
                        if (i4 > 0) {
                            int i5 = 2131755194;
                            if (i2 == 0) {
                                i5 = 2131755142;
                            }
                            String format = NumberFormat.getIntegerInstance(avs.A09.A0N()).format((long) i4);
                            String quantityString = context.getResources().getQuantityString(i5, i4, new Object[]{str, format});
                            int i6 = 35;
                            if (C108965cb.A08(context).densityDpi <= 240) {
                                i6 = 25;
                            }
                            int length = quantityString.length();
                            if (length > i6) {
                                int i7 = length - i6;
                                int length2 = str.length();
                                if (i7 > length2) {
                                    str = "";
                                } else {
                                    String substring = str.substring(0, length2 - i7);
                                    if (substring.length() < length2) {
                                        str = AnonymousClass000.A0y("... ", AnonymousClass000.A11(substring));
                                    }
                                }
                            }
                            str = context.getResources().getQuantityString(i5, i4, C108945cZ.A1a(str, format, 2, 1));
                        }
                        linkedAccountsMediaCard.setMediaInfo(str);
                    }
                }
                linkedAccountsMediaCard.setSeeMoreClickListener(new C21070Ae0(avs, 1));
                AVS avs2 = this.A02;
                if (!avs2.A01) {
                    avs2.A05.A07((View.OnClickListener) null, 3);
                    avs2.A01 = true;
                }
                AVS avs3 = this.A02;
                int i8 = this.A06;
                if (avs3.A02(userJid2)) {
                    avs3.A01(userJid2);
                    return;
                }
                AnonymousClass7I8 A002 = avs3.A04.A00(avs3, new C136376ti(userJid2, i8, i8, avs3.A02, false, false, false));
                avs3.A00 = A002;
                A002.A02();
                return;
            }
            this.A02.A01(userJid2);
        }
    }

    public LinkedAccountsMediaCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A06(attributeSet);
    }

    public C77523qH A02(ViewGroup.LayoutParams layoutParams, C85774Or r5, int i) {
        C77523qH A022 = super.A02(layoutParams, r5, i);
        A022.A01 = getResources().getDimension(2131165780);
        return A022;
    }

    public View getOpenProfileView() {
        View A09 = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(this), this, 2131625820);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131167706);
        int i = this.A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        A09.setLayoutParams(layoutParams);
        return AnonymousClass1HF.A06(A09, 2131432036);
    }

    public int getThumbnailPixelSize() {
        return getResources().getDimensionPixelSize(2131167227);
    }

    public LinkedAccountsMediaCard(Context context) {
        this(context, (AttributeSet) null);
    }

    public LinkedAccountsMediaCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
