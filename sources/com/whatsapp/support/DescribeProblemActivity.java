package com.whatsapp.support;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass129;
import X.AnonymousClass181;
import X.AnonymousClass18K;
import X.AnonymousClass1EC;
import X.AnonymousClass1K3;
import X.AnonymousClass1LU;
import X.AnonymousClass1MB;
import X.AnonymousClass1NM;
import X.AnonymousClass1QS;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4aU;
import X.AnonymousClass62I;
import X.AnonymousClass6MN;
import X.AnonymousClass6MO;
import X.AnonymousClass74O;
import X.AnonymousClass770;
import X.AnonymousClass7RD;
import X.AnonymousClass88C;
import X.AnonymousClass895;
import X.BD4;
import X.C108945cZ;
import X.C108985cd;
import X.C108995ce;
import X.C110885hR;
import X.C120616El;
import X.C123386Ug;
import X.C130676jp;
import X.C132216mP;
import X.C132636nD;
import X.C133186oJ;
import X.C138186wf;
import X.C1403871f;
import X.C171858sO;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C197289wS;
import X.C219217x;
import X.C26521Sl;
import X.C33261iX;
import X.C35551mQ;
import X.C72483Me;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.LabeledIntent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.inappsupport.ui.AddScreenshotImageView;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;

public class DescribeProblemActivity extends C120616El implements AnonymousClass895, AnonymousClass88C {
    public int A00;
    public Uri A01;
    public EditText A02;
    public AppCompatCheckBox A03;
    public C132216mP A04;
    public AnonymousClass181 A05;
    public AnonymousClass1NM A06;
    public C219217x A07;
    public AnonymousClass18K A08;
    public AnonymousClass1MB A09;
    public C132636nD A0A;
    public AnonymousClass6MO A0B;
    public AnonymousClass1LU A0C;
    public WhatsAppLibLoader A0D;
    public AnonymousClass1QS A0E;
    public C123386Ug A0F;
    public C133186oJ A0G;
    public AnonymousClass129 A0H;
    public C35551mQ A0I;
    public AnonymousClass1K3 A0J;
    public C26521Sl A0K;
    public AnonymousClass00H A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public boolean A0P;
    public C1403871f A0Q;
    public final Uri[] A0R = new Uri[3];

    public static void A0r(DescribeProblemActivity describeProblemActivity) {
        ArrayList arrayList;
        boolean z;
        AppCompatCheckBox appCompatCheckBox;
        DescribeProblemActivity describeProblemActivity2 = describeProblemActivity;
        describeProblemActivity.A0V(3);
        C133186oJ r4 = describeProblemActivity.A0G;
        String str = describeProblemActivity.A0N;
        String str2 = describeProblemActivity.A0M;
        String str3 = describeProblemActivity.A0O;
        String A032 = A03(describeProblemActivity);
        Uri[] uriArr = describeProblemActivity.A0R;
        C123386Ug r0 = describeProblemActivity.A0F;
        if (r0 != null) {
            arrayList = r0.A00();
        } else {
            arrayList = null;
        }
        if (!describeProblemActivity.A0t() || ((appCompatCheckBox = describeProblemActivity.A03) != null && appCompatCheckBox.isChecked())) {
            z = true;
        } else {
            z = false;
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (Uri uri : uriArr) {
            if (uri != null) {
                A13.add(uri);
            }
        }
        r4.A00(describeProblemActivity2, (AnonymousClass770) null, (AnonymousClass1EC) null, str, A032, str2, str3, A13, arrayList, z);
    }

    public static boolean A0u(String str, boolean z) {
        int length;
        int i;
        if (!z) {
            length = str.getBytes().length;
            i = 10;
        } else if (!str.contains("\n\n")) {
            return false;
        } else {
            length = str.substring(str.indexOf("\n\n", 0) + "\n\n".getBytes().length).getBytes().length;
            i = 45;
        }
        return length < i;
    }

    public void BsZ() {
        this.A0B = null;
        A0q(this);
    }

    public void C4m(C130676jp r14) {
        AnonymousClass1LU r1 = this.A0C;
        String str = this.A0N;
        String str2 = r14.A02;
        ArrayList arrayList = r14.A05;
        CNh(r1.A23(this, str, str2, this.A0O, arrayList, r14.A06, r14.A03, r14.A07, r14.A04, r14.A08, r14.A00), 32);
    }

    public void onBackPressed() {
        A0V(1);
        super.onBackPressed();
    }

    public Dialog onCreateDialog(int i) {
        if (i != 2) {
            return super.onCreateDialog(i);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(getString(2131895533));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    private void A0Q(int i) {
        if (this.A0E.A06() != null && this.A0E.A06().BRb() != null) {
            BD4 BRb = this.A0E.A06().BRb();
            C171858sO BHN = BRb.BHN();
            BHN.A08 = Integer.valueOf(i);
            BHN.A0b = "payments_in_app_support_view";
            BRb.BiH(BHN);
        }
    }

    private void A0V(int i) {
        AnonymousClass62I r1 = new AnonymousClass62I();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = this.A00.A05();
        this.A08.CC7(r1);
    }

    private void A0d(Uri uri, int i) {
        int i2;
        Uri uri2 = uri;
        this.A0R[i] = uri;
        AddScreenshotImageView addScreenshotImageView = (AddScreenshotImageView) ((ViewGroup) C110885hR.A0A(this, 2131434829)).getChildAt(i);
        if (uri != null) {
            int i3 = C72483Me.A0D(this).x / 3;
            try {
                addScreenshotImageView.setScreenshot(this.A0K.A0i(uri2, i3 / 2, i3, this.A0D.A04(), false));
                AnonymousClass3MY.A0w(this, addScreenshotImageView, 2131889364);
            } catch (IOException e) {
                C108995ce.A1J(uri, "descprob/screenshot/io-exception ", AnonymousClass000.A10(), e);
                i2 = 2131889981;
                BhQ(i2);
                AnonymousClass3MY.A0w(this, addScreenshotImageView, 2131889357);
            } catch (C33261iX e2) {
                C108995ce.A1J(uri, "descprob/screenshot/not-an-image ", AnonymousClass000.A10(), e2);
                i2 = 2131889970;
                BhQ(i2);
                AnonymousClass3MY.A0w(this, addScreenshotImageView, 2131889357);
            }
        } else {
            Bitmap bitmap = addScreenshotImageView.A02;
            if (bitmap != null) {
                bitmap.recycle();
                addScreenshotImageView.A02 = null;
            }
            AddScreenshotImageView.A02(addScreenshotImageView);
            AnonymousClass3MY.A0w(this, addScreenshotImageView, 2131889357);
        }
    }

    public static void A0s(DescribeProblemActivity describeProblemActivity, int i) {
        Intent labeledIntent;
        if (describeProblemActivity.A07.A0G()) {
            ArrayList A0z = C17880vN.A0z(2);
            A0z.add(new C138186wf(new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI).setType("image/*")));
            if (describeProblemActivity.A0R[i] != null) {
                Intent A0A2 = C17880vN.A0A();
                A0A2.setClassName(describeProblemActivity.getPackageName(), "com.whatsapp.support.Remove");
                A0z.add(new C138186wf(A0A2, describeProblemActivity.getString(2131896933)));
            }
            int size = A0z.size();
            ArrayList A0z2 = C17880vN.A0z(size);
            Intent intent = ((C138186wf) A0z.get(0)).A01;
            A0c(intent);
            A0z2.add(intent);
            for (int i2 = 1; i2 < size; i2++) {
                C138186wf r9 = (C138186wf) A0z.get(i2);
                String str = r9.A02;
                if (str == null) {
                    labeledIntent = r9.A01;
                } else {
                    Intent intent2 = r9.A01;
                    labeledIntent = new LabeledIntent(C17880vN.A0A().setComponent(intent2.resolveActivity(describeProblemActivity.getPackageManager())).setData(intent2.getData()).putExtras(intent2), describeProblemActivity.getPackageName(), str, r9.A00);
                }
                A0c(labeledIntent);
                A0z2.add(labeledIntent);
            }
            describeProblemActivity.startActivityForResult(AnonymousClass4aU.A01((IntentSender) null, (CharSequence) null, A0z2), i | 16);
            return;
        }
        int i3 = 2131894495;
        if (Build.VERSION.SDK_INT < 30) {
            i3 = 2131894425;
        }
        AnonymousClass74O.A09(describeProblemActivity, 2131894494, i3, i | 48);
    }

    private boolean A0t() {
        if (C197289wS.A00(this.A0N)) {
            if (!C18020vd.A05(C18040vf.A02, this.A0E, 2237) || !this.A0E.A06().getName().equals("UPI")) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        int i3;
        if ((i & 16) == 16) {
            if (i2 == -1 && intent != null) {
                if (AnonymousClass3MY.A1a(intent, "is_removed")) {
                    i3 = i - 16;
                    data = null;
                } else {
                    data = intent.getData();
                    if (data != null) {
                        try {
                            grantUriPermission("com.whatsapp", data, 1);
                        } catch (SecurityException e) {
                            Log.w("descprob/permission", e);
                        }
                        i3 = i - 16;
                    } else {
                        BhQ(2131889981);
                        return;
                    }
                }
                A0d(data, i3);
            }
        } else if (i == 32) {
            if (i2 == -1) {
                finish();
            }
        } else if ((i & 48) != 48) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            A0s(this, i - 48);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01e8, code lost:
        if (r1 == 3) goto L_0x01ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r4 = r20
            r7 = r21
            super.onCreate(r7)
            r0 = 2131889358(0x7f120cce, float:1.9413377E38)
            r4.setTitle(r0)
            X.01n r9 = X.AnonymousClass3MY.A0J(r4)
            r8 = 1
            r9.A0W(r8)
            r9.A0G()
            r0 = 2131625068(0x7f0e046c, float:1.8877334E38)
            r4.setContentView((int) r0)
            r0 = 2131434837(0x7f0b1d55, float:1.84915E38)
            android.view.View r19 = r4.findViewById(r0)
            r0 = 2131429920(0x7f0b0a20, float:1.8481526E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r4.A02 = r0
            r0 = 2131435164(0x7f0b1e9c, float:1.8492162E38)
            android.view.View r0 = r4.findViewById(r0)
            androidx.appcompat.widget.AppCompatCheckBox r0 = (androidx.appcompat.widget.AppCompatCheckBox) r0
            r4.A03 = r0
            r0.setChecked(r8)
            r0 = 2131435166(0x7f0b1e9e, float:1.8492166E38)
            r10 = 2131435166(0x7f0b1e9e, float:1.8492166E38)
            android.view.View r1 = r4.findViewById(r0)
            r0 = 41
            X.AnonymousClass78P.A00(r1, r4, r0)
            r0 = 2131429921(0x7f0b0a21, float:1.8481528E38)
            android.view.View r6 = r4.findViewById(r0)
            r0 = 2131433119(0x7f0b169f, float:1.8488015E38)
            android.view.View r5 = r4.findViewById(r0)
            android.widget.EditText r0 = r4.A02
            java.lang.String r0 = X.AnonymousClass3Ma.A12(r0)
            int r0 = r0.length()
            r3 = 0
            boolean r0 = X.C108975cc.A1C(r0, r8)
            r5.setEnabled(r0)
            android.widget.EditText r1 = r4.A02
            r2 = 2
            X.6If r0 = new X.6If
            r0.<init>(r4, r5, r2)
            r1.addTextChangedListener(r0)
            boolean r0 = r4.A0t()
            if (r0 == 0) goto L_0x008a
            r4.A0Q(r3)
            android.view.View r0 = r4.findViewById(r10)
            if (r0 == 0) goto L_0x008a
            r0.setVisibility(r3)
        L_0x008a:
            r3 = 1
            X.AnonymousClass78M.A00(r5, r4, r6, r8)
            android.content.Intent r8 = r4.getIntent()
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.from"
            java.lang.String r0 = r8.getStringExtra(r0)
            r4.A0N = r0
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.serverstatus"
            java.lang.String r0 = r8.getStringExtra(r0)
            r4.A0O = r0
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.emailAddress"
            java.lang.String r0 = r8.getStringExtra(r0)
            r4.A0M = r0
            X.00H r0 = r4.A0L
            java.lang.Object r0 = r0.get()
            X.1mP r0 = (X.C35541mP) r0
            android.util.Pair r6 = r0.A00()
            X.129 r5 = r4.A0H
            r1 = 0
            java.lang.String r0 = "general"
            android.net.Uri r0 = X.AnonymousClass129.A00(r6, r5, r0, r1, r1)
            r4.A01 = r0
            java.lang.String r0 = r4.A0N
            boolean r0 = X.C197289wS.A00(r0)
            if (r0 == 0) goto L_0x00ed
            X.18O r1 = r4.A06
            X.18S r0 = X.AnonymousClass18O.A1X
            java.lang.String r1 = r1.A07(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00d9
            r4.A0M = r1
        L_0x00d9:
            X.18O r1 = r4.A06
            X.18S r0 = X.AnonymousClass18O.A1Y
            java.lang.String r1 = r1.A07(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00ed
            android.net.Uri r0 = android.net.Uri.parse(r1)
            r4.A01 = r0
        L_0x00ed:
            r0 = 2131434829(0x7f0b1d4d, float:1.8491483E38)
            android.view.View r6 = X.C110885hR.A0A(r4, r0)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r6.removeAllViews()
            java.lang.String r0 = r4.A0N
            boolean r0 = X.C197289wS.A00(r0)
            if (r0 == 0) goto L_0x01d7
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicIDs"
            java.util.ArrayList r18 = r8.getStringArrayListExtra(r0)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicTitles"
            java.util.ArrayList r1 = r8.getStringArrayListExtra(r0)
            X.1QS r0 = r4.A0E
            X.BD1 r0 = r0.A06()
            X.6Ug r0 = r0.BWd()
            r4.A0F = r0
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentBankPhone"
            java.lang.String r17 = r8.getStringExtra(r0)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentMethod"
            android.os.Parcelable r12 = r8.getParcelableExtra(r0)
            X.AEs r12 = (X.C20284AEs) r12
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentFBTxnId"
            java.lang.String r16 = r8.getStringExtra(r0)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentBankTxnId"
            java.lang.String r14 = r8.getStringExtra(r0)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentErrorCode"
            java.lang.String r13 = r8.getStringExtra(r0)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentStatus"
            java.lang.String r11 = r8.getStringExtra(r0)
            r0 = 2131433551(0x7f0b184f, float:1.848889E38)
            android.view.View r10 = r4.findViewById(r0)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            X.6Ug r5 = r4.A0F
            if (r5 == 0) goto L_0x0171
            java.lang.String r15 = "payments:account-details"
            java.lang.String r0 = r4.A0N
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x0171
            r0 = r16
            r5.A02 = r0
            r5.A00 = r14
            r5.A01 = r13
            r5.A03 = r11
            r0 = r18
            r5.A04 = r0
            r0 = r17
            android.view.View r0 = r5.buildPaymentHelpSupportSection(r4, r12, r0)
            r10.addView(r0)
            r0 = 0
            r10.setVisibility(r0)
        L_0x0171:
            r0 = 2131433309(0x7f0b175d, float:1.84884E38)
            android.widget.TextView r10 = X.AnonymousClass3MX.A0L(r4, r0)
            r5 = 8
            if (r1 == 0) goto L_0x01b3
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01b3
            r0 = 0
            java.lang.String r0 = X.C108945cZ.A1H(r1, r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r0)
            r11 = 1
        L_0x018d:
            int r0 = r1.size()
            if (r11 >= r0) goto L_0x01b7
            if (r11 != r3) goto L_0x019a
            java.lang.String r0 = " ("
            r12.append(r0)
        L_0x019a:
            java.lang.String r0 = X.C108945cZ.A1H(r1, r11)
            r12.append(r0)
            int r0 = r1.size()
            int r0 = r0 - r3
            if (r11 != r0) goto L_0x01b0
            java.lang.String r0 = ")"
        L_0x01aa:
            r12.append(r0)
            int r11 = r11 + 1
            goto L_0x018d
        L_0x01b0:
            java.lang.String r0 = ", "
            goto L_0x01aa
        L_0x01b3:
            r10.setVisibility(r5)
            goto L_0x01c2
        L_0x01b7:
            java.lang.String r0 = r12.toString()
            r10.setText(r0)
            r0 = 0
            r10.setVisibility(r0)
        L_0x01c2:
            r0 = 2131427636(0x7f0b0134, float:1.8476894E38)
            android.view.View r1 = r4.findViewById(r0)
            X.6Ug r0 = r4.A0F
            if (r0 == 0) goto L_0x01d7
            boolean r0 = r0 instanceof X.C120076Bo
            if (r0 == 0) goto L_0x01d7
            r1.setVisibility(r5)
            r6.setVisibility(r5)
        L_0x01d7:
            java.lang.String r1 = "com.whatsapp.support.DescribeProblemActivity.type"
            r0 = 0
            int r1 = r8.getIntExtra(r1, r0)
            r4.A00 = r1
            r5 = 3
            if (r1 == r3) goto L_0x01ea
            if (r1 == r2) goto L_0x01ea
            r0 = 2131889358(0x7f120cce, float:1.9413377E38)
            if (r1 != r5) goto L_0x01ed
        L_0x01ea:
            r0 = 2131889359(0x7f120ccf, float:1.941338E38)
        L_0x01ed:
            r9.A0M(r0)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.description"
            java.lang.String r1 = r8.getStringExtra(r0)
            if (r1 == 0) goto L_0x0205
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0205
            android.widget.EditText r0 = r4.A02
            r0.setText(r1)
            r4.A0P = r3
        L_0x0205:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131167706(0x7f0709da, float:1.7949693E38)
            int r11 = r1.getDimensionPixelSize(r0)
            r10 = 0
        L_0x0211:
            com.whatsapp.inappsupport.ui.AddScreenshotImageView r9 = new com.whatsapp.inappsupport.ui.AddScreenshotImageView
            r9.<init>(r4)
            r0 = 36
            X.C90104dX.A00(r9, r4, r10, r0)
            r12 = -2
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r3, r12, r1)
            r0.bottomMargin = r11
            r0.rightMargin = r11
            r0.topMargin = r11
            r0.leftMargin = r11
            r6.addView(r9, r0)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.uri"
            java.lang.String r0 = r8.getStringExtra(r0)
            if (r10 != 0) goto L_0x0247
            if (r0 == 0) goto L_0x0247
            android.net.Uri r1 = android.net.Uri.parse(r0)
            android.net.Uri[] r0 = r4.A0R
            r0[r3] = r1
            X.AnonymousClass3MW.A1R(r9)
            r9.setImageURI(r1)
        L_0x0247:
            int r10 = r10 + 1
            if (r10 < r5) goto L_0x0211
            if (r21 == 0) goto L_0x0262
            java.lang.String r0 = "screenshots"
            android.os.Parcelable[] r1 = r7.getParcelableArray(r0)
        L_0x0253:
            int r0 = r1.length
            if (r3 >= r0) goto L_0x0262
            r0 = r1[r3]
            if (r0 == 0) goto L_0x025f
            android.net.Uri r0 = (android.net.Uri) r0
            r4.A0d(r0, r3)
        L_0x025f:
            int r3 = r3 + 1
            goto L_0x0253
        L_0x0262:
            int r0 = r4.A00
            if (r0 != r2) goto L_0x0269
            A0q(r4)
        L_0x0269:
            r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r1 = r4.findViewById(r0)
            r0 = r19
            X.71f r0 = X.C1403871f.A00(r4, r0, r1)
            r4.A0Q = r0
            r0.A02()
            boolean r0 = r4.A0t()
            if (r0 == 0) goto L_0x0291
            android.view.View r1 = r4.A00
            r0 = 2131429924(0x7f0b0a24, float:1.8481534E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r1, r0)
            r0 = 2131888881(0x7f120af1, float:1.941241E38)
            r1.setText(r0)
            return
        L_0x0291:
            r0 = 2131429924(0x7f0b0a24, float:1.8481534E38)
            android.widget.TextView r3 = X.AnonymousClass3MX.A0L(r4, r0)
            r0 = 2131889363(0x7f120cd3, float:1.9413387E38)
            java.lang.String r2 = r4.getString(r0)
            X.5dr r1 = new X.5dr
            r1.<init>(r4, r5)
            r0 = 2132083204(0x7f150204, float:1.9806544E38)
            X.C1403871f.A01(r4, r1, r3, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.support.DescribeProblemActivity.onCreate(android.os.Bundle):void");
    }

    public static String A03(DescribeProblemActivity describeProblemActivity) {
        ArrayList<String> stringArrayListExtra;
        if (!describeProblemActivity.getIntent().hasExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicTitles") || (stringArrayListExtra = describeProblemActivity.getIntent().getStringArrayListExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicTitles")) == null || stringArrayListExtra.isEmpty()) {
            return C108985cd.A0h(describeProblemActivity.A02);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(describeProblemActivity.getString(2131894073));
        StringBuilder sb = new StringBuilder(AnonymousClass000.A0y(" ", A10));
        for (int i = 0; i < stringArrayListExtra.size(); i++) {
            sb.append(C108945cZ.A1H(stringArrayListExtra, i));
            if (i < AnonymousClass000.A0Q(stringArrayListExtra)) {
                sb.append(", ");
            }
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("\n\n");
        C108985cd.A1L(C108985cd.A0h(describeProblemActivity.A02), A102, sb);
        return sb.toString();
    }

    public static void A0c(Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("com.whatsapp");
            if (action.startsWith(AnonymousClass000.A0y(".intent.action.", A10)) && !"gigaset".equalsIgnoreCase(Build.MANUFACTURER)) {
                intent.setPackage("com.whatsapp");
            }
        }
    }

    public static void A0q(DescribeProblemActivity describeProblemActivity) {
        if (describeProblemActivity.A0t()) {
            describeProblemActivity.A0Q(1);
            describeProblemActivity.CNB(0, 2131891797);
            describeProblemActivity.A05.CGF(new AnonymousClass7RD(describeProblemActivity, describeProblemActivity, 3));
            return;
        }
        A0r(describeProblemActivity);
    }

    public String A4b() {
        return "contact_support";
    }

    public String A4c() {
        return "contact_support";
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0Q.A02();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!A0t()) {
            return super.onCreateOptionsMenu(menu);
        }
        menu.add(0, 2131432541, 0, getString(2131897196)).setShowAsAction(0);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass6MO r1 = this.A0B;
        if (r1 != null) {
            r1.A0B(false);
        }
        AnonymousClass6MN r12 = this.A0G.A00;
        if (r12 != null) {
            r12.A0B(false);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            A0V(1);
            finish();
            return true;
        } else if (itemId != 2131432541) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            TextView A0L2 = AnonymousClass3MX.A0L(this, 2131429921);
            String A032 = A03(this);
            int length = A032.getBytes().length;
            boolean A002 = C197289wS.A00(this.A0N);
            if (this.A0P || !A0u(A032, A002)) {
                AnonymousClass3MY.A0v(this, this.A02, 2131231322);
                A0L2.setVisibility(8);
                A0r(this);
                return true;
            }
            AnonymousClass3MY.A0v(this, this.A02, 2131231320);
            int i = 2131889361;
            if (length == 0) {
                i = 2131889360;
            }
            A0L2.setText(i);
            A0L2.setVisibility(0);
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        this.A02.clearFocus();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArray("screenshots", this.A0R);
    }

    public void C3G(boolean z) {
        finish();
    }
}
