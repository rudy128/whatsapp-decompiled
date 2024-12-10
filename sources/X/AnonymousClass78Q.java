package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: X.78Q  reason: invalid class name */
public class AnonymousClass78Q implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass78Q(Context context, Intent intent, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = context;
            this.A02 = intent;
            return;
        }
        this.A01 = context;
        this.A02 = intent;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new AnonymousClass78Q(obj, obj2, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0072, code lost:
        r2.A25(((X.C161768Hr) r14.A02).A0V(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04bd, code lost:
        r0 = "systemServices";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x05d4, code lost:
        r1 = new X.C46922Gk();
        X.C36171nS.A01(r1, r5);
        r1.A00 = 1;
        r1.A01 = 1;
        r1.A02 = r2;
        X.C36171nS.A00(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x05ea, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x061d, code lost:
        if (r2 == 3) goto L_0x061f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x07c9, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x07cd, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x07f4, code lost:
        r1.A0T(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x07f7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x080d, code lost:
        r0 = (X.AnonymousClass7D2) r0;
        r1 = r0.A00;
        r0 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0813, code lost:
        if (r1 == 0) goto L_0x0823;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0815, code lost:
        r0 = ((com.whatsapp.bot.home.BotListFragment) r0).A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0819, code lost:
        X.C108945cZ.A0b(r0).A02.A0F(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0822, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0823, code lost:
        r0 = ((com.whatsapp.bot.home.AiHomeFragment) r0).A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x020e, code lost:
        r1.invoke(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0211, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x001b;
                case 1: goto L_0x0863;
                case 2: goto L_0x0041;
                case 3: goto L_0x0056;
                case 4: goto L_0x031f;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x032f;
                case 9: goto L_0x033b;
                case 10: goto L_0x046f;
                case 11: goto L_0x007e;
                case 12: goto L_0x047b;
                case 13: goto L_0x0487;
                case 14: goto L_0x04a2;
                case 15: goto L_0x0099;
                case 16: goto L_0x04c1;
                case 17: goto L_0x04e1;
                case 18: goto L_0x04e1;
                case 19: goto L_0x0011;
                case 20: goto L_0x00eb;
                case 21: goto L_0x010e;
                case 22: goto L_0x04ee;
                case 23: goto L_0x0517;
                case 24: goto L_0x0597;
                case 25: goto L_0x0141;
                case 26: goto L_0x05eb;
                case 27: goto L_0x05fc;
                case 28: goto L_0x0634;
                case 29: goto L_0x017d;
                case 30: goto L_0x064b;
                case 31: goto L_0x065f;
                case 32: goto L_0x06d3;
                case 33: goto L_0x01a7;
                case 34: goto L_0x01be;
                case 35: goto L_0x01da;
                case 36: goto L_0x06ed;
                case 37: goto L_0x0216;
                case 38: goto L_0x0740;
                case 39: goto L_0x0759;
                case 40: goto L_0x0775;
                case 41: goto L_0x07ce;
                case 42: goto L_0x07f8;
                case 43: goto L_0x0803;
                case 44: goto L_0x0828;
                case 45: goto L_0x0272;
                case 46: goto L_0x0290;
                case 47: goto L_0x02b9;
                case 48: goto L_0x02d4;
                case 49: goto L_0x0848;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r14.A01
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            java.lang.Object r0 = r14.A02
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            r1.onOptionsItemSelected(r0)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r1 = r14.A01
            X.1Di r1 = (X.C22821Di) r1
            java.lang.Object r2 = r14.A02
            java.util.List r0 = X.C42011xT.A0I
            goto L_0x020e
        L_0x001b:
            java.lang.Object r3 = r14.A02
            X.CiW r3 = (X.C25591CiW) r3
            android.os.Handler r2 = r3.A02
            r1 = 32
            X.AkX r0 = new X.AkX
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.post(r0)
            java.lang.Object r0 = r14.A01
            X.CIn r0 = (X.C24751CIn) r0
            X.D8A r0 = r0.A00
            java.util.Deque r0 = r0.A0C
            java.lang.Object r0 = r0.peek()
            X.CSC r0 = (X.CSC) r0
            if (r0 == 0) goto L_0x0010
            X.EAQ r0 = r0.A04
            r0.CDn()
            return
        L_0x0041:
            java.lang.Object r2 = r14.A01
            com.google.android.material.datepicker.MaterialCalendar r2 = (com.google.android.material.datepicker.MaterialCalendar) r2
            androidx.recyclerview.widget.RecyclerView r0 = r2.A04
            X.1qy r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.A1Q()
            int r1 = r0 + -1
            if (r1 < 0) goto L_0x0010
            goto L_0x0072
        L_0x0056:
            java.lang.Object r2 = r14.A01
            com.google.android.material.datepicker.MaterialCalendar r2 = (com.google.android.material.datepicker.MaterialCalendar) r2
            androidx.recyclerview.widget.RecyclerView r0 = r2.A04
            X.1qy r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.A1O()
            int r1 = r0 + 1
            androidx.recyclerview.widget.RecyclerView r0 = r2.A04
            X.1rD r0 = r0.A0B
            int r0 = r0.A0Q()
            if (r1 >= r0) goto L_0x0010
        L_0x0072:
            java.lang.Object r0 = r14.A02
            X.8Hr r0 = (X.C161768Hr) r0
            X.Aie r0 = r0.A0V(r1)
            r2.A25(r0)
            return
        L_0x007e:
            java.lang.Object r4 = r14.A01
            X.1FU r4 = (X.AnonymousClass1FU) r4
            java.lang.Object r3 = r14.A02
            X.5rq r3 = (X.C114705rq) r3
            X.11C r0 = r4.A08
            android.content.ClipboardManager r1 = r0.A09()
            r2 = 0
            if (r1 == 0) goto L_0x0890
            java.lang.String r0 = r3.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0010
            goto L_0x0878
        L_0x0099:
            java.lang.Object r1 = r14.A01
            X.3ZF r1 = (X.AnonymousClass3ZF) r1
            java.lang.Object r4 = r14.A02
            X.5Wf r4 = (X.C106535Wf) r4
            java.util.List r0 = X.C42011xT.A0I
            X.4Kd r1 = r1.A00
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            com.whatsapp.areffects.tray.ArEffectsTrayFragment r2 = r1.A00
            X.0vl r3 = r2.A05
            java.lang.Object r0 = r3.getValue()
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r0 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r0
            X.0vl r0 = r0.A0J
            java.util.Map r1 = X.AnonymousClass3MW.A12(r0)
            X.0vl r2 = r2.A04
            java.lang.Object r0 = r2.getValue()
            java.lang.Object r0 = r1.get(r0)
            X.4S8 r0 = (X.AnonymousClass4S8) r0
            if (r0 == 0) goto L_0x00e9
            X.1G4 r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.4Sy r0 = (X.C86764Sy) r0
            if (r0 == 0) goto L_0x00e9
            X.5Wf r0 = r0.A00
        L_0x00d3:
            boolean r0 = X.C18070vi.A18(r0, r4)
            if (r0 == 0) goto L_0x0010
            java.lang.Object r1 = r3.getValue()
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r1 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r1
            java.lang.Object r0 = r2.getValue()
            X.4DE r0 = (X.AnonymousClass4DE) r0
            r1.A0e(r0)
            return
        L_0x00e9:
            r0 = 0
            goto L_0x00d3
        L_0x00eb:
            java.lang.Object r4 = r14.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r4 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r4
            java.lang.Object r3 = r14.A02
            X.9uI r3 = (X.C195999uI) r3
            X.00H r0 = r4.A0g
            java.lang.Object r2 = r0.get()
            X.A8V r2 = (X.A8V) r2
            java.lang.String r1 = "backup_found"
            java.lang.String r0 = "restore"
            r2.A0I(r1, r0)
            boolean r0 = com.whatsapp.backup.google.RestoreFromBackupActivity.A1A(r4)
            if (r0 != 0) goto L_0x0010
            X.9Ht r0 = X.C179389Ht.TRIGGER_RESTORE_FROM_LOCAL_BACKUP
            com.whatsapp.backup.google.RestoreFromBackupActivity.A0z(r4, r3, r0)
            return
        L_0x010e:
            java.lang.Object r5 = r14.A01
            X.1FY r5 = (X.AnonymousClass1FY) r5
            java.lang.Object r2 = r14.A02
            X.9Zv r2 = (X.C183849Zv) r2
            X.00H r0 = r5.A0C
            long r3 = X.C108975cc.A07(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "settings-gdrive/display-media-restore-error/"
            r1.append(r0)
            int r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = " freeSpace:"
            X.C17900vP.A0m(r0, r1, r3)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0010
            X.10I r2 = r5.A05
            r1 = 4
            X.Ajr r0 = new X.Ajr
            r0.<init>(r5, r1)
            r2.CGF(r0)
            return
        L_0x0141:
            java.lang.Object r4 = r14.A01
            X.4i3 r4 = (X.C92874i3) r4
            java.lang.Object r0 = r14.A02
            X.24c r0 = (X.C446124c) r0
            com.whatsapp.biz.viewmodel.BusinessDetailsViewModel r3 = r4.A0h
            com.whatsapp.jid.UserJid r8 = r3.A0T()
            if (r8 == 0) goto L_0x0010
            X.6kp r2 = r4.A0T
            java.lang.String r1 = r8.getRawString()
            java.lang.String r0 = r0.A02
            X.AEe r9 = r2.A00(r1, r0)
            if (r9 == 0) goto L_0x0010
            X.1l7 r2 = r4.A0p
            java.lang.String r1 = "messageless_flow"
            java.lang.String r0 = r9.A00
            X.9ul r5 = r2.A02(r1, r0)
            if (r5 == 0) goto L_0x0010
            com.whatsapp.chatinfo.ContactInfoActivity r6 = r4.A0l
            r7 = 0
            r3.A0T()
            java.lang.String r10 = "-1"
            boolean r0 = r5 instanceof X.AnonymousClass8nz
            if (r0 != 0) goto L_0x0899
            java.lang.String r0 = "NativeFlowActionUtils/processCommerceNativeFlow. Base class for commerce action should be CommerceNativeFlowAction."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x017d:
            java.lang.Object r0 = r14.A02
            X.8jL r0 = (X.C168638jL) r0
            android.content.Context r3 = r15.getContext()
            java.lang.String r2 = r0.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "mailto:"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r1 = X.AnonymousClass3MY.A07(r0)
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            android.content.ComponentName r0 = r1.resolveActivity(r0)
            if (r0 == 0) goto L_0x0010
            r3.startActivity(r1)
            return
        L_0x01a7:
            java.lang.Object r2 = r14.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r14.A02
            com.whatsapp.videoplayback.VideoSurfaceView r1 = (com.whatsapp.videoplayback.VideoSurfaceView) r1
            r0 = 8
            r2.setVisibility(r0)
            boolean r0 = r1.isPlaying()
            if (r0 != 0) goto L_0x0010
            r1.start()
            return
        L_0x01be:
            java.lang.Object r1 = r14.A01
            X.5mv r1 = (X.C113335mv) r1
            java.lang.Object r3 = r14.A02
            X.1w3 r3 = (X.C41251w3) r3
            X.AnonymousClass3MX.A1O(r1)
            int r2 = r1.A05()
            r0 = -1
            if (r2 == r0) goto L_0x0010
            X.1Di r1 = r1.A02
            java.lang.Object r2 = r3.A0U(r2)
            X.C18070vi.A0X(r2)
            goto L_0x020e
        L_0x01da:
            java.lang.Object r5 = r14.A01
            X.5mv r5 = (X.C113335mv) r5
            java.lang.Object r4 = r14.A02
            X.5kP r4 = (X.C111775kP) r4
            X.AnonymousClass3MX.A1O(r5)
            int r3 = r5.A05()
            r0 = -1
            if (r3 == r0) goto L_0x0010
            java.lang.Integer r1 = r4.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x0010
            java.lang.Object r0 = r4.A0U(r3)
            X.6qf r0 = (X.C134486qf) r0
            java.util.Set r2 = r4.A01
            java.lang.String r1 = r0.A00
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x0212
            r2.remove(r1)
        L_0x0205:
            r4.A0G(r3)
            X.1Di r1 = r5.A03
            java.util.List r2 = X.C29431cG.A0t(r2)
        L_0x020e:
            r1.invoke(r2)
            return
        L_0x0212:
            r2.add(r1)
            goto L_0x0205
        L_0x0216:
            java.lang.Object r1 = r14.A01
            X.3Wj r1 = (X.C73543Wj) r1
            java.lang.Object r4 = r14.A02
            X.4cI r4 = (X.C89334cI) r4
            java.util.List r0 = X.C42011xT.A0I
            X.5Wp r0 = r1.A00
            if (r0 == 0) goto L_0x0010
            X.4iE r0 = (X.C92974iE) r0
            X.4Ys r1 = r0.A00
            X.3rd r0 = r1.A00
            if (r0 == 0) goto L_0x0010
            X.5Wq r0 = r0.A01
            if (r0 == 0) goto L_0x0010
            X.73D r2 = r1.A04
            X.4iF r0 = (X.C92984iF) r0
            X.4aY r3 = r0.A01
            X.5cQ r0 = r3.A2Q
            X.1FY r0 = r0.getActivityNullable()
            X.6yo r1 = new X.6yo
            r1.<init>(r0)
            android.net.Uri r0 = r4.A00
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.util.ArrayList r0 = X.C17880vN.A10(r0)
            r1.A0I = r0
            X.1BI r0 = r3.A3R
            java.lang.String r0 = r0.getRawString()
            r1.A0D = r0
            r0 = 0
            r1.A0S = r0
            r0 = 12
            r1.A01 = r0
            r0 = 1
            r1.A0R = r0
            X.C139416yo.A00(r2, r1)
            android.content.Intent r2 = r1.A01()
            X.5cQ r0 = r3.A2Q
            X.1FY r1 = r0.CFa()
            r0 = 816(0x330, float:1.143E-42)
            r1.startActivityForResult(r2, r0)
            return
        L_0x0272:
            java.lang.Object r0 = r14.A02
            X.3hU r0 = (X.C75433hU) r0
            X.1E7 r0 = r0.A0H
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass3MZ.A0x(r0)
            if (r3 == 0) goto L_0x0010
            java.lang.Object r2 = r14.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Integer r1 = X.C17880vN.A0i()
            r0 = 1
            android.content.Intent r1 = X.AnonymousClass1LU.A1D(r2, r3, r1, r0, r0)
            r0 = 0
            r2.startActivity(r1, r0)
            return
        L_0x0290:
            java.lang.Object r1 = r14.A01
            com.whatsapp.WaButtonWithLoader r1 = (com.whatsapp.WaButtonWithLoader) r1
            java.lang.Object r0 = r14.A02
            com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingErrorDialogFragment r0 = (com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingErrorDialogFragment) r0
            r1.A02()
            com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingCameraFragment r1 = r0.A01
            if (r1 == 0) goto L_0x0010
            X.0vl r0 = r1.A0O
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel r0 = (com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel) r0
            X.1G1 r0 = r0.A0P
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof X.C75783lk
            if (r0 == 0) goto L_0x0010
            X.4Qd r0 = r1.A0B
            if (r0 == 0) goto L_0x0010
            r0.A00()
            return
        L_0x02b9:
            java.lang.Object r1 = r14.A01
            X.3RG r1 = (X.AnonymousClass3RG) r1
            java.lang.Object r0 = r14.A02
            X.24Z r0 = (X.AnonymousClass24Z) r0
            X.3Uy r3 = r1.getViewModel()
            X.1BI r2 = r3.A00
            if (r2 == 0) goto L_0x0010
            X.1iW r1 = r3.A06
            java.lang.String r0 = r0.A01
            r1.A0W(r2, r0)
            X.C73343Uy.A00(r3)
            return
        L_0x02d4:
            java.lang.Object r4 = r14.A01
            X.8jm r4 = (X.C168848jm) r4
            java.lang.Object r6 = r14.A02
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            X.AnonymousClass3MX.A1O(r4)
            int r1 = r4.A05()
            r0 = -1
            if (r1 == r0) goto L_0x0010
            X.8HZ r0 = r4.A05
            java.util.List r0 = r0.A00
            java.lang.Object r2 = r0.get(r1)
            X.9Wn r2 = (X.C182999Wn) r2
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.biz.collection.view.adapter.model.CollectionHeaderDisplayItem"
            X.C18070vi.A0z(r2, r0)
            X.8jc r2 = (X.C168748jc) r2
            X.B7L r0 = r4.A04
            X.9cq r1 = r0.BOv(r1)
            android.view.View r0 = r4.A0H
            android.content.Context r5 = r0.getContext()
            java.lang.String r9 = r2.A02
            java.lang.String r10 = r2.A00
            if (r1 == 0) goto L_0x031d
            java.lang.String r11 = r1.A01
        L_0x030b:
            r7 = 0
            r8 = r7
            android.content.Intent r3 = X.AnonymousClass1LU.A1C(r5, r6, r7, r8, r9, r10, r11)
            X.1L9 r2 = r4.A01
            android.app.Activity r1 = X.AnonymousClass3Ma.A05(r0)
            r0 = 3000(0xbb8, float:4.204E-42)
            r2.A0D(r1, r3, r0)
            return
        L_0x031d:
            r11 = 0
            goto L_0x030b
        L_0x031f:
            java.lang.Object r1 = r14.A01
            X.CtN r1 = (X.C26155CtN) r1
            java.lang.Object r0 = r14.A02
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r15)
            r0 = 1
            r1.A09(r0)
            return
        L_0x032f:
            java.lang.Object r1 = r14.A01
            X.1Zk r1 = (X.C28221Zk) r1
            java.lang.Object r0 = r14.A02
            X.1bm r0 = (X.C29201bm) r0
            r1.A06(r0)
            return
        L_0x033b:
            java.lang.Object r0 = r14.A01
            X.3WT r0 = (X.AnonymousClass3WT) r0
            java.lang.Object r3 = r14.A02
            X.4cV r3 = (X.C89464cV) r3
            com.whatsapp.IntentChooserBottomSheetDialogFragment r2 = r0.A01
            java.lang.Integer r0 = r2.A08
            if (r0 != 0) goto L_0x038d
            X.1FL r1 = r2.A1D()
            android.content.Intent r4 = r3.A07
            int r0 = r2.A00
            r1.startActivityForResult(r4, r0)
        L_0x0354:
            java.lang.Integer r1 = r3.A03
            if (r1 == 0) goto L_0x0366
            X.00H r0 = r2.A06
            X.6ue r3 = X.C108945cZ.A0p(r0)
            int r1 = r1.intValue()
            r0 = 0
            r3.A03(r0, r1)
        L_0x0366:
            X.1Un r5 = r2.A04
            android.content.ComponentName r0 = r4.getComponent()
            java.lang.String r1 = r0.getClassName()
            android.os.Bundle r6 = r2.A02
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0ve r4 = r5.A02
            r3 = 10532(0x2924, float:1.4758E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r3)
            if (r0 == 0) goto L_0x046b
            if (r6 == 0) goto L_0x046b
            java.lang.String r3 = "group_jid"
            boolean r0 = r6.containsKey(r3)
            if (r0 == 0) goto L_0x046b
            goto L_0x03a6
        L_0x038d:
            X.1GP r1 = r2.A1F()
            java.lang.Integer r0 = r2.A08
            int r0 = r0.intValue()
            androidx.fragment.app.Fragment r1 = r1.A0O(r0)
            X.C17960vV.A07(r1)
            android.content.Intent r4 = r3.A07
            int r0 = r2.A00
            r1.startActivityForResult(r4, r0)
            goto L_0x0354
        L_0x03a6:
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ 11T -> 0x046b }
            java.lang.String r0 = r6.getString(r3)     // Catch:{ 11T -> 0x046b }
            com.whatsapp.jid.GroupJid r6 = X.C36321nh.A01(r0)     // Catch:{ 11T -> 0x046b }
            X.1M9 r0 = r5.A00     // Catch:{ 11T -> 0x046b }
            X.1E7 r8 = r0.A0F(r6)     // Catch:{ 11T -> 0x046b }
            if (r8 == 0) goto L_0x046b
            X.63J r4 = new X.63J     // Catch:{ 11T -> 0x046b }
            r4.<init>()     // Catch:{ 11T -> 0x046b }
            int r0 = r1.hashCode()     // Catch:{ 11T -> 0x046b }
            switch(r0) {
                case -1368386048: goto L_0x03d1;
                case -1264370173: goto L_0x03e0;
                case 1064086507: goto L_0x03ef;
                case 1182733385: goto L_0x03fe;
                default: goto L_0x03c4;
            }     // Catch:{ 11T -> 0x046b }
        L_0x03c4:
            java.lang.String r0 = r8.A0X     // Catch:{ 11T -> 0x046b }
            if (r0 == 0) goto L_0x0421
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ 11T -> 0x046b }
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch:{ 11T -> 0x046b }
            goto L_0x040d
        L_0x03d1:
            java.lang.String r0 = "com.whatsapp.profile.CapturePhoto"
            boolean r0 = r1.equals(r0)     // Catch:{ 11T -> 0x046b }
            if (r0 == 0) goto L_0x03c4
            java.lang.Integer r0 = X.C17880vN.A0i()     // Catch:{ 11T -> 0x046b }
            r4.A02 = r0     // Catch:{ 11T -> 0x046b }
            goto L_0x03c4
        L_0x03e0:
            java.lang.String r0 = "com.whatsapp.gallerypicker.GalleryPickerLauncher"
            boolean r0 = r1.equals(r0)     // Catch:{ 11T -> 0x046b }
            if (r0 == 0) goto L_0x03c4
            java.lang.Integer r0 = X.C17880vN.A0l()     // Catch:{ 11T -> 0x046b }
            r4.A02 = r0     // Catch:{ 11T -> 0x046b }
            goto L_0x03c4
        L_0x03ef:
            java.lang.String r0 = "com.whatsapp.group.GroupProfileEmojiEditor"
            boolean r0 = r1.equals(r0)     // Catch:{ 11T -> 0x046b }
            if (r0 == 0) goto L_0x03c4
            java.lang.Integer r0 = X.C17880vN.A0k()     // Catch:{ 11T -> 0x046b }
            r4.A02 = r0     // Catch:{ 11T -> 0x046b }
            goto L_0x03c4
        L_0x03fe:
            java.lang.String r0 = "com.whatsapp.profile.WebImagePicker"
            boolean r0 = r1.equals(r0)     // Catch:{ 11T -> 0x046b }
            if (r0 == 0) goto L_0x03c4
            java.lang.Integer r0 = X.C108955ca.A0e()     // Catch:{ 11T -> 0x046b }
            r4.A02 = r0     // Catch:{ 11T -> 0x046b }
            goto L_0x03c4
        L_0x040d:
            if (r3 == 0) goto L_0x0421
            java.lang.String r3 = "yyyy-MM-dd"
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch:{ 11T -> 0x046b }
            r7.<init>(r3)     // Catch:{ 11T -> 0x046b }
            java.util.Date r3 = new java.util.Date     // Catch:{ 11T -> 0x046b }
            r3.<init>(r0)     // Catch:{ 11T -> 0x046b }
            java.lang.String r0 = r7.format(r3)     // Catch:{ 11T -> 0x046b }
            r4.A04 = r0     // Catch:{ 11T -> 0x046b }
        L_0x0421:
            boolean r0 = r8.A0g     // Catch:{ 11T -> 0x046b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 11T -> 0x046b }
            r4.A00 = r0     // Catch:{ 11T -> 0x046b }
            X.1MZ r1 = r5.A01     // Catch:{ 11T -> 0x046b }
            boolean r0 = r1.A0K(r6)     // Catch:{ 11T -> 0x046b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 11T -> 0x046b }
            r4.A01 = r0     // Catch:{ 11T -> 0x046b }
            X.1MW r0 = r1.A08     // Catch:{ 11T -> 0x046b }
            X.1MS r0 = r0.A04     // Catch:{ 11T -> 0x046b }
            X.2tp r3 = r0.A0A(r6)     // Catch:{ 11T -> 0x046b }
            if (r3 == 0) goto L_0x0460
            int r1 = r3.A00     // Catch:{ 11T -> 0x046b }
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1T(r0, r1)     // Catch:{ 11T -> 0x046b }
            if (r0 == 0) goto L_0x0466
            java.util.Map r0 = r3.A08     // Catch:{ 11T -> 0x046b }
            java.util.Collection r0 = r0.values()     // Catch:{ 11T -> 0x046b }
            X.10f r0 = X.C199410f.copyOf((java.util.Collection) r0)     // Catch:{ 11T -> 0x046b }
            int r0 = r0.size()     // Catch:{ 11T -> 0x046b }
        L_0x0456:
            int r0 = X.C64002u3.A02(r0)     // Catch:{ 11T -> 0x046b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 11T -> 0x046b }
            r4.A03 = r0     // Catch:{ 11T -> 0x046b }
        L_0x0460:
            X.18K r0 = r5.A03     // Catch:{ 11T -> 0x046b }
            r0.CC7(r4)     // Catch:{ 11T -> 0x046b }
            goto L_0x046b
        L_0x0466:
            int r0 = r3.A06()     // Catch:{ 11T -> 0x046b }
            goto L_0x0456
        L_0x046b:
            r2.A28()
            return
        L_0x046f:
            java.lang.Object r1 = r14.A01
            X.5rV r1 = (X.C114655rV) r1
            java.lang.Object r0 = r14.A02
            X.5rs r0 = (X.C114725rs) r0
            r1.A4g(r0)
            return
        L_0x047b:
            java.lang.Object r1 = r14.A01
            X.5rV r1 = (X.C114655rV) r1
            java.lang.Object r0 = r14.A02
            X.5rr r0 = (X.C114715rr) r0
            r1.A4h(r0)
            return
        L_0x0487:
            java.lang.Object r2 = r14.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r14.A02
            com.whatsapp.areffects.ArEffectsButtonHeaderFragment r1 = (com.whatsapp.areffects.ArEffectsButtonHeaderFragment) r1
            X.11C r0 = r1.A00
            if (r0 == 0) goto L_0x04bd
            X.AnonymousClass4a5.A01(r2, r0)
            X.0vl r0 = r1.A02
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r0 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r0
            r0.A0a()
            return
        L_0x04a2:
            java.lang.Object r2 = r14.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r14.A02
            com.whatsapp.areffects.ArEffectsButtonHeaderFragment r1 = (com.whatsapp.areffects.ArEffectsButtonHeaderFragment) r1
            X.11C r0 = r1.A00
            if (r0 == 0) goto L_0x04bd
            X.AnonymousClass4a5.A01(r2, r0)
            X.0vl r0 = r1.A02
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r0 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r0
            r0.A0Z()
            return
        L_0x04bd:
            java.lang.String r0 = "systemServices"
            goto L_0x07c9
        L_0x04c1:
            java.lang.Object r1 = r14.A01
            X.4hm r1 = (X.C92714hm) r1
            java.lang.Object r5 = r14.A02
            X.4ha r5 = (X.C92594ha) r5
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.20G r4 = r1.A00
            android.content.Context r3 = X.AnonymousClass3MY.A04(r15)
            X.5aj r2 = r5.A01
            X.4hD r1 = r5.A02
            boolean r0 = r5.A04
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.invoke(r3, r2, r1, r0)
            return
        L_0x04e1:
            java.lang.Object r1 = r14.A01
            X.1Di r1 = (X.C22821Di) r1
            java.lang.Object r0 = r14.A02
            X.AnonymousClass3MX.A1O(r1)
            r1.invoke(r0)
            return
        L_0x04ee:
            java.lang.Object r2 = r14.A01
            X.ALa r2 = (X.C20437ALa) r2
            java.lang.Object r1 = r14.A02
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "https://faq.whatsapp.com/335178174377229"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r0 = X.AnonymousClass3MY.A07(r0)
            r1.startActivity(r0)
            X.9Wt r0 = r2.A02
            X.0z4 r2 = r0.A00
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r2)
            java.lang.String r1 = "biz_shop_sunset_banner_clicked"
            int r0 = X.C17890vO.A00(r0, r1)
            int r0 = r0 + 1
            X.C17900vP.A0M(r2, r1, r0)
            return
        L_0x0517:
            java.lang.Object r6 = r14.A01
            X.7Bh r6 = (X.C142917Bh) r6
            java.lang.Object r5 = r14.A02
            X.6zs r5 = (X.C140056zs) r5
            r4 = 0
            X.C18070vi.A0d(r5, r4)
            java.lang.String r1 = r5.A07
            java.lang.String r0 = "automation_bulk_messaging"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x057d
            java.lang.String r2 = "notification"
            com.whatsapp.softenforcementsmb.AutomatorEnforcementEducationFragment r3 = new com.whatsapp.softenforcementsmb.AutomatorEnforcementEducationFragment
            r3.<init>()
            r0 = 1
            X.1D6[] r1 = new X.AnonymousClass1D6[r0]
            org.json.JSONObject r0 = r5.A00()
            java.lang.String r0 = r0.toString()
            X.AnonymousClass1D6.A03(r2, r0, r1, r4)
            X.AnonymousClass3MX.A1I(r3, r1)
        L_0x0545:
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            X.1GP r1 = r6.A01
            java.lang.String r0 = "SMBSoftEnforcementEducation"
            r3.A2C(r1, r0)
            X.6pe r1 = r6.A04
            X.6zs r0 = r1.A00
            if (r0 == 0) goto L_0x0576
            r0 = 2
            r1.A00(r0)
            X.6zM r0 = r1.A03
            X.6zs r1 = r1.A00
            X.0z4 r4 = r0.A00
            java.lang.String r0 = "click_count"
            java.lang.String r3 = X.C139736zM.A00(r1, r0)
            java.lang.String r2 = X.C139736zM.A00(r1, r0)
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r4)
            r0 = -1
            int r0 = r1.getInt(r2, r0)
            int r0 = r0 + 1
            r4.A1l(r3, r0)
        L_0x0576:
            X.1nS r3 = r6.A03
            java.lang.Integer r2 = X.C17880vN.A0i()
            goto L_0x05d4
        L_0x057d:
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r1 = "notification"
            org.json.JSONObject r0 = r5.A00()
            java.lang.String r0 = r0.toString()
            r2.putString(r1, r0)
            com.whatsapp.softenforcementsmb.SMBSoftEnforcementEducationFragment r3 = new com.whatsapp.softenforcementsmb.SMBSoftEnforcementEducationFragment
            r3.<init>()
            r3.A1R(r2)
            goto L_0x0545
        L_0x0597:
            java.lang.Object r6 = r14.A01
            X.7Bh r6 = (X.C142917Bh) r6
            java.lang.Object r5 = r14.A02
            X.6zs r5 = (X.C140056zs) r5
            android.view.View r1 = r6.A00
            r0 = 8
            r1.setVisibility(r0)
            X.6pe r1 = r6.A04
            X.6zs r0 = r1.A00
            if (r0 == 0) goto L_0x05ce
            r0 = 3
            r1.A00(r0)
            X.6zM r0 = r1.A03
            X.6zs r1 = r1.A00
            X.0z4 r4 = r0.A00
            java.lang.String r0 = "dismiss_count"
            java.lang.String r3 = X.C139736zM.A00(r1, r0)
            java.lang.String r2 = X.C139736zM.A00(r1, r0)
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r4)
            r0 = -1
            int r0 = r1.getInt(r2, r0)
            int r0 = r0 + 1
            r4.A1l(r3, r0)
        L_0x05ce:
            X.1nS r3 = r6.A03
            java.lang.Integer r2 = X.C17880vN.A0j()
        L_0x05d4:
            X.2Gk r1 = new X.2Gk
            r1.<init>()
            X.C36171nS.A01(r1, r5)
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            r1.A01 = r0
            r1.A02 = r2
            X.C36171nS.A00(r1, r3)
            return
        L_0x05eb:
            java.lang.Object r0 = r14.A01
            X.4i3 r0 = (X.C92874i3) r0
            java.lang.Object r2 = r14.A02
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            X.4VP r1 = r0.A10
            X.1E2 r2 = (X.AnonymousClass1E2) r2
            r0 = 2
            r1.A02(r2, r0)
            return
        L_0x05fc:
            java.lang.Object r5 = r14.A01
            X.4i3 r5 = (X.C92874i3) r5
            java.lang.Object r0 = r14.A02
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            X.Cgm r4 = r5.A14
            X.1BI r2 = r0.A0J
            java.lang.Integer r1 = r5.A1E
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            java.lang.String r3 = r2.getRawString()
            if (r1 == 0) goto L_0x0632
            int r2 = r1.intValue()
            r1 = 2
            r0 = 1
            if (r2 == r1) goto L_0x061f
            r0 = 3
            if (r2 != r0) goto L_0x0632
        L_0x061f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0623:
            r0 = 1
            X.C25491Cgm.A00(r4, r1, r3, r0, r0)
            X.72R r1 = r5.A0d
            r0 = 10
            r1.A02(r0)
            X.C92874i3.A01(r5)
            return
        L_0x0632:
            r1 = 0
            goto L_0x0623
        L_0x0634:
            java.lang.Object r3 = r14.A01
            X.A4l r3 = (X.C20042A4l) r3
            java.lang.Object r2 = r14.A02
            android.content.Intent r2 = (android.content.Intent) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.C20042A4l.A01(r3)
            X.1L9 r1 = r3.A04
            X.1FU r0 = r3.A05
            r1.A08(r0, r2)
            return
        L_0x064b:
            java.lang.Object r2 = r14.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r14.A02
            android.content.Intent r1 = (android.content.Intent) r1
            java.util.List r0 = X.C42011xT.A0I
            r2.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x0659 }
            return
        L_0x0659:
            java.lang.String r0 = "BusinessComplianceAdapter/Call action feature is not supported."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x065f:
            java.lang.Object r3 = r14.A01
            com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment r3 = (com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment) r3
            java.lang.Object r7 = r14.A02
            X.77G r7 = (X.AnonymousClass77G) r7
            android.content.Context r0 = r3.A1n()
            if (r0 == 0) goto L_0x06b0
            X.1LU r2 = r3.A0D
            android.content.Context r1 = r3.A1n()
            com.whatsapp.jid.UserJid r0 = r3.A0E
            r6 = 0
            android.content.Intent r5 = r2.A1w(r1, r0, r6)
            int r0 = r3.A02
            r4 = 1
            if (r0 != r4) goto L_0x06a7
            java.lang.String r0 = "confirm"
            r5.putExtra(r0, r4)
            java.lang.String r2 = r7.A03
            java.lang.String r0 = "ig_post_url"
            r5.putExtra(r0, r2)
            android.content.Context r1 = r3.A1n()
            r0 = 2131891246(0x7f12142e, float:1.9417207E38)
            java.lang.String r1 = X.C17890vO.A0R(r1, r2, r4, r6, r0)
            java.lang.String r0 = "has_share"
            r5.putExtra(r0, r4)
            java.lang.String r0 = "share_msg"
            r5.putExtra(r0, r1)
            android.content.Context r0 = r3.A1n()
            X.C60392nx.A00(r0, r5)
        L_0x06a7:
            X.1L9 r1 = r3.A04
            android.content.Context r0 = r3.A1n()
            r1.A09(r0, r5)
        L_0x06b0:
            int r0 = r3.A02
            if (r0 != 0) goto L_0x06c4
            int r0 = r3.A00
            r2 = 25
            if (r0 != 0) goto L_0x06bc
            r2 = 24
        L_0x06bc:
            X.72R r1 = r3.A05
            X.76t r0 = r3.A06
            r1.A04(r0, r2)
            return
        L_0x06c4:
            X.00H r0 = r3.A0G
            java.lang.Object r2 = r0.get()
            X.6wJ r2 = (X.C137966wJ) r2
            com.whatsapp.jid.UserJid r1 = r3.A0E
            r0 = 2
            X.C137966wJ.A00(r2, r1, r0)
            return
        L_0x06d3:
            java.lang.Object r2 = r14.A01
            X.A2Y r2 = (X.A2Y) r2
            java.lang.Object r1 = r14.A02
            com.whatsapp.bizintegrity.callpermission.CallPermissionRequestBottomSheet r1 = (com.whatsapp.bizintegrity.callpermission.CallPermissionRequestBottomSheet) r1
            X.0vl r0 = r1.A0M
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 != 0) goto L_0x06e9
            r1.A09 = r2
        L_0x06e9:
            r1.A28()
            return
        L_0x06ed:
            java.lang.Object r3 = r14.A01
            com.whatsapp.bot.botmemory.bottomsheet.MemoryBottomSheet r3 = (com.whatsapp.bot.botmemory.bottomsheet.MemoryBottomSheet) r3
            java.lang.Object r4 = r14.A02
            android.view.View r4 = (android.view.View) r4
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.00H r0 = r3.A01
            if (r0 == 0) goto L_0x073c
            java.lang.Object r2 = r0.get()
            X.6zQ r2 = (X.C139776zQ) r2
            X.2Hl r1 = new X.2Hl
            r1.<init>()
            r0 = 23
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.AnonymousClass3MZ.A1T(r1, r0)
            r0 = 94
            X.C108945cZ.A1M(r1, r0)
            X.C139776zQ.A00(r2, r1)
            X.1LU r0 = r3.A00
            if (r0 == 0) goto L_0x07c4
            android.content.Context r0 = X.AnonymousClass3MY.A04(r4)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.bot.botmemory.MemoryActivity"
            r2.setClassName(r1, r0)
            r1 = 22
            java.lang.String r0 = "extra_entry_point"
            r2.putExtra(r0, r1)
            r3.A1k(r2)
            r3.A29()
            return
        L_0x073c:
            java.lang.String r0 = "memoryJourneyLogger"
            goto L_0x07c9
        L_0x0740:
            java.lang.Object r1 = r14.A01
            X.2fQ r1 = (X.C55222fQ) r1
            java.lang.Object r4 = r14.A02
            X.0vk r4 = (X.C18090vk) r4
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.1Pr r3 = r1.A03
            r2 = 0
            r1 = 31
            r0 = 1
            X.AnonymousClass3MY.A1P(r2, r3, r1, r0)
            r4.invoke()
            return
        L_0x0759:
            java.lang.Object r0 = r14.A01
            com.whatsapp.bot.home.AiHomePreviewBottomSheet r0 = (com.whatsapp.bot.home.AiHomePreviewBottomSheet) r0
            java.lang.Object r2 = r14.A02
            X.7Cw r2 = (X.C143307Cw) r2
            r0.A28()
            X.0vl r1 = r0.A08
            com.whatsapp.bot.home.AiHomeViewModel r0 = X.C108945cZ.A0b(r1)
            r0.A0U(r2)
            com.whatsapp.bot.home.AiHomeViewModel r1 = X.C108945cZ.A0b(r1)
            r0 = 65
            goto L_0x07f4
        L_0x0775:
            java.lang.Object r6 = r14.A01
            com.whatsapp.bot.home.AiHomePreviewBottomSheet r6 = (com.whatsapp.bot.home.AiHomePreviewBottomSheet) r6
            java.lang.Object r7 = r14.A02
            X.7Cw r7 = (X.C143307Cw) r7
            r6.A28()
            X.00H r0 = r6.A06
            if (r0 == 0) goto L_0x07c4
            android.content.Context r5 = X.C108955ca.A0A(r6, r0)
            java.lang.String r4 = "text/plain"
            X.1Ps r3 = r6.A02
            if (r3 == 0) goto L_0x07c7
            android.content.Context r2 = r6.A14()
            X.1BI r1 = r7.A01
            java.lang.String r0 = X.C1401970i.A00(r7)
            java.lang.String r3 = r3.A05(r2, r1, r0)
            if (r3 == 0) goto L_0x07bb
            java.lang.String r0 = "com.whatsapp.contact.picker.ContactPicker"
            android.content.Intent r2 = X.C72473Md.A0B(r5, r0)
            java.lang.String r1 = "source_surface"
            r0 = 36
            r2.putExtra(r1, r0)
            r2.setType(r4)
            java.lang.String r0 = "android.intent.extra.TEXT"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "show_more_sharing_options_content"
            r2.putExtra(r0, r3)
            r6.A1k(r2)
        L_0x07bb:
            X.0vl r0 = r6.A08
            com.whatsapp.bot.home.AiHomeViewModel r1 = X.C108945cZ.A0b(r0)
            r0 = 66
            goto L_0x07f4
        L_0x07c4:
            java.lang.String r0 = "waIntents"
            goto L_0x07c9
        L_0x07c7:
            java.lang.String r0 = "bonsaiUiUtil"
        L_0x07c9:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x07ce:
            java.lang.Object r2 = r14.A01
            X.5mT r2 = (X.C113055mT) r2
            java.lang.Object r1 = r14.A02
            java.util.List r0 = X.C42011xT.A0I
            X.6df r3 = r2.A01
            com.whatsapp.bot.home.AiHomePreviewBottomSheet r0 = r3.A01
            X.0vl r2 = r0.A08
            com.whatsapp.bot.home.AiHomeViewModel r0 = X.C108945cZ.A0b(r2)
            X.1DT r0 = r0.A03
            r0.A0F(r1)
            com.whatsapp.bot.home.AiHomeViewModel r1 = X.C108945cZ.A0b(r2)
            X.7Cw r0 = r3.A00
            r1.A0U(r0)
            com.whatsapp.bot.home.AiHomeViewModel r1 = X.C108945cZ.A0b(r2)
            r0 = 64
        L_0x07f4:
            r1.A0T(r0)
            return
        L_0x07f8:
            java.lang.Object r1 = r14.A01
            X.5vs r1 = (X.C115845vs) r1
            java.lang.Object r2 = r14.A02
            java.util.List r0 = X.C42011xT.A0I
            X.86c r0 = r1.A02
            goto L_0x080d
        L_0x0803:
            java.lang.Object r1 = r14.A01
            X.5vr r1 = (X.C115835vr) r1
            java.lang.Object r2 = r14.A02
            java.util.List r0 = X.C42011xT.A0I
            X.86c r0 = r1.A02
        L_0x080d:
            X.7D2 r0 = (X.AnonymousClass7D2) r0
            int r1 = r0.A00
            java.lang.Object r0 = r0.A01
            if (r1 == 0) goto L_0x0823
            com.whatsapp.bot.home.BotListFragment r0 = (com.whatsapp.bot.home.BotListFragment) r0
            X.0vl r0 = r0.A04
        L_0x0819:
            com.whatsapp.bot.home.AiHomeViewModel r0 = X.C108945cZ.A0b(r0)
            X.1DT r0 = r0.A02
            r0.A0F(r2)
            return
        L_0x0823:
            com.whatsapp.bot.home.AiHomeFragment r0 = (com.whatsapp.bot.home.AiHomeFragment) r0
            X.0vl r0 = r0.A04
            goto L_0x0819
        L_0x0828:
            java.lang.Object r2 = r14.A01
            X.5vx r2 = (X.C115865vx) r2
            java.lang.Object r1 = r14.A02
            X.7Cq r1 = (X.C143247Cq) r1
            java.util.List r0 = X.C42011xT.A0I
            X.86c r0 = r2.A01
            X.7Cr r1 = r1.A00
            X.7D2 r0 = (X.AnonymousClass7D2) r0
            java.lang.Object r0 = r0.A01
            com.whatsapp.bot.home.AiHomeFragment r0 = (com.whatsapp.bot.home.AiHomeFragment) r0
            X.0vl r0 = r0.A04
            com.whatsapp.bot.home.AiHomeViewModel r0 = X.C108945cZ.A0b(r0)
            X.1DT r0 = r0.A06
            r0.A0F(r1)
            return
        L_0x0848:
            java.lang.Object r1 = r14.A01
            X.A7p r1 = (X.C20109A7p) r1
            java.lang.Object r3 = r14.A02
            X.8wY r3 = (X.C174298wY) r3
            android.view.View r0 = r1.A00
            X.AF0 r2 = r3.A0B
            X.9og r1 = r1.A0G
            android.app.Activity r0 = X.AnonymousClass3Ma.A05(r0)
            r1.A00(r0, r2)
            X.BAb r0 = r3.A08
            r0.ByL()
            return
        L_0x0863:
            java.lang.Object r1 = r14.A01     // Catch:{ ActivityNotFoundException -> 0x086f }
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ ActivityNotFoundException -> 0x086f }
            java.lang.Object r0 = r14.A02     // Catch:{ ActivityNotFoundException -> 0x086f }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ ActivityNotFoundException -> 0x086f }
            r1.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x086f }
            return
        L_0x086f:
            r2 = move-exception
            java.lang.String r1 = "DeferredLifecycleHelper"
            java.lang.String r0 = "Failed to start resolution intent"
            android.util.Log.e(r1, r0, r2)
            return
        L_0x0878:
            java.lang.String r0 = r3.A00     // Catch:{ NullPointerException | SecurityException -> 0x088a }
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r0)     // Catch:{ NullPointerException | SecurityException -> 0x088a }
            r1.setPrimaryClip(r0)     // Catch:{ NullPointerException | SecurityException -> 0x088a }
            X.1KB r1 = r4.A05     // Catch:{ NullPointerException | SecurityException -> 0x088a }
            r0 = 2131891618(0x7f1215a2, float:1.9417961E38)
            r1.A08(r0, r2)     // Catch:{ NullPointerException | SecurityException -> 0x088a }
            return
        L_0x088a:
            r1 = move-exception
            java.lang.String r0 = "sharelinkactivity/copylink/npe"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0890:
            X.1KB r1 = r4.A05
            r0 = 2131897878(0x7f122e16, float:1.9430658E38)
            r1.A08(r0, r2)
            return
        L_0x0899:
            java.lang.String r11 = X.C108985cd.A0f()
            java.lang.String r0 = "NativeFlowActionUtils/sendWamEvent: message was null, can't send event"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.8nz r5 = (X.AnonymousClass8nz) r5
            r12 = -1
            r5.A0H(r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78Q.onClick(android.view.View):void");
    }

    public AnonymousClass78Q(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
