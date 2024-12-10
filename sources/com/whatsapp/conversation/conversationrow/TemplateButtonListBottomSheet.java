package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4VN;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C28931bI;
import X.C72453Mb;
import X.C86244Qw;
import X.C89914dE;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class TemplateButtonListBottomSheet extends Hilt_TemplateButtonListBottomSheet {
    public AnonymousClass4VN A00;
    public C86244Qw A01;
    public List A02;
    public List A03;
    public TextEmojiLabel A04;
    public WaImageButton A05;

    public void A21(Bundle bundle, View view) {
        Resources.Theme theme;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        WaImageButton waImageButton = (WaImageButton) AnonymousClass1HF.A06(view, 2131428608);
        this.A05 = waImageButton;
        if (waImageButton != null) {
            C89914dE.A00(waImageButton, this, 11);
        }
        TextEmojiLabel A0V = AnonymousClass3MX.A0V(view, 2131436031);
        this.A04 = A0V;
        C18070vi.A0b(A0V);
        AnonymousClass4VN r2 = this.A00;
        if (r2 != null) {
            Resources A09 = AnonymousClass3MZ.A09(this);
            AnonymousClass1FL A1B = A1B();
            if (A1B != null) {
                theme = A1B.getTheme();
            } else {
                theme = null;
            }
            A0V.setTextSize(r2.A01(theme, A09));
            Integer[] numArr = new Integer[10];
            AnonymousClass000.A1L(numArr, 2131431416);
            AnonymousClass000.A1M(numArr, 2131431418);
            AnonymousClass3Ma.A1S(numArr, 2131431419);
            C17890vO.A1G(numArr, 2131431420);
            AnonymousClass3Ma.A1T(numArr, 2131431421);
            AnonymousClass3Ma.A1U(numArr, 2131431422);
            C17890vO.A1H(numArr, 2131431423);
            C17890vO.A1I(numArr, 2131431424);
            numArr[8] = 2131431425;
            List A0O = C18070vi.A0O(2131431417, numArr, 9);
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = A0O.iterator();
            while (it.hasNext()) {
                A13.add(C28931bI.A00(view, C72453Mb.A0H(it)));
            }
            this.A02 = C17880vN.A10(A13);
            Integer[] numArr2 = new Integer[9];
            AnonymousClass000.A1L(numArr2, 2131431426);
            AnonymousClass000.A1M(numArr2, 2131431427);
            AnonymousClass3Ma.A1S(numArr2, 2131431428);
            C17890vO.A1G(numArr2, 2131431429);
            AnonymousClass3Ma.A1T(numArr2, 2131431430);
            AnonymousClass3Ma.A1U(numArr2, 2131431431);
            C17890vO.A1H(numArr2, 2131431432);
            C17890vO.A1I(numArr2, 2131431433);
            List A0O2 = C18070vi.A0O(2131431434, numArr2, 8);
            ArrayList A132 = AnonymousClass000.A13();
            Iterator it2 = A0O2.iterator();
            while (it2.hasNext()) {
                A132.add(C28931bI.A00(view, C72453Mb.A0H(it2)));
            }
            ArrayList A10 = C17880vN.A10(A132);
            this.A03 = A10;
            C86244Qw r1 = this.A01;
            if (r1 != null) {
                r1.A00(this.A02, A10);
                return;
            }
            return;
        }
        C18070vi.A11("conversationFont");
        throw null;
    }

    public void A1s() {
        super.A1s();
        this.A05 = null;
        this.A04 = null;
        this.A02 = null;
        this.A03 = null;
    }

    public int A2F() {
        return 2131627165;
    }
}
