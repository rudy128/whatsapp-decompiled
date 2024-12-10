package X;

/* renamed from: X.AkJ  reason: case insensitive filesystem */
public class C21452AkJ implements Runnable {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C21452AkJ(int i, String str, Object obj) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public static void A00(AnonymousClass10I r1, Object obj, String str, int i) {
        r1.CGF(new C21452AkJ(i, str, obj));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.1mw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: X.9tj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: X.9tj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v148, resolved type: X.9tj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: X.9tj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v106, resolved type: X.6wa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v139, resolved type: X.1mw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v140, resolved type: X.1mw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v141, resolved type: X.1mw} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (X.AnonymousClass8BR.A1T(X.C20078A6e.A08, r4.A0B) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        r3 = r6.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0737, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x073b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x073e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x073f, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0742, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x08af, code lost:
        r1.append(r0);
        r1.append(r5);
        r1 = X.AnonymousClass000.A0y(";", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x08bd, code lost:
        if (r2.A0E != null) goto L_0x08c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x08bf, code lost:
        r2.A0E = X.AnonymousClass000.A10();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x08c5, code lost:
        r2.A0E.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x08ca, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a4, code lost:
        r3.A00(r1, new X.AnonymousClass482(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:?, code lost:
        r6.A09.put(X.AnonymousClass9OL.A00(r4), r4);
        r6.A08.put(X.AnonymousClass9OL.A00(r4), X.C197029w2.A00(r6, r6.A04, r4, ((X.C20367AHx) r6.A05).A03));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0aa9, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0aaa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r5 = r21
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x03a1;
                case 1: goto L_0x03b9;
                case 2: goto L_0x0015;
                case 3: goto L_0x004b;
                case 4: goto L_0x0077;
                case 5: goto L_0x0091;
                case 6: goto L_0x00ad;
                case 7: goto L_0x00c9;
                case 8: goto L_0x00e5;
                case 9: goto L_0x0447;
                case 10: goto L_0x04b3;
                case 11: goto L_0x0101;
                case 12: goto L_0x04be;
                case 13: goto L_0x0116;
                case 14: goto L_0x01ae;
                case 15: goto L_0x04cf;
                case 16: goto L_0x04f6;
                case 17: goto L_0x050a;
                case 18: goto L_0x0536;
                case 19: goto L_0x0552;
                case 20: goto L_0x055d;
                case 21: goto L_0x01db;
                case 22: goto L_0x057a;
                case 23: goto L_0x01ef;
                case 24: goto L_0x05e6;
                case 25: goto L_0x0602;
                case 26: goto L_0x0200;
                case 27: goto L_0x0282;
                case 28: goto L_0x0611;
                case 29: goto L_0x0743;
                case 30: goto L_0x077c;
                case 31: goto L_0x0795;
                case 32: goto L_0x07a9;
                case 33: goto L_0x028e;
                case 34: goto L_0x02a6;
                case 35: goto L_0x07b6;
                case 36: goto L_0x07e5;
                case 37: goto L_0x081c;
                case 38: goto L_0x083b;
                case 39: goto L_0x02f8;
                case 40: goto L_0x0854;
                case 41: goto L_0x085e;
                case 42: goto L_0x0868;
                case 43: goto L_0x0371;
                case 44: goto L_0x088c;
                case 45: goto L_0x08cb;
                case 46: goto L_0x0386;
                case 47: goto L_0x08d5;
                case 48: goto L_0x08e1;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r5.A01
            X.4WT r0 = (X.AnonymousClass4WT) r0
            java.lang.String r1 = r5.A02
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r0 = r0.A00
            X.1mv r0 = r0.A05
            r0.A02(r1)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r6 = r5.A01
            X.AHi r6 = (X.C20352AHi) r6
            X.A7W r0 = r6.A00
            X.AHp r3 = r0.A03
            java.lang.String r2 = r5.A02
            java.lang.Object r1 = r3.A09
            monitor-enter(r1)
            java.util.Map r0 = r3.A05     // Catch:{ all -> 0x0aae }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0aae }
            X.Aka r0 = (X.C21469Aka) r0     // Catch:{ all -> 0x0aae }
            if (r0 != 0) goto L_0x0039
            java.util.Map r0 = r3.A04     // Catch:{ all -> 0x0aae }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0aae }
            X.Aka r0 = (X.C21469Aka) r0     // Catch:{ all -> 0x0aae }
            if (r0 != 0) goto L_0x0039
            monitor-exit(r1)     // Catch:{ all -> 0x0aae }
            goto L_0x0a8a
        L_0x0039:
            X.A2t r4 = r0.A08     // Catch:{ all -> 0x0aae }
            monitor-exit(r1)     // Catch:{ all -> 0x0aae }
            X.A6e r1 = X.C20078A6e.A08
            X.A6e r0 = r4.A0B
            boolean r0 = X.AnonymousClass8BR.A1T(r1, r0)
            if (r0 == 0) goto L_0x0014
            java.lang.Object r3 = r6.A06
            monitor-enter(r3)
            goto L_0x0a8b
        L_0x004b:
            java.lang.String r1 = r5.A02
            java.lang.Object r2 = r5.A01
            java.util.Map r0 = X.CEH.A00
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0014
            java.util.Iterator r1 = r0.iterator()
        L_0x005d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            boolean r0 = X.C18070vi.A18(r0, r2)
            if (r0 == 0) goto L_0x005d
            r1.remove()
            return
        L_0x0077:
            java.lang.Object r0 = r5.A01
            com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceListenerWrapper r0 = (com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceListenerWrapper) r0
            X.9cb r2 = r0.mListener
            if (r2 == 0) goto L_0x0014
            java.lang.String r1 = r5.A02
            X.C17960vV.A02()
            java.util.Map r0 = r2.A02
            java.lang.String r4 = X.C17880vN.A0s(r1, r0)
            if (r4 == 0) goto L_0x0014
            X.4Pe r3 = r2.A01
            X.4DE r1 = r2.A00
            goto L_0x00a4
        L_0x0091:
            java.lang.Object r0 = r5.A01
            com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceListenerWrapper r0 = (com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceListenerWrapper) r0
            X.9cb r0 = r0.mListener
            if (r0 == 0) goto L_0x0014
            java.lang.String r4 = r5.A02
            X.C17960vV.A02()
            if (r4 == 0) goto L_0x0014
            X.4Pe r3 = r0.A01
            X.4DE r1 = r0.A00
        L_0x00a4:
            X.482 r0 = new X.482
            r0.<init>(r4)
            r3.A00(r1, r0)
            return
        L_0x00ad:
            java.lang.Object r0 = r5.A01
            X.CXw r0 = (X.C25103CXw) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x00b7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = r2.next()
            X.BCw r1 = (X.BCw) r1
            java.lang.String r0 = r5.A02
            r1.BzW(r0)
            goto L_0x00b7
        L_0x00c9:
            java.lang.Object r0 = r5.A01
            X.CXw r0 = (X.C25103CXw) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x00d3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = r2.next()
            X.BCw r1 = (X.BCw) r1
            java.lang.String r0 = r5.A02
            r1.C2v(r0)
            goto L_0x00d3
        L_0x00e5:
            java.lang.Object r0 = r5.A01
            X.CXw r0 = (X.C25103CXw) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x00ef:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = r2.next()
            X.BCw r1 = (X.BCw) r1
            java.lang.String r0 = r5.A02
            r1.Bt0(r0)
            goto L_0x00ef
        L_0x0101:
            java.lang.Object r0 = r5.A01
            X.1KB r0 = (X.AnonymousClass1KB) r0
            java.lang.String r2 = r5.A02
            android.content.Context r1 = X.AnonymousClass1KB.A00(r0)
            if (r1 == 0) goto L_0x0014
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r2, r0)
            r0.show()
            return
        L_0x0116:
            java.lang.Object r6 = r5.A01
            X.1Zk r6 = (X.C28221Zk) r6
            java.lang.String r4 = r5.A02
            com.google.android.material.button.MaterialButton r0 = r6.A05()
            if (r0 == 0) goto L_0x0014
            com.google.android.material.button.MaterialButton r0 = r6.A05()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0014
            com.google.android.material.button.MaterialButton r0 = r6.A05()
            android.view.ViewParent r3 = r0.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            X.1ba r2 = new X.1ba
            r2.<init>()
            com.google.android.material.button.MaterialButton r0 = r6.A05()
            r2.A0E(r0)
            r0 = 300(0x12c, double:1.48E-321)
            r2.A0C(r0)
            X.C29191bl.A02(r3, r2)
            com.google.android.material.button.MaterialButton r0 = r6.A05()
            r0.setText(r4)
            com.google.android.material.button.MaterialButton r0 = r6.A05()
            android.content.res.Resources r5 = X.AnonymousClass000.A0Y(r0)
            X.0vb r0 = r6.A0B
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            com.google.android.material.button.MaterialButton r4 = r6.A05()
            if (r0 == 0) goto L_0x0196
            com.google.android.material.button.MaterialButton r0 = r6.A05()
            int r3 = r0.getPaddingLeft()
            com.google.android.material.button.MaterialButton r0 = r6.A05()
            int r2 = r0.getPaddingTop()
            r0 = 2131168778(0x7f070e0a, float:1.7951867E38)
            int r1 = r5.getDimensionPixelSize(r0)
        L_0x017c:
            com.google.android.material.button.MaterialButton r0 = r6.A05()
            int r0 = r0.getPaddingBottom()
            r4.setPadding(r3, r2, r1, r0)
            com.google.android.material.button.MaterialButton r1 = r6.A05()
            r0 = 2131168777(0x7f070e09, float:1.7951865E38)
            int r0 = r5.getDimensionPixelSize(r0)
            r1.setIconPadding(r0)
            return
        L_0x0196:
            r0 = 2131168778(0x7f070e0a, float:1.7951867E38)
            int r3 = r5.getDimensionPixelSize(r0)
            com.google.android.material.button.MaterialButton r0 = r6.A05()
            int r2 = r0.getPaddingTop()
            com.google.android.material.button.MaterialButton r0 = r6.A05()
            int r1 = r0.getPaddingRight()
            goto L_0x017c
        L_0x01ae:
            java.lang.Object r1 = r5.A01
            X.9AZ r1 = (X.AnonymousClass9AZ) r1
            java.lang.String r4 = r5.A02
            java.util.Map r0 = r1.A03
            java.lang.Object r3 = r0.get(r4)
            X.9uU r3 = (X.C196119uU) r3
            if (r3 == 0) goto L_0x0014
            com.facebook.stash.core.FileStash r2 = r1.A00
            if (r2 == 0) goto L_0x0aca
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.C17970vW.A04(r4)
            r1.append(r0)
            java.lang.String r0 = ".json"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.io.File r2 = r2.insertFile(r0)
            if (r2 == 0) goto L_0x0aca
            goto L_0x0ab1
        L_0x01db:
            java.lang.Object r2 = r5.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r2 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r2
            java.lang.String r1 = r5.A02
            boolean r0 = com.whatsapp.backup.google.RestoreFromBackupActivity.A19(r2)
            if (r0 != 0) goto L_0x0014
            com.whatsapp.wds.components.textlayout.WDSTextLayout r0 = X.AnonymousClass8BV.A0P(r2)
            r0.setFootnoteText(r1)
            return
        L_0x01ef:
            java.lang.Object r2 = r5.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r2 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r2
            java.lang.String r0 = r5.A02
            r1 = 1
            boolean r0 = com.whatsapp.backup.google.RestoreFromBackupActivity.A1B(r2, r0, r1)
            if (r0 == 0) goto L_0x0014
            com.whatsapp.backup.google.RestoreFromBackupActivity.A14(r2, r1)
            return
        L_0x0200:
            java.lang.Object r7 = r5.A01
            X.2fP r7 = (X.C55212fP) r7
            java.lang.String r5 = r5.A02
            X.00H r6 = r7.A03
            java.lang.Object r8 = r6.get()
            X.6wa r8 = (X.C138136wa) r8
            monitor-enter(r8)
            X.C17960vV.A00()     // Catch:{ all -> 0x0af6 }
            X.0vl r10 = r8.A01     // Catch:{ all -> 0x0af6 }
            java.util.Map r0 = X.AnonymousClass3MW.A12(r10)     // Catch:{ all -> 0x0af6 }
            java.lang.Object r9 = r0.get(r5)     // Catch:{ all -> 0x0af6 }
            if (r9 != 0) goto L_0x0226
            java.util.ArrayDeque r9 = new java.util.ArrayDeque     // Catch:{ all -> 0x0af6 }
            r9.<init>()     // Catch:{ all -> 0x0af6 }
            r0.put(r5, r9)     // Catch:{ all -> 0x0af6 }
        L_0x0226:
            java.util.Queue r9 = (java.util.Queue) r9     // Catch:{ all -> 0x0af6 }
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0af6 }
        L_0x022c:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x0af6 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x024d
            java.lang.Object r2 = r9.peek()     // Catch:{ all -> 0x0af6 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0af6 }
            if (r2 == 0) goto L_0x024d
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r3 = r11 - r0
            long r1 = r2.longValue()     // Catch:{ all -> 0x0af6 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x024d
            r9.poll()     // Catch:{ all -> 0x0af6 }
            goto L_0x022c
        L_0x024d:
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0af6 }
            r9.add(r0)     // Catch:{ all -> 0x0af6 }
            java.util.Map r0 = X.AnonymousClass3MW.A12(r10)     // Catch:{ all -> 0x0af6 }
            r0.put(r5, r9)     // Catch:{ all -> 0x0af6 }
            X.C138136wa.A00(r8)     // Catch:{ all -> 0x0af6 }
            int r1 = r9.size()     // Catch:{ all -> 0x0af6 }
            monitor-exit(r8)
            r0 = 10
            if (r1 < r0) goto L_0x0014
            X.00H r0 = r7.A04
            java.lang.Object r1 = r0.get()
            X.18K r1 = (X.AnonymousClass18K) r1
            X.8qb r0 = new X.8qb
            r0.<init>()
            r0.A00 = r5
            r1.CC7(r0)
            java.lang.Object r1 = r6.get()
            X.6wa r1 = (X.C138136wa) r1
            monitor-enter(r1)
            goto L_0x0ae5
        L_0x0282:
            java.lang.Object r0 = r5.A01
            X.Acf r0 = (X.C20987Acf) r0
            X.1nW r0 = r0.A00
            if (r0 == 0) goto L_0x0014
            r0.BvB()
            return
        L_0x028e:
            java.lang.Object r3 = r5.A01
            X.8qR r3 = (X.C170648qR) r3
            java.lang.String r2 = "daily_cron_job"
            r1 = 0
            boolean r0 = r3.A0C()
            if (r0 == 0) goto L_0x02a1
            boolean r0 = r3.A0D()
            if (r0 != 0) goto L_0x0014
        L_0x02a1:
            r0 = 1
            r3.A0B(r1, r2, r0)
            return
        L_0x02a6:
            java.lang.Object r4 = r5.A01
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel r4 = (com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel) r4
            java.lang.String r3 = r5.A02
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel.A00(r4)     // Catch:{ Exception -> 0x0014 }
            android.media.MediaPlayer r1 = new android.media.MediaPlayer     // Catch:{ Exception -> 0x02f3 }
            r1.<init>()     // Catch:{ Exception -> 0x02f3 }
            r4.A00 = r1     // Catch:{ Exception -> 0x02f3 }
            android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder     // Catch:{ Exception -> 0x02f3 }
            r0.<init>()     // Catch:{ Exception -> 0x02f3 }
            r2 = 1
            android.media.AudioAttributes$Builder r0 = r0.setUsage(r2)     // Catch:{ Exception -> 0x02f3 }
            android.media.AudioAttributes$Builder r0 = r0.setContentType(r2)     // Catch:{ Exception -> 0x02f3 }
            android.media.AudioAttributes r0 = r0.build()     // Catch:{ Exception -> 0x02f3 }
            r1.setAudioAttributes(r0)     // Catch:{ Exception -> 0x02f3 }
            android.media.MediaPlayer r0 = r4.A00     // Catch:{ Exception -> 0x02f3 }
            if (r0 == 0) goto L_0x02d2
            r0.setDataSource(r3)     // Catch:{ Exception -> 0x02f3 }
        L_0x02d2:
            android.media.MediaPlayer r0 = r4.A00     // Catch:{ Exception -> 0x02f3 }
            if (r0 == 0) goto L_0x02d9
            r0.prepareAsync()     // Catch:{ Exception -> 0x02f3 }
        L_0x02d9:
            android.media.MediaPlayer r1 = r4.A00     // Catch:{ Exception -> 0x0014 }
            if (r1 == 0) goto L_0x02e5
            X.75U r0 = new X.75U     // Catch:{ Exception -> 0x0014 }
            r0.<init>(r4, r2)     // Catch:{ Exception -> 0x0014 }
            r1.setOnPreparedListener(r0)     // Catch:{ Exception -> 0x0014 }
        L_0x02e5:
            android.media.MediaPlayer r1 = r4.A00     // Catch:{ Exception -> 0x0014 }
            if (r1 == 0) goto L_0x0014
            X.75Q r0 = new X.75Q     // Catch:{ Exception -> 0x0014 }
            r0.<init>(r4, r2)     // Catch:{ Exception -> 0x0014 }
            r1.setOnCompletionListener(r0)     // Catch:{ Exception -> 0x0014 }
            goto L_0x0af9
        L_0x02f3:
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel.A00(r4)     // Catch:{ Exception -> 0x0014 }
            goto L_0x0afa
        L_0x02f8:
            java.lang.Object r4 = r5.A01
            X.9sx r4 = (X.C195199sx) r4
            java.lang.String r5 = r5.A02
            X.0ve r8 = r4.A04
            r7 = 8175(0x1fef, float:1.1456E-41)
            X.0vf r6 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r6, r8, r7)
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x0334
            X.6uK r1 = r4.A03
            if (r1 == 0) goto L_0x036b
            r1.A00()
            long r2 = r1.A00
            X.9qW r0 = new X.9qW
            r0.<init>(r5, r2)
            r4.A01 = r0
            r1.A01()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoipUXResponsivenessLogger endCallStartMarker ended: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " ms"
            X.C17890vO.A1A(r1, r0)
        L_0x0331:
            r0 = 0
            r4.A03 = r0
        L_0x0334:
            int r0 = X.C18020vd.A00(r6, r8, r7)
            r1 = 4
            r0 = r0 & 4
            if (r0 != r1) goto L_0x0014
            X.6uK r1 = r4.A02
            if (r1 == 0) goto L_0x0365
            r1.A00()
            long r2 = r1.A00
            X.9qW r0 = new X.9qW
            r0.<init>(r5, r2)
            r4.A00 = r0
            r1.A01()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoipUXResponsivenessLogger endCallAnswerMarker ended: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " ms"
            X.C17890vO.A1A(r1, r0)
        L_0x0361:
            r0 = 0
            r4.A02 = r0
            return
        L_0x0365:
            java.lang.String r0 = "VoipUXResponsivenessLogger/endCallAnswerMarker tracking not started"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0361
        L_0x036b:
            java.lang.String r0 = "VoipUXResponsivenessLogger/endCallStartMarker tracking not started"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0331
        L_0x0371:
            java.lang.Object r0 = r5.A01
            X.A99 r0 = (X.A99) r0
            java.lang.String r1 = r5.A02
            X.11S r0 = r0.A23
            if (r0 == 0) goto L_0x0014
            r0.A0I()
            X.1E8 r0 = r0.A0D
            if (r0 == 0) goto L_0x0014
            com.whatsapp.voipcalling.Voip.timeoutPendingCall(r1)
            return
        L_0x0386:
            java.lang.Object r1 = r5.A01
            X.7DY r1 = (X.AnonymousClass7DY) r1
            java.lang.String r4 = r5.A02
            X.6zG r2 = r1.A1K
            r5 = 1
            r7 = 0
            r3 = 0
            r6 = r5
            boolean r0 = r2.A02(r3, r4, r5, r6, r7)
            if (r0 != 0) goto L_0x0014
            X.1KB r1 = r1.A0y
            r0 = 2131888841(0x7f120ac9, float:1.9412329E38)
            r1.A08(r0, r5)
            return
        L_0x03a1:
            java.lang.String r3 = r5.A02
            java.lang.Object r2 = r5.A01
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            X.1kE r0 = X.C34281kE.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Policy violation with PENALTY_DEATH in "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r3, r1)
            java.lang.String r0 = "FragmentStrictMode"
            android.util.Log.e(r0, r1, r2)
            throw r2
        L_0x03b9:
            java.lang.Object r6 = r5.A01     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            X.Aka r6 = (X.C21469Aka) r6     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            X.5oM r0 = r6.A0F     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            java.lang.Object r4 = r0.get()     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            X.9Lg r4 = (X.C180129Lg) r4     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            if (r4 != 0) goto L_0x03e2
            X.A5Z r3 = X.A5Z.A00()     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            java.lang.String r2 = X.C21469Aka.A0I     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            X.A2t r0 = r6.A08     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            java.lang.String r0 = r0.A0I     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            r1.append(r0)     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            java.lang.String r0 = " returned a null result. Treating it as a failure."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            r3.A04(r2, r0)     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            goto L_0x0436
        L_0x03e2:
            X.A5Z r3 = X.A5Z.A00()     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            java.lang.String r2 = X.C21469Aka.A0I     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            X.A2t r0 = r6.A08     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            java.lang.String r0 = r0.A0I     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            r1.append(r0)     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            java.lang.String r0 = " returned a "
            r1.append(r0)     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            r1.append(r4)     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            java.lang.String r0 = "."
            X.AnonymousClass8BW.A16(r3, r0, r2, r1)     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            r6.A02 = r4     // Catch:{ CancellationException -> 0x041d, InterruptedException | ExecutionException -> 0x0403 }
            goto L_0x0436
        L_0x0403:
            r4 = move-exception
            X.A5Z r3 = X.A5Z.A00()     // Catch:{ all -> 0x043e }
            java.lang.String r2 = X.C21469Aka.A0I     // Catch:{ all -> 0x043e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x043e }
            java.lang.String r0 = r5.A02     // Catch:{ all -> 0x043e }
            r1.append(r0)     // Catch:{ all -> 0x043e }
            java.lang.String r0 = " failed because it threw an exception/error"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x043e }
            r3.A08(r2, r0, r4)     // Catch:{ all -> 0x043e }
            goto L_0x0436
        L_0x041d:
            r4 = move-exception
            X.A5Z r3 = X.A5Z.A00()     // Catch:{ all -> 0x043e }
            java.lang.String r2 = X.C21469Aka.A0I     // Catch:{ all -> 0x043e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x043e }
            java.lang.String r0 = r5.A02     // Catch:{ all -> 0x043e }
            r1.append(r0)     // Catch:{ all -> 0x043e }
            java.lang.String r0 = " was cancelled"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x043e }
            r3.A09(r2, r0, r4)     // Catch:{ all -> 0x043e }
        L_0x0436:
            java.lang.Object r0 = r5.A01
            X.Aka r0 = (X.C21469Aka) r0
            r0.A03()
            return
        L_0x043e:
            r1 = move-exception
            java.lang.Object r0 = r5.A01
            X.Aka r0 = (X.C21469Aka) r0
            r0.A03()
            throw r1
        L_0x0447:
            java.lang.Object r4 = r5.A01
            X.8RI r4 = (X.AnonymousClass8RI) r4
            java.lang.String r5 = r5.A02
            com.google.android.material.textfield.TextInputLayout r7 = r4.A02
            java.text.DateFormat r10 = r4.A05
            android.content.Context r12 = r7.getContext()
            r0 = 2131899215(0x7f12334f, float:1.943337E38)
            java.lang.String r11 = r12.getString(r0)
            r0 = 2131899217(0x7f123351, float:1.9433374E38)
            java.lang.String r3 = r12.getString(r0)
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r9 = 32
            r8 = 160(0xa0, float:2.24E-43)
            java.lang.String r0 = r5.replace(r9, r8)
            r6 = 0
            java.lang.String r5 = X.AnonymousClass8BS.A0l(r0, r3, r1, r6)
            r0 = 2131899216(0x7f123350, float:1.9433372E38)
            java.lang.String r3 = r12.getString(r0)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.util.Calendar r0 = X.A8Y.A05()
            long r0 = r0.getTimeInMillis()
            java.lang.String r0 = X.AnonymousClass8BU.A0r(r10, r0)
            java.lang.String r0 = r0.replace(r9, r8)
            java.lang.String r2 = X.AnonymousClass8BS.A0l(r0, r3, r2, r6)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r11)
            java.lang.String r0 = "\n"
            r1.append(r0)
            X.C17890vO.A10(r5, r0, r2, r1)
            java.lang.String r0 = r1.toString()
            r7.setError(r0)
            X.AJN r1 = r4.A07
            com.google.android.material.textfield.TextInputLayout r0 = r4.A08
            java.lang.CharSequence r0 = r0.getError()
            r1.A00 = r0
            X.9Nt r0 = r4.A06
            r0.A00()
            return
        L_0x04b3:
            java.lang.Object r2 = r5.A01
            X.2n7 r2 = (X.C59932n7) r2
            java.lang.String r1 = r5.A02
            r0 = 0
            r2.A02(r1, r0)
            return
        L_0x04be:
            java.lang.Object r3 = r5.A01
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            java.lang.String r2 = r5.A02
            r1 = 2000(0x7d0, float:2.803E-42)
            r0 = 0
            X.4eK r0 = r3.A4n(r2, r1, r0)
            r0.A03()
            return
        L_0x04cf:
            java.lang.Object r4 = r5.A01
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r4 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r4
            java.lang.String r1 = r5.A02
            X.1eh r0 = r4.A05
            if (r0 == 0) goto L_0x04ef
            java.lang.String r0 = r0.A02()
            boolean r3 = X.C18070vi.A18(r0, r1)
            X.1KB r2 = r4.A2H()
            r1 = 5
            X.7RK r0 = new X.7RK
            r0.<init>((int) r1, (java.lang.Object) r4, (boolean) r3)
            r2.A0J(r0)
            return
        L_0x04ef:
            java.lang.String r0 = "twoFactorAuthManager"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x04f6:
            java.lang.Object r0 = r5.A01
            X.9hw r0 = (X.C188759hw) r0
            java.lang.String r2 = r5.A02
            X.00H r0 = r0.A0G
            java.lang.Object r1 = r0.get()
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r1 = (com.whatsapp.stickers.stickerpack.StickerPackDownloader) r1
            java.lang.String r0 = "avatar deleted"
            r1.A03(r2, r0)
            return
        L_0x050a:
            java.lang.Object r4 = r5.A01
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r4 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r4
            java.lang.String r3 = r5.A02
            X.1NT r2 = r4.A0F
            int r1 = r3.length()
            r0 = 64
            if (r1 == r0) goto L_0x051f
            r0 = 0
        L_0x051b:
            r4.A0b(r0)
            return
        L_0x051f:
            byte[] r1 = X.AnonymousClass1EG.A0J(r3)     // Catch:{ IllegalArgumentException -> 0x052e }
            X.1NO r0 = r2.A02
            byte[] r0 = r0.A03()
            boolean r0 = java.util.Arrays.equals(r1, r0)
            goto L_0x051b
        L_0x052e:
            r1 = move-exception
            java.lang.String r0 = "encb/EncBackupManager/verifyRootKeyStr/key contains invalid hex characters"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            goto L_0x051b
        L_0x0536:
            java.lang.Object r3 = r5.A01
            X.8gR r3 = (X.C167498gR) r3
            java.lang.String r2 = r5.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "settings-gdrive/auth-request unable to access "
            X.C17900vP.A0e(r0, r2, r1)
            r0 = 2131895899(0x7f12265b, float:1.9426644E38)
            r3.BhQ(r0)
            com.whatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel r1 = r3.A05
            r0 = 0
            r1.A0T(r0)
            return
        L_0x0552:
            java.lang.Object r2 = r5.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r2 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r2
            java.lang.String r1 = r5.A02
            r0 = 4
            com.whatsapp.backup.google.RestoreFromBackupActivity.A1B(r2, r1, r0)
            return
        L_0x055d:
            java.lang.Object r3 = r5.A01
            X.1FU r3 = (X.AnonymousClass1FU) r3
            java.lang.String r2 = r5.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/auth-request/unable to access "
            r1.append(r0)
            java.lang.String r0 = X.C41361wE.A08(r2)
            X.C17890vO.A19(r1, r0)
            r0 = 2131895899(0x7f12265b, float:1.9426644E38)
            r3.BhQ(r0)
            return
        L_0x057a:
            java.lang.Object r10 = r5.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r10 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r10
            java.lang.String r3 = r5.A02
            X.118 r0 = r10.A0H
            android.content.Context r0 = r0.A00
            android.accounts.Account[] r5 = X.C41371wF.A01(r0)
            int r2 = r5.length
            r1 = 0
        L_0x058a:
            r4 = 1
            if (r1 >= r2) goto L_0x059e
            r0 = r5[r1]
            java.lang.String r0 = r0.name
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto L_0x059b
            com.whatsapp.backup.google.RestoreFromBackupActivity.A1B(r10, r3, r4)
            return
        L_0x059b:
            int r1 = r1 + 1
            goto L_0x058a
        L_0x059e:
            android.accounts.AccountManager r5 = android.accounts.AccountManager.get(r10)
            r7 = 0
            java.lang.String r6 = "com.google"
            r9 = r7
            r11 = r7
            r12 = r7
            r8 = r7
            android.accounts.AccountManagerFuture r0 = r5.addAccount(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r1 = r0.getResult()     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0ac3 }
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0ac3 }
            java.lang.String r0 = "authAccount"
            java.lang.String r2 = r1.getString(r0)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0ac3 }
            if (r2 != 0) goto L_0x05c1
            java.lang.String r0 = "restore>RestoreFromBackupActivity/error-during-msgstore-download/account-manager-returned-with-no-account-name"
        L_0x05bd:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0ac3 }
            goto L_0x05da
        L_0x05c1:
            boolean r0 = r2.equals(r3)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0ac3 }
            if (r0 != 0) goto L_0x05db
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0ac3 }
            java.lang.String r0 = "restore>RestoreFromBackupActivity/error-during-msgstore-download/account-manager user added "
            X.AnonymousClass8BV.A1L(r0, r2, r1)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0ac3 }
            java.lang.String r0 = " instead of "
            X.AnonymousClass8BV.A1L(r0, r3, r1)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0ac3 }
            java.lang.String r0 = r1.toString()     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0ac3 }
            goto L_0x05bd
        L_0x05da:
            return
        L_0x05db:
            X.1KB r1 = r10.A05     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0ac3 }
            r0 = 39
            X.C21457AkO.A00(r1, r10, r0)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0ac3 }
            com.whatsapp.backup.google.RestoreFromBackupActivity.A1B(r10, r3, r4)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0ac3 }
            return
        L_0x05e6:
            java.lang.Object r3 = r5.A01
            com.whatsapp.backup.google.SettingsGoogleDrive r3 = (com.whatsapp.backup.google.SettingsGoogleDrive) r3
            java.lang.String r2 = r5.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "settings-gdrive/auth-request unable to access "
            X.C17900vP.A0e(r0, r2, r1)
            r0 = 2131895899(0x7f12265b, float:1.9426644E38)
            r3.BhQ(r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r1 = r3.A0P
            r0 = 0
            r1.A0V(r0)
            return
        L_0x0602:
            java.lang.Object r2 = r5.A01
            X.1dJ r2 = (X.C30051dJ) r2
            java.lang.String r1 = r5.A02
            r0 = 0
            r2.A0A = r0
            java.lang.String r0 = "foreground"
            X.C30051dJ.A00(r2, r0, r1)
            return
        L_0x0611:
            java.lang.Object r4 = r5.A01
            X.9yn r4 = (X.C198719yn) r4
            java.lang.String r8 = r5.A02
            X.A7x r0 = r4.A06
            com.whatsapp.jid.UserJid r5 = r4.A09
            X.9yf r0 = X.A76.A00(r0, r5)
            if (r0 == 0) goto L_0x0667
            java.util.List r0 = r0.A04
            r3 = 0
            if (r0 == 0) goto L_0x0667
            java.util.Iterator r7 = r0.iterator()
        L_0x062a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0652
            java.lang.Object r6 = r7.next()
            r0 = r6
            X.9tj r0 = (X.C195679tj) r0
            java.lang.String r0 = r0.A06
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r0)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = X.AnonymousClass8BS.A0p(r2, r0)
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r8)
            java.lang.String r0 = X.AnonymousClass8BS.A0p(r2, r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x062a
            r3 = r6
        L_0x0652:
            X.9tj r3 = (X.C195679tj) r3
            if (r3 == 0) goto L_0x0667
            X.9k2 r2 = r4.A05
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.util.Date r11 = r3.A08
            if (r11 == 0) goto L_0x066f
            boolean r0 = r11.before(r1)
            if (r0 != 0) goto L_0x066f
        L_0x0667:
            X.1wy r1 = r4.A0A
            X.8i4 r0 = X.C167968i4.A00
        L_0x066b:
            r1.A0E(r0)
            return
        L_0x066f:
            java.util.Date r10 = r3.A07
            if (r10 == 0) goto L_0x067a
            boolean r0 = r10.after(r1)
            if (r0 != 0) goto L_0x067a
            goto L_0x0667
        L_0x067a:
            X.8i3 r0 = r2.A00(r3, r5)
            if (r0 == 0) goto L_0x0683
            X.1wy r1 = r4.A0A
            goto L_0x066b
        L_0x0683:
            X.9k1 r1 = r4.A04
            r7 = 0
            r8 = 1
            X.4S5 r0 = r1.A01
            com.whatsapp.jid.UserJid r6 = r0.A00(r5)
            X.9or r0 = r1.A00
            X.8ov r0 = r0.A00()
            X.1au r2 = r0.A06()
            X.1xA r5 = r2.BD0()     // Catch:{ all -> 0x073c }
            android.content.ContentValues r12 = X.C17880vN.A08()     // Catch:{ all -> 0x0735 }
            java.lang.String r1 = "business_id"
            java.lang.String r0 = r6.getRawString()     // Catch:{ all -> 0x0735 }
            r12.put(r1, r0)     // Catch:{ all -> 0x0735 }
            java.lang.String r1 = "promotion_id"
            java.lang.String r0 = r3.A06     // Catch:{ all -> 0x0735 }
            r12.put(r1, r0)     // Catch:{ all -> 0x0735 }
            java.lang.String r1 = "promotion_name"
            java.lang.String r0 = r3.A05     // Catch:{ all -> 0x0735 }
            r12.put(r1, r0)     // Catch:{ all -> 0x0735 }
            java.lang.String r1 = "promotion_discount"
            java.lang.String r0 = r3.A03     // Catch:{ all -> 0x0735 }
            r12.put(r1, r0)     // Catch:{ all -> 0x0735 }
            int r9 = r3.A00     // Catch:{ all -> 0x0735 }
            r1 = 1
            if (r9 == r8) goto L_0x06c6
            r0 = 2
            if (r9 != r0) goto L_0x06c6
            r1 = 2
        L_0x06c6:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0735 }
            java.lang.String r0 = "promotion_discount_type"
            r12.put(r0, r1)     // Catch:{ all -> 0x0735 }
            long r0 = r3.A01     // Catch:{ all -> 0x0735 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0735 }
            java.lang.String r0 = "promotion_minimum_cart_price"
            r12.put(r0, r1)     // Catch:{ all -> 0x0735 }
            r9 = 0
            if (r11 == 0) goto L_0x06de
            goto L_0x06e0
        L_0x06de:
            r1 = r9
            goto L_0x06e4
        L_0x06e0:
            java.lang.Long r1 = X.AnonymousClass8BU.A0m(r11)     // Catch:{ all -> 0x0735 }
        L_0x06e4:
            java.lang.String r0 = "promotion_start_date"
            r12.put(r0, r1)     // Catch:{ all -> 0x0735 }
            if (r10 == 0) goto L_0x06ef
            java.lang.Long r9 = X.AnonymousClass8BU.A0m(r10)     // Catch:{ all -> 0x0735 }
        L_0x06ef:
            java.lang.String r0 = "promotion_end_date"
            r12.put(r0, r9)     // Catch:{ all -> 0x0735 }
            java.lang.String r1 = "promotion_description"
            java.lang.String r0 = r3.A02     // Catch:{ all -> 0x0735 }
            r12.put(r1, r0)     // Catch:{ all -> 0x0735 }
            java.lang.String r1 = "promotion_more_info"
            java.lang.String r0 = r3.A04     // Catch:{ all -> 0x0735 }
            r12.put(r1, r0)     // Catch:{ all -> 0x0735 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0735 }
            X.1Ev r11 = r0.A02     // Catch:{ all -> 0x0735 }
            java.lang.String r13 = "cart_applied_promotion"
            java.lang.String r14 = "business_id=?"
            java.lang.String[] r0 = new java.lang.String[r8]     // Catch:{ all -> 0x0735 }
            X.C17880vN.A1J(r6, r0, r7)     // Catch:{ all -> 0x0735 }
            java.lang.String r15 = "cart_applied_promotion.UPDATE_APPLIED_PROMOTION"
            r16 = r0
            int r0 = r11.A02(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0735 }
            if (r0 != 0) goto L_0x071f
            java.lang.String r0 = "cart_applied_promotion.INSERT_APPLIED_PROMOTION"
            r11.A05(r13, r0, r12)     // Catch:{ all -> 0x0735 }
        L_0x071f:
            r5.A00()     // Catch:{ all -> 0x0735 }
            r5.close()     // Catch:{ all -> 0x073c }
            r2.close()
            X.1wy r1 = r4.A0A
            X.8i6 r0 = X.C167988i6.A00
            r1.A0E(r0)
            X.1DT r0 = r4.A00
            r0.A0E(r3)
            return
        L_0x0735:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0737 }
        L_0x0737:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x073c }
            throw r0     // Catch:{ all -> 0x073c }
        L_0x073c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x073e }
        L_0x073e:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x0743:
            java.lang.Object r6 = r5.A01
            X.8hy r6 = (X.C167908hy) r6
            java.lang.String r5 = r5.A02
            X.9kx r1 = r6.A01
            X.9fP r0 = r6.A00
            com.whatsapp.jid.UserJid r4 = r0.A02
            java.lang.String r0 = "GetOrderProtocol/getBizCompatibleLid"
            com.whatsapp.jid.UserJid r3 = r1.A00(r4, r0)
            if (r3 != 0) goto L_0x0760
            java.lang.String r0 = "GetOrderProtocol/GetOrderProtocol/getBizCompatibleLid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r6.BrD(r5)
            return
        L_0x0760:
            X.A2u r1 = r6.A04
            java.lang.String r0 = "order_view_tag"
            r1.A03(r0)
            X.A0g r2 = r6.A02
            X.1ca r1 = X.C167908hy.A00(r6, r3, r5)
            r0 = 248(0xf8, float:3.48E-43)
            r2.A02(r6, r1, r5, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetOrderProtocol/sendGetOrderRequest/jid="
            X.C17900vP.A0Y(r4, r0, r1)
            return
        L_0x077c:
            java.lang.Object r3 = r5.A01
            com.whatsapp.biz.product.viewmodel.ComplianceInfoViewModel r3 = (com.whatsapp.biz.product.viewmodel.ComplianceInfoViewModel) r3
            java.lang.String r2 = r5.A02
            X.00H r0 = r3.A05
            java.lang.Object r0 = r0.get()
            com.whatsapp.biz.catalog.manager.CatalogManager r0 = (com.whatsapp.biz.catalog.manager.CatalogManager) r0
            X.ANE r1 = new X.ANE
            r1.<init>(r3, r2)
            java.util.List r0 = r0.A08
            r0.add(r1)
            return
        L_0x0795:
            java.lang.Object r0 = r5.A01
            X.1nX r0 = (X.C36221nX) r0
            java.lang.String r2 = r5.A02
            X.00H r0 = r0.A0K
            X.10T r1 = X.C17880vN.A0V(r0)
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.C20738AWt.A00(r1, r2, r0)
            return
        L_0x07a9:
            java.lang.Object r0 = r5.A01
            X.6xR r0 = (X.C138636xR) r0
            java.lang.String r2 = r5.A02
            r1 = 1
            X.1KB r0 = r0.A00
            r0.A0G(r2, r1)
            return
        L_0x07b6:
            java.lang.Object r0 = r5.A01
            X.8F9 r0 = (X.AnonymousClass8F9) r0
            java.lang.String r5 = r5.A02
            X.0IX r4 = r0.A0A
            X.9it r1 = r0.A08
            r0 = 741481818(0x2c321d5a, float:2.5311615E-12)
            X.A2b r3 = r1.A00(r0)
            X.8t2 r0 = r4.A03
            boolean r0 = r0 instanceof X.AnonymousClass0CF
            if (r0 == 0) goto L_0x07d0
            r4.A00()
        L_0x07d0:
            X.B8M r2 = r4.A07
            X.9XW r0 = r4.A06
            X.9mx r1 = r0.A00
            X.0YW r0 = new X.0YW
            r0.<init>(r4, r5)
            X.8vc r0 = r2.BGw(r0, r1, r3, r5)
            r0.A0E()
            r4.A03 = r0
            return
        L_0x07e5:
            java.lang.Object r3 = r5.A01
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r3 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r3
            java.lang.String r2 = r5.A02
            X.0vb r0 = r3.A0C
            java.util.Locale r0 = r0.A0N()
            android.location.Geocoder r1 = new android.location.Geocoder
            r1.<init>(r3, r0)
            r0 = 1
            java.util.List r1 = r1.getFromLocationName(r2, r0)     // Catch:{ Exception -> 0x080a }
            if (r1 == 0) goto L_0x0810
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x080a }
            if (r0 != 0) goto L_0x0810
            java.lang.Object r2 = X.C108955ca.A0p(r1)     // Catch:{ Exception -> 0x080a }
            android.location.Address r2 = (android.location.Address) r2     // Catch:{ Exception -> 0x080a }
            goto L_0x0811
        L_0x080a:
            r1 = move-exception
            java.lang.String r0 = "SearchLocationUtil/geoLocateAddressFromLocationName/failed"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0810:
            r2 = 0
        L_0x0811:
            r1 = 44
            X.AkI r0 = new X.AkI
            r0.<init>(r3, r2, r1)
            r3.runOnUiThread(r0)
            return
        L_0x081c:
            java.lang.Object r3 = r5.A01
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r3 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r3
            java.lang.String r4 = r5.A02
            int r6 = r3.A01
            X.A6f r2 = com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A04(r3)
            int r7 = com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A00(r3, r4)
            X.A36 r0 = r3.A0R
            X.9l3 r1 = r0.A02()
            X.AP5 r0 = r3.A0P
            java.lang.String r5 = r0.A0K
            r0 = 0
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A0B(r0, r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x083b:
            java.lang.Object r2 = r5.A01
            X.1V9 r2 = (X.AnonymousClass1V9) r2
            java.lang.String r1 = r5.A02
            if (r1 != 0) goto L_0x0847
            r0 = 0
        L_0x0844:
            r2.A00 = r0
            return
        L_0x0847:
            X.00H r0 = r2.A04
            java.lang.Object r0 = r0.get()
            X.9mr r0 = (X.C191599mr) r0
            java.lang.String r0 = r0.A00(r1)
            goto L_0x0844
        L_0x0854:
            java.lang.Object r1 = r5.A01
            X.A7S r1 = (X.A7S) r1
            java.lang.String r0 = r5.A02
            r1.A06(r0)
            return
        L_0x085e:
            java.lang.Object r1 = r5.A01
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            java.lang.String r0 = r5.A02
            com.whatsapp.voipcalling.Voip.resendOfferOnDecryptionFailure(r1, r0)
            return
        L_0x0868:
            java.lang.Object r4 = r5.A01
            X.A99 r4 = (X.A99) r4
            java.lang.String r3 = r5.A02
            X.11P r0 = r4.A2c
            X.1D9 r2 = r4.A2s
            X.C18070vi.A0j(r0, r2)
            X.0ve r1 = r4.A2p
            r0 = 11682(0x2da2, float:1.637E-41)
            java.lang.String r0 = r1.A0I(r0)
            long r5 = X.C181269Pu.A00(r2, r0)
            X.9hv r2 = r4.A0Q(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "accept:"
            goto L_0x08af
        L_0x088c:
            java.lang.Object r4 = r5.A01
            X.A99 r4 = (X.A99) r4
            java.lang.String r3 = r5.A02
            X.11P r0 = r4.A2c
            X.1D9 r2 = r4.A2s
            X.C18070vi.A0j(r0, r2)
            X.0ve r1 = r4.A2p
            r0 = 11682(0x2da2, float:1.637E-41)
            java.lang.String r0 = r1.A0I(r0)
            long r5 = X.C181269Pu.A00(r2, r0)
            X.9hv r2 = r4.A0Q(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "offer:"
        L_0x08af:
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ";"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.StringBuilder r0 = r2.A0E
            if (r0 != 0) goto L_0x08c5
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            r2.A0E = r0
        L_0x08c5:
            java.lang.StringBuilder r0 = r2.A0E
            r0.append(r1)
            return
        L_0x08cb:
            java.lang.Object r1 = r5.A01
            com.whatsapp.calling.service.VoiceServiceEventCallback r1 = (com.whatsapp.calling.service.VoiceServiceEventCallback) r1
            java.lang.String r0 = r5.A02
            r1.m41lambda$linkEditAcked$9$comwhatsappcallingserviceVoiceServiceEventCallback(r0)
            return
        L_0x08d5:
            java.lang.Object r0 = r5.A01
            X.4Xo r0 = (X.C87914Xo) r0
            java.lang.String r1 = r5.A02
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r0 = r0.A06
            r0.setContactChatStatus(r1)
            return
        L_0x08e1:
            java.lang.Object r0 = r5.A01
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r0 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r0
            java.lang.String r14 = r5.A02
            X.1mw r1 = r0.A06
            monitor-enter(r1)
            X.1mv r0 = r1.A01     // Catch:{ all -> 0x0af3 }
            X.2rA r6 = r0.A00()     // Catch:{ all -> 0x0af3 }
            X.00H r5 = r1.A06     // Catch:{ all -> 0x0af3 }
            java.lang.Object r4 = r5.get()     // Catch:{ all -> 0x0af3 }
            X.9sz r4 = (X.C195219sz) r4     // Catch:{ all -> 0x0af3 }
            r3 = 0
            if (r6 == 0) goto L_0x0904
            java.lang.String r0 = r6.A02     // Catch:{ all -> 0x0af3 }
            java.lang.String r3 = r6.A01     // Catch:{ all -> 0x0af3 }
        L_0x08ff:
            r2 = 3
            r4.A01(r2, r0, r3)     // Catch:{ all -> 0x0af3 }
            goto L_0x0906
        L_0x0904:
            r0 = r3
            goto L_0x08ff
        L_0x0906:
            if (r6 != 0) goto L_0x0944
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/handleInputLinkCode companion hello is null or expired"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0af3 }
            java.lang.Object r7 = r5.get()     // Catch:{ all -> 0x0af3 }
            X.9sz r7 = (X.C195219sz) r7     // Catch:{ all -> 0x0af3 }
            X.11P r0 = r7.A03     // Catch:{ all -> 0x0af3 }
            long r2 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x0af3 }
            r7.A00 = r2     // Catch:{ all -> 0x0af3 }
            X.1mv r4 = r7.A02     // Catch:{ all -> 0x0af3 }
            monitor-enter(r4)     // Catch:{ all -> 0x0af3 }
            long r5 = r4.A00     // Catch:{ all -> 0x0941 }
            r2 = 0
            r4.A00 = r2     // Catch:{ all -> 0x0941 }
            monitor-exit(r4)     // Catch:{ all -> 0x0af3 }
            r2 = 180000(0x2bf20, double:8.8932E-319)
            long r5 = r5 + r2
            long r3 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x0af3 }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r0 = 13
            if (r2 <= 0) goto L_0x0935
            r0 = 14
        L_0x0935:
            r7.A00(r0)     // Catch:{ all -> 0x0af3 }
            r0 = 21
            X.AWq r2 = new X.AWq     // Catch:{ all -> 0x0af3 }
            r2.<init>(r0)     // Catch:{ all -> 0x0af3 }
            goto L_0x0a86
        L_0x0941:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0af3 }
            throw r0     // Catch:{ all -> 0x0af3 }
        L_0x0944:
            byte[] r10 = r6.A04     // Catch:{ all -> 0x0af3 }
            byte[] r13 = r6.A03     // Catch:{ all -> 0x0af3 }
            java.lang.String r3 = r6.A02     // Catch:{ all -> 0x0af3 }
            java.lang.String r4 = r6.A01     // Catch:{ all -> 0x0af3 }
            r6 = 0
            r5 = 1
            int r8 = r10.length     // Catch:{ IllegalArgumentException -> 0x0a5d }
            r7 = 48
            if (r8 < r7) goto L_0x0a56
            r0 = 32
            byte[] r12 = java.util.Arrays.copyOfRange(r10, r6, r0)     // Catch:{ IllegalArgumentException -> 0x0a5d }
            byte[] r9 = java.util.Arrays.copyOfRange(r10, r0, r7)     // Catch:{ IllegalArgumentException -> 0x0a5d }
            byte[] r8 = java.util.Arrays.copyOfRange(r10, r7, r8)     // Catch:{ IllegalArgumentException -> 0x0a5d }
            char[] r10 = r14.toCharArray()     // Catch:{ all -> 0x0af3 }
            java.util.List r0 = X.C60732oW.A00     // Catch:{ all -> 0x0af3 }
            r15 = 131072(0x20000, float:1.83671E-40)
            r11 = 256(0x100, float:3.59E-43)
            java.lang.String r7 = "PBKDF2WithHmacSHA256"
            javax.crypto.SecretKey r10 = X.C17970vW.A08(r7, r12, r10, r15, r11)     // Catch:{ all -> 0x0af3 }
            java.lang.String r17 = "AES/CTR/NoPadding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r17)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0a6f }
            X.AnonymousClass8BW.A1O(r10, r0, r9)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0a6f }
            byte[] r8 = r0.doFinal(r8)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0a6f }
            r9 = 2
            X.2cF r0 = X.C63962tz.A00()     // Catch:{ all -> 0x0af3 }
            r10 = 32
            byte[] r10 = X.C17970vW.A0I(r10)     // Catch:{ all -> 0x0af3 }
            r12 = 16
            byte[] r16 = X.C17970vW.A0I(r12)     // Catch:{ all -> 0x0af3 }
            X.1jP r12 = r0.A01     // Catch:{ all -> 0x0af3 }
            byte[] r12 = r12.A00     // Catch:{ all -> 0x0af3 }
            char[] r14 = r14.toCharArray()     // Catch:{ all -> 0x0af3 }
            javax.crypto.SecretKey r11 = X.C17970vW.A08(r7, r10, r14, r15, r11)     // Catch:{ all -> 0x0af3 }
            X.1jP r7 = new X.1jP     // Catch:{ all -> 0x0af3 }
            r7.<init>(r8)     // Catch:{ all -> 0x0af3 }
            X.2kN r0 = r0.A00     // Catch:{ all -> 0x0af3 }
            byte[] r8 = X.C63962tz.A08(r0, r7)     // Catch:{ all -> 0x0af3 }
            java.util.Map r7 = r1.A00     // Catch:{ all -> 0x0af3 }
            X.9d9 r0 = new X.9d9     // Catch:{ all -> 0x0af3 }
            r0.<init>(r4, r8, r13)     // Catch:{ all -> 0x0af3 }
            r7.put(r3, r0)     // Catch:{ all -> 0x0af3 }
            javax.crypto.Cipher r7 = javax.crypto.Cipher.getInstance(r17)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0a4f }
            javax.crypto.spec.IvParameterSpec r0 = X.AnonymousClass8BR.A19(r16)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0a4f }
            byte[] r7 = X.AnonymousClass8BS.A1Q(r11, r0, r7, r12, r5)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0a4f }
            byte[][] r0 = new byte[r2][]     // Catch:{ all -> 0x0af3 }
            r0[r6] = r10     // Catch:{ all -> 0x0af3 }
            r0[r5] = r16     // Catch:{ all -> 0x0af3 }
            r0[r9] = r7     // Catch:{ all -> 0x0af3 }
            byte[] r12 = X.A8G.A05(r0)     // Catch:{ all -> 0x0af3 }
            X.1P3 r0 = r1.A04     // Catch:{ all -> 0x0af3 }
            X.1PJ r0 = r0.A01     // Catch:{ all -> 0x0af3 }
            X.2cG r0 = r0.A03()     // Catch:{ all -> 0x0af3 }
            X.2kO r0 = r0.A01     // Catch:{ all -> 0x0af3 }
            X.1jP r0 = r0.A00     // Catch:{ all -> 0x0af3 }
            byte[] r11 = r0.A00     // Catch:{ all -> 0x0af3 }
            X.00H r0 = r1.A07     // Catch:{ all -> 0x0af3 }
            X.1OZ r7 = X.C17880vN.A0U(r0)     // Catch:{ all -> 0x0af3 }
            X.9l7 r0 = new X.9l7     // Catch:{ all -> 0x0af3 }
            r0.<init>(r1, r3, r4)     // Catch:{ all -> 0x0af3 }
            X.AcJ r15 = new X.AcJ     // Catch:{ all -> 0x0af3 }
            r15.<init>(r0, r7)     // Catch:{ all -> 0x0af3 }
            java.lang.String r0 = "LinkCodePrimaryHelloProtocolHelper/sendPrimaryHelloIq start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0af3 }
            X.1OZ r14 = r15.A00     // Catch:{ all -> 0x0af3 }
            java.lang.String r4 = r14.A0B()     // Catch:{ all -> 0x0af3 }
            r0 = 4
            X.1MD[] r8 = new X.AnonymousClass1MD[r0]     // Catch:{ all -> 0x0af3 }
            java.lang.String r0 = "id"
            X.1MD r0 = X.AnonymousClass8BR.A0h(r0, r4)     // Catch:{ all -> 0x0af3 }
            r13 = 0
            r8[r6] = r0     // Catch:{ all -> 0x0af3 }
            java.lang.String r6 = "xmlns"
            java.lang.String r0 = "md"
            X.C17880vN.A1Q(r6, r0, r8, r5)     // Catch:{ all -> 0x0af3 }
            java.lang.String r6 = "type"
            java.lang.String r0 = "set"
            X.C17880vN.A1Q(r6, r0, r8, r9)     // Catch:{ all -> 0x0af3 }
            java.lang.String r6 = "to"
            X.8v4 r0 = X.C173438v4.A00     // Catch:{ all -> 0x0af3 }
            X.C17880vN.A1I(r0, r6, r8, r2)     // Catch:{ all -> 0x0af3 }
            X.1MD[] r7 = new X.AnonymousClass1MD[r5]     // Catch:{ all -> 0x0af3 }
            java.lang.String r6 = "stage"
            java.lang.String r0 = "primary_hello"
            X.C17880vN.A1Q(r6, r0, r7, r13)     // Catch:{ all -> 0x0af3 }
            X.1ca[] r6 = new X.C29621ca[r2]     // Catch:{ all -> 0x0af3 }
            java.lang.String r2 = "link_code_pairing_wrapped_primary_ephemeral_pub"
            r10 = 0
            X.1ca r0 = new X.1ca     // Catch:{ all -> 0x0af3 }
            r0.<init>((java.lang.String) r2, (byte[]) r12, (X.AnonymousClass1MD[]) r10)     // Catch:{ all -> 0x0af3 }
            r6[r13] = r0     // Catch:{ all -> 0x0af3 }
            java.lang.String r2 = "primary_identity_pub"
            X.1ca r0 = new X.1ca     // Catch:{ all -> 0x0af3 }
            r0.<init>((java.lang.String) r2, (byte[]) r11, (X.AnonymousClass1MD[]) r10)     // Catch:{ all -> 0x0af3 }
            r6[r5] = r0     // Catch:{ all -> 0x0af3 }
            java.lang.String r2 = "link_code_pairing_ref"
            X.1ca r0 = new X.1ca     // Catch:{ all -> 0x0af3 }
            r0.<init>((java.lang.String) r2, (java.lang.String) r3, (X.AnonymousClass1MD[]) r10)     // Catch:{ all -> 0x0af3 }
            r6[r9] = r0     // Catch:{ all -> 0x0af3 }
            java.lang.String r0 = "link_code_companion_reg"
            X.1ca r0 = X.AnonymousClass8BR.A0l(r0, r7, r6)     // Catch:{ all -> 0x0af3 }
            X.1ca r16 = X.AnonymousClass8BT.A0a(r0, r8)     // Catch:{ all -> 0x0af3 }
            r19 = 120000(0x1d4c0, double:5.9288E-319)
            r18 = 361(0x169, float:5.06E-43)
            r17 = r4
            r14.A0I(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0af3 }
            goto L_0x0af1
        L_0x0a4f:
            r2 = move-exception
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/processCompanionHello/encrypt fail"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0af3 }
            goto L_0x0a80
        L_0x0a56:
            java.lang.String r0 = "WrappedCompanionEphemeralPubData input byte array length too small"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ IllegalArgumentException -> 0x0a5d }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0a5d }
        L_0x0a5d:
            r2 = move-exception
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/processCompanionHello exception"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0af3 }
            X.00H r0 = r1.A05     // Catch:{ all -> 0x0af3 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0af3 }
            X.9j4 r0 = (X.AnonymousClass9j4) r0     // Catch:{ all -> 0x0af3 }
            r0.A00(r5, r3, r4)     // Catch:{ all -> 0x0af3 }
            goto L_0x0a80
        L_0x0a6f:
            r2 = move-exception
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/processCompanionHello/decryption fail"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0af3 }
            X.00H r0 = r1.A05     // Catch:{ all -> 0x0af3 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0af3 }
            X.9j4 r0 = (X.AnonymousClass9j4) r0     // Catch:{ all -> 0x0af3 }
            r0.A00(r5, r3, r4)     // Catch:{ all -> 0x0af3 }
        L_0x0a80:
            r0 = 2
            X.7KS r2 = new X.7KS     // Catch:{ all -> 0x0af3 }
            r2.<init>(r3, r4, r0)     // Catch:{ all -> 0x0af3 }
        L_0x0a86:
            r1.notifyAllObservers(r2)     // Catch:{ all -> 0x0af3 }
            goto L_0x0af1
        L_0x0a8a:
            return
        L_0x0a8b:
            java.util.Map r1 = r6.A09     // Catch:{ all -> 0x0aab }
            X.9pp r0 = X.AnonymousClass9OL.A00(r4)     // Catch:{ all -> 0x0aab }
            r1.put(r0, r4)     // Catch:{ all -> 0x0aab }
            X.9ie r1 = r6.A04     // Catch:{ all -> 0x0aab }
            X.3Kb r0 = r6.A05     // Catch:{ all -> 0x0aab }
            X.AHx r0 = (X.C20367AHx) r0     // Catch:{ all -> 0x0aab }
            X.0wl r0 = r0.A03     // Catch:{ all -> 0x0aab }
            X.1OD r2 = X.C197029w2.A00(r6, r1, r4, r0)     // Catch:{ all -> 0x0aab }
            java.util.Map r1 = r6.A08     // Catch:{ all -> 0x0aab }
            X.9pp r0 = X.AnonymousClass9OL.A00(r4)     // Catch:{ all -> 0x0aab }
            r1.put(r0, r2)     // Catch:{ all -> 0x0aab }
            monitor-exit(r3)     // Catch:{ all -> 0x0aab }
            return
        L_0x0aab:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0aab }
            throw r0
        L_0x0aae:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0aae }
            throw r0
        L_0x0ab1:
            org.json.JSONObject r0 = r3.A01()     // Catch:{ IOException -> 0x0abf }
            java.lang.String r1 = X.C18070vi.A0H(r0)     // Catch:{ IOException -> 0x0abf }
            java.nio.charset.Charset r0 = X.C26571Sq.A05     // Catch:{ IOException -> 0x0abf }
            X.AnonymousClass3Gr.A01(r2, r1, r0)     // Catch:{ IOException -> 0x0abf }
            return
        L_0x0abf:
            r1 = move-exception
            java.lang.String r0 = "ArEffectsCacheDataSource/persistCache Failed to write to file"
            goto L_0x0ac6
        L_0x0ac3:
            r1 = move-exception
            java.lang.String r0 = "restore>RestoreFromBackupActivity/error-during-msgstore-download"
        L_0x0ac6:
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0aca:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ArEffectsCacheDataSource/persistCache Failed to create or find file "
            java.lang.StringBuilder r1 = X.AnonymousClass8BT.A0y(r0, r2)
            java.lang.String r0 = X.C17970vW.A04(r4)
            r1.append(r0)
            java.lang.String r0 = ".json"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.C17890vO.A19(r2, r0)
            return
        L_0x0ae5:
            X.0vl r0 = r1.A01     // Catch:{ all -> 0x0af3 }
            java.util.Map r0 = X.AnonymousClass3MW.A12(r0)     // Catch:{ all -> 0x0af3 }
            r0.remove(r5)     // Catch:{ all -> 0x0af3 }
            X.C138136wa.A00(r1)     // Catch:{ all -> 0x0af3 }
        L_0x0af1:
            monitor-exit(r1)
            return
        L_0x0af3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0af6:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0af9:
            return
        L_0x0afa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21452AkJ.run():void");
    }

    public C21452AkJ(C170648qR r2) {
        this.A00 = 33;
        this.A01 = r2;
        this.A02 = "daily_cron_job";
    }
}
