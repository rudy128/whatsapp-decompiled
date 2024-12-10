package X;

import android.content.res.Resources;
import android.view.View;

/* renamed from: X.83O  reason: invalid class name */
public final class AnonymousClass83O extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C30191dX $contactAccessHelper;
    public final /* synthetic */ C133496or $contactFormSaveButtonController;
    public final /* synthetic */ C136756uL $contactFormSyncToDeviceController;
    public final /* synthetic */ AnonymousClass1M9 $contactManager;
    public final /* synthetic */ AnonymousClass12E $contactSyncMethods;
    public final /* synthetic */ View $contentView;
    public final /* synthetic */ AnonymousClass1KB $globalUI;
    public final /* synthetic */ boolean $isEditContact;
    public final /* synthetic */ C139486yv $nativeContactDbHelper;
    public final /* synthetic */ C37301pI $nativeContactsLogUtil;
    public final /* synthetic */ Resources $resources;
    public final /* synthetic */ boolean $runOnSeparateUploadJob;
    public final /* synthetic */ C133956pm $settingsContactsUtil;
    public final /* synthetic */ View $syncToPhoneToggleOverlay;
    public final /* synthetic */ View $toggle;
    public final /* synthetic */ View $turnonBackupProgressBar;
    public final /* synthetic */ C219217x $waPermissionsHelper;
    public final /* synthetic */ C19830z4 $waSharedPreferences;
    public final /* synthetic */ AnonymousClass10I $waWorkers;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass83O(Resources resources, View view, View view2, View view3, View view4, AnonymousClass1KB r7, C30191dX r8, AnonymousClass1M9 r9, C139486yv r10, C133496or r11, C136756uL r12, AnonymousClass12E r13, C219217x r14, C19830z4 r15, C133956pm r16, C37301pI r17, AnonymousClass10I r18, boolean z, boolean z2) {
        super(1);
        this.$globalUI = r7;
        this.$settingsContactsUtil = r16;
        this.$waPermissionsHelper = r14;
        this.$contactAccessHelper = r8;
        this.$waSharedPreferences = r15;
        this.$nativeContactDbHelper = r10;
        this.$contactManager = r9;
        this.$contactSyncMethods = r13;
        this.$waWorkers = r18;
        this.$runOnSeparateUploadJob = z;
        this.$nativeContactsLogUtil = r17;
        this.$isEditContact = z2;
        this.$contactFormSaveButtonController = r11;
        this.$syncToPhoneToggleOverlay = view;
        this.$turnonBackupProgressBar = view2;
        this.$toggle = view3;
        this.$contactFormSyncToDeviceController = r12;
        this.$contentView = view4;
        this.$resources = resources;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0036, code lost:
        if (r1.A00() == false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r14) {
        /*
            r13 = this;
            boolean r0 = X.AnonymousClass000.A1Y(r14)
            r9 = 1
            if (r0 != r9) goto L_0x005b
            X.1KB r0 = r13.$globalUI
            X.6or r2 = r13.$contactFormSaveButtonController
            android.view.View r6 = r13.$syncToPhoneToggleOverlay
            android.view.View r3 = r13.$turnonBackupProgressBar
            android.view.View r4 = r13.$toggle
            boolean r8 = r13.$isEditContact
            X.6uL r5 = r13.$contactFormSyncToDeviceController
            r7 = 2
            X.7QF r1 = new X.7QF
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.A0J(r1)
            X.17x r2 = r13.$waPermissionsHelper
            X.1dX r1 = r13.$contactAccessHelper
            r11 = 0
            X.C18070vi.A0d(r2, r11)
            X.C18070vi.A0d(r1, r9)
            java.lang.String r0 = "android.permission.GET_ACCOUNTS"
            int r0 = r2.A02(r0)
            if (r0 != 0) goto L_0x0038
            boolean r0 = r1.A00()
            r10 = 1
            if (r0 != 0) goto L_0x0039
        L_0x0038:
            r10 = 0
        L_0x0039:
            X.0z4 r0 = r13.$waSharedPreferences
            r0.A25(r9)
            X.6pm r4 = r13.$settingsContactsUtil
            X.6yv r6 = r13.$nativeContactDbHelper
            X.1M9 r5 = r13.$contactManager
            X.12E r7 = r13.$contactSyncMethods
            X.10I r8 = r13.$waWorkers
            boolean r12 = r13.$runOnSeparateUploadJob
            r4.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            X.1pI r1 = r13.$nativeContactsLogUtil
            boolean r0 = r13.$isEditContact
            int r0 = X.C72453Mb.A03(r0)
            r1.A02(r9, r0)
        L_0x0058:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x005b:
            if (r0 != 0) goto L_0x0058
            X.1KB r0 = r13.$globalUI
            X.6or r2 = r13.$contactFormSaveButtonController
            android.view.View r3 = r13.$syncToPhoneToggleOverlay
            android.view.View r4 = r13.$turnonBackupProgressBar
            android.view.View r5 = r13.$toggle
            X.1pI r6 = r13.$nativeContactsLogUtil
            boolean r10 = r13.$isEditContact
            android.view.View r7 = r13.$contentView
            android.content.res.Resources r8 = r13.$resources
            X.Ak7 r1 = new X.Ak7
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.A0J(r1)
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass83O.invoke(java.lang.Object):java.lang.Object");
    }
}
