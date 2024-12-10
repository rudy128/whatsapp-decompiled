package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass11C;
import X.AnonymousClass1BI;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass4Z9;
import X.AnonymousClass783;
import X.C1599686o;
import X.C17880vN;
import X.C17960vV;
import X.C218617r;
import X.C22971Dz;
import X.C24921Me;
import X.C60592oI;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaseSharedPreviewDialogFragment extends Hilt_BaseSharedPreviewDialogFragment {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public RelativeLayout A03;
    public C218617r A04;
    public AnonymousClass1KB A05;
    public AnonymousClass1M9 A06;
    public C24921Me A07;
    public AnonymousClass11C A08;
    public WebPagePreviewView A09;
    public List A0A;
    public ImageButton A0B;
    public LinearLayout A0C;
    public LinearLayout A0D;
    public C1599686o A0E;
    public EmojiSearchContainer A0F;

    public void A1y(Bundle bundle) {
        this.A0X = true;
        Toolbar toolbar = (Toolbar) this.A00.findViewById(2131436270);
        AnonymousClass3MX.A1A(A1D(), toolbar, AnonymousClass4Z9.A01(A1D(), false));
        toolbar.A0Q(A1B(), 2132083960);
        toolbar.setTitle(2131895741);
        AnonymousClass3NL.A02(A1B(), toolbar, this.A01, 2131231675);
        toolbar.setNavigationOnClickListener(new AnonymousClass783(this, 27));
        toolbar.setNavigationContentDescription(2131898718);
        Window window = this.A03.getWindow();
        C17960vV.A07(window);
        window.clearFlags(67108864);
        window.setStatusBarColor(AnonymousClass3Ma.A00(A1B(), 2130970827, 2131102235));
    }

    public void A1v() {
        Dialog dialog = this.A03;
        if (dialog != null) {
            Window window = dialog.getWindow();
            C17960vV.A07(window);
            window.setLayout(-1, -1);
            AnonymousClass3Ma.A1H(dialog.getWindow(), -16777216);
            dialog.getWindow().getAttributes().windowAnimations = 2132083328;
        }
        super.A1v();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0.getVisibility() != 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2H() {
        /*
            r3 = this;
            android.widget.RelativeLayout r0 = r3.A03
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r3.A09
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getVisibility()
            r1 = 2131168718(0x7f070dce, float:1.7951746E38)
            if (r0 == 0) goto L_0x0016
        L_0x0013:
            r1 = 2131168719(0x7f070dcf, float:1.7951748E38)
        L_0x0016:
            android.content.res.Resources r0 = X.AnonymousClass3MZ.A09(r3)
            int r1 = r0.getDimensionPixelSize(r1)
            r2.height = r1
            android.widget.RelativeLayout r0 = r3.A03
            int r0 = r0.getHeight()
            if (r1 == r0) goto L_0x002d
            android.widget.RelativeLayout r0 = r3.A03
            r0.setLayoutParams(r2)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.BaseSharedPreviewDialogFragment.A2H():void");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C1599686o r1 = this.A0E;
        if (r1 != null) {
            ((ContactPicker) r1).A04 = null;
        }
        super.onDismiss(dialogInterface);
    }

    public void A1l(Menu menu) {
        menu.findItem(2131432620).setVisible(false);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String A0p;
        this.A00 = AnonymousClass3MZ.A0E(this).inflate(2131624263, viewGroup, false);
        A1Z(true);
        A2A(2, 0);
        this.A0C = (LinearLayout) this.A00.findViewById(2131436299);
        this.A0D = (LinearLayout) this.A00.findViewById(2131436811);
        this.A03 = (RelativeLayout) this.A00.findViewById(2131430949);
        this.A0B = (ImageButton) this.A00.findViewById(2131435142);
        this.A02 = AnonymousClass3MW.A0D(this.A00, 2131437043);
        this.A01 = this.A00.findViewById(2131432019);
        this.A02.setVisibility(8);
        this.A01.setVisibility(8);
        EmojiSearchContainer emojiSearchContainer = (EmojiSearchContainer) this.A00.findViewById(2131430335);
        this.A0F = emojiSearchContainer;
        emojiSearchContainer.setVisibility(8);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI A0Q = C17880vN.A0Q(it);
            if (C22971Dz.A0a(A0Q)) {
                A0p = A1H(2131892379);
            } else {
                A0p = AnonymousClass3MY.A0p(this.A06, this.A07, A0Q);
            }
            A13.add(0, A0p);
        }
        AnonymousClass3MX.A0W(this.A00, 2131434399).A0R(C60592oI.A00(this.A07.A02, A13, false));
        A2H();
        return this.A00;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        if (!(A1B() instanceof C1599686o)) {
            throw new RuntimeException("Activity must implement BaseSharedPreviewDialogFragment.Host");
        }
    }

    public boolean A24(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        A28();
        return true;
    }

    public Dialog A27(Bundle bundle) {
        ArrayList<String> stringArrayList = A15().getStringArrayList("jids");
        C17960vV.A08(stringArrayList, "null jids");
        this.A0A = C22971Dz.A0A(AnonymousClass1BI.class, stringArrayList);
        C1599686o r0 = (C1599686o) A1B();
        this.A0E = r0;
        if (r0 != null) {
            ((ContactPicker) r0).A04 = this;
        }
        A2A(0, 2132083330);
        return super.A27(bundle);
    }
}
