package X;

/* renamed from: X.7SX  reason: invalid class name */
public class AnonymousClass7SX implements C22841Dk, AnonymousClass1G2 {
    public final int A00;
    public final Object A01;

    public AnonymousClass7SX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0481, code lost:
        if (r1.A0J(r0.A02()) == false) goto L_0x0483;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04e6, code lost:
        if (r3 > X.AnonymousClass11P.A00(r7.A00)) goto L_0x04e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x064e, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0665, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0669, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        return X.C27621Wu.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0359  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object BJt(java.lang.Object r15, X.C30391dr r16) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x045f;
                case 1: goto L_0x0448;
                case 2: goto L_0x039f;
                case 3: goto L_0x0129;
                case 4: goto L_0x011a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r14.A01
            com.whatsapp.pancake.dosa.DosaActivity r2 = (com.whatsapp.pancake.dosa.DosaActivity) r2
            X.7Dl r0 = X.C143447Dl.A00
            boolean r0 = X.C18070vi.A18(r15, r0)
            if (r0 == 0) goto L_0x0035
            java.lang.Class<com.whatsapp.pancake.dosa.DosaCollectionFragment> r0 = com.whatsapp.pancake.dosa.DosaCollectionFragment.class
            boolean r0 = X.C109005cf.A0t(r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0032
            r0 = 1
            r2.A00 = r0
            com.whatsapp.pancake.dosa.DosaCollectionFragment r4 = new com.whatsapp.pancake.dosa.DosaCollectionFragment
            r4.<init>()
            java.lang.String r3 = "DosaCollectionFragment"
        L_0x0025:
            X.1jj r1 = X.AnonymousClass3Ma.A0H(r2)
            r0 = 2131433406(0x7f0b17be, float:1.8488597E38)
            r1.A0D(r4, r3, r0)
            r1.A02()
        L_0x0032:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0035:
            X.7Dm r0 = X.C143457Dm.A00
            boolean r0 = X.C18070vi.A18(r15, r0)
            if (r0 == 0) goto L_0x004f
            java.lang.Class<com.whatsapp.pancake.dosa.DosaRemediationFragment> r0 = com.whatsapp.pancake.dosa.DosaRemediationFragment.class
            boolean r0 = X.C109005cf.A0t(r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0032
            com.whatsapp.pancake.dosa.DosaRemediationFragment r4 = new com.whatsapp.pancake.dosa.DosaRemediationFragment
            r4.<init>()
            java.lang.String r3 = "DosaRemediationFragment"
            goto L_0x0025
        L_0x004f:
            X.7Dp r0 = X.C143487Dp.A00
            boolean r0 = X.C18070vi.A18(r15, r0)
            if (r0 == 0) goto L_0x0073
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            java.lang.String r4 = "com.bloks.www.wa.authenticity.launcher.async"
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r2.getPackageName()
            java.lang.String r0 = "com.whatsapp.ageverification.idv.AuthenticityActivity"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "screen_name"
            r3.putExtra(r0, r4)
            r2.startActivity(r3)
            goto L_0x0032
        L_0x0073:
            X.7Dq r0 = X.C143497Dq.A00
            boolean r0 = X.C18070vi.A18(r15, r0)
            if (r0 == 0) goto L_0x009d
            java.lang.Class<com.whatsapp.pancake.dosa.DosaAgeBanFragment> r0 = com.whatsapp.pancake.dosa.DosaAgeBanFragment.class
            boolean r0 = X.C109005cf.A0t(r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0099
            com.whatsapp.pancake.dosa.DosaAgeBanFragment r4 = new com.whatsapp.pancake.dosa.DosaAgeBanFragment
            r4.<init>()
            java.lang.String r3 = "DosaAgeBanFragment"
        L_0x008c:
            X.1jj r1 = X.AnonymousClass3Ma.A0H(r2)
            r0 = 2131433406(0x7f0b17be, float:1.8488597E38)
            r1.A0D(r4, r3, r0)
            r1.A02()
        L_0x0099:
            r0 = 1
            r2.A01 = r0
            goto L_0x0032
        L_0x009d:
            X.7Dn r0 = X.C143467Dn.A00
            boolean r0 = X.C18070vi.A18(r15, r0)
            if (r0 == 0) goto L_0x00b8
            java.lang.Class<com.whatsapp.pancake.dosa.DosaAgeRemediationFailFragment> r0 = com.whatsapp.pancake.dosa.DosaAgeRemediationFailFragment.class
            boolean r0 = X.C109005cf.A0t(r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0032
            com.whatsapp.pancake.dosa.DosaAgeRemediationFailFragment r4 = new com.whatsapp.pancake.dosa.DosaAgeRemediationFailFragment
            r4.<init>()
            java.lang.String r3 = "DosaAgeRemediationFailFragment"
            goto L_0x0025
        L_0x00b8:
            X.7Do r0 = X.C143477Do.A00
            boolean r0 = X.C18070vi.A18(r15, r0)
            if (r0 == 0) goto L_0x00d3
            java.lang.Class<com.whatsapp.pancake.dosa.DosaAgeRemediationPassFragment> r0 = com.whatsapp.pancake.dosa.DosaAgeRemediationPassFragment.class
            boolean r0 = X.C109005cf.A0t(r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0032
            com.whatsapp.pancake.dosa.DosaAgeRemediationPassFragment r4 = new com.whatsapp.pancake.dosa.DosaAgeRemediationPassFragment
            r4.<init>()
            java.lang.String r3 = "DosaAgeRemediationPassFragment"
            goto L_0x0025
        L_0x00d3:
            X.7Ds r0 = X.C143517Ds.A00
            boolean r0 = X.C18070vi.A18(r15, r0)
            if (r0 == 0) goto L_0x00ed
            java.lang.Class<com.whatsapp.pancake.dosa.DosaPearPancakeFragment> r0 = com.whatsapp.pancake.dosa.DosaPearPancakeFragment.class
            boolean r0 = X.C109005cf.A0t(r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0099
            com.whatsapp.pancake.dosa.DosaPearPancakeFragment r4 = new com.whatsapp.pancake.dosa.DosaPearPancakeFragment
            r4.<init>()
            java.lang.String r3 = "DosaPearPancakeFragment"
            goto L_0x008c
        L_0x00ed:
            boolean r0 = r15 instanceof X.C143537Du
            if (r0 == 0) goto L_0x010d
            r0 = -1
            r2.setResult(r0)
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0108
            r0 = 2131896826(0x7f1229fa, float:1.9428524E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r1, r0)
            r0.show()
        L_0x0108:
            r2.finish()
            goto L_0x0032
        L_0x010d:
            boolean r0 = r15 instanceof X.C143577Dy
            if (r0 != 0) goto L_0x0108
            boolean r0 = r15 instanceof X.C143507Dr
            if (r0 == 0) goto L_0x0032
            r0 = 0
            r2.setResult(r0)
            goto L_0x0108
        L_0x011a:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r0 = r14.A01
            com.whatsapp.pancake.PearPancakeFragment r0 = (com.whatsapp.pancake.PearPancakeFragment) r0
            android.widget.TextView r0 = r0.A00
            if (r0 == 0) goto L_0x0032
            r0.setText(r15)
            goto L_0x0032
        L_0x0129:
            X.6tm r15 = (X.C136416tm) r15
            java.lang.Object r6 = r14.A01
            com.whatsapp.consent.common.AgeCollectionFragment r6 = (com.whatsapp.consent.common.AgeCollectionFragment) r6
            android.view.ViewGroup r1 = r6.A02
            if (r1 == 0) goto L_0x0137
            r0 = 0
            X.C29191bl.A02(r1, r0)
        L_0x0137:
            X.0vl r3 = r6.A0E
            java.lang.Object r1 = r3.getValue()
            android.widget.ArrayAdapter r1 = (android.widget.ArrayAdapter) r1
            int r0 = r15.A01
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r1.getPosition(r0)
            r5 = 0
            if (r2 < 0) goto L_0x0170
            java.lang.Object r0 = r3.getValue()
            android.widget.ArrayAdapter r0 = (android.widget.ArrayAdapter) r0
            java.lang.Object r0 = r0.getItem(r5)
            java.lang.String r1 = "----"
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 == 0) goto L_0x0169
            java.lang.Object r0 = r3.getValue()
            android.widget.ArrayAdapter r0 = (android.widget.ArrayAdapter) r0
            r0.remove(r1)
            int r2 = r2 + -1
        L_0x0169:
            android.widget.Spinner r0 = r6.A04
            if (r0 == 0) goto L_0x0170
            r0.setSelection(r2)
        L_0x0170:
            android.widget.TextView r0 = r6.A06
            if (r0 == 0) goto L_0x0199
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0199
            boolean r0 = r15.A07
            if (r0 == 0) goto L_0x0199
            boolean r0 = r6 instanceof com.whatsapp.pancake.dosa.DosaRemediationFragment
            if (r0 != 0) goto L_0x0199
            boolean r0 = r6 instanceof com.whatsapp.pancake.dosa.DosaCollectionFragment
            if (r0 == 0) goto L_0x0388
            r0 = r6
            com.whatsapp.pancake.dosa.DosaCollectionFragment r0 = (com.whatsapp.pancake.dosa.DosaCollectionFragment) r0
            X.1Pc r3 = r0.A00
            if (r3 == 0) goto L_0x065a
            java.lang.Integer r2 = X.AnonymousClass3MY.A0f()
            java.lang.Integer r1 = X.C17880vN.A0j()
            r0 = 0
            X.C25661Pc.A00(r3, r2, r1, r2, r0)
        L_0x0199:
            android.widget.TextView r1 = r6.A06
            r2 = 8
            if (r1 == 0) goto L_0x01a8
            boolean r0 = r15.A07
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
        L_0x01a8:
            android.widget.TextView r1 = r6.A07
            if (r1 == 0) goto L_0x01b5
            boolean r0 = r15.A07
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
        L_0x01b5:
            android.widget.TextView r1 = r6.A05
            if (r1 == 0) goto L_0x01c1
            boolean r0 = r15.A07
            if (r0 == 0) goto L_0x01be
            r2 = 0
        L_0x01be:
            r1.setVisibility(r2)
        L_0x01c1:
            android.widget.TextView r1 = r6.A06
            if (r1 == 0) goto L_0x01ca
            java.lang.String r0 = r15.A02
            r1.setText(r0)
        L_0x01ca:
            android.widget.TextView r3 = r6.A05
            if (r3 == 0) goto L_0x01de
            android.content.res.Resources r2 = X.AnonymousClass3MZ.A09(r6)
            r1 = 2131755017(0x7f100009, float:1.9140901E38)
            int r0 = r15.A00
            java.lang.String r0 = X.C72473Md.A0k(r2, r0, r1)
            r3.setText(r0)
        L_0x01de:
            android.widget.TextView r1 = r6.A08
            if (r1 == 0) goto L_0x01e7
            java.lang.String r0 = r15.A03
            r1.setText(r0)
        L_0x01e7:
            boolean r3 = r15.A06
            if (r3 != 0) goto L_0x037f
            X.6bd r0 = r6.A0A
            if (r0 == 0) goto L_0x0657
            X.19D r2 = r0.A00
            r1 = 12577(0x3121, float:1.7624E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x037f
            android.widget.Button r1 = r6.A03
            if (r1 == 0) goto L_0x0204
            boolean r0 = r15.A05
            r1.setEnabled(r0)
        L_0x0204:
            java.lang.String r0 = r15.A03
            if (r0 == 0) goto L_0x0359
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0359
            android.widget.TextView r1 = r6.A09
            if (r1 == 0) goto L_0x021b
            X.0vl r0 = r6.A0F
            int r0 = X.C72453Mb.A0I(r0)
            r1.setTextColor(r0)
        L_0x021b:
            android.widget.TextView r1 = r6.A07
            if (r1 == 0) goto L_0x0228
            X.0vl r0 = r6.A0F
            int r0 = X.C72453Mb.A0I(r0)
            r1.setTextColor(r0)
        L_0x0228:
            X.0vl r2 = r6.A0G
            java.lang.Object r1 = r2.getValue()
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            X.0vl r0 = r6.A0F
        L_0x0232:
            int r0 = X.C72453Mb.A0I(r0)
            r1.setTint(r0)
            android.widget.TextView r1 = r6.A06
            if (r1 == 0) goto L_0x0246
            java.lang.Object r0 = r2.getValue()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r1.setBackground(r0)
        L_0x0246:
            android.view.View r1 = r6.A01
            if (r1 == 0) goto L_0x0253
            java.lang.Object r0 = r2.getValue()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r1.setBackground(r0)
        L_0x0253:
            java.lang.String r2 = r15.A04
            if (r2 == 0) goto L_0x0271
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0271
            android.view.View r1 = r6.A0B
            if (r1 == 0) goto L_0x0271
            android.content.Context r0 = r6.A14()
            X.Bik r1 = X.C23520Bik.A00(r0, r1, r2, r5)
            android.widget.Button r0 = r6.A03
            r1.A0B(r0)
            r1.A08()
        L_0x0271:
            android.widget.Spinner r1 = r6.A04
            if (r1 == 0) goto L_0x027a
            r0 = r3 ^ 1
            r1.setEnabled(r0)
        L_0x027a:
            android.widget.Button r1 = r6.A03
            if (r1 == 0) goto L_0x0283
            r0 = r3 ^ 1
            r1.setEnabled(r0)
        L_0x0283:
            android.view.View r1 = r6.A00
            if (r1 == 0) goto L_0x028e
            int r0 = X.C72453Mb.A07(r3)
            r1.setVisibility(r0)
        L_0x028e:
            X.6bd r0 = r6.A0A
            if (r0 == 0) goto L_0x0657
            X.19D r1 = r0.A00
            r0 = 12577(0x3121, float:1.7624E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x02c0
            android.widget.TextView r0 = r6.A06
            if (r0 == 0) goto L_0x0356
            java.lang.CharSequence r0 = r0.getText()
        L_0x02a6:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 2131886568(0x7f1201e8, float:1.9407719E38)
            java.lang.String r0 = r6.A1H(r0)
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x02c0
            android.widget.Button r1 = r6.A03
            if (r1 == 0) goto L_0x02c0
            boolean r0 = r15.A05
            r1.setEnabled(r0)
        L_0x02c0:
            X.6bd r0 = r6.A0A
            if (r0 == 0) goto L_0x0657
            X.19D r1 = r0.A00
            r0 = 12941(0x328d, float:1.8134E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x0032
            android.widget.TextView r2 = r6.A06
            r3 = 0
            if (r2 == 0) goto L_0x02e1
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r6)
            r0 = 2131230996(0x7f080114, float:1.807806E38)
            android.graphics.drawable.Drawable r0 = X.C40501uo.A00(r3, r1, r0)
            r2.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r0, r3)
        L_0x02e1:
            android.widget.TextView r2 = r6.A05
            if (r2 == 0) goto L_0x02ee
            r1 = -2
            X.1sZ r0 = new X.1sZ
            r0.<init>(r1, r1)
            r2.setLayoutParams(r0)
        L_0x02ee:
            android.widget.TextView r5 = r6.A05
            if (r5 == 0) goto L_0x0331
            android.view.ViewGroup$LayoutParams r4 = X.C108965cb.A0A(r5)
            X.1sZ r4 = (X.C39151sZ) r4
            r0 = 2131429373(0x7f0b07fd, float:1.8480417E38)
            r4.A0o = r0
            r4.A0n = r0
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165300(0x7f070074, float:1.7944813E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r4.topMargin = r0
            X.0vb r0 = r6.A0B
            if (r0 == 0) goto L_0x0653
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165299(0x7f070073, float:1.7944811E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165298(0x7f070072, float:1.794481E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.C27641Ww.A03(r5, r2, r0)
            r0 = -1
            r4.A0I = r0
            r4.A0C = r0
            r5.setLayoutParams(r4)
        L_0x0331:
            android.widget.TextView r2 = r6.A08
            if (r2 == 0) goto L_0x0032
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof X.C39151sZ
            if (r0 == 0) goto L_0x034c
            X.1sZ r1 = (X.C39151sZ) r1
            if (r1 == 0) goto L_0x034c
            android.widget.TextView r0 = r6.A05
            if (r0 == 0) goto L_0x0351
            int r0 = r0.getId()
        L_0x0349:
            r1.A0o = r0
            r3 = r1
        L_0x034c:
            r2.setLayoutParams(r3)
            goto L_0x0032
        L_0x0351:
            int r0 = android.view.View.generateViewId()
            goto L_0x0349
        L_0x0356:
            r0 = 0
            goto L_0x02a6
        L_0x0359:
            android.widget.TextView r1 = r6.A09
            if (r1 == 0) goto L_0x0366
            X.0vl r0 = r6.A0H
            int r0 = X.C72453Mb.A0I(r0)
            r1.setTextColor(r0)
        L_0x0366:
            android.widget.TextView r1 = r6.A07
            if (r1 == 0) goto L_0x0373
            X.0vl r0 = r6.A0H
            int r0 = X.C72453Mb.A0I(r0)
            r1.setTextColor(r0)
        L_0x0373:
            X.0vl r2 = r6.A0G
            java.lang.Object r1 = r2.getValue()
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            X.0vl r0 = r6.A0H
            goto L_0x0232
        L_0x037f:
            android.widget.Button r0 = r6.A03
            if (r0 == 0) goto L_0x0204
            r0.setEnabled(r5)
            goto L_0x0204
        L_0x0388:
            boolean r0 = r6 instanceof com.whatsapp.consent.DateOfBirthRemediationFragment
            if (r0 != 0) goto L_0x0199
            r0 = r6
            com.whatsapp.consent.DateOfBirthCollectionFragment r0 = (com.whatsapp.consent.DateOfBirthCollectionFragment) r0
            X.A8V r4 = r0.A27()
            r3 = 0
            java.lang.String r2 = "age_collection_monthday"
            java.lang.String r1 = "age_collection_monthday_landing"
            java.lang.String r0 = "view"
            r4.A0L(r2, r1, r0, r3)
            goto L_0x0199
        L_0x039f:
            X.84t r15 = (X.C1594984t) r15
            java.lang.Object r3 = r14.A01
            com.whatsapp.consent.common.AgeCollectionFragment r3 = (com.whatsapp.consent.common.AgeCollectionFragment) r3
            boolean r0 = r15 instanceof X.C143437Dk
            if (r0 == 0) goto L_0x0412
            X.1FL r0 = r3.A1D()
            X.1GP r5 = r0.getSupportFragmentManager()
            X.7Dk r15 = (X.C143437Dk) r15
            int r4 = r15.A00
            boolean r0 = r3 instanceof com.whatsapp.pancake.dosa.DosaRemediationFragment
            if (r0 == 0) goto L_0x03e3
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r0 = "arg_age"
            r2.putInt(r0, r4)
            com.whatsapp.pancake.dosa.DosaRemediationConfirmationDialog r0 = new com.whatsapp.pancake.dosa.DosaRemediationConfirmationDialog
            r0.<init>()
        L_0x03c7:
            r0.A1R(r2)
            X.C20098A7b.A02(r0, r5)
            boolean r0 = r3 instanceof com.whatsapp.consent.DateOfBirthCollectionFragment
            if (r0 == 0) goto L_0x0032
            com.whatsapp.consent.DateOfBirthCollectionFragment r3 = (com.whatsapp.consent.DateOfBirthCollectionFragment) r3
            X.A8V r4 = r3.A27()
            r3 = 0
            java.lang.String r2 = "age_collection_under18_confirmation"
            java.lang.String r1 = "age_collection_under18_confirmation_landing"
            java.lang.String r0 = "view"
            r4.A0L(r2, r1, r0, r3)
            goto L_0x0032
        L_0x03e3:
            boolean r0 = r3 instanceof com.whatsapp.pancake.dosa.DosaCollectionFragment
            if (r0 == 0) goto L_0x03f6
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r0 = "arg_age"
            r2.putInt(r0, r4)
            com.whatsapp.pancake.dosa.DosaAgeConfirmationDialog r0 = new com.whatsapp.pancake.dosa.DosaAgeConfirmationDialog
            r0.<init>()
            goto L_0x03c7
        L_0x03f6:
            boolean r1 = r3 instanceof com.whatsapp.consent.DateOfBirthRemediationFragment
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r0 = "arg_age"
            if (r1 == 0) goto L_0x0409
            r2.putInt(r0, r4)
            com.whatsapp.consent.DateOfBirthRemediationDialog r0 = new com.whatsapp.consent.DateOfBirthRemediationDialog
            r0.<init>()
            goto L_0x03c7
        L_0x0409:
            r2.putInt(r0, r4)
            com.whatsapp.consent.DateOfBirthConfirmationDialog r0 = new com.whatsapp.consent.DateOfBirthConfirmationDialog
            r0.<init>()
            goto L_0x03c7
        L_0x0412:
            boolean r0 = r15 instanceof X.C143527Dt
            if (r0 == 0) goto L_0x0428
            X.1FL r0 = r3.A1D()
            X.1GP r1 = r0.getSupportFragmentManager()
            com.whatsapp.consent.common.NonRecoverableErrorDialog r0 = new com.whatsapp.consent.common.NonRecoverableErrorDialog
            r0.<init>()
            X.C20098A7b.A02(r0, r1)
            goto L_0x0032
        L_0x0428:
            boolean r0 = r15 instanceof X.C143507Dr
            if (r0 == 0) goto L_0x043b
            X.1FL r1 = r3.A1B()
            if (r1 == 0) goto L_0x0436
            r0 = 0
            r1.setResult(r0)
        L_0x0436:
            X.1FL r0 = r3.A1B()
            goto L_0x0458
        L_0x043b:
            boolean r0 = r15 instanceof X.C143547Dv
            if (r0 == 0) goto L_0x0444
            com.whatsapp.consent.common.AgeCollectionFragment.A01(r3)
            goto L_0x0032
        L_0x0444:
            java.lang.String r0 = "AgeCollectionFragment/navigate/unknown action"
            goto L_0x064e
        L_0x0448:
            java.lang.Object r1 = r14.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.7Du r0 = X.C143537Du.A00
            boolean r0 = X.C18070vi.A18(r15, r0)
            if (r0 == 0) goto L_0x0032
            X.1FL r0 = r1.A1B()
        L_0x0458:
            if (r0 == 0) goto L_0x0032
            r0.finish()
            goto L_0x0032
        L_0x045f:
            java.lang.Object r8 = r14.A01
            com.whatsapp.consent.ConsentFlowActivity r8 = (com.whatsapp.consent.ConsentFlowActivity) r8
            X.7Dl r2 = X.C143447Dl.A00
            boolean r0 = X.C18070vi.A18(r15, r2)
            android.view.View r7 = r8.A00
            r9 = 2131436246(0x7f0b22d6, float:1.8494357E38)
            if (r0 == 0) goto L_0x0483
            X.1cN r1 = r8.A01
            if (r1 == 0) goto L_0x0660
            X.1fR r0 = r8.A00
            if (r0 == 0) goto L_0x065d
            boolean r0 = r0.A02()
            boolean r0 = r1.A0J(r0)
            r12 = 1
            if (r0 != 0) goto L_0x0484
        L_0x0483:
            r12 = 0
        L_0x0484:
            r10 = 0
            r11 = r10
            X.A9B.A0Q(r7, r8, r9, r10, r11, r12)
            boolean r0 = X.C18070vi.A18(r15, r2)
            if (r0 == 0) goto L_0x04af
            java.lang.Class<com.whatsapp.consent.DateOfBirthCollectionFragment> r0 = com.whatsapp.consent.DateOfBirthCollectionFragment.class
            boolean r0 = X.C109005cf.A0t(r8, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0032
            com.whatsapp.consent.DateOfBirthCollectionFragment r3 = new com.whatsapp.consent.DateOfBirthCollectionFragment
            r3.<init>()
            java.lang.String r2 = "DateOfBirthCollectionFragment"
        L_0x04a0:
            X.1jj r1 = X.AnonymousClass3Ma.A0H(r8)
            r0 = 2131433406(0x7f0b17be, float:1.8488597E38)
            r1.A0D(r3, r2, r0)
            r1.A01()
            goto L_0x0032
        L_0x04af:
            X.7Dp r0 = X.C143487Dp.A00
            boolean r0 = X.C18070vi.A18(r15, r0)
            if (r0 == 0) goto L_0x04f6
            X.0vl r6 = r8.A05
            java.lang.Object r0 = r6.getValue()
            com.whatsapp.consent.ConsentNavigationViewModel r0 = (com.whatsapp.consent.ConsentNavigationViewModel) r0
            com.whatsapp.dobverification.WaConsentRepository r7 = r0.A04
            android.content.SharedPreferences r0 = r7.A02()
            java.lang.String r5 = "minted_idv_token"
            java.lang.String r2 = X.C17880vN.A0r(r0, r5)
            android.content.SharedPreferences r1 = r7.A02()
            java.lang.String r0 = "minted_idvtoken_expiry_time_secs"
            long r3 = X.C17890vO.A04(r1, r0)
            if (r2 == 0) goto L_0x04e8
            int r0 = r2.length()
            if (r0 == 0) goto L_0x04e8
            X.11P r0 = r7.A00
            long r1 = X.AnonymousClass11P.A00(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x04e9
        L_0x04e8:
            r1 = 0
        L_0x04e9:
            java.lang.Object r0 = r6.getValue()
            com.whatsapp.consent.ConsentNavigationViewModel r0 = (com.whatsapp.consent.ConsentNavigationViewModel) r0
            if (r1 == 0) goto L_0x0616
            r0.A0T()
            goto L_0x0032
        L_0x04f6:
            X.7Dq r0 = X.C143497Dq.A00
            boolean r0 = X.C18070vi.A18(r15, r0)
            if (r0 == 0) goto L_0x0510
            java.lang.Class<com.whatsapp.consent.ConsentAgeBanFragment> r0 = com.whatsapp.consent.ConsentAgeBanFragment.class
            boolean r0 = X.C109005cf.A0t(r8, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0032
            com.whatsapp.consent.ConsentAgeBanFragment r3 = new com.whatsapp.consent.ConsentAgeBanFragment
            r3.<init>()
            java.lang.String r2 = "ConsentAgeBanFragment"
            goto L_0x04a0
        L_0x0510:
            X.7Ds r0 = X.C143517Ds.A00
            boolean r0 = X.C18070vi.A18(r15, r0)
            if (r0 == 0) goto L_0x052b
            java.lang.Class<com.whatsapp.pancake.PomegranatePancakeFragment> r0 = com.whatsapp.pancake.PomegranatePancakeFragment.class
            boolean r0 = X.C109005cf.A0t(r8, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0032
            com.whatsapp.pancake.PomegranatePancakeFragment r3 = new com.whatsapp.pancake.PomegranatePancakeFragment
            r3.<init>()
            java.lang.String r2 = "PomegranatePancakeFragment"
            goto L_0x04a0
        L_0x052b:
            X.7Do r0 = X.C143477Do.A00
            boolean r0 = X.C18070vi.A18(r15, r0)
            if (r0 == 0) goto L_0x0546
            java.lang.Class<com.whatsapp.consent.AgeRemediationPassFragment> r0 = com.whatsapp.consent.AgeRemediationPassFragment.class
            boolean r0 = X.C109005cf.A0t(r8, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0032
            com.whatsapp.consent.AgeRemediationPassFragment r3 = new com.whatsapp.consent.AgeRemediationPassFragment
            r3.<init>()
            java.lang.String r2 = "AgeRemediationPassFragment"
            goto L_0x04a0
        L_0x0546:
            X.7Dn r0 = X.C143467Dn.A00
            boolean r0 = X.C18070vi.A18(r15, r0)
            if (r0 == 0) goto L_0x0561
            java.lang.Class<com.whatsapp.consent.AgeRemediationFailFragment> r0 = com.whatsapp.consent.AgeRemediationFailFragment.class
            boolean r0 = X.C109005cf.A0t(r8, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0032
            com.whatsapp.consent.AgeRemediationFailFragment r3 = new com.whatsapp.consent.AgeRemediationFailFragment
            r3.<init>()
            java.lang.String r2 = "AgeRemediationFailFragment"
            goto L_0x04a0
        L_0x0561:
            X.7Dm r0 = X.C143457Dm.A00
            boolean r0 = X.C18070vi.A18(r15, r0)
            if (r0 == 0) goto L_0x057c
            java.lang.Class<com.whatsapp.consent.DateOfBirthRemediationFragment> r0 = com.whatsapp.consent.DateOfBirthRemediationFragment.class
            boolean r0 = X.C109005cf.A0t(r8, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0032
            com.whatsapp.consent.DateOfBirthRemediationFragment r3 = new com.whatsapp.consent.DateOfBirthRemediationFragment
            r3.<init>()
            java.lang.String r2 = "DateOfBirthRemediationFragment"
            goto L_0x04a0
        L_0x057c:
            X.7Dw r0 = X.C143557Dw.A00
            boolean r0 = X.C18070vi.A18(r15, r0)
            if (r0 == 0) goto L_0x059b
            X.0vl r0 = r8.A05
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.consent.ConsentNavigationViewModel r4 = (com.whatsapp.consent.ConsentNavigationViewModel) r4
            X.1OX r3 = r4.A0A
            X.0wl r2 = r4.A09
            r1 = 0
            com.whatsapp.consent.ConsentNavigationViewModel$resumeRegistrationAfterAgeVerification$1 r0 = new com.whatsapp.consent.ConsentNavigationViewModel$resumeRegistrationAfterAgeVerification$1
            r0.<init>(r4, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            goto L_0x0032
        L_0x059b:
            boolean r0 = r15 instanceof X.C143537Du
            if (r0 == 0) goto L_0x05b2
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x05a9
            r0 = -1
            r8.setResult(r0)
            goto L_0x0647
        L_0x05a9:
            X.1LU r0 = r8.A02
            if (r0 == 0) goto L_0x0663
            android.content.Intent r0 = X.AnonymousClass1LU.A03(r8)
            goto L_0x0605
        L_0x05b2:
            boolean r0 = r15 instanceof X.C143577Dy
            if (r0 == 0) goto L_0x05f9
            X.0vl r0 = r8.A05
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.consent.ConsentNavigationViewModel r3 = (com.whatsapp.consent.ConsentNavigationViewModel) r3
            X.1iv r4 = r3.A06
            r0 = 1
            X.2tN[] r1 = new X.C63592tN[r0]
            r2 = 20240708(0x134d944, float:3.321666E-38)
            X.2tN r0 = new X.2tN
            r0.<init>(r2)
            r1[r10] = r0
            r4.A05(r1)
            X.6W5 r1 = r3.A02
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            java.util.concurrent.ConcurrentHashMap r0 = r4.A0A
            r0.put(r12, r1)
            java.util.concurrent.ConcurrentSkipListSet r0 = r4.A0B
            r0.add(r12)
            X.1pH r7 = r3.A05
            r0 = 1
            X.7Ku r11 = new X.7Ku
            r11.<init>(r8, r3, r0)
            X.6wZ r10 = X.C138126wZ.A05
            X.6be r9 = new X.6be
            r9.<init>(r3)
            r13 = 0
            r7.A01(r8, r9, r10, r11, r12, r13)
            goto L_0x0032
        L_0x05f9:
            boolean r0 = r15 instanceof X.C143507Dr
            if (r0 == 0) goto L_0x0609
            X.1LU r0 = r8.A02
            if (r0 == 0) goto L_0x0663
            android.content.Intent r0 = X.AnonymousClass1LU.A01(r8)
        L_0x0605:
            r8.startActivity(r0)
            goto L_0x0647
        L_0x0609:
            boolean r0 = r15 instanceof X.C143567Dx
            if (r0 == 0) goto L_0x0647
            X.1LU r0 = r8.A02
            if (r0 == 0) goto L_0x0663
            android.content.Intent r0 = X.AnonymousClass1LU.A1o(r8, r10, r10)
            goto L_0x0605
        L_0x0616:
            com.whatsapp.dobverification.WaConsentRepository r2 = r0.A04
            android.content.SharedPreferences r0 = r2.A02()
            r1 = 0
            r0.getString(r5, r1)
            android.content.SharedPreferences r0 = r2.A02()
            java.lang.String r0 = r0.getString(r5, r1)
            if (r0 == 0) goto L_0x064c
            int r0 = r0.length()
            if (r0 == 0) goto L_0x064c
            java.lang.String r3 = "com.bloks.www.wa.authenticity.launcher.async"
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r8.getPackageName()
            java.lang.String r0 = "com.whatsapp.ageverification.idv.AuthenticityActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "screen_name"
            r2.putExtra(r0, r3)
            r8.startActivity(r2)
        L_0x0647:
            r8.finish()
            goto L_0x0032
        L_0x064c:
            java.lang.String r0 = "ConsentFlowActivity/navigate/launch Bloks age verification screen: no minted token"
        L_0x064e:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0032
        L_0x0653:
            X.AnonymousClass3MW.A1M()
            throw r3
        L_0x0657:
            java.lang.String r0 = "consentFeatureManager"
            goto L_0x0665
        L_0x065a:
            java.lang.String r0 = "contextualAgeCollectionLogUtil"
            goto L_0x0665
        L_0x065d:
            java.lang.String r0 = "changeNumberManager"
            goto L_0x0665
        L_0x0660:
            java.lang.String r0 = "accountSwitcher"
            goto L_0x0665
        L_0x0663:
            java.lang.String r0 = "waIntents"
        L_0x0665:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7SX.BJt(java.lang.Object, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r6 = 4;
        r1 = 2;
        r4 = "updateUi";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r5 = "navigate(Lcom/whatsapp/consent/data/Navigation;)V";
        r6 = 4;
        r1 = 2;
        r4 = "navigate";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        return new X.C445423v(r1, r2, r3, r4, r5, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C18080vj BS6() {
        /*
            r7 = this;
            int r0 = r7.A00
            java.lang.Object r2 = r7.A01
            switch(r0) {
                case 0: goto L_0x0015;
                case 1: goto L_0x0018;
                case 2: goto L_0x001b;
                case 3: goto L_0x001e;
                case 4: goto L_0x0023;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Class<com.whatsapp.pancake.dosa.DosaActivity> r3 = com.whatsapp.pancake.dosa.DosaActivity.class
        L_0x0009:
            java.lang.String r5 = "navigate(Lcom/whatsapp/consent/data/Navigation;)V"
            r6 = 4
            r1 = 2
            java.lang.String r4 = "navigate"
        L_0x000f:
            X.23v r0 = new X.23v
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0015:
            java.lang.Class<com.whatsapp.consent.ConsentFlowActivity> r3 = com.whatsapp.consent.ConsentFlowActivity.class
            goto L_0x0009
        L_0x0018:
            java.lang.Class<com.whatsapp.consent.common.AgeBanFragment> r3 = com.whatsapp.consent.common.AgeBanFragment.class
            goto L_0x0009
        L_0x001b:
            java.lang.Class<com.whatsapp.consent.common.AgeCollectionFragment> r3 = com.whatsapp.consent.common.AgeCollectionFragment.class
            goto L_0x0009
        L_0x001e:
            java.lang.Class<com.whatsapp.consent.common.AgeCollectionFragment> r3 = com.whatsapp.consent.common.AgeCollectionFragment.class
            java.lang.String r5 = "updateUi(Lcom/whatsapp/consent/data/ConsentData;)V"
            goto L_0x0027
        L_0x0023:
            java.lang.Class<com.whatsapp.pancake.PearPancakeFragment> r3 = com.whatsapp.pancake.PearPancakeFragment.class
            java.lang.String r5 = "updateUi(Ljava/lang/String;)V"
        L_0x0027:
            r6 = 4
            r1 = 2
            java.lang.String r4 = "updateUi"
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7SX.BS6():X.0vj");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass1G2) || !(obj instanceof C22841Dk)) {
            return false;
        }
        return C108975cc.A1L(obj, BS6());
    }

    public final int hashCode() {
        return BS6().hashCode();
    }
}
