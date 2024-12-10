package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.TemplateRowContentLayout;
import java.util.List;

/* renamed from: X.3si  reason: invalid class name and case insensitive filesystem */
public class C78383si extends AnonymousClass3uP {
    public AnonymousClass00H A00;
    public boolean A01;
    public final AnonymousClass1GP A02;
    public final TextEmojiLabel A03 = ((TextEmojiLabel) findViewById(2131436244));
    public final TemplateRowContentLayout A04 = ((TemplateRowContentLayout) findViewById(2131436035));

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    private void A00() {
        boolean z;
        int i;
        int i2;
        C439521o r5 = (C439521o) getFMessage();
        List list = r5.A00.A06;
        if (list == null || list.isEmpty()) {
            z = false;
            i = -2;
        } else {
            z = true;
            i = getResources().getDimensionPixelSize(2131166243);
        }
        View view = this.A0j;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
        TemplateRowContentLayout templateRowContentLayout = this.A04;
        templateRowContentLayout.A02(this.A02, this, this.A2v);
        if (!TextUtils.isEmpty(r5.A0P())) {
            String A0P = r5.A0P();
            TextEmojiLabel textEmojiLabel = this.A03;
            A2F(textEmojiLabel, C82924Cr.HEADER, getFMessage(), A0P, 0, false, true, false);
            ViewGroup.LayoutParams layoutParams2 = textEmojiLabel.getLayoutParams();
            if (z) {
                i2 = i;
            } else {
                i2 = -1;
                if (A01(r5)) {
                    i2 = -2;
                }
            }
            layoutParams2.width = i2;
            textEmojiLabel.setLayoutParams(layoutParams2);
            textEmojiLabel.setVisibility(0);
        } else {
            this.A03.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams3 = templateRowContentLayout.getLayoutParams();
        if (!z) {
            i = -2;
            if (A01(r5)) {
                i = -1;
            }
        }
        layoutParams3.width = i;
        templateRowContentLayout.setLayoutParams(layoutParams3);
    }

    public void A1M() {
        if (!this.A01) {
            this.A01 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r3 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r3, A0O, this);
            AnonymousClass10G r1 = r3.A00;
            AnonymousClass3uQ.A16(r1, this);
            AnonymousClass3uQ.A0w(A0n, r3, r1, this);
            AnonymousClass3uQ.A12(r3, r1, this);
            AnonymousClass3uQ.A0y(A0n, r3, this, BE8.A0d(r3));
            AnonymousClass3uQ.A13(r3, r1, this, r3.ABq);
            AnonymousClass3uQ.A0x(A0n, r3, r1, this, r3.AIy);
            C19890zB r0 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A11(r3, r1, this);
            AnonymousClass3uQ.A15(r3, this);
            AnonymousClass3uQ.A0s(r0, A0n, r3, r1, this);
            AnonymousClass3uQ.A0u(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A0t(r0, A0n, r3, A0O, this);
            AnonymousClass3uQ.A10(r3, r1, this);
            AnonymousClass3uQ.A0z(r3, r1, A0O, this, AnonymousClass3uQ.A0o(r3));
            this.A00 = C000200d.A00(A0O.A0l);
        }
    }

    public boolean A1X() {
        AnonymousClass206 fMessage = getFMessage();
        C18070vi.A0d(fMessage, 0);
        if (((AnonymousClass4QZ) this.A2H.get()).A00(fMessage) == null) {
            if (C79103uS.A1K(this, getFMessage(), this.A1h)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public C78383si(Context context, AnonymousClass1GP r3, C108875cR r4, C439521o r5) {
        super(context, r4, r5);
        A1M();
        this.A02 = r3;
        A00();
    }

    private boolean A01(C439521o r7) {
        float f;
        String A0P = r7.A0P();
        if (TextUtils.isEmpty(A0P)) {
            return false;
        }
        C58072k6 r0 = r7.A00;
        String str = r0.A02;
        String str2 = r0.A03;
        float measureText = this.A03.getPaint().measureText(A0P);
        TemplateRowContentLayout templateRowContentLayout = this.A04;
        float measureText2 = templateRowContentLayout.getContentTextView().getPaint().measureText(str);
        if (!TextUtils.isEmpty(str2)) {
            f = templateRowContentLayout.A00.getPaint().measureText(str2);
        } else {
            f = 0.0f;
        }
        if (measureText <= measureText2 || measureText <= f) {
            return false;
        }
        return true;
    }

    public boolean A1W() {
        Long l = ((C439421n) getFMessage()).BaE().A00;
        if (l == null || AnonymousClass11P.A01(this.A0u) >= l.longValue()) {
            return false;
        }
        return true;
    }

    public void A1u() {
        A00();
        AnonymousClass3uP.A0h(this, false);
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A00();
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        ((C57802jf) this.A00.get()).A00(getFMessage(), i);
    }

    public int getCenteredLayoutId() {
        return 2131624940;
    }

    public int getIncomingLayoutId() {
        return 2131624940;
    }

    public int getOutgoingLayoutId() {
        return 2131624941;
    }
}
