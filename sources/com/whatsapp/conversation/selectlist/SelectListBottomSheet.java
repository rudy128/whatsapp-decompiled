package com.whatsapp.conversation.selectlist;

import X.AE4;
import X.AEF;
import X.AnonymousClass000;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3XY;
import X.AnonymousClass4MV;
import X.AnonymousClass4bG;
import X.C106795Xf;
import X.C17960vV;
import X.C20285AEt;
import X.C72453Mb;
import X.C72463Mc;
import X.C73673Ww;
import X.C87654Wk;
import X.C89924dF;
import X.C90014dO;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class SelectListBottomSheet extends Hilt_SelectListBottomSheet {
    public C106795Xf A00;
    public C20285AEt A01;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131624968);
    }

    public void A1s() {
        super.A1s();
        this.A00 = null;
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, X.1uz] */
    public void A21(Bundle bundle, View view) {
        String str;
        super.A21(bundle, view);
        C20285AEt aEt = (C20285AEt) A15().getParcelable("arg_select_list_content");
        this.A01 = aEt;
        if (aEt == null || this.A00 == null) {
            A28();
            return;
        }
        if (A2L()) {
            view.setBackground((Drawable) null);
        }
        C89924dF.A00(view.findViewById(2131429132), this, 4);
        if (this.A01.A00 == 8) {
            AnonymousClass3MW.A0J(view, 2131435085).setText(2131895597);
        }
        AnonymousClass3MX.A0W(view, 2131435094).A0R(this.A01.A0A);
        RecyclerView A0Q = AnonymousClass3MX.A0Q(view, 2131435091);
        A0Q.A0t(new AnonymousClass3XY(this, 1));
        A0Q.setNestedScrollingEnabled(true);
        A0Q.A0r(new Object());
        C73673Ww r2 = new C73673Ww();
        A0Q.setAdapter(r2);
        C20285AEt aEt2 = this.A01;
        C17960vV.A07(aEt2);
        List<AE4> list = aEt2.A0F;
        ArrayList A13 = AnonymousClass000.A13();
        for (AE4 ae4 : list) {
            String str2 = ae4.A01;
            if (!TextUtils.isEmpty(str2)) {
                A13.add(new C87654Wk(str2));
            }
            int i = 0;
            while (true) {
                List list2 = ae4.A02;
                if (i < list2.size()) {
                    AEF aef = (AEF) list2.get(i);
                    if (i == 0) {
                        str = ae4.A00;
                    } else {
                        str = null;
                    }
                    A13.add(new C87654Wk(aef, str));
                    i++;
                }
            }
        }
        if (this.A01.A00 == 8) {
            int i2 = 0;
            while (true) {
                if (i2 >= A13.size()) {
                    break;
                } else if (!TextUtils.isEmpty(((C87654Wk) A13.get(i2)).A02)) {
                    i2++;
                } else if (i2 != -1) {
                    r2.A00 = i2;
                    AnonymousClass1HF.A06(view, 2131435085).setVisibility(0);
                    C72463Mc.A13(view, 2131436003);
                }
            }
        }
        C72453Mb.A1J(r2, A13, r2.A02);
        C90014dO.A00(view.findViewById(2131435085), this, r2, 7);
        r2.A01 = new AnonymousClass4MV(view, this);
        this.A03.setOnShowListener(new AnonymousClass4bG());
    }
}
