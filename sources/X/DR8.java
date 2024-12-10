package X;

public final class DR8 implements C28543E6r {
    public final AnonymousClass118 A00;
    public final C1407873b A01;
    public final C88534a3 A02;

    /* JADX WARNING: type inference failed for: r0v5, types: [X.CM2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CPe(X.C25209Cb3 r14, X.E8I r15) {
        /*
            r13 = this;
            r4 = 1
            X.C18070vi.A0d(r15, r4)
            X.22l r3 = r14.A01
            java.lang.String r0 = "voicetranscription/engines/UnityTranscriptionEngine/transcribe: starting transcription"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            java.io.File r6 = r14.A02     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            X.73b r1 = r13.A01     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            X.6Rq r0 = X.C122716Rq.TRANSCRIPTION     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            java.lang.String r5 = r1.A04(r0)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            if (r5 != 0) goto L_0x0022
            java.lang.String r0 = "voicetranscription/UnityTranscriptionEngine/transcribe: model not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            X.Bvb r0 = X.C24109Bvb.A00     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            r15.C98(r0, r3)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            return
        L_0x0022:
            X.Cho r7 = r14.A00     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            X.0vl r0 = X.C24352Bzn.A01     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            java.lang.Object r2 = X.AnonymousClass8BV.A0n(r7, r0)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            X.Bzn r2 = (X.C24352Bzn) r2     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            if (r2 != 0) goto L_0x0039
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            java.lang.String r0 = "voicetranscription/UnityTranscriptionEngine/transcribe: invalid locale "
            X.C17900vP.A0X(r7, r0, r1)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            X.Bzn r2 = X.C24352Bzn.UNKNOWN     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
        L_0x0039:
            X.4a3 r0 = r13.A02     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            X.0ve r7 = r0.A01     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            r0 = 10875(0x2a7b, float:1.5239E-41)
            float r1 = r7.A0E(r0)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b2
            X.118 r0 = r13.A00     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            android.content.Context r1 = r0.A00     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            java.lang.String r0 = "activity"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            boolean r0 = r1 instanceof android.app.ActivityManager     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            if (r0 == 0) goto L_0x00b2
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            if (r1 == 0) goto L_0x00b2
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            r0.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            r1.getMemoryInfo(r0)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            long r0 = r0.availMem     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            java.lang.Long r12 = java.lang.Long.valueOf(r0)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            if (r12 == 0) goto L_0x00b2
            X.4XD r0 = com.whatsapp.unity.UnityLib.A00     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            java.lang.String r0 = "unity/unitylib: estimateRequiredMemory before loadLibrary()"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            X.4XD r0 = com.whatsapp.unity.UnityLib.A00     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            r0.A01()     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            java.lang.String r0 = "unity/unitylib: estimateRequiredMemory after loadLibrary()"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            java.lang.String r0 = r2.value     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            long r0 = com.whatsapp.unity.UnityLib.estimateRequiredMemoryNative(r0, r5)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            java.lang.Long r11 = java.lang.Long.valueOf(r0)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x00b2
            if (r11 == 0) goto L_0x00b2
            float r8 = (float) r0     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            r0 = 10875(0x2a7b, float:1.5239E-41)
            float r7 = r7.A0E(r0)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = X.C28851b7.A02(r7, r1, r0)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            float r8 = r8 * r0
            java.lang.Float r0 = java.lang.Float.valueOf(r8)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            if (r0 == 0) goto L_0x00b2
            long r0 = r12.longValue()     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            float r7 = (float) r0     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            int r0 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b2
            X.Bvh r0 = X.C24115Bvh.A00     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            r15.C98(r0, r3)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            return
        L_0x00b2:
            X.4XD r0 = com.whatsapp.unity.UnityLib.A00     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            X.DQu r7 = new X.DQu     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            r7.<init>(r14, r15)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            java.lang.String r0 = "unity/unitylib: before loadLibrary()"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            X.4XD r0 = com.whatsapp.unity.UnityLib.A00     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            r0.A01()     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            java.lang.String r0 = "unity/unitylib: after loadLibrary()"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            java.lang.String r1 = r6.getCanonicalPath()     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            X.C18070vi.A0X(r1)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            java.lang.String r0 = r2.value     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            com.whatsapp.unity.UnityLib.transcribeAudio(r1, r0, r5, r7)     // Catch:{ UnsatisfiedLinkError -> 0x00e5, all -> 0x00d5 }
            return
        L_0x00d5:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voicetranscription/UnityTranscriptionEngine/transcribe error: "
            X.C17900vP.A0X(r2, r0, r1)
            X.BvT r0 = new X.BvT
            r0.<init>(r4)
            goto L_0x00ec
        L_0x00e5:
            java.lang.String r0 = "voicetranscription/UnityTranscriptionEngine/transcribe: UnsatisfiedLinkError"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.Bve r0 = X.C24112Bve.A00
        L_0x00ec:
            r15.C98(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DR8.CPe(X.Cb3, X.E8I):void");
    }

    public DR8(AnonymousClass118 r1, C1407873b r2, C88534a3 r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
