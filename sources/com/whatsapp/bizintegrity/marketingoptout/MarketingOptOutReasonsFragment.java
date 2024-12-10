package com.whatsapp.bizintegrity.marketingoptout;

import X.AFB;
import X.AnonymousClass11C;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass4FC;
import X.AnonymousClass4FE;
import X.C18030ve;
import X.C35751mk;
import X.C35771mm;
import X.C90874em;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import com.whatsapp.bizintegrity.utils.BizIntegrityFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;

public class MarketingOptOutReasonsFragment extends BizIntegrityFragment {
    public static final AnonymousClass4FC[] A08;
    public View.OnClickListener A00 = new AFB(this, 23);
    public AnonymousClass4FC A01;
    public List A02;
    public boolean A03 = false;
    public C35771mm A04;
    public C35751mk A05;
    public UserJid A06;
    public final CompoundButton.OnCheckedChangeListener A07 = new C90874em(this, 1);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.4FC[]} */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.4FC, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.4FC, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.4FC, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.4FC, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 4
            X.4FC[] r3 = new X.AnonymousClass4FC[r0]
            java.lang.String r2 = "too_many_messages"
            r0 = 2131891901(0x7f1216bd, float:1.9418535E38)
            X.4FC r1 = new X.4FC
            r1.<init>()
            r1.A01 = r2
            r1.A00 = r0
            r0 = 0
            r3[r0] = r1
            java.lang.String r2 = "no_sign_up"
            r0 = 2131891899(0x7f1216bb, float:1.9418531E38)
            X.4FC r1 = new X.4FC
            r1.<init>()
            r1.A01 = r2
            r1.A00 = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2131891893(0x7f1216b5, float:1.9418519E38)
            X.4FC r1 = new X.4FC
            r1.<init>()
            r1.A01 = r2
            r1.A00 = r0
            r0 = 2
            r3[r0] = r1
            java.lang.String r2 = "no_longer_relevant"
            r0 = 2131891891(0x7f1216b3, float:1.9418515E38)
            X.4FC r1 = new X.4FC
            r1.<init>()
            r1.A01 = r2
            r1.A00 = r0
            r0 = 3
            r3[r0] = r1
            A08 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment.<clinit>():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r1 != r3) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.widget.RadioButton r3, com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment r4) {
        /*
            r2 = 0
        L_0x0001:
            java.util.List r0 = r4.A02
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x0025
            java.util.List r0 = r4.A02
            java.lang.Object r1 = r0.get(r2)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            if (r1 == 0) goto L_0x0016
            r0 = 1
            if (r1 == r3) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r1.setChecked(r0)
            if (r0 == 0) goto L_0x0022
            X.4FC[] r0 = A08
            r0 = r0[r2]
            r4.A01 = r0
        L_0x0022:
            int r2 = r2 + 1
            goto L_0x0001
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment.A00(android.widget.RadioButton, com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment):void");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        AnonymousClass4FC r0;
        C35771mm r4 = this.A04;
        UserJid userJid = this.A06;
        if (!this.A03 || (r0 = this.A01) == null) {
            str = null;
        } else {
            str = r0.A01;
        }
        r4.A06(userJid, str, "quick_action", 0);
        super.onDismiss(dialogInterface);
    }

    public MarketingOptOutReasonsFragment(AnonymousClass1L9 r3, AnonymousClass1KB r4, C35771mm r5, AnonymousClass4FE r6, C35751mk r7, AnonymousClass11C r8, C18030ve r9, AnonymousClass1LU r10, UserJid userJid) {
        this.A06 = r6;
        this.A08 = r9;
        this.A04 = r4;
        this.A09 = r10;
        this.A03 = r3;
        this.A07 = r8;
        this.A06 = userJid;
        this.A04 = r5;
        this.A01 = null;
        this.A05 = r7;
    }
}
