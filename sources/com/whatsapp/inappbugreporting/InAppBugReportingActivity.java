package com.whatsapp.inappbugreporting;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11S;
import X.AnonymousClass18K;
import X.AnonymousClass1DF;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1YF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3RY;
import X.AnonymousClass41O;
import X.AnonymousClass5I3;
import X.AnonymousClass770;
import X.C000200d;
import X.C132216mP;
import X.C133186oJ;
import X.C146707Qh;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C219217x;
import X.C25291Nq;
import X.C28931bI;
import X.C33261iX;
import X.C36401np;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C91014f0;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.inappsupport.ui.AddScreenshotImageView;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

public class InAppBugReportingActivity extends AnonymousClass1FY {
    public ProgressDialog A00;
    public View A01;
    public ViewStub A02;
    public LinearLayout A03;
    public TextView A04;
    public ConstraintLayout A05;
    public ConstraintLayout A06;
    public C132216mP A07;
    public TextEmojiLabel A08;
    public WaEditText A09;
    public WaEditText A0A;
    public WaTextView A0B;
    public WaTextView A0C;
    public C219217x A0D;
    public AnonymousClass18K A0E;
    public C25291Nq A0F;
    public WhatsAppLibLoader A0G;
    public C133186oJ A0H;
    public C36401np A0I;
    public C28931bI A0J;
    public WDSButton A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public String A0O;
    public Uri[] A0P;
    public boolean A0Q;
    public final C18100vl A0R;

    public InAppBugReportingActivity() {
        this(0);
        this.A0P = new Uri[3];
        this.A0R = AnonymousClass1DF.A01(new AnonymousClass5I3(this));
    }

    private final void A0Q(Uri uri, int i) {
        int i2;
        LinearLayout linearLayout = this.A03;
        if (linearLayout == null) {
            C18070vi.A11("screenshotsGroup");
            throw null;
        }
        int i3 = i;
        View childAt = linearLayout.getChildAt(i);
        C18070vi.A0z(childAt, "null cannot be cast to non-null type com.whatsapp.inappbugreporting.view.AddScreenshotImageViewWithRemoveButton");
        AnonymousClass3RY r5 = (AnonymousClass3RY) childAt;
        Uri uri2 = uri;
        if (uri != null) {
            try {
                this.A05.CGF(new C146707Qh(this, uri2, r5, C72483Me.A0D(this).x / 3, i3, 3));
            } catch (IOException e) {
                Log.e(AnonymousClass001.A1E(uri, "InAppBugReporting/screenshot/io-exception ", AnonymousClass000.A10()), e);
                i2 = 2131889981;
                BhQ(i2);
            } catch (C33261iX e2) {
                Log.e(AnonymousClass001.A1E(uri, "InAppBugReporting/screenshot/not-an-image ", AnonymousClass000.A10()), e2);
                i2 = 2131889970;
                BhQ(i2);
            }
        } else {
            AddScreenshotImageView addScreenshotImageView = r5.getAddScreenshotImageView();
            Bitmap bitmap = addScreenshotImageView.A02;
            if (bitmap != null) {
                bitmap.recycle();
                addScreenshotImageView.A02 = null;
            }
            AddScreenshotImageView.A02(addScreenshotImageView);
            r5.setRemoveButtonVisibility(false);
        }
    }

    public static final void A0V(InAppBugReportingActivity inAppBugReportingActivity) {
        String str;
        InAppBugReportingActivity inAppBugReportingActivity2 = inAppBugReportingActivity;
        if (inAppBugReportingActivity.A07 != null) {
            C133186oJ r4 = inAppBugReportingActivity.A0H;
            if (r4 != null) {
                String A032 = A03(inAppBugReportingActivity);
                Uri[] uriArr = inAppBugReportingActivity.A0P;
                ArrayList A13 = AnonymousClass000.A13();
                for (Uri uri : uriArr) {
                    if (uri != null) {
                        A13.add(uri);
                    }
                }
                r4.A00(inAppBugReportingActivity2, (AnonymousClass770) null, (AnonymousClass1EC) null, "InAppBugReporting", A032, (String) null, (String) null, A13, (List) null, true);
                inAppBugReportingActivity2.finish();
                return;
            }
            str = "contactSupportManager";
        } else {
            str = "sendFeedback";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void CBt(String str) {
        C18070vi.A0d(str, 0);
        if (str.equals("confirm_cancel_reporting_dialog")) {
            C72473Md.A0V(this).A00(3, (String) null);
            finish();
        }
    }

    public void onBackPressed() {
        if (!(AnonymousClass3MZ.A0v(this).A07.A06() instanceof AnonymousClass41O)) {
            WaEditText waEditText = this.A09;
            if (waEditText == null) {
                C18070vi.A11("describeBugField");
                throw null;
            } else if (AnonymousClass1YF.A0I(AnonymousClass3MZ.A17(waEditText)).length() > 0) {
                CMx((Integer) null, 2131887463, 2131887469, 2131887470, (Integer) null, "confirm_cancel_reporting_dialog", (String) null, (Object[]) null);
                return;
            }
        }
        super.onBackPressed();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onRestoreInstanceState(bundle);
        Parcelable[] parcelableArray = bundle.getParcelableArray("save_state_screenshots");
        if (parcelableArray != null) {
            int length = parcelableArray.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                Parcelable parcelable = parcelableArray[i];
                int i3 = i2 + 1;
                if (parcelable != null) {
                    A0Q((Uri) parcelable, i2);
                }
                i++;
                i2 = i3;
            }
        }
        String string = bundle.getString("save_state_bug_category");
        if (string != null) {
            WaTextView waTextView = this.A0B;
            if (waTextView == null) {
                C18070vi.A11("categoryTextView");
                throw null;
            }
            waTextView.setText(string);
            this.A0O = string;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArray("save_state_screenshots", this.A0P);
        bundle.putString("save_state_bug_category", this.A0O);
    }

    public static final String A03(InAppBugReportingActivity inAppBugReportingActivity) {
        WaEditText waEditText = inAppBugReportingActivity.A09;
        if (waEditText == null) {
            C18070vi.A11("describeBugField");
            throw null;
        }
        String A17 = AnonymousClass3MZ.A17(waEditText);
        String stringExtra = inAppBugReportingActivity.getIntent().getStringExtra("extra_message_id");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        if (!AnonymousClass1YF.A0T(stringExtra)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MessageID: ");
            A10.append(stringExtra);
            A17 = AnonymousClass001.A1H(";\n", A17, A10);
        }
        String stringExtra2 = inAppBugReportingActivity.getIntent().getStringExtra("extra_custom_bloks_use_case");
        if (stringExtra2 == null) {
            stringExtra2 = str;
        }
        if (stringExtra2.equals("contextual_help") || stringExtra2.equals("help_article")) {
            try {
                String optString = C17880vN.A16(inAppBugReportingActivity.getIntent().getStringExtra("extra_custom_bloks_param")).optString("cms_id");
                if (optString != null) {
                    str = optString;
                }
                if (str.length() > 0) {
                    StringBuilder A11 = AnonymousClass000.A11(A17);
                    A11.append("\n\n\n\nCMS_ID: ");
                    A11.append(str);
                    A11.append("\n#wa-dogfooding-pretriaged\n#Oncall_wasce\n");
                    return A11.toString();
                }
            } catch (JSONException e) {
                Log.w("InAppBugReporting/Custom Params: Could not parse Bloks params", e);
            }
        }
        return A17;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r9.A07.A04() == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0c(com.whatsapp.inappbugreporting.InAppBugReportingActivity r9, int r10) {
        /*
            r2 = r10 | 32
            X.17x r0 = r9.A0D
            if (r0 == 0) goto L_0x0088
            java.lang.Integer r1 = r0.A05()
            X.C18070vi.A0X(r1)
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x0084
            X.11S r0 = r9.A02
            r0.A0I()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x0023
            X.1CM r0 = r9.A07
            boolean r0 = r0.A04()
            r8 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r8 = 0
        L_0x0024:
            X.00H r0 = r9.A0N
            if (r0 == 0) goto L_0x0081
            r0.get()
            X.0ve r2 = r9.A0E
            r1 = 7951(0x1f0f, float:1.1142E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r7 = 5
            r5 = 1
            r6 = 40
            r4 = 0
            r3 = 21
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r9.getPackageName()
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = "com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity"
        L_0x0048:
            r2.setClassName(r1, r0)
            java.lang.String r0 = "include_media"
            r2.putExtra(r0, r7)
            java.lang.String r0 = "max_items"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "preview"
            r2.putExtra(r0, r8)
            java.lang.String r0 = "origin"
            r2.putExtra(r0, r6)
            java.lang.String r0 = "send"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "should_hide_caption_view"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "skip_max_items_new_limit"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "should_set_gallery_result"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "media_sharing_user_journey_origin"
            r2.putExtra(r0, r3)
            r0 = r10 | 16
            r9.startActivityForResult(r2, r0)
            return
        L_0x007e:
            java.lang.String r0 = "com.whatsapp.gallerypicker.GalleryPicker"
            goto L_0x0048
        L_0x0081:
            java.lang.String r0 = "waIntents"
            goto L_0x008a
        L_0x0084:
            X.AnonymousClass74O.A07(r9, r2)
            return
        L_0x0088:
            java.lang.String r0 = "waPermissionsHelper"
        L_0x008a:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappbugreporting.InAppBugReportingActivity.A0c(com.whatsapp.inappbugreporting.InAppBugReportingActivity, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r3 != null) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0d(com.whatsapp.inappbugreporting.InAppBugReportingActivity r4, X.C83204Ef r5, X.AnonymousClass3RY r6, int r7) {
        /*
            boolean r0 = r5 instanceof X.AnonymousClass41U
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0017
            r6.setUploadProgressBarVisibility(r3)
            r6.setEnabled(r1)
            r6.setRemoveButtonVisibility(r3)
            com.whatsapp.wds.components.button.WDSButton r3 = r4.A0K
            if (r3 == 0) goto L_0x0033
        L_0x0013:
            r3.setEnabled(r1)
        L_0x0016:
            return
        L_0x0017:
            boolean r0 = r5 instanceof X.AnonymousClass41T
            java.lang.String r2 = "describeBugField"
            if (r0 == 0) goto L_0x0039
            r6.setUploadProgressBarVisibility(r1)
            r6.setEnabled(r3)
        L_0x0023:
            r6.setRemoveButtonVisibility(r3)
        L_0x0026:
            com.whatsapp.wds.components.button.WDSButton r3 = r4.A0K
            if (r3 == 0) goto L_0x0033
            com.whatsapp.WaEditText r0 = r4.A09
            if (r0 != 0) goto L_0x0069
            X.C18070vi.A11(r2)
        L_0x0031:
            r0 = 0
            throw r0
        L_0x0033:
            java.lang.String r0 = "submitButton"
            X.C18070vi.A11(r0)
            goto L_0x0031
        L_0x0039:
            boolean r0 = r5 instanceof X.AnonymousClass41R
            if (r0 == 0) goto L_0x0051
            r6.setUploadProgressBarVisibility(r1)
            r6.setEnabled(r3)
            r6.setRetryLayoutVisibility(r3)
            r6.setRemoveButtonVisibility(r3)
            X.4nz r0 = new X.4nz
            r0.<init>(r4, r7)
            r6.A04 = r0
            goto L_0x0026
        L_0x0051:
            X.41S r0 = X.AnonymousClass41S.A00
            boolean r0 = X.C18070vi.A18(r5, r0)
            if (r0 == 0) goto L_0x0016
            r6.setUploadProgressBarVisibility(r1)
            r6.setEnabled(r3)
            android.net.Uri[] r0 = r4.A0P
            r0 = r0[r7]
            if (r0 != 0) goto L_0x0023
            r6.setRemoveButtonVisibility(r1)
            goto L_0x0026
        L_0x0069:
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0013
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0013
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r0 = X.AnonymousClass3MZ.A0v(r4)
            boolean r0 = r0.A0V()
            if (r0 != 0) goto L_0x0013
            r1 = 1
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappbugreporting.InAppBugReportingActivity.A0d(com.whatsapp.inappbugreporting.InAppBugReportingActivity, X.4Ef, X.3RY, int):void");
    }

    public void A2y() {
        if (!this.A0Q) {
            this.A0Q = true;
            AnonymousClass10E A0L2 = C72473Md.A0L(this);
            C72483Me.A0q(A0L2, this);
            AnonymousClass10G r2 = A0L2.A00;
            AnonymousClass1FB.A0K(A0L2, r2, this, r2.A45);
            AnonymousClass1FB.A0L(A0L2, r2, this, r2.A5A);
            this.A0H = (C133186oJ) r2.A8E.get();
            this.A0L = AnonymousClass3MX.A10(A0L2);
            this.A0I = AnonymousClass3MY.A0e(r2);
            this.A0F = (C25291Nq) A0L2.A6E.get();
            this.A07 = (C132216mP) r2.A4S.get();
            this.A0M = C000200d.A00(r2.ACF);
            this.A0N = AnonymousClass3MW.A0s(A0L2);
            this.A0D = AnonymousClass3Ma.A0b(A0L2);
            this.A0E = AnonymousClass3Ma.A0g(A0L2);
            this.A0G = (WhatsAppLibLoader) A0L2.ABy.get();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList parcelableArrayListExtra;
        Uri uri;
        super.onActivityResult(i, i2, intent);
        String str = null;
        if ((i & 16) == 16) {
            if (i2 == -1 && intent != null && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM")) != null && parcelableArrayListExtra.size() > 0 && (uri = (Uri) parcelableArrayListExtra.get(0)) != null) {
                try {
                    grantUriPermission("com.whatsapp", uri, 1);
                } catch (SecurityException e) {
                    Log.w("InAppBugReporting/permission", e);
                }
                A0Q(uri, i - 16);
                AnonymousClass11S r0 = this.A02;
                r0.A0I();
                if (r0.A00 != null && this.A07.A04()) {
                    AnonymousClass3MZ.A0v(this).A0T(uri, i - 16);
                }
            }
        } else if ((i & 32) == 32) {
            if (i2 == -1) {
                A0c(this, i - 32);
            }
        } else if (i == 3 && i2 == -1) {
            if (intent != null) {
                String stringExtra = intent.getStringExtra("bug_category_title");
                if (stringExtra != null) {
                    WaTextView waTextView = this.A0B;
                    if (waTextView == null) {
                        C18070vi.A11("categoryTextView");
                        throw null;
                    }
                    waTextView.setText(stringExtra);
                }
                str = intent.getStringExtra("bug_category_type");
            }
            this.A0O = str;
        }
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [android.widget.RelativeLayout, X.3RY, android.view.View, java.lang.Object, android.view.ViewGroup] */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0213, code lost:
        if (X.AnonymousClass3MZ.A0v(r13).A0V() != false) goto L_0x0215;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            super.onCreate(r14)
            X.4Po r1 = X.C72473Md.A0V(r13)
            r2 = 0
            r0 = 2
            r1.A00(r0, r2)
            r0 = 2131624059(0x7f0e007b, float:1.8875287E38)
            r13.setContentView((int) r0)
            X.01n r1 = r13.getSupportActionBar()
            if (r1 == 0) goto L_0x0026
            r0 = 1
            r1.A0W(r0)
            r0 = 2131895174(0x7f122386, float:1.9425174E38)
            java.lang.String r0 = r13.getString(r0)
            r1.A0S(r0)
        L_0x0026:
            r0 = 2131427636(0x7f0b0134, float:1.8476894E38)
            android.view.View r7 = X.AnonymousClass3MY.A0C(r13, r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 2131427637(0x7f0b0135, float:1.8476896E38)
            android.view.View r5 = X.AnonymousClass3MY.A0C(r13, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            X.0ve r1 = r13.A0E
            r0 = 10127(0x278f, float:1.4191E-41)
            X.0vf r6 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            r4 = 3
            r3 = 0
            if (r0 == 0) goto L_0x01c7
            r0 = 2131895472(0x7f1224b0, float:1.9425778E38)
            X.AnonymousClass3MY.A0x(r13, r7, r0)
            r1 = 2131886523(0x7f1201bb, float:1.9407627E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            X.C17880vN.A1T(r0, r4, r3)
            java.lang.String r0 = r13.getString(r1, r0)
        L_0x005a:
            r5.setText(r0)
        L_0x005d:
            r0 = 2131434830(0x7f0b1d4e, float:1.8491485E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r13, r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r13.A03 = r0
            r0 = 2131432440(0x7f0b13f8, float:1.8486638E38)
            X.1bI r0 = X.AnonymousClass3Ma.A0x(r13, r0)
            r13.A0J = r0
            android.widget.LinearLayout r0 = r13.A03
            java.lang.String r9 = "screenshotsGroup"
            if (r0 == 0) goto L_0x03a3
            r0.removeAllViews()
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131167706(0x7f0709da, float:1.7949693E38)
            int r8 = r1.getDimensionPixelSize(r0)
        L_0x0085:
            X.3RY r7 = new X.3RY
            r7.<init>(r13)
            boolean r0 = r7.A09
            if (r0 != 0) goto L_0x00a5
            r0 = 1
            r7.A09 = r0
            java.lang.Object r0 = r7.generatedComponent()
            X.10E r1 = X.AnonymousClass3MW.A0O(r0)
            X.0ve r0 = X.AnonymousClass10E.A8r(r1)
            r7.A01 = r0
            X.18K r0 = X.AnonymousClass3Ma.A0g(r1)
            r7.A02 = r0
        L_0x00a5:
            android.content.Context r1 = r7.getContext()
            r0 = 2131625796(0x7f0e0744, float:1.887881E38)
            android.view.View r1 = android.view.View.inflate(r1, r0, r7)
            r0 = 2131434827(0x7f0b1d4b, float:1.8491479E38)
            android.view.View r0 = X.AnonymousClass3MX.A0C(r1, r0)
            com.whatsapp.inappsupport.ui.AddScreenshotImageView r0 = (com.whatsapp.inappsupport.ui.AddScreenshotImageView) r0
            r7.setAddScreenshotImageView(r0)
            r0 = 2131434485(0x7f0b1bf5, float:1.8490785E38)
            android.view.View r0 = X.AnonymousClass3MX.A0C(r1, r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r7.setRemoveButton(r0)
            r0 = 2131432441(0x7f0b13f9, float:1.848664E38)
            X.1bI r0 = X.C72453Mb.A0s(r1, r0)
            r7.A06 = r0
            r0 = 2131432444(0x7f0b13fc, float:1.8486646E38)
            X.1bI r0 = X.C72453Mb.A0s(r1, r0)
            r7.A07 = r0
            r0 = 0
            r7.setRemoveButtonVisibility(r0)
            android.widget.FrameLayout r1 = r7.getRemoveButton()
            r0 = 45
            X.C90044dR.A00(r1, r7, r0)
            X.1bI r5 = r7.A07
            if (r5 != 0) goto L_0x00f1
            java.lang.String r0 = "mediaUploadRetryViewStubHolder"
            X.C18070vi.A11(r0)
            throw r2
        L_0x00f1:
            r1 = 46
            X.4dR r0 = new X.4dR
            r0.<init>((java.lang.Object) r7, (int) r1)
            r5.A05(r0)
            android.widget.LinearLayout$LayoutParams r1 = X.AnonymousClass3Ma.A0D()
            r0 = r8
            if (r3 != 0) goto L_0x0103
            r0 = 0
        L_0x0103:
            r1.leftMargin = r0
            r1.rightMargin = r8
            r1.topMargin = r8
            r1.bottomMargin = r8
            android.widget.LinearLayout r0 = r13.A03
            if (r0 == 0) goto L_0x03a3
            r0.addView(r7, r1)
            r0 = 20
            X.C90104dX.A00(r7, r13, r3, r0)
            X.4ny r0 = new X.4ny
            r0.<init>(r13, r3)
            r7.A03 = r0
            int r3 = r3 + 1
            if (r3 < r4) goto L_0x0085
            r0 = 2131435882(0x7f0b216a, float:1.8493619E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r13, r0)
            com.whatsapp.TextEmojiLabel r0 = (com.whatsapp.TextEmojiLabel) r0
            r13.A08 = r0
            X.4rF r4 = X.C98494rF.A00()
            java.lang.String r3 = "information-collection-when-report-bug"
            r4.element = r3
            X.0ve r1 = r13.A0E
            r0 = 10127(0x278f, float:1.4191E-41)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            java.lang.String r5 = "submitBugInfoTextView"
            if (r0 == 0) goto L_0x01b0
            com.whatsapp.TextEmojiLabel r1 = r13.A08
            if (r1 == 0) goto L_0x039f
            r0 = 2131896604(0x7f12291c, float:1.9428074E38)
            X.AnonymousClass3MY.A0x(r13, r1, r0)
        L_0x014b:
            r4.element = r3
        L_0x014d:
            X.1np r7 = r13.A0I
            if (r7 == 0) goto L_0x039b
            com.whatsapp.TextEmojiLabel r0 = r13.A08
            if (r0 == 0) goto L_0x039f
            android.content.Context r8 = r0.getContext()
            com.whatsapp.TextEmojiLabel r0 = r13.A08
            if (r0 == 0) goto L_0x039f
            java.lang.String r10 = X.AnonymousClass3Ma.A13(r0)
            com.whatsapp.TextEmojiLabel r0 = r13.A08
            if (r0 == 0) goto L_0x039f
            android.content.Context r3 = r0.getContext()
            r1 = 2130971981(0x7f040d4d, float:1.7552716E38)
            r0 = 2131101274(0x7f06065a, float:1.7814953E38)
            int r12 = X.AnonymousClass1YL.A00(r3, r1, r0)
            r0 = 18
            X.7Pj r9 = new X.7Pj
            r9.<init>(r13, r4, r0)
            java.lang.String r11 = "learn-more"
            android.text.SpannableStringBuilder r3 = r7.A06(r8, r9, r10, r11, r12)
            com.whatsapp.TextEmojiLabel r1 = r13.A08
            if (r1 == 0) goto L_0x039f
            X.0ve r0 = r13.A0E
            X.AnonymousClass3Ma.A1L(r0, r1)
            com.whatsapp.TextEmojiLabel r0 = r13.A08
            if (r0 == 0) goto L_0x039f
            r0.setText(r3)
            r0 = 2131429922(0x7f0b0a22, float:1.848153E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r13, r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            r13.A09 = r0
            r0 = 2131429923(0x7f0b0a23, float:1.8481532E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r13, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r13.A0C = r0
            com.whatsapp.WaEditText r1 = r13.A09
            if (r1 != 0) goto L_0x01e0
            java.lang.String r0 = "describeBugField"
            X.C18070vi.A11(r0)
            throw r2
        L_0x01b0:
            X.0ve r1 = r13.A0E
            r0 = 2090(0x82a, float:2.929E-42)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            if (r0 == 0) goto L_0x014d
            com.whatsapp.TextEmojiLabel r1 = r13.A08
            if (r1 == 0) goto L_0x039f
            r0 = 2131896603(0x7f12291b, float:1.9428072E38)
            X.AnonymousClass3MY.A0x(r13, r1, r0)
            java.lang.String r3 = "information-collection-when-contact-support"
            goto L_0x014b
        L_0x01c7:
            X.0ve r1 = r13.A0E
            r0 = 2090(0x82a, float:2.929E-42)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            if (r0 == 0) goto L_0x005d
            r0 = 2131889365(0x7f120cd5, float:1.9413392E38)
            X.AnonymousClass3MY.A0x(r13, r7, r0)
            r0 = 2131886505(0x7f1201a9, float:1.940759E38)
            java.lang.String r0 = r13.getString(r0)
            goto L_0x005a
        L_0x01e0:
            r0 = 12
            X.AnonymousClass48E.A00(r1, r13, r0)
            r0 = 2131435881(0x7f0b2169, float:1.8493617E38)
            android.view.View r3 = X.AnonymousClass3MY.A0C(r13, r0)
            com.whatsapp.wds.components.button.WDSButton r3 = (com.whatsapp.wds.components.button.WDSButton) r3
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            r13.A0K = r3
            com.whatsapp.WaEditText r0 = r13.A09
            if (r0 != 0) goto L_0x01fe
            java.lang.String r0 = "describeBugField"
            X.C18070vi.A11(r0)
            throw r2
        L_0x01fe:
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0215
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0215
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r0 = X.AnonymousClass3MZ.A0v(r13)
            boolean r1 = r0.A0V()
            r0 = 1
            if (r1 == 0) goto L_0x0216
        L_0x0215:
            r0 = 0
        L_0x0216:
            r3.setEnabled(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r13.A0K
            if (r1 == 0) goto L_0x0395
            r0 = 44
            X.C90044dR.A00(r1, r13, r0)
            X.0vl r7 = r13.A0R
            java.lang.Object r0 = r7.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r0 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r0
            X.1DT r1 = r0.A06
            X.5So r0 = new X.5So
            r0.<init>(r13)
            r3 = 35
            X.C91644g1.A00(r13, r1, r0, r3)
            java.lang.Object r0 = r7.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r0 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r0
            X.1DT r1 = r0.A07
            X.5Sp r0 = new X.5Sp
            r0.<init>(r13)
            X.C91644g1.A00(r13, r1, r0, r3)
            java.lang.Object r0 = r7.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r0 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r0
            X.1DT r1 = r0.A02
            X.5Sq r0 = new X.5Sq
            r0.<init>(r13)
            X.C91644g1.A00(r13, r1, r0, r3)
            java.lang.Object r0 = r7.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r0 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r0
            X.1DT r1 = r0.A00
            X.5Sr r0 = new X.5Sr
            r0.<init>(r13)
            X.C91644g1.A00(r13, r1, r0, r3)
            java.lang.Object r0 = r7.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r0 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r0
            X.1DT r1 = r0.A01
            X.5Ss r0 = new X.5Ss
            r0.<init>(r13)
            X.C91644g1.A00(r13, r1, r0, r3)
            java.lang.Object r0 = r7.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r0 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r0
            X.1DS r1 = r0.A05
            X.5St r0 = new X.5St
            r0.<init>(r13)
            X.C91644g1.A00(r13, r1, r0, r3)
            java.lang.Object r0 = r7.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r0 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r0
            X.1wy r1 = r0.A08
            X.5Su r0 = new X.5Su
            r0.<init>(r13)
            X.C91644g1.A00(r13, r1, r0, r3)
            r0 = 2131436227(0x7f0b22c3, float:1.8494318E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r13, r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            r13.A0A = r0
            r0 = 2131428931(0x7f0b0643, float:1.847952E38)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r13, r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0 = 43
            X.C90044dR.A00(r1, r13, r0)
            r13.A0B = r1
            r0 = 2131428936(0x7f0b0648, float:1.847953E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r13, r0)
            r13.A01 = r0
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "extra_screenshot_uri"
            java.lang.String r4 = r1.getStringExtra(r0)
            if (r4 == 0) goto L_0x02ef
            android.net.Uri r0 = android.net.Uri.parse(r4)
            r3 = 0
            r13.A0Q(r0, r3)
            X.11S r0 = r13.A02
            r0.A0I()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x02ef
            X.1CM r0 = r13.A07
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x02ef
            java.lang.Object r1 = r7.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r1 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r1
            android.net.Uri r0 = android.net.Uri.parse(r4)
            X.C18070vi.A0X(r0)
            r1.A0T(r0, r3)
        L_0x02ef:
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "extra_is_calling_bug"
            boolean r0 = X.AnonymousClass3MY.A1a(r1, r0)
            if (r0 == 0) goto L_0x033f
            java.lang.Object r4 = r7.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r4 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r4
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "extra_call_log_key"
            android.os.Parcelable r3 = r1.getParcelableExtra(r0)
            X.4cT r3 = (X.C89444cT) r3
            X.00H r0 = r4.A0A
            java.lang.Object r0 = r0.get()
            X.4RM r0 = (X.AnonymousClass4RM) r0
            X.00H r0 = r0.A02
            java.lang.Object r1 = r0.get()
            X.4On r1 = (X.C85734On) r1
            if (r3 == 0) goto L_0x032b
            r1.A01 = r3
        L_0x0321:
            com.whatsapp.WaTextView r3 = r13.A0B
            if (r3 != 0) goto L_0x0334
            java.lang.String r0 = "categoryTextView"
            X.C18070vi.A11(r0)
            throw r2
        L_0x032b:
            X.1HQ r0 = r1.A02
            com.whatsapp.voipcalling.CallInfo r0 = r0.BO3()
            r1.A00 = r0
            goto L_0x0321
        L_0x0334:
            X.41V r1 = X.AnonymousClass41V.A00
            java.lang.String r0 = r1.A02
            r3.setText(r0)
            java.lang.String r0 = r1.A00
            r13.A0O = r0
        L_0x033f:
            X.0ve r1 = r13.A0E
            r0 = 2090(0x82a, float:2.929E-42)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            java.lang.String r5 = "categoryUnderline"
            java.lang.String r4 = "categoryTextView"
            java.lang.String r3 = "titleEditText"
            if (r0 == 0) goto L_0x035f
            com.whatsapp.WaEditText r0 = r13.A0A
            if (r0 == 0) goto L_0x037b
            r1 = 0
        L_0x0354:
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r0 = r13.A0B
            if (r0 != 0) goto L_0x0370
            X.C18070vi.A11(r4)
            throw r2
        L_0x035f:
            X.0ve r1 = r13.A0E
            r0 = 10127(0x278f, float:1.4191E-41)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            if (r0 == 0) goto L_0x0382
            com.whatsapp.WaEditText r0 = r13.A0A
            if (r0 == 0) goto L_0x037b
            r1 = 8
            goto L_0x0354
        L_0x0370:
            r0.setVisibility(r1)
            android.view.View r0 = r13.A01
            if (r0 != 0) goto L_0x037f
            X.C18070vi.A11(r5)
            throw r2
        L_0x037b:
            X.C18070vi.A11(r3)
            throw r2
        L_0x037f:
            r0.setVisibility(r1)
        L_0x0382:
            java.lang.Object r2 = r7.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r2 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r2
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "extra_bug_reporting_endpoint"
            java.lang.String r0 = r1.getStringExtra(r0)
            r2.A03 = r0
            return
        L_0x0395:
            java.lang.String r0 = "submitButton"
            X.C18070vi.A11(r0)
            throw r2
        L_0x039b:
            X.AnonymousClass3MW.A1E()
            throw r2
        L_0x039f:
            X.C18070vi.A11(r5)
            throw r2
        L_0x03a3:
            X.C18070vi.A11(r9)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappbugreporting.InAppBugReportingActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public InAppBugReportingActivity(int i) {
        this.A0Q = false;
        C91014f0.A00(this, 23);
    }
}
