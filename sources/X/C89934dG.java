package X;

import android.view.View;

/* renamed from: X.4dG  reason: invalid class name and case insensitive filesystem */
public class C89934dG implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C89934dG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C89934dG(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02dd, code lost:
        r14.postDelayed(new X.C98564rM(r3, r0), 300);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x033d, code lost:
        r0 = "waSharedPreferences";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0373, code lost:
        r0 = "activityUtils";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0377, code lost:
        r0 = "faqLinkFactory";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04fa, code lost:
        r0 = "waIntents";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0081, code lost:
        X.C20098A7b.A03(r1, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05e9, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05ed, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
        r0.toggle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0563;
                case 1: goto L_0x01a1;
                case 2: goto L_0x0530;
                case 3: goto L_0x051d;
                case 4: goto L_0x0506;
                case 5: goto L_0x00e5;
                case 6: goto L_0x04fe;
                case 7: goto L_0x04cf;
                case 8: goto L_0x04b7;
                case 9: goto L_0x04a0;
                case 10: goto L_0x0498;
                case 11: goto L_0x0469;
                case 12: goto L_0x0461;
                case 13: goto L_0x0420;
                case 14: goto L_0x0405;
                case 15: goto L_0x03f7;
                case 16: goto L_0x00bf;
                case 17: goto L_0x03e6;
                case 18: goto L_0x03b8;
                case 19: goto L_0x00a6;
                case 20: goto L_0x0091;
                case 21: goto L_0x03b0;
                case 22: goto L_0x0393;
                case 23: goto L_0x038b;
                case 24: goto L_0x038b;
                case 25: goto L_0x0383;
                case 26: goto L_0x037b;
                case 27: goto L_0x037b;
                case 28: goto L_0x0341;
                case 29: goto L_0x0327;
                case 30: goto L_0x0327;
                case 31: goto L_0x02e8;
                case 32: goto L_0x02c3;
                case 33: goto L_0x02a8;
                case 34: goto L_0x0296;
                case 35: goto L_0x0296;
                case 36: goto L_0x0085;
                case 37: goto L_0x0005;
                case 38: goto L_0x006c;
                case 39: goto L_0x0005;
                case 40: goto L_0x0011;
                case 41: goto L_0x0005;
                case 42: goto L_0x005a;
                case 43: goto L_0x0265;
                case 44: goto L_0x0005;
                case 45: goto L_0x0213;
                case 46: goto L_0x003a;
                case 47: goto L_0x01f8;
                case 48: goto L_0x01cd;
                case 49: goto L_0x01c7;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r13.A01
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.show()
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r2 = r13.A01
            com.whatsapp.events.EventCreateOrEditFragment r2 = (com.whatsapp.events.EventCreateOrEditFragment) r2
            X.1GP r3 = r2.A1E()
            X.3VY r0 = r2.A0M
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "eventCreateOrEditViewModel"
            goto L_0x05e9
        L_0x0021:
            X.1G1 r0 = r0.A0M
            X.4Zf r0 = X.AnonymousClass3MX.A0f(r0)
            X.4CW r1 = r0.A01
            X.0vl r0 = r2.A0u
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass000.A1W(r0)
            com.whatsapp.events.EventCallTypeDialog r1 = X.C83654Gd.A00(r1, r0)
            java.lang.String r0 = "CALL_TYPE_SELECTION"
            goto L_0x0081
        L_0x003a:
            java.lang.Object r2 = r13.A01
            com.whatsapp.events.EventCreateOrEditFragment r2 = (com.whatsapp.events.EventCreateOrEditFragment) r2
            X.3VY r0 = r2.A0M
            r1 = 0
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = "eventCreateOrEditViewModel"
            X.C18070vi.A11(r0)
            throw r1
        L_0x0049:
            r0.A0U(r1)
            com.whatsapp.WaEditText r0 = r2.A09
            if (r0 == 0) goto L_0x0010
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0010
            r0.clear()
            return
        L_0x005a:
            java.lang.Object r2 = r13.A01
            com.whatsapp.events.EventCreateOrEditFragment r2 = (com.whatsapp.events.EventCreateOrEditFragment) r2
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = r2.A0c
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isEnabled()
            r0 = 1
            if (r1 != r0) goto L_0x0010
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = r2.A0c
            goto L_0x008b
        L_0x006c:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r0 = r0.A1B()
            if (r0 == 0) goto L_0x0010
            X.1GP r3 = r0.getSupportFragmentManager()
            com.whatsapp.events.EventRemindersDialogFragment r1 = new com.whatsapp.events.EventRemindersDialogFragment
            r1.<init>()
            java.lang.String r0 = "Event_Reminders"
        L_0x0081:
            X.C20098A7b.A03(r1, r3, r0)
            return
        L_0x0085:
            java.lang.Object r0 = r13.A01
            com.whatsapp.events.EventCreateOrEditFragment r0 = (com.whatsapp.events.EventCreateOrEditFragment) r0
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = r0.A0d
        L_0x008b:
            if (r0 == 0) goto L_0x0010
            r0.toggle()
            return
        L_0x0091:
            java.lang.Object r0 = r13.A01
            com.whatsapp.emojiedittext.customstickerpack.CustomStickerPackRenameDialog r0 = (com.whatsapp.emojiedittext.customstickerpack.CustomStickerPackRenameDialog) r0
            r0.A28()
            X.5aO r1 = r0.A00
            if (r1 == 0) goto L_0x0010
            com.whatsapp.WaEditText r0 = r0.A06
            java.lang.String r0 = X.AnonymousClass3MZ.A17(r0)
            r1.Boq(r0)
            return
        L_0x00a6:
            java.lang.Object r1 = r13.A01
            com.whatsapp.emojiedittext.EmojiEditTextBottomSheetDialogFragment r1 = (com.whatsapp.emojiedittext.EmojiEditTextBottomSheetDialogFragment) r1
            X.2E7 r0 = r1.A0E
            boolean r0 = r0.A0U()
            if (r0 == 0) goto L_0x0010
            X.2E7 r2 = r1.A0E
            r0 = 27
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            r2.A0O(r1, r0)
            return
        L_0x00bf:
            java.lang.Object r6 = r13.A01
            com.whatsapp.emojiedittext.EmojiEditTextBottomSheetDialogFragment r6 = (com.whatsapp.emojiedittext.EmojiEditTextBottomSheetDialogFragment) r6
            com.whatsapp.WaEditText r0 = r6.A06
            java.lang.String r5 = X.AnonymousClass3Ma.A12(r0)
            java.lang.String[] r4 = r6.A0L
            r3 = 0
            if (r4 == 0) goto L_0x05b8
            int r2 = r4.length
            r1 = 0
        L_0x00d0:
            if (r1 >= r2) goto L_0x05b8
            r0 = r4[r1]
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x00e2
            X.5bP r0 = r6.A0D
            if (r0 == 0) goto L_0x0010
            r0.Bmf(r5)
            return
        L_0x00e2:
            int r1 = r1 + 1
            goto L_0x00d0
        L_0x00e5:
            java.lang.Object r4 = r13.A01
            com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportActivity r4 = (com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportActivity) r4
            X.11C r0 = r4.A08
            android.view.inputmethod.InputMethodManager r2 = r0.A0N()
            if (r2 == 0) goto L_0x00ff
            android.view.View r0 = r4.getCurrentFocus()
            if (r0 == 0) goto L_0x00ff
            android.os.IBinder r1 = r0.getWindowToken()
            r0 = 0
            r2.hideSoftInputFromWindow(r1, r0)
        L_0x00ff:
            X.0vl r3 = r4.A08
            int r1 = X.C72453Mb.A0I(r3)
            r0 = 1
            if (r1 != r0) goto L_0x011b
            r0 = 2131889541(0x7f120d85, float:1.9413748E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r6 = 0
            java.lang.String r11 = "We currently don't support crash report submission, if you believe this is a legit crash, you can rage shake on this screen to report it."
            r8 = r6
            r9 = r6
            r10 = r6
            r12 = r6
            r7 = r6
            r4.CMx(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x011b:
            boolean r0 = X.AnonymousClass3MW.A1Y(r4)
            if (r0 != 0) goto L_0x0139
            r0 = 2131892932(0x7f121ac4, float:1.9420626E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r0 = 2131888732(0x7f120a5c, float:1.9412108E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r7 = 0
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r8 = r7
            r4.CMx(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0139:
            int r2 = X.C72453Mb.A0I(r3)
            r1 = 4
            X.0vl r0 = r4.A09
            java.lang.Object r5 = r0.getValue()
            com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel r5 = (com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel) r5
            com.whatsapp.WaEditText r0 = r4.A02
            if (r2 != r1) goto L_0x0195
            if (r0 == 0) goto L_0x05d9
            java.lang.String r2 = X.AnonymousClass3MZ.A17(r0)
            int r7 = X.C72453Mb.A0I(r3)
            android.net.Uri r3 = r4.A3T()
        L_0x0158:
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            java.lang.String r0 = "[^\\p{L}\\p{N}\\p{P}\\p{Z}]"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r0)
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r2)
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.lang.String r0 = ""
            java.lang.String r0 = r1.replaceAll(r0)
            X.C18070vi.A0X(r0)
            X.4Wq r0 = r5.A01
            X.4S3 r4 = X.C87704Wq.A00(r0, r7)
            if (r4 == 0) goto L_0x0010
            X.5bc r0 = r4.A00
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.BZo()
            if (r0 != 0) goto L_0x0010
            X.1OX r1 = X.C41561wd.A00(r5)
            X.0wl r0 = r5.A05
            r6 = 0
            com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel$submitReport$1 r2 = new com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel$submitReport$1
            r2.<init>(r3, r4, r5, r6, r7)
            X.AnonymousClass3MW.A1X(r0, r2, r1)
            return
        L_0x0195:
            if (r0 == 0) goto L_0x05d9
            java.lang.String r2 = X.AnonymousClass3MZ.A17(r0)
            int r7 = X.C72453Mb.A0I(r3)
            r3 = 0
            goto L_0x0158
        L_0x01a1:
            java.lang.Object r2 = r13.A01
            com.whatsapp.documentpicker.DocumentPickerActivity r2 = (com.whatsapp.documentpicker.DocumentPickerActivity) r2
            X.17x r0 = r2.A0F
            if (r0 == 0) goto L_0x05e4
            java.lang.Integer r1 = r0.A05()
            X.C18070vi.A0X(r1)
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x05df
            X.1NM r1 = r2.A0E
            if (r1 == 0) goto L_0x05dc
            X.4lx r0 = new X.4lx
            r0.<init>(r2)
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0010
            com.whatsapp.documentpicker.DocumentPickerActivity.A11(r2)
            return
        L_0x01c7:
            java.lang.Object r0 = r13.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x01cd:
            java.lang.Object r2 = r13.A01
            com.whatsapp.events.EventInfoBottomSheet r2 = (com.whatsapp.events.EventInfoBottomSheet) r2
            X.1GP r0 = r2.A1E()
            X.1GR r0 = r0.A0U
            java.util.List r0 = r0.A04()
            X.C18070vi.A0X(r0)
            java.lang.Object r1 = X.C29431cG.A0e(r0)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            boolean r0 = r1 instanceof com.whatsapp.events.EventCreateOrEditFragment
            if (r0 == 0) goto L_0x01f4
            com.whatsapp.events.EventCreateOrEditFragment r1 = (com.whatsapp.events.EventCreateOrEditFragment) r1
            boolean r0 = r1.A26()
            if (r0 == 0) goto L_0x01f4
            com.whatsapp.events.EventInfoBottomSheet.A02(r2)
            return
        L_0x01f4:
            com.whatsapp.events.EventInfoBottomSheet.A01(r2)
            return
        L_0x01f8:
            java.lang.Object r2 = r13.A01
            com.whatsapp.events.EventCreationActivity r2 = (com.whatsapp.events.EventCreationActivity) r2
            X.00H r0 = r2.A00
            if (r0 == 0) goto L_0x020f
            java.lang.Object r1 = r0.get()
            X.4Yq r1 = (X.C88184Yq) r1
            r0 = 18
            r1.A02(r0)
            r2.finish()
            return
        L_0x020f:
            java.lang.String r0 = "conversationAttachmentEventLoggerLazy"
            goto L_0x05e9
        L_0x0213:
            java.lang.Object r5 = r13.A01
            com.whatsapp.events.EventCreateOrEditFragment r5 = (com.whatsapp.events.EventCreateOrEditFragment) r5
            android.view.View r0 = r5.A0B
            if (r0 == 0) goto L_0x0228
            android.view.View r1 = r0.findFocus()
            if (r1 == 0) goto L_0x0228
            X.1L4 r0 = r5.A0R
            if (r0 == 0) goto L_0x0261
            r0.A01(r1)
        L_0x0228:
            X.689 r1 = r5.A0O
            if (r1 == 0) goto L_0x025d
            android.content.Context r0 = r5.A1n()
            boolean r4 = r1.A06(r0)
            X.00H r0 = r5.A0h
            if (r0 == 0) goto L_0x04fa
            r0.get()
            android.content.Context r3 = r5.A14()
            android.content.Intent r2 = X.C17880vN.A0A()
            r1 = 2
            java.lang.String r0 = "mode"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r3.getPackageName()
            if (r4 == 0) goto L_0x025a
            java.lang.String r0 = "com.whatsapp.location.LocationPicker2"
        L_0x0251:
            r2.setClassName(r1, r0)
            X.02n r0 = r5.A0q
            r0.A03(r2)
            return
        L_0x025a:
            java.lang.String r0 = "com.whatsapp.location.LocationPicker"
            goto L_0x0251
        L_0x025d:
            java.lang.String r0 = "locationUtils"
            goto L_0x05e9
        L_0x0261:
            java.lang.String r0 = "imeUtils"
            goto L_0x05e9
        L_0x0265:
            java.lang.Object r2 = r13.A01
            com.whatsapp.events.EventCreateOrEditFragment r2 = (com.whatsapp.events.EventCreateOrEditFragment) r2
            X.1bI r0 = r2.A0W
            if (r0 == 0) goto L_0x027a
            int r1 = r0.A01()
            r0 = 8
            if (r1 != r0) goto L_0x027a
            r0 = 0
            com.whatsapp.events.EventCreateOrEditFragment.A09(r2, r0)
            return
        L_0x027a:
            X.1bI r0 = r2.A0a
            if (r0 == 0) goto L_0x0290
            android.view.View r1 = r0.A02()
            android.widget.TextSwitcher r1 = (android.widget.TextSwitcher) r1
            if (r1 == 0) goto L_0x0290
            r0 = 2131890042(0x7f120f7a, float:1.9414765E38)
            java.lang.String r0 = r2.A1H(r0)
            r1.setCurrentText(r0)
        L_0x0290:
            X.1bI r0 = r2.A0W
            X.C72453Mb.A1M(r0)
            return
        L_0x0296:
            java.lang.Object r3 = r13.A01
            com.whatsapp.events.EventCreateOrEditFragment r3 = (com.whatsapp.events.EventCreateOrEditFragment) r3
            X.1pm r2 = X.AnonymousClass2SS.A00(r3)
            r1 = 0
            com.whatsapp.events.EventCreateOrEditFragment$selectEventCoverImage$1 r0 = new com.whatsapp.events.EventCreateOrEditFragment$selectEventCoverImage$1
            r0.<init>(r3, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            return
        L_0x02a8:
            java.lang.Object r3 = r13.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.os.Bundle r2 = X.C17880vN.A0D()
            X.4CW r0 = X.AnonymousClass4CW.WA_VOICE_CALL
            java.lang.String r1 = "SELECTED_CALL_TYPE"
            java.lang.String r0 = r0.toString()
            r2.putString(r1, r0)
            java.lang.String r0 = "RESULT_KEY"
            X.AnonymousClass3MY.A16(r2, r3, r0)
            r0 = 46
            goto L_0x02dd
        L_0x02c3:
            java.lang.Object r3 = r13.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.os.Bundle r2 = X.C17880vN.A0D()
            X.4CW r0 = X.AnonymousClass4CW.WA_VIDEO_CALL
            java.lang.String r1 = "SELECTED_CALL_TYPE"
            java.lang.String r0 = r0.toString()
            r2.putString(r1, r0)
            java.lang.String r0 = "RESULT_KEY"
            X.AnonymousClass3MY.A16(r2, r3, r0)
            r0 = 45
        L_0x02dd:
            X.4rM r2 = new X.4rM
            r2.<init>(r3, r0)
            r0 = 300(0x12c, double:1.48E-321)
            r14.postDelayed(r2, r0)
            return
        L_0x02e8:
            java.lang.Object r4 = r13.A01
            com.whatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet r4 = (com.whatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet) r4
            r3 = 1
            X.C18070vi.A0d(r14, r3)
            X.129 r2 = r4.A04
            if (r2 == 0) goto L_0x0377
            java.lang.String r1 = "chats"
            java.lang.String r0 = "about-view-once"
            android.net.Uri r0 = r2.A05(r1, r0)
            X.C18070vi.A0X(r0)
            android.content.Intent r2 = X.AnonymousClass3MY.A07(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r0)
            X.1L9 r1 = r4.A00
            if (r1 == 0) goto L_0x0373
            android.content.Context r0 = r14.getContext()
            r1.A08(r0, r2)
            X.0z4 r0 = r4.A01
            if (r0 == 0) goto L_0x033d
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "view_once_nux_secondary"
            X.C17880vN.A1F(r1, r0, r3)
            r4.A29()
            com.whatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet.A00(r4, r3)
            return
        L_0x0327:
            java.lang.Object r3 = r13.A01
            com.whatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet r3 = (com.whatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet) r3
            X.0z4 r0 = r3.A01
            if (r0 == 0) goto L_0x033d
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r0)
            java.lang.String r1 = "view_once_nux_secondary"
            r0 = 1
            X.C17880vN.A1F(r2, r1, r0)
            r3.A29()
            return
        L_0x033d:
            java.lang.String r0 = "waSharedPreferences"
            goto L_0x05e9
        L_0x0341:
            java.lang.Object r4 = r13.A01
            com.whatsapp.ephemeral.ViewOnceNuxBottomSheet r4 = (com.whatsapp.ephemeral.ViewOnceNuxBottomSheet) r4
            r3 = 1
            X.C18070vi.A0d(r14, r3)
            X.129 r2 = r4.A06
            if (r2 == 0) goto L_0x0377
            java.lang.String r1 = "chats"
            java.lang.String r0 = "about-view-once"
            android.net.Uri r0 = r2.A05(r1, r0)
            X.C18070vi.A0X(r0)
            android.content.Intent r2 = X.AnonymousClass3MY.A07(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r0)
            X.1L9 r1 = r4.A01
            if (r1 == 0) goto L_0x0373
            android.content.Context r0 = r14.getContext()
            r1.A08(r0, r2)
            com.whatsapp.ephemeral.ViewOnceNuxBottomSheet.A00(r4)
            com.whatsapp.ephemeral.ViewOnceNuxBottomSheet.A01(r4, r3)
            return
        L_0x0373:
            java.lang.String r0 = "activityUtils"
            goto L_0x05e9
        L_0x0377:
            java.lang.String r0 = "faqLinkFactory"
            goto L_0x05e9
        L_0x037b:
            java.lang.Object r0 = r13.A01
            com.whatsapp.ephemeral.ViewOnceNuxBottomSheet r0 = (com.whatsapp.ephemeral.ViewOnceNuxBottomSheet) r0
            com.whatsapp.ephemeral.ViewOnceNuxBottomSheet.A00(r0)
            return
        L_0x0383:
            java.lang.Object r0 = r13.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            return
        L_0x038b:
            java.lang.Object r0 = r13.A01
            com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog r0 = (com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog) r0
            com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog.A01(r0)
            return
        L_0x0393:
            java.lang.Object r2 = r13.A01
            com.whatsapp.ephemeral.ChangeEphemeralSettingActivity r2 = (com.whatsapp.ephemeral.ChangeEphemeralSettingActivity) r2
            X.0vl r0 = r2.A0F
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3MW.A0h(r0)
            boolean r0 = X.C22971Dz.A0d(r0)
            r1 = 4
            if (r0 == 0) goto L_0x03a5
            r1 = 3
        L_0x03a5:
            android.content.Intent r0 = X.C17880vN.A0A()
            X.AnonymousClass1LU.A1q(r2, r0, r1)
            r2.startActivity(r0)
            return
        L_0x03b0:
            java.lang.Object r0 = r13.A01
            com.whatsapp.ephemeral.ChangeEphemeralSettingActivity r0 = (com.whatsapp.ephemeral.ChangeEphemeralSettingActivity) r0
            r0.onBackPressed()
            return
        L_0x03b8:
            java.lang.Object r4 = r13.A01
            com.whatsapp.emojiedittext.EmojiEditTextBottomSheetDialogFragment r4 = (com.whatsapp.emojiedittext.EmojiEditTextBottomSheetDialogFragment) r4
            X.2E7 r3 = r4.A0E
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r3.A0E
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r2 = 0
            if (r0 == 0) goto L_0x03cb
            r3.A0O(r2, r2)
            return
        L_0x03cb:
            r1 = 0
            X.1GP r0 = r4.A1E()
            r3.A0M(r0, r1)
            X.2E7 r1 = r4.A0E
            X.5ai r0 = r4.A0X
            r1.A0N(r0)
            X.2E7 r1 = r4.A0E
            r0 = 27
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0O(r0, r2)
            return
        L_0x03e6:
            java.lang.Object r2 = r13.A01
            com.whatsapp.emojiedittext.EmojiEditTextBottomSheetDialogFragment r2 = (com.whatsapp.emojiedittext.EmojiEditTextBottomSheetDialogFragment) r2
            X.5bP r1 = r2.A0D
            if (r1 == 0) goto L_0x03f3
            int r0 = r2.A00
            r1.Bnk(r0)
        L_0x03f3:
            r2.A28()
            return
        L_0x03f7:
            java.lang.Object r0 = r13.A01
            X.5nM r0 = (X.C113605nM) r0
            X.872 r2 = r0.A05
            X.737 r1 = r0.A01
            int r0 = r0.A00
            r2.BsY(r1, r0)
            return
        L_0x0405:
            java.lang.Object r2 = r13.A01
            X.3RO r2 = (X.AnonymousClass3RO) r2
            int[][] r1 = r2.A04
            java.lang.Object r0 = r14.getTag()
            int r0 = X.AnonymousClass000.A0M(r0)
            r1 = r1[r0]
            X.5Zl r0 = r2.A03
            if (r0 == 0) goto L_0x041c
            r0.C5m(r1)
        L_0x041c:
            r2.dismiss()
            return
        L_0x0420:
            java.lang.Object r3 = r13.A01
            X.3d3 r3 = (X.C74873d3) r3
            boolean r0 = r3.isShowing()
            if (r0 == 0) goto L_0x0430
            com.whatsapp.WaEditText r0 = r3.A0M
            r3.A08(r0)
            return
        L_0x0430:
            X.4UI r0 = r3.A0B
            if (r0 == 0) goto L_0x0440
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0440
            X.4UI r0 = r3.A0B
            r0.A02()
            return
        L_0x0440:
            java.lang.Runnable r0 = r3.A0E
            if (r0 == 0) goto L_0x0447
            r0.run()
        L_0x0447:
            X.4Wn r2 = r3.A0C
            if (r2 == 0) goto L_0x045d
            r0 = 5
            X.C87684Wn.A00(r2, r0)
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x045d
            X.3yQ r1 = new X.3yQ
            r1.<init>()
            X.18K r0 = r2.A00
            r0.CC7(r1)
        L_0x045d:
            r3.A0D()
            return
        L_0x0461:
            java.lang.Object r0 = r13.A01
            X.3cR r0 = (X.C74763cR) r0
            r0.A00()
            return
        L_0x0469:
            java.lang.Object r3 = r13.A01
            X.3cR r3 = (X.C74763cR) r3
            com.whatsapp.WaEditText r0 = r3.A03
            java.lang.String r0 = X.AnonymousClass3Ma.A12(r0)
            java.lang.String r1 = r0.trim()
            int r0 = r1.length()
            if (r0 > 0) goto L_0x048f
            int r2 = r3.A09
            if (r2 == 0) goto L_0x048f
            X.1KB r1 = r3.A0C
            r0 = 0
            r1.A08(r2, r0)
        L_0x0487:
            android.app.Activity r1 = r3.A00
            int r0 = r3.A08
            X.AnonymousClass4Yv.A00(r1, r0)
            return
        L_0x048f:
            X.5Zj r0 = r3.A0D
            r0.CDU(r1)
            r3.dismiss()
            goto L_0x0487
        L_0x0498:
            java.lang.Object r0 = r13.A01
            com.whatsapp.email.VerifyEmailActivity r0 = (com.whatsapp.email.VerifyEmailActivity) r0
            com.whatsapp.email.VerifyEmailActivity.A03(r0)
            return
        L_0x04a0:
            java.lang.Object r1 = r13.A01
            com.whatsapp.email.VerifyEmailActivity r1 = (com.whatsapp.email.VerifyEmailActivity) r1
            com.whatsapp.CodeInputField r0 = r1.A02
            if (r0 != 0) goto L_0x04ac
            java.lang.String r0 = "codeInputField"
            goto L_0x05e9
        L_0x04ac:
            java.lang.String r0 = r0.getCode()
            X.C18070vi.A0X(r0)
            com.whatsapp.email.VerifyEmailActivity.A0c(r1, r0)
            return
        L_0x04b7:
            java.lang.Object r1 = r13.A01
            com.whatsapp.email.UpdateEmailActivity r1 = (com.whatsapp.email.UpdateEmailActivity) r1
            com.whatsapp.WaEditText r0 = r1.A02
            if (r0 != 0) goto L_0x04c3
            java.lang.String r0 = "emailInput"
            goto L_0x05e9
        L_0x04c3:
            java.lang.String r0 = X.AnonymousClass3MZ.A17(r0)
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r0)
            com.whatsapp.email.UpdateEmailActivity.A0V(r1, r0)
            return
        L_0x04cf:
            java.lang.Object r4 = r13.A01
            com.whatsapp.email.EmailVerificationActivity r4 = (com.whatsapp.email.EmailVerificationActivity) r4
            boolean r0 = com.whatsapp.email.EmailVerificationActivity.A0s(r4)
            r1 = 7
            if (r0 == 0) goto L_0x04dc
            r1 = 11
        L_0x04dc:
            r0 = 10
            com.whatsapp.email.EmailVerificationActivity.A0r(r4, r1, r0)
            X.1L9 r3 = r4.A01
            X.00H r0 = r4.A0A
            if (r0 == 0) goto L_0x04fa
            r0.get()
            int r2 = r4.A00
            java.lang.String r1 = r4.A0B
            r0 = 1
            android.content.Intent r0 = X.AnonymousClass1LU.A1Q(r4, r1, r0, r2)
            r3.A08(r4, r0)
            r4.finish()
            return
        L_0x04fa:
            java.lang.String r0 = "waIntents"
            goto L_0x05e9
        L_0x04fe:
            java.lang.Object r0 = r13.A01
            com.whatsapp.email.EmailVerificationActivity r0 = (com.whatsapp.email.EmailVerificationActivity) r0
            com.whatsapp.email.EmailVerificationActivity.A03(r0)
            return
        L_0x0506:
            java.lang.Object r1 = r13.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0 = 2131889541(0x7f120d85, float:1.9413748E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = 0
            java.lang.String r8 = "Please click on an item to access its detail page and submit from there"
            r5 = r3
            r6 = r3
            r7 = r3
            r9 = r3
            r4 = r3
            r1.CMx(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x051d:
            java.lang.Object r0 = r13.A01
            X.1FL r0 = (X.AnonymousClass1FL) r0
            com.whatsapp.dogfood.MuteDiagnosticsDialogFragment r2 = new com.whatsapp.dogfood.MuteDiagnosticsDialogFragment
            r2.<init>()
            X.1GP r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "MuteDiagnosticsDialogFragment"
            r2.A2F(r1, r0)
            return
        L_0x0530:
            java.lang.Object r3 = r13.A01
            X.1FU r3 = (X.AnonymousClass1FU) r3
            java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.String r0 = "android.intent.category.OPENABLE"
            r2.addCategory(r0)
            java.lang.String r0 = "*/*"
            r2.setType(r0)
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "allowed_mime_types"
            java.lang.String[] r1 = r1.getStringArrayExtra(r0)
            if (r1 == 0) goto L_0x0559
            int r0 = r1.length
            if (r0 == 0) goto L_0x0559
            java.lang.String r0 = "android.intent.extra.MIME_TYPES"
            r2.putExtra(r0, r1)
        L_0x0559:
            java.lang.String r1 = "android.intent.extra.ALLOW_MULTIPLE"
            r0 = 1
            r2.putExtra(r1, r0)
            r3.CNh(r2, r0)
            return
        L_0x0563:
            java.lang.Object r3 = r13.A01
            com.whatsapp.dmsetting.DisappearingMessagesSettingActivity r3 = (com.whatsapp.dmsetting.DisappearingMessagesSettingActivity) r3
            r8 = 0
            X.1PS r0 = r3.A04
            if (r0 == 0) goto L_0x05b3
            int r7 = r0.A00()
            X.00H r0 = r3.A07
            if (r0 == 0) goto L_0x05e7
            java.lang.Object r4 = r0.get()
            X.4S2 r4 = (X.AnonymousClass4S2) r4
            int r10 = r3.A00
            r6 = 1
            r5 = 0
            r9 = r8
            r4.A01(r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.String r0 = "com.whatsapp.contact.picker.ContactPicker"
            android.content.Intent r1 = X.C72483Me.A0B(r3, r0, r6)
            java.lang.String r0 = "send"
            r1.putExtra(r0, r5)
            java.lang.String r0 = "skip_preview"
            r1.putExtra(r0, r5)
            java.lang.String r0 = "message_types"
            r1.putExtra(r0, r4)
            java.lang.String r0 = "multi_select_ddm"
            r1.putExtra(r0, r5)
            if (r2 == 0) goto L_0x05af
            java.lang.String r0 = "dm_duration"
            r1.putExtra(r0, r2)
        L_0x05af:
            r3.startActivityForResult(r1, r6)
            return
        L_0x05b3:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        L_0x05b8:
            java.lang.String r2 = r5.trim()
            int r0 = r2.length()
            if (r0 > 0) goto L_0x05cc
            int r1 = r6.A01
            if (r1 == 0) goto L_0x05cc
            X.1KB r0 = r6.A05
            r0.A08(r1, r3)
            return
        L_0x05cc:
            X.5bP r1 = r6.A0D
            if (r1 == 0) goto L_0x05d5
            int r0 = r6.A00
            r1.BsU(r0, r2)
        L_0x05d5:
            r6.A28()
            return
        L_0x05d9:
            java.lang.String r0 = "describeProblemField"
            goto L_0x05e9
        L_0x05dc:
            java.lang.String r0 = "mediaStateManager"
            goto L_0x05e9
        L_0x05df:
            r0 = 2
            X.AnonymousClass74O.A07(r2, r0)
            return
        L_0x05e4:
            java.lang.String r0 = "waPermissionsHelper"
            goto L_0x05e9
        L_0x05e7:
            java.lang.String r0 = "ephemeralSettingLogger"
        L_0x05e9:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89934dG.onClick(android.view.View):void");
    }
}
