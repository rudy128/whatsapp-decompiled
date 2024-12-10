package X;

/* renamed from: X.7S0  reason: invalid class name */
public class AnonymousClass7S0 implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7S0(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0070, code lost:
        X.AnonymousClass73F.A00(r0).A02(r2, r1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0178, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        return X.C27621Wu.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0019;
                case 1: goto L_0x0029;
                case 2: goto L_0x0100;
                case 3: goto L_0x0115;
                case 4: goto L_0x0146;
                case 5: goto L_0x015b;
                case 6: goto L_0x003f;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x004b;
                case 10: goto L_0x0055;
                case 11: goto L_0x0067;
                case 12: goto L_0x0078;
                case 13: goto L_0x0168;
                case 14: goto L_0x008a;
                case 15: goto L_0x0099;
                case 16: goto L_0x00cd;
                case 17: goto L_0x00e9;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r6.A02
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "https://play.google.com/store/apps/details?id=com.google.android.gms"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r0 = X.AnonymousClass3MY.A07(r0)
            r1.startActivity(r0)
        L_0x0016:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0019:
            java.lang.Object r0 = r6.A01
            com.whatsapp.bot.botmemory.MemoryActivity r0 = (com.whatsapp.bot.botmemory.MemoryActivity) r0
            java.lang.Object r1 = r6.A02
            java.util.List r1 = (java.util.List) r1
            com.whatsapp.bot.botmemory.MemoryViewModel r0 = X.C108965cb.A0J(r0)
            r0.A0U(r1)
            goto L_0x0016
        L_0x0029:
            java.lang.Object r1 = r6.A01
            com.whatsapp.bot.botmemory.MemoryActivity r1 = (com.whatsapp.bot.botmemory.MemoryActivity) r1
            java.lang.Object r0 = r6.A02
            X.6qf r0 = (X.C134486qf) r0
            com.whatsapp.bot.botmemory.MemoryViewModel r1 = X.C108965cb.A0J(r1)
            java.lang.String r0 = r0.A00
            java.util.List r0 = X.C18070vi.A0M(r0)
            r1.A0U(r0)
            goto L_0x0016
        L_0x003f:
            java.lang.Object r1 = r6.A01
            com.whatsapp.mediacomposer.MediaComposerActivity r1 = (com.whatsapp.mediacomposer.MediaComposerActivity) r1
            java.lang.Object r0 = r6.A02
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = (com.whatsapp.mediacomposer.MediaComposerFragment) r0
            com.whatsapp.mediacomposer.MediaComposerActivity.A1C(r1, r0)
            goto L_0x0016
        L_0x004b:
            java.lang.Object r0 = r6.A01
            X.73F r0 = (X.AnonymousClass73F) r0
            java.lang.Object r2 = r6.A02
            X.1BI r2 = (X.AnonymousClass1BI) r2
            r1 = 1
            goto L_0x0070
        L_0x0055:
            java.lang.Object r0 = r6.A01
            X.73F r0 = (X.AnonymousClass73F) r0
            java.lang.Object r3 = r6.A02
            X.1BI r3 = (X.AnonymousClass1BI) r3
            r2 = 0
            r1 = 1
            X.706 r0 = X.AnonymousClass73F.A00(r0)
            r0.A02(r3, r1, r2)
            goto L_0x0016
        L_0x0067:
            java.lang.Object r0 = r6.A01
            X.73F r0 = (X.AnonymousClass73F) r0
            java.lang.Object r2 = r6.A02
            X.1BI r2 = (X.AnonymousClass1BI) r2
            r1 = 0
        L_0x0070:
            X.706 r0 = X.AnonymousClass73F.A00(r0)
            r0.A02(r2, r1, r1)
            goto L_0x0016
        L_0x0078:
            java.lang.Object r0 = r6.A01
            X.73F r0 = (X.AnonymousClass73F) r0
            java.lang.Object r3 = r6.A02
            X.1BI r3 = (X.AnonymousClass1BI) r3
            r2 = 0
            r1 = 1
            X.706 r0 = X.AnonymousClass73F.A00(r0)
            r0.A02(r3, r2, r1)
            goto L_0x0016
        L_0x008a:
            java.lang.Object r1 = r6.A01
            X.5jJ r1 = (X.C111255jJ) r1
            java.lang.Object r0 = r6.A02
            java.util.List r0 = X.C18070vi.A0M(r0)
            X.C111255jJ.A05(r1, r0)
            goto L_0x0016
        L_0x0099:
            java.lang.Object r5 = r6.A01
            X.5jJ r5 = (X.C111255jJ) r5
            java.lang.Object r4 = r6.A02
            X.4rF r4 = (X.C98494rF) r4
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            java.util.Set r0 = r5.A02
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x00af:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r4.element
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            boolean r0 = r0.contains(r1)
            X.AnonymousClass3MZ.A1V(r1, r3, r0)
            goto L_0x00af
        L_0x00c5:
            java.util.Set r0 = X.C29431cG.A12(r3)
            r5.A02 = r0
            goto L_0x0016
        L_0x00cd:
            java.lang.Object r4 = r6.A01
            X.5jJ r4 = (X.C111255jJ) r4
            java.lang.Object r3 = r6.A02
            X.6f4 r3 = (X.C127866f4) r3
            r2 = 0
            r1 = 1
            X.C18070vi.A0d(r3, r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0I
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 == 0) goto L_0x0016
            java.util.Set r0 = r3.A01
            X.C111255jJ.A05(r4, r0)
            goto L_0x0016
        L_0x00e9:
            java.lang.Object r5 = r6.A01
            X.6hr r5 = (X.C129476hr) r5
            java.lang.Object r4 = r6.A02
            X.CYi r4 = (X.C25113CYi) r4
            X.1OX r3 = r5.A00
            X.0wl r2 = r5.A03
            r1 = 0
            com.whatsapp.wds.metrics.logging.network.HierarchyUploader$startWork$1$1$1 r0 = new com.whatsapp.wds.metrics.logging.network.HierarchyUploader$startWork$1$1$1
            r0.<init>(r4, r5, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            goto L_0x0016
        L_0x0100:
            java.lang.Object r2 = r6.A01
            X.1MZ r2 = (X.AnonymousClass1MZ) r2
            java.lang.Object r1 = r6.A02
            X.1E9 r1 = (X.AnonymousClass1E9) r1
            X.1MW r0 = r2.A08
            X.2tp r1 = r0.A0B(r1)
            X.11S r0 = r2.A02
            boolean r0 = r1.A0W(r0)
            goto L_0x0174
        L_0x0115:
            java.lang.Object r2 = r6.A01
            X.1MZ r2 = (X.AnonymousClass1MZ) r2
            java.lang.Object r1 = r6.A02
            X.1E9 r1 = (X.AnonymousClass1E9) r1
            X.1MW r0 = r2.A08
            X.2tp r3 = r0.A0B(r1)
            X.11S r1 = r2.A02
            int r0 = r3.A00
            if (r0 == 0) goto L_0x0141
            X.1E2 r0 = r1.A09()
        L_0x012d:
            r2 = 0
            if (r0 == 0) goto L_0x013c
            X.2sr r0 = r3.A0D(r0, r2)
            if (r0 == 0) goto L_0x013c
            int r1 = r0.A01
            r0 = 2
            if (r1 != r0) goto L_0x013c
            r2 = 1
        L_0x013c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x0141:
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r1)
            goto L_0x012d
        L_0x0146:
            java.lang.Object r2 = r6.A01
            X.1MZ r2 = (X.AnonymousClass1MZ) r2
            java.lang.Object r1 = r6.A02
            X.1E9 r1 = (X.AnonymousClass1E9) r1
            X.1MW r0 = r2.A08
            X.2tp r1 = r0.A0B(r1)
            X.11S r0 = r2.A02
            boolean r0 = r1.A0X(r0)
            goto L_0x0174
        L_0x015b:
            java.lang.Object r1 = r6.A01
            com.whatsapp.mediacomposer.MediaComposerActivity r1 = (com.whatsapp.mediacomposer.MediaComposerActivity) r1
            java.lang.Object r0 = r6.A02
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = (com.whatsapp.mediacomposer.MediaComposerFragment) r0
            com.whatsapp.mediacomposer.MediaComposerActivity.A19(r1, r0)
            r0 = 0
            return r0
        L_0x0168:
            java.lang.Object r0 = r6.A01
            X.5jU r0 = (X.C111295jU) r0
            java.lang.Object r1 = r6.A02
            X.1Dg r0 = r0.A0a
            r0.A0E(r1)
            r0 = 1
        L_0x0174:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7S0.invoke():java.lang.Object");
    }
}
