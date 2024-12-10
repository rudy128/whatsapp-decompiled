package X;

import com.whatsapp.phonematching.CountryAndPhoneNumberFragment;

/* renamed from: X.4f7  reason: invalid class name and case insensitive filesystem */
public class C91084f7 implements AnonymousClass02j, C22841Dk {
    public final int A00;
    public final Object A01;

    public C91084f7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final C18080vj BS6() {
        Class cls;
        String str;
        int i;
        int i2;
        String str2;
        int i3 = this.A00;
        Object obj = this.A01;
        switch (i3) {
            case 0:
                cls = AnonymousClass4PB.class;
                break;
            case 1:
                cls = AnonymousClass4X6.class;
                break;
            case 2:
                cls = C85844Oy.class;
                break;
            case 3:
                cls = AnonymousClass4RX.class;
                break;
            default:
                cls = CountryAndPhoneNumberFragment.class;
                str = "onCountryPickerResult(Landroidx/activity/result/ActivityResult;)V";
                i = 0;
                i2 = 1;
                str2 = "onCountryPickerResult";
                break;
        }
        str = "onResult(Landroidx/activity/result/ActivityResult;)V";
        i = 0;
        i2 = 1;
        str2 = "onResult";
        return new AnonymousClass1JJ(i2, obj, cls, str2, str, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.77K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: X.77K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.36j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: X.77K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: X.77K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.77K} */
    /* JADX WARNING: type inference failed for: r0v47, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        if (r0 == false) goto L_0x00ad;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bkx(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            X.02m r12 = (X.C005702m) r12
            switch(r0) {
                case 0: goto L_0x0109;
                case 1: goto L_0x00e3;
                case 2: goto L_0x004a;
                case 3: goto L_0x01a6;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            java.lang.Object r3 = r11.A01
            com.whatsapp.phonematching.CountryAndPhoneNumberFragment r3 = (com.whatsapp.phonematching.CountryAndPhoneNumberFragment) r3
            int r1 = r12.A00
            r0 = -1
            if (r1 != r0) goto L_0x0049
            android.content.Intent r1 = r12.A01
            if (r1 == 0) goto L_0x0049
            java.lang.String r0 = "country_name"
            java.lang.String r2 = r1.getStringExtra(r0)
            java.lang.String r0 = "cc"
            java.lang.String r0 = r1.getStringExtra(r0)
            r3.A0D = r0
            java.lang.String r0 = "iso"
            java.lang.String r0 = r1.getStringExtra(r0)
            r3.A0E = r0
            android.widget.EditText r1 = r3.A00
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = r3.A0D
            r1.setText(r0)
        L_0x0037:
            android.widget.TextView r0 = r3.A02
            if (r0 == 0) goto L_0x003e
            r0.setText(r2)
        L_0x003e:
            java.lang.String r1 = r3.A0E
            if (r1 == 0) goto L_0x0049
            com.whatsapp.components.PhoneNumberEntry r0 = r3.A07
            if (r0 == 0) goto L_0x0049
            r0.A03(r1)
        L_0x0049:
            return
        L_0x004a:
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            java.lang.Object r3 = r11.A01
            X.4Oy r3 = (X.C85844Oy) r3
            int r0 = r12.A00
            r4 = -1
            if (r0 != r4) goto L_0x0049
            android.content.Intent r2 = r12.A01
            if (r2 == 0) goto L_0x00d9
            X.1yz r1 = X.AnonymousClass1EC.A01
            java.lang.String r0 = "group_jid"
            java.lang.String r0 = r2.getStringExtra(r0)
            X.1EC r6 = X.C42941yz.A01(r0)
            java.lang.String r0 = "parent_group_jid_to_link"
            java.lang.String r0 = r2.getStringExtra(r0)
            X.1EC r8 = r1.A02(r0)
            java.lang.String r0 = "entry_point"
            int r7 = r2.getIntExtra(r0, r4)
            java.lang.String r5 = "new_group_result_bundle"
            android.os.Bundle r4 = r2.getBundleExtra(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CreateGroupResultHandler/group created "
            X.C17900vP.A0Y(r6, r0, r1)
            X.1CJ r0 = r3.A05
            boolean r0 = r0.A0P(r6)
            if (r0 == 0) goto L_0x0049
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CreateGroupResultHandler/opening conversation"
            X.C17900vP.A0Y(r6, r0, r1)
            X.0ve r2 = r3.A06
            r0 = 9798(0x2646, float:1.373E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 != 0) goto L_0x00ad
            r0 = 12916(0x3274, float:1.8099E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            r1 = 37
            if (r0 != 0) goto L_0x00ae
        L_0x00ad:
            r1 = 0
        L_0x00ae:
            if (r8 == 0) goto L_0x00cd
            r0 = 10
            if (r7 == r0) goto L_0x00cd
            android.content.Context r2 = r3.A02
            android.content.Intent r1 = X.C72473Md.A0A(r2, r6, r1)
        L_0x00ba:
            X.C18070vi.A0b(r1)
            if (r4 == 0) goto L_0x00c2
            r1.putExtra(r5, r4)
        L_0x00c2:
            X.1L9 r0 = r3.A04
            r0.A09(r2, r1)
        L_0x00c7:
            android.app.Activity r0 = r3.A01
            r0.finish()
            return
        L_0x00cd:
            X.1LU r0 = new X.1LU
            r0.<init>()
            android.content.Context r2 = r3.A02
            android.content.Intent r1 = r0.A1w(r2, r6, r1)
            goto L_0x00ba
        L_0x00d9:
            android.content.Context r1 = r3.A02
            android.content.Intent r0 = X.AnonymousClass1LU.A02(r1)
            r1.startActivity(r0)
            goto L_0x00c7
        L_0x00e3:
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            java.lang.Object r3 = r11.A01
            X.4X6 r3 = (X.AnonymousClass4X6) r3
            int r1 = r12.A00
            r0 = -1
            if (r1 != r0) goto L_0x0049
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            android.content.Intent r1 = r12.A01
            if (r1 == 0) goto L_0x0106
            java.lang.String r0 = "contacts"
            java.util.ArrayList r0 = r1.getStringArrayListExtra(r0)
            if (r0 == 0) goto L_0x0106
        L_0x00fe:
            java.util.ArrayList r0 = X.C22971Dz.A0A(r2, r0)
            X.AnonymousClass4X6.A00(r3, r0)
            return
        L_0x0106:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x00fe
        L_0x0109:
            r9 = 0
            X.C18070vi.A0d(r12, r9)
            java.lang.Object r4 = r11.A01
            X.4PB r4 = (X.AnonymousClass4PB) r4
            android.content.Intent r3 = r12.A01
            int r1 = r12.A00
            r0 = -1
            if (r1 != r0) goto L_0x0049
            if (r3 == 0) goto L_0x0049
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            java.util.ArrayList r6 = X.C72463Mc.A0r(r3, r0)
            java.lang.String r0 = "include_captions"
            boolean r10 = r3.getBooleanExtra(r0, r9)
            java.lang.String r0 = "appended_message"
            java.lang.String r8 = r3.getStringExtra(r0)
            java.lang.String r0 = "message_keys"
            android.os.Bundle r0 = r3.getBundleExtra(r0)
            if (r0 == 0) goto L_0x0049
            java.util.ArrayList r5 = X.AnonymousClass4aU.A04(r0)
            if (r5 == 0) goto L_0x0049
            X.1BI r1 = X.C22971Dz.A01(r6)
            r0 = 0
            if (r1 == 0) goto L_0x0142
            r0 = 1
        L_0x0142:
            r7 = 0
            if (r0 == 0) goto L_0x015a
            X.36j r2 = new X.36j
            r2.<init>()
            android.os.Bundle r1 = r3.getExtras()
            if (r1 == 0) goto L_0x0156
            X.727 r0 = r4.A08
            X.77K r7 = r0.A02(r1)
        L_0x0156:
            r2.A00(r7)
            r7 = r2
        L_0x015a:
            X.10I r0 = r4.A09
            X.3CO r3 = new X.3CO
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.CGF(r3)
            int r1 = r6.size()
            r0 = 1
            if (r1 != r0) goto L_0x0198
            java.lang.Object r0 = X.C29431cG.A0b(r6)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            boolean r0 = X.C22971Dz.A0a(r0)
            if (r0 != 0) goto L_0x0198
            X.1L9 r3 = r4.A04
            android.content.Context r2 = r4.A02
            X.1LU r1 = r4.A07
            java.lang.Object r0 = X.C29431cG.A0b(r6)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            android.content.Intent r0 = r1.A1w(r2, r0, r9)
            r3.A09(r2, r0)
        L_0x018a:
            android.app.Activity r1 = r4.A01
            boolean r0 = r1 instanceof X.C108875cR
            if (r0 == 0) goto L_0x0049
            X.5cR r1 = (X.C108875cR) r1
            if (r1 == 0) goto L_0x0049
            r1.BLL()
            return
        L_0x0198:
            android.app.Activity r1 = r4.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.WaBaseActivity"
            X.C18070vi.A0z(r1, r0)
            X.1FY r1 = (X.AnonymousClass1FY) r1
            r0 = 1
            r1.CPW(r6, r0)
            goto L_0x018a
        L_0x01a6:
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            java.lang.Object r0 = r11.A01
            X.4RX r0 = (X.AnonymousClass4RX) r0
            r0.A00(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91084f7.Bkx(java.lang.Object):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass02j) || !(obj instanceof C22841Dk)) {
            return false;
        }
        return C18070vi.A18(BS6(), ((C22841Dk) obj).BS6());
    }

    public final int hashCode() {
        return BS6().hashCode();
    }
}
