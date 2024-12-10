package X;

import android.content.DialogInterface;

/* renamed from: X.757  reason: invalid class name */
public class AnonymousClass757 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass757(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass757 A00(Object obj, int i) {
        return new AnonymousClass757(obj, i);
    }

    public static void A01(C73203Rj r1, Object obj, int i, int i2) {
        r1.A0Z(new AnonymousClass757(obj, i), i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0315, code lost:
        r7.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0318, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03cc, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03d0, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0070, code lost:
        r2.setResult(r1 ? 1 : 0);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008e, code lost:
        r1.A29();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0091, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r2.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01e5, code lost:
        r4.A2F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01e8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01f1, code lost:
        X.AnonymousClass4Yv.A00(r1, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01f5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0239, code lost:
        if (r0 != null) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x023b, code lost:
        r0 = "contactFormSaveContactController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x024c, code lost:
        r0.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x024f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02ce, code lost:
        r3.CGF(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02d1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r7, int r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x03a5;
                case 1: goto L_0x038e;
                case 2: goto L_0x037f;
                case 3: goto L_0x0345;
                case 4: goto L_0x033d;
                case 5: goto L_0x0319;
                case 6: goto L_0x0005;
                case 7: goto L_0x02ec;
                case 8: goto L_0x0084;
                case 9: goto L_0x02da;
                case 10: goto L_0x02d2;
                case 11: goto L_0x0294;
                case 12: goto L_0x0074;
                case 13: goto L_0x0250;
                case 14: goto L_0x0065;
                case 15: goto L_0x022c;
                case 16: goto L_0x0065;
                case 17: goto L_0x022c;
                case 18: goto L_0x021f;
                case 19: goto L_0x0212;
                case 20: goto L_0x0212;
                case 21: goto L_0x000d;
                case 22: goto L_0x0092;
                case 23: goto L_0x000d;
                case 24: goto L_0x0092;
                case 25: goto L_0x000d;
                case 26: goto L_0x0092;
                case 27: goto L_0x0057;
                case 28: goto L_0x023f;
                case 29: goto L_0x0207;
                case 30: goto L_0x01f6;
                case 31: goto L_0x0043;
                case 32: goto L_0x01e9;
                case 33: goto L_0x01aa;
                case 34: goto L_0x019d;
                case 35: goto L_0x016f;
                case 36: goto L_0x0163;
                case 37: goto L_0x015b;
                case 38: goto L_0x0153;
                case 39: goto L_0x0153;
                case 40: goto L_0x013c;
                case 41: goto L_0x0130;
                case 42: goto L_0x00dd;
                case 43: goto L_0x003b;
                case 44: goto L_0x0005;
                case 45: goto L_0x0005;
                case 46: goto L_0x0019;
                case 47: goto L_0x00c9;
                case 48: goto L_0x00b5;
                case 49: goto L_0x00a1;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r6.A01
            android.app.Activity r2 = (android.app.Activity) r2
        L_0x0009:
            r2.finish()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r1 = r6.A01
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            r0 = 1
            X.C18070vi.A0d(r7, r0)
            r7.dismiss()
            goto L_0x008e
        L_0x0019:
            java.lang.Object r3 = r6.A01
            X.7By r3 = (X.C143087By) r3
            android.app.Activity r0 = r3.A05
            r2 = 0
            X.AnonymousClass4Yv.A00(r0, r2)
            X.1BI r0 = r3.A0I
            if (r0 == 0) goto L_0x000c
            X.1KB r1 = r3.A0x
            r0 = 2131891797(0x7f121655, float:1.9418324E38)
            r1.A07(r2, r0)
            X.10I r2 = r3.A17
            r1 = 3
            X.7RA r0 = new X.7RA
            r0.<init>((X.C143087By) r3, (int) r1)
            r2.CGN(r0)
            return
        L_0x003b:
            java.lang.Object r2 = r6.A01
            android.app.Activity r2 = (android.app.Activity) r2
            r7.dismiss()
            goto L_0x0009
        L_0x0043:
            java.lang.Object r2 = r6.A01
            com.whatsapp.contact.picker.ContactPickerFragment r2 = (com.whatsapp.contact.picker.ContactPickerFragment) r2
            X.1FL r1 = r2.A1B()
            r0 = 1
            X.AnonymousClass4Yv.A00(r1, r0)
            X.02B r0 = r2.A0E
            if (r0 == 0) goto L_0x000c
            r0.A05()
            return
        L_0x0057:
            java.lang.Object r0 = r6.A01
            X.6n8 r0 = (X.C132606n8) r0
            boolean r1 = X.C72453Mb.A1Z(r7)
            r7.dismiss()
            android.app.Activity r2 = r0.A00
            goto L_0x0070
        L_0x0065:
            java.lang.Object r2 = r6.A01
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r1 = X.C72453Mb.A1Z(r7)
            r7.dismiss()
        L_0x0070:
            r2.setResult(r1)
            goto L_0x0009
        L_0x0074:
            java.lang.Object r2 = r6.A01
            com.whatsapp.companionmode.registration.RegisterAsCompanionActivity r2 = (com.whatsapp.companionmode.registration.RegisterAsCompanionActivity) r2
            X.1LU r0 = r2.A07
            if (r0 == 0) goto L_0x03c7
            android.content.Intent r0 = X.AnonymousClass1LU.A01(r2)
            r2.startActivity(r0)
            goto L_0x0009
        L_0x0084:
            java.lang.Object r1 = r6.A01
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = r1.A1b()
            if (r0 == 0) goto L_0x000c
        L_0x008e:
            r1.A29()
            return
        L_0x0092:
            java.lang.Object r1 = r6.A01
            com.whatsapp.contact.contactform.ContactFormBottomSheetFragment r1 = (com.whatsapp.contact.contactform.ContactFormBottomSheetFragment) r1
            r0 = 1
            X.C18070vi.A0d(r7, r0)
            r7.dismiss()
            X.70L r0 = r1.A0C
            goto L_0x0239
        L_0x00a1:
            java.lang.Object r3 = r6.A01
            X.75M r3 = (X.AnonymousClass75M) r3
            X.01E r2 = r3.A0P
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r1 = X.C108945cZ.A0G(r0)
            r0 = 0
            r2.startActivityForResult(r1, r0)
            X.01E r1 = r3.A0P
            goto L_0x01f1
        L_0x00b5:
            java.lang.Object r2 = r6.A01
            X.1FU r2 = (X.AnonymousClass1FU) r2
            X.0z4 r1 = r2.A0A
            r0 = 1
            r1.A24(r0)
            X.10I r3 = r2.A05
            r0 = 7
            X.7RA r1 = new X.7RA
            r1.<init>((java.lang.Object) r2, (int) r0)
            goto L_0x02ce
        L_0x00c9:
            java.lang.Object r3 = r6.A01
            X.7By r3 = (X.C143087By) r3
            android.app.Activity r2 = r3.A05
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r1 = X.C108945cZ.A0G(r0)
            r0 = 0
            r2.startActivityForResult(r1, r0)
            android.app.Activity r1 = r3.A05
            goto L_0x01f1
        L_0x00dd:
            java.lang.Object r3 = r6.A01
            com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet r3 = (com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet) r3
            boolean r2 = X.C72453Mb.A1Z(r7)
            X.0vl r5 = r3.A0Y
            java.lang.Object r4 = r5.getValue()
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r4 = (com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel) r4
            X.6Ky r1 = r4.A0H
            java.util.Map r0 = r1.A00
            r0.clear()
            java.util.Map r0 = r1.A01
            r0.clear()
            java.util.Map r0 = r4.A06
            r0.clear()
            java.util.List r0 = r4.A05
            r0.clear()
            X.5kU r1 = r3.A0L
            if (r1 == 0) goto L_0x010c
            X.0wS r0 = X.C18460wS.A00
            r1.A0W(r0)
        L_0x010c:
            java.lang.Object r0 = r5.getValue()
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = (com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel) r0
            r0.A0U(r2)
            com.whatsapp.WaEditText r1 = r3.A0A
            if (r1 == 0) goto L_0x011d
            r0 = 0
            r1.setText(r0)
        L_0x011d:
            com.whatsapp.WaTextView r0 = r3.A0H
            if (r0 == 0) goto L_0x0124
            r0.setVisibility(r2)
        L_0x0124:
            android.widget.FrameLayout r0 = r3.A03
            if (r0 == 0) goto L_0x012b
            r0.setVisibility(r2)
        L_0x012b:
            com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet.A05(r3)
            goto L_0x0315
        L_0x0130:
            java.lang.Object r1 = r6.A01
            android.content.Context r1 = (android.content.Context) r1
            android.content.Intent r0 = X.AnonymousClass1LU.A0A(r1)
            r1.startActivity(r0)
            return
        L_0x013c:
            java.lang.Object r2 = r6.A01
            com.whatsapp.deeplink.DeepLinkActivity r2 = (com.whatsapp.deeplink.DeepLinkActivity) r2
            X.1vD r0 = r2.A0G
            android.net.Uri r0 = r0.A03()
            android.content.Intent r1 = X.AnonymousClass3MY.A07(r0)
            X.1L9 r0 = r2.A01
            r0.A08(r2, r1)
            X.C108965cb.A0y(r2)
            return
        L_0x0153:
            java.lang.Object r0 = r6.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.C108965cb.A0y(r0)
            return
        L_0x015b:
            java.lang.Object r0 = r6.A01
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            r0.A2F()
            return
        L_0x0163:
            java.lang.Object r0 = r6.A01
            X.48m r0 = (X.AnonymousClass48m) r0
            java.lang.Object r0 = r0.A01
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            com.whatsapp.contact.picker.ContactPickerFragment.A0M(r0)
            return
        L_0x016f:
            java.lang.Object r4 = r6.A01
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            android.content.Intent r3 = X.C17880vN.A0A()
            X.1E7 r0 = r4.A1O
            java.lang.String r1 = X.C108985cd.A0l(r0)
            java.lang.String r0 = "contact"
            r3.putExtra(r0, r1)
            android.os.Bundle r0 = r4.A27()
            java.lang.String r2 = "message_row_id"
            long r0 = r0.getLong(r2)
            r3.putExtra(r2, r0)
            X.7Bn r0 = r4.A0r
            r0.A01(r3)
            X.1FL r1 = r4.A1B()
            r0 = 3
            X.AnonymousClass4Yv.A00(r1, r0)
            goto L_0x01e5
        L_0x019d:
            java.lang.Object r0 = r6.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r1 = r0.A1B()
            r0 = 3
            X.AnonymousClass4Yv.A00(r1, r0)
            return
        L_0x01aa:
            java.lang.Object r4 = r6.A01
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            android.content.Intent r3 = X.C17880vN.A0A()
            r2 = 1
            java.util.ArrayList r1 = X.C17880vN.A0z(r2)
            X.1E7 r0 = r4.A1O
            java.lang.String r0 = X.C108985cd.A0l(r0)
            r1.add(r0)
            java.lang.String r0 = "jids"
            r3.putStringArrayListExtra(r0, r1)
            android.os.Bundle r0 = r4.A27()
            java.lang.String r1 = "file_path"
            java.lang.String r0 = r0.getString(r1)
            r3.putExtra(r1, r0)
            X.7Bn r0 = r4.A0r
            r0.A01(r3)
            X.1FL r1 = r4.A1B()
            r0 = 2
            X.AnonymousClass4Yv.A00(r1, r0)
            X.6lb r1 = r4.A1r
            r0 = 0
            r1.A00(r0, r2)
        L_0x01e5:
            r4.A2F()
            return
        L_0x01e9:
            java.lang.Object r0 = r6.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r1 = r0.A1B()
        L_0x01f1:
            r0 = 2
            X.AnonymousClass4Yv.A00(r1, r0)
            return
        L_0x01f6:
            java.lang.Object r2 = r6.A01
            com.whatsapp.contact.picker.ContactPickerFragment r2 = (com.whatsapp.contact.picker.ContactPickerFragment) r2
            X.1FL r1 = r2.A1B()
            r0 = 1
            X.AnonymousClass4Yv.A00(r1, r0)
            r0 = 0
            com.whatsapp.contact.picker.ContactPickerFragment.A0h(r2, r0)
            return
        L_0x0207:
            java.lang.Object r1 = r6.A01
            X.6oP r1 = (X.C133246oP) r1
            android.accounts.Account[] r0 = r1.A02
            r0 = r0[r8]
            r1.A00 = r0
            return
        L_0x0212:
            java.lang.Object r0 = r6.A01
            com.whatsapp.contact.contactform.ContactFormBottomSheetFragment r0 = (com.whatsapp.contact.contactform.ContactFormBottomSheetFragment) r0
            r1 = 0
            X.70L r0 = r0.A0C
            if (r0 == 0) goto L_0x023b
            r0.A07(r1)
            return
        L_0x021f:
            java.lang.Object r1 = r6.A01
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            r0 = 1
            X.C18070vi.A0d(r7, r0)
            r1.setChecked(r0)
            goto L_0x0315
        L_0x022c:
            java.lang.Object r1 = r6.A01
            com.whatsapp.contact.contactform.ContactFormActivity r1 = (com.whatsapp.contact.contactform.ContactFormActivity) r1
            r0 = 1
            X.C18070vi.A0d(r7, r0)
            r7.dismiss()
            X.70L r0 = r1.A0B
        L_0x0239:
            if (r0 != 0) goto L_0x024c
        L_0x023b:
            java.lang.String r0 = "contactFormSaveContactController"
            goto L_0x03cc
        L_0x023f:
            java.lang.Object r1 = r6.A01
            X.6n8 r1 = (X.C132606n8) r1
            r0 = 1
            X.C18070vi.A0d(r7, r0)
            r7.dismiss()
            X.70L r0 = r1.A01
        L_0x024c:
            r0.A02()
            return
        L_0x0250:
            java.lang.Object r3 = r6.A01
            com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity r3 = (com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity) r3
            r0 = 1
            X.C18070vi.A0d(r7, r0)
            r1 = 0
            r3.A08 = r1
            X.A15 r0 = r3.A05
            if (r0 == 0) goto L_0x028e
            java.util.concurrent.atomic.AtomicReference r1 = r0.A01
            java.lang.String r0 = X.C17890vO.A0Q()
            r1.set(r0)
            android.widget.ProgressBar r1 = r3.A01
            if (r1 != 0) goto L_0x0270
            java.lang.String r0 = "loadingSpinner"
            goto L_0x03cc
        L_0x0270:
            r0 = 0
            r1.setVisibility(r0)
            android.widget.LinearLayout r1 = r3.A00
            if (r1 != 0) goto L_0x027c
            java.lang.String r0 = "codeInputBoxesLinearLayout"
            goto L_0x03cc
        L_0x027c:
            r0 = 4
            r1.setVisibility(r0)
            X.10I r2 = r3.A05
            r1 = 20
            X.7Pc r0 = new X.7Pc
            r0.<init>(r3, r1)
            r2.CGF(r0)
            goto L_0x0315
        L_0x028e:
            java.lang.String r0 = "companionPreRegLogger"
            X.C18070vi.A11(r0)
            throw r1
        L_0x0294:
            java.lang.Object r4 = r6.A01
            com.whatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment r4 = (com.whatsapp.calling.spam.CallSpamActivity.ReportSpamOrBlockDialogFragment) r4
            X.11E r0 = r4.A03
            boolean r0 = r0.A09()
            r2 = 0
            if (r0 != 0) goto L_0x02bc
            java.lang.String r0 = "callspamactivity/spam/report/no-network-cannot-block-report"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1FL r0 = r4.A1D()
            boolean r0 = X.AnonymousClass11E.A02(r0)
            r1 = 2131892938(0x7f121aca, float:1.9420638E38)
            if (r0 == 0) goto L_0x02b6
            r1 = 2131892939(0x7f121acb, float:1.942064E38)
        L_0x02b6:
            X.1KB r0 = r4.A02
            r0.A08(r1, r2)
            return
        L_0x02bc:
            X.1KB r1 = r4.A02
            r0 = 0
            r1.A0D(r0)
            X.1FL r2 = r4.A1D()
            X.10I r3 = r4.A0D
            r0 = 5
            X.7RL r1 = new X.7RL
            r1.<init>(r4, r2, r0)
        L_0x02ce:
            r3.CGF(r1)
            return
        L_0x02d2:
            java.lang.Object r0 = r6.A01
            com.whatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment r0 = (com.whatsapp.calling.spam.CallSpamActivity.ReportSpamOrBlockDialogFragment) r0
            com.whatsapp.calling.spam.CallSpamActivity.ReportSpamOrBlockDialogFragment.A00(r0)
            return
        L_0x02da:
            java.lang.Object r0 = r6.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r1 = "switch_to_video_result"
            X.1GP r0 = r0.A1F()
            r0.A0w(r1, r2)
            return
        L_0x02ec:
            java.lang.Object r0 = r6.A01
            com.whatsapp.bot.metaai.imagineme.settings.ImagineMeSettingsActivity r0 = (com.whatsapp.bot.metaai.imagineme.settings.ImagineMeSettingsActivity) r0
            r4 = 1
            X.C18070vi.A0d(r7, r4)
            X.0vl r0 = r0.A07
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.bot.metaai.imagineme.settings.ImagineMeSettingsViewModel r3 = (com.whatsapp.bot.metaai.imagineme.settings.ImagineMeSettingsViewModel) r3
            X.2JU r1 = r3.A0B
            r2 = 0
            r0 = 23
            X.AnonymousClass3MY.A1P(r2, r1, r0, r4)
            X.1wy r0 = r3.A0D
            X.AnonymousClass3MY.A1L(r0, r4)
            X.1OX r1 = X.C41561wd.A00(r3)
            com.whatsapp.bot.metaai.imagineme.settings.ImagineMeSettingsViewModel$onDeleteConfirmationClicked$1 r0 = new com.whatsapp.bot.metaai.imagineme.settings.ImagineMeSettingsViewModel$onDeleteConfirmationClicked$1
            r0.<init>(r3, r2)
            X.AnonymousClass3MX.A1Q(r0, r1)
        L_0x0315:
            r7.dismiss()
            return
        L_0x0319:
            java.lang.Object r1 = r6.A01
            com.whatsapp.blockui.BlockConfirmationDialogFragment r1 = (com.whatsapp.blockui.BlockConfirmationDialogFragment) r1
            X.00H r0 = r1.A09
            if (r0 == 0) goto L_0x03ca
            java.lang.Object r3 = r0.get()
            X.2ps r3 = (X.C61552ps) r3
            X.0vl r0 = r1.A0B
            java.lang.String r2 = X.AnonymousClass3MW.A0y(r0)
            X.0vl r0 = r1.A0C
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.C18070vi.A0h(r2, r1)
            r0 = 2
            X.C61552ps.A00(r3, r1, r2, r0)
            return
        L_0x033d:
            java.lang.Object r0 = r6.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A29()
            return
        L_0x0345:
            java.lang.Object r5 = r6.A01
            com.whatsapp.audiopicker.AudioPickerActivity r5 = (com.whatsapp.audiopicker.AudioPickerActivity) r5
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.LinkedHashMap r0 = r5.A0K
            java.util.Iterator r3 = X.C17890vO.A0j(r0)
        L_0x0353:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x036c
            java.lang.Object r0 = r3.next()
            X.6jn r0 = (X.C130656jn) r0
            android.net.Uri r2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            int r0 = r0.A00
            long r0 = (long) r0
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r2, r0)
            r4.add(r0)
            goto L_0x0353
        L_0x036c:
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r0 = "result_uris"
            r1.putParcelableArrayListExtra(r0, r4)
            X.C72453Mb.A16(r5, r1)
            X.4Yq r1 = r5.A09
            r0 = 7
            r1.A03(r0)
            return
        L_0x037f:
            java.lang.Object r1 = r6.A01
            com.whatsapp.status.playback.fragment.OpenLinkDialogFragment r1 = (com.whatsapp.status.playback.fragment.OpenLinkDialogFragment) r1
            X.89L r0 = r1.A04
            if (r0 == 0) goto L_0x038a
            r0.BrX()
        L_0x038a:
            r1.A28()
            return
        L_0x038e:
            java.lang.Object r1 = r6.A01
            com.whatsapp.Main r1 = (com.whatsapp.Main) r1
            X.00H r0 = r1.A0I
            java.lang.Object r0 = r0.get()
            X.1vD r0 = (X.C40751vD) r0
            r0.A04()
            r0 = 0
            X.AnonymousClass4Yv.A00(r1, r0)
            com.whatsapp.Main.A0V(r1)
            return
        L_0x03a5:
            java.lang.Object r3 = r6.A01
            com.whatsapp.Main r3 = (com.whatsapp.Main) r3
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r2 = X.C108945cZ.A0G(r0)
            android.net.Uri r1 = r3.A00
            java.lang.String r0 = "application/vnd.android.package-archive"
            android.content.Intent r1 = r2.setDataAndType(r1, r0)
            r0 = 1
            android.content.Intent r0 = r1.setFlags(r0)
            r3.startActivity(r0)
            r0 = 0
            X.AnonymousClass4Yv.A00(r3, r0)
            r3.finish()
            return
        L_0x03c7:
            java.lang.String r0 = "waIntents"
            goto L_0x03cc
        L_0x03ca:
            java.lang.String r0 = "blockFunnelLogger"
        L_0x03cc:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass757.onClick(android.content.DialogInterface, int):void");
    }
}
