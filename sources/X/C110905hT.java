package X;

/* renamed from: X.5hT  reason: invalid class name and case insensitive filesystem */
public class C110905hT extends AnonymousClass1XU {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C110905hT(int i, String str, Object obj) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        r2 = X.AnonymousClass000.A10();
        r2.append("AccessibilityUtils/setRole/invalid role: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01cb, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 23) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01cd, code lost:
        r6.A0V(X.AnonymousClass3Ma.A11((android.view.View) r4.A01, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d8, code lost:
        r6.A0O(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01db, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        throw X.AnonymousClass001.A12(r1, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1Z(android.view.View r5, X.C26228CvK r6) {
        /*
            r4 = this;
            int r0 = r4.A00
            if (r0 == 0) goto L_0x0014
            super.A1Z(r5, r6)
            r2 = 16
            java.lang.String r1 = r4.A02
            X.Ct0 r0 = new X.Ct0
            r0.<init>((int) r2, (java.lang.CharSequence) r1)
            r6.A0L(r0)
            return
        L_0x0014:
            super.A1Z(r5, r6)
            java.lang.String r1 = r4.A02
            int r0 = r1.hashCode()
            switch(r0) {
                case -1865955844: goto L_0x002e;
                case -1805606060: goto L_0x0041;
                case -1604708901: goto L_0x0054;
                case -1495589242: goto L_0x0067;
                case -1406842887: goto L_0x007a;
                case -1221024851: goto L_0x008d;
                case -1125439882: goto L_0x00a0;
                case 2228070: goto L_0x00b3;
                case 2368702: goto L_0x00c6;
                case 70760763: goto L_0x00d9;
                case 80979463: goto L_0x00ec;
                case 279225764: goto L_0x00ff;
                case 313126659: goto L_0x0112;
                case 757931941: goto L_0x0125;
                case 799298502: goto L_0x0138;
                case 1123338583: goto L_0x014a;
                case 1472283236: goto L_0x015c;
                case 1601535971: goto L_0x016e;
                case 1667629655: goto L_0x0180;
                case 2001146706: goto L_0x0192;
                case 2010926191: goto L_0x01a4;
                case 2059813682: goto L_0x01b6;
                default: goto L_0x0020;
            }
        L_0x0020:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccessibilityUtils/setRole/invalid role: "
            r2.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r1, r2)
            throw r0
        L_0x002e:
            java.lang.String r0 = "DatePicker"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.widget.DatePicker> r0 = android.widget.DatePicker.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886266(0x7f1200ba, float:1.9407106E38)
            goto L_0x01c7
        L_0x0041:
            java.lang.String r0 = "Switch"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.widget.Switch> r0 = android.widget.Switch.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886279(0x7f1200c7, float:1.9407132E38)
            goto L_0x01c7
        L_0x0054:
            java.lang.String r0 = "TimePicker"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.widget.TimePicker> r0 = android.widget.TimePicker.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886281(0x7f1200c9, float:1.9407136E38)
            goto L_0x01c7
        L_0x0067:
            java.lang.String r0 = "ProgressBar"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.widget.ProgressBar> r0 = android.widget.ProgressBar.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886275(0x7f1200c3, float:1.9407124E38)
            goto L_0x01c7
        L_0x007a:
            java.lang.String r0 = "WebView"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.webkit.WebView> r0 = android.webkit.WebView.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886285(0x7f1200cd, float:1.9407145E38)
            goto L_0x01c7
        L_0x008d:
            java.lang.String r0 = "RadioButton  "
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.widget.RadioButton> r0 = android.widget.RadioButton.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886276(0x7f1200c4, float:1.9407126E38)
            goto L_0x01c7
        L_0x00a0:
            java.lang.String r0 = "HorizontalScrollView"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.widget.HorizontalScrollView> r0 = android.widget.HorizontalScrollView.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886271(0x7f1200bf, float:1.9407116E38)
            goto L_0x01c7
        L_0x00b3:
            java.lang.String r0 = "Grid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.widget.GridView> r0 = android.widget.GridView.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886270(0x7f1200be, float:1.9407114E38)
            goto L_0x01c7
        L_0x00c6:
            java.lang.String r0 = "List"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.widget.AbsListView> r0 = android.widget.AbsListView.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886273(0x7f1200c1, float:1.940712E38)
            goto L_0x01c7
        L_0x00d9:
            java.lang.String r0 = "Image"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.widget.ImageView> r0 = android.widget.ImageView.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886272(0x7f1200c0, float:1.9407118E38)
            goto L_0x01c7
        L_0x00ec:
            java.lang.String r0 = "Toast"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.widget.Toast> r0 = android.widget.Toast.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886283(0x7f1200cb, float:1.940714E38)
            goto L_0x01c7
        L_0x00ff:
            java.lang.String r0 = "AlertDialog"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.app.AlertDialog> r0 = android.app.AlertDialog.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886263(0x7f1200b7, float:1.94071E38)
            goto L_0x01c7
        L_0x0112:
            java.lang.String r0 = "TimePickerDialog"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.app.TimePickerDialog> r0 = android.app.TimePickerDialog.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886282(0x7f1200ca, float:1.9407138E38)
            goto L_0x01c7
        L_0x0125:
            java.lang.String r0 = "SeekControl"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.widget.SeekBar> r0 = android.widget.SeekBar.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886278(0x7f1200c6, float:1.940713E38)
            goto L_0x01c7
        L_0x0138:
            java.lang.String r0 = "ToggleButton"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.widget.ToggleButton> r0 = android.widget.ToggleButton.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886284(0x7f1200cc, float:1.9407142E38)
            goto L_0x01c7
        L_0x014a:
            java.lang.String r0 = "NumberPicker"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.widget.NumberPicker> r0 = android.widget.NumberPicker.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886274(0x7f1200c2, float:1.9407122E38)
            goto L_0x01c7
        L_0x015c:
            java.lang.String r0 = "DatePickerDialog"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.app.DatePickerDialog> r0 = android.app.DatePickerDialog.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886267(0x7f1200bb, float:1.9407108E38)
            goto L_0x01c7
        L_0x016e:
            java.lang.String r0 = "Checkbox"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.widget.CheckBox> r0 = android.widget.CheckBox.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886265(0x7f1200b9, float:1.9407104E38)
            goto L_0x01c7
        L_0x0180:
            java.lang.String r0 = "Edittext"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.widget.EditText> r0 = android.widget.EditText.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886269(0x7f1200bd, float:1.9407112E38)
            goto L_0x01c7
        L_0x0192:
            java.lang.String r0 = "Button"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886264(0x7f1200b8, float:1.9407102E38)
            goto L_0x01c7
        L_0x01a4:
            java.lang.String r0 = "DropdownList"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.widget.Spinner> r0 = android.widget.Spinner.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886268(0x7f1200bc, float:1.940711E38)
            goto L_0x01c7
        L_0x01b6:
            java.lang.String r0 = "ScrollView"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Class<android.widget.ScrollView> r0 = android.widget.ScrollView.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886277(0x7f1200c5, float:1.9407128E38)
        L_0x01c7:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 >= r0) goto L_0x01d8
            java.lang.Object r0 = r4.A01
            android.view.View r0 = (android.view.View) r0
            java.lang.String r0 = X.AnonymousClass3Ma.A11(r0, r2)
            r6.A0V(r0)
        L_0x01d8:
            r6.A0O(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110905hT.A1Z(android.view.View, X.CvK):void");
    }
}
