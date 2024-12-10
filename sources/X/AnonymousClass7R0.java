package X;

import com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel;

/* renamed from: X.7R0  reason: invalid class name */
public class AnonymousClass7R0 implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass7R0(AnonymousClass1FL r2, AnonymousClass1BI r3, MetaAiVoiceViewModel metaAiVoiceViewModel) {
        this.A00 = 48;
        this.A01 = metaAiVoiceViewModel;
        this.A02 = r3;
        this.A03 = r2;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x037b A[PHI: r1 
      PHI: (r1v127 java.io.File) = (r1v126 java.io.File), (r1v138 java.io.File) binds: [B:146:0x0328, B:612:0x037b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x038d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0af0  */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x0b02  */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x0b0d  */
    /* JADX WARNING: Removed duplicated region for block: B:452:0x0b2b  */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x0b2f  */
    public final void run() {
        /*
            r46 = this;
            r1 = r46
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x04dd;
                case 1: goto L_0x0d2b;
                case 2: goto L_0x0eca;
                case 3: goto L_0x0cee;
                case 4: goto L_0x04be;
                case 5: goto L_0x0c7b;
                case 6: goto L_0x0b75;
                case 7: goto L_0x097c;
                case 8: goto L_0x0913;
                case 9: goto L_0x0449;
                case 10: goto L_0x08fa;
                case 11: goto L_0x08ba;
                case 12: goto L_0x08a0;
                case 13: goto L_0x0894;
                case 14: goto L_0x0007;
                case 15: goto L_0x0007;
                case 16: goto L_0x0876;
                case 17: goto L_0x0866;
                case 18: goto L_0x0856;
                case 19: goto L_0x0829;
                case 20: goto L_0x042e;
                case 21: goto L_0x0814;
                case 22: goto L_0x07e9;
                case 23: goto L_0x07be;
                case 24: goto L_0x07ae;
                case 25: goto L_0x0796;
                case 26: goto L_0x0787;
                case 27: goto L_0x075c;
                case 28: goto L_0x074d;
                case 29: goto L_0x03e7;
                case 30: goto L_0x0e4d;
                case 31: goto L_0x0df2;
                case 32: goto L_0x0250;
                case 33: goto L_0x0720;
                case 34: goto L_0x0202;
                case 35: goto L_0x06fa;
                case 36: goto L_0x0191;
                case 37: goto L_0x00b2;
                case 38: goto L_0x06b4;
                case 39: goto L_0x008d;
                case 40: goto L_0x069b;
                case 41: goto L_0x0655;
                case 42: goto L_0x0073;
                case 43: goto L_0x063e;
                case 44: goto L_0x0dd7;
                case 45: goto L_0x0618;
                case 46: goto L_0x05d9;
                case 47: goto L_0x001a;
                case 48: goto L_0x0564;
                case 49: goto L_0x054d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r1.A01
            com.whatsapp.lists.ListsRepository r3 = (com.whatsapp.lists.ListsRepository) r3
            java.lang.Object r2 = r1.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r1.A03
            java.util.List r1 = X.C18070vi.A0M(r0)
            r0 = 0
            com.whatsapp.lists.ListsRepository.A00(r3, r2, r1, r0)
        L_0x0019:
            return
        L_0x001a:
            java.lang.Object r5 = r1.A01
            X.6AT r5 = (X.AnonymousClass6AT) r5
            java.lang.Object r7 = r1.A02
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            java.lang.Object r4 = r1.A03
            X.17r r1 = r5.A02
            java.lang.String r0 = "tmpi"
            java.io.File r6 = r1.A0a(r0)
            java.io.FileOutputStream r3 = X.C108945cZ.A19(r6)
            java.io.ByteArrayOutputStream r2 = X.C108945cZ.A15()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0d71 }
            r0 = 100
            byte[] r0 = X.C108955ca.A1a(r1, r7, r2, r0)     // Catch:{ all -> 0x0d71 }
            r2.close()
            if (r0 == 0) goto L_0x0019
            r3.write(r0)     // Catch:{ all -> 0x0d6a }
            X.C26511Sk.A0R(r6)     // Catch:{ all -> 0x0d6a }
            android.net.Uri r2 = android.net.Uri.fromFile(r6)     // Catch:{ all -> 0x0d6a }
            r3.close()
            if (r2 == 0) goto L_0x0019
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "file"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0d5b
            java.lang.String r0 = r2.getPath()
            if (r0 == 0) goto L_0x0d4c
            java.io.File r3 = X.C108945cZ.A17(r0)
            X.1KB r2 = r5.A03
            r1 = 46
            X.7R0 r0 = new X.7R0
            r0.<init>(r5, r3, r4, r1)
            r2.A0J(r0)
            return
        L_0x0073:
            java.lang.Object r2 = r1.A01
            X.1dT r2 = (X.C30151dT) r2
            java.lang.Object r6 = r1.A02
            java.lang.Object r5 = r1.A03
            X.1dn r4 = r2.A00
            if (r4 == 0) goto L_0x0019
            java.util.Map r0 = r4.A07
            java.lang.Number r0 = X.C108945cZ.A1E(r6, r0)
            if (r0 != 0) goto L_0x0d78
            java.lang.String r0 = "log_invalid_unknown_session"
            X.C30151dT.A03(r2, r0)
            return
        L_0x008d:
            java.lang.Object r4 = r1.A01
            X.2qF r4 = (X.C61782qF) r4
            java.lang.Object r0 = r1.A02
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r3 = r1.A03
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            java.util.Iterator r2 = r0.iterator()
        L_0x009d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0019
            X.1BI r1 = X.C17880vN.A0Q(r2)
            X.1Rj r0 = r4.A09
            r0.A0C(r1, r3)
            X.1mk r0 = r4.A04
            r0.A00(r1)
            goto L_0x009d
        L_0x00b2:
            java.lang.Object r2 = r1.A01
            X.1N9 r2 = (X.AnonymousClass1N9) r2
            java.lang.Object r0 = r1.A02
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.Object r4 = r1.A03
            java.util.AbstractMap r4 = (java.util.AbstractMap) r4
            java.util.Iterator r3 = X.C17890vO.A0i(r0)
        L_0x00c2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e8
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r3)
            X.1N8 r5 = r2.A03
            java.lang.Object r6 = r1.getKey()
            X.1BI r6 = (X.AnonymousClass1BI) r6
            java.lang.Object r0 = r1.getValue()
            X.206 r0 = (X.AnonymousClass206) r0
            long r7 = r0.A0x
            java.lang.Object r0 = r1.getValue()
            X.206 r0 = (X.AnonymousClass206) r0
            long r9 = r0.A0y
            r5.A01(r6, r7, r9)
            goto L_0x00c2
        L_0x00e8:
            java.util.Iterator r10 = X.C17890vO.A0i(r4)
        L_0x00ec:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0019
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r10)
            X.1N8 r3 = r2.A03
            java.lang.Object r4 = r0.getKey()
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.Object r0 = r0.getValue()
            long r0 = X.C17880vN.A05(r0)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r5 = "msgstore/setstatusreadreceiptssent/"
            r6.append(r5)
            r6.append(r4)
            java.lang.String r5 = " "
            X.C17900vP.A0m(r5, r6, r0)
            X.1Le r7 = r3.A04
            X.2sx r9 = r7.A08(r4)
            if (r9 != 0) goto L_0x0129
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "msgstore/setstatusreadreceiptssent/no status for "
            X.C17900vP.A0Z(r4, r0, r1)
            goto L_0x00ec
        L_0x0129:
            monitor-enter(r9)
            long r5 = r9.A06     // Catch:{ all -> 0x0d9f }
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x0132
            r9.A06 = r0     // Catch:{ all -> 0x0d9f }
        L_0x0132:
            X.2sx r5 = r9.A06()     // Catch:{ all -> 0x0d9f }
            monitor-exit(r9)
            monitor-enter(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0186, Error | RuntimeException -> 0x0d9a }
            long r0 = r5.A06     // Catch:{ all -> 0x0183 }
            monitor-exit(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0186, Error | RuntimeException -> 0x0d9a }
            X.1Cd r5 = r7.A03     // Catch:{ SQLiteDatabaseCorruptException -> 0x0186, Error | RuntimeException -> 0x0d9a }
            X.1au r6 = r5.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0186, Error | RuntimeException -> 0x0d9a }
            android.content.ContentValues r12 = X.C17880vN.A08()     // Catch:{ all -> 0x0179 }
            java.lang.String r5 = "last_read_receipt_sent_message_table_id"
            X.C17880vN.A19(r12, r5, r0)     // Catch:{ all -> 0x0179 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0179 }
            X.1Ev r11 = r0.A02     // Catch:{ all -> 0x0179 }
            java.lang.String r13 = "status"
            java.lang.String r14 = "jid_row_id=?"
            java.lang.String[] r16 = X.C24661Le.A04(r7, r4)     // Catch:{ all -> 0x0179 }
            java.lang.String r0 = "updateLastReadReceiptSentMessageRowId/UPDATE"
            java.lang.String r15 = X.C24661Le.A00(r0)     // Catch:{ all -> 0x0179 }
            int r0 = r11.A02(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0179 }
            if (r0 != 0) goto L_0x0174
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0179 }
            java.lang.String r0 = "StatusStore/updateLastReadReceiptSentMessageTableId/no status saved for "
            r1.append(r0)     // Catch:{ all -> 0x0179 }
            r1.append(r4)     // Catch:{ all -> 0x0179 }
            java.lang.String r0 = ";"
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x0179 }
        L_0x0174:
            r6.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0186, Error | RuntimeException -> 0x0d9a }
            goto L_0x00ec
        L_0x0179:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x017e }
            goto L_0x0182
        L_0x017e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0186, Error | RuntimeException -> 0x0d9a }
        L_0x0182:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0186, Error | RuntimeException -> 0x0d9a }
        L_0x0183:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0186, Error | RuntimeException -> 0x0d9a }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0186, Error | RuntimeException -> 0x0d9a }
        L_0x0186:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1Cn r0 = r3.A02
            r0.A03()
            goto L_0x00ec
        L_0x0191:
            java.lang.Object r3 = r1.A01
            X.9fd r3 = (X.C187329fd) r3
            java.lang.Object r2 = r1.A02
            X.206 r2 = (X.AnonymousClass206) r2
            java.lang.Object r7 = r1.A03
            X.205 r7 = (X.AnonymousClass205) r7
            r0 = 2
            X.C18070vi.A0d(r7, r0)
            X.121 r0 = r3.A00
            r0.BBY(r2)
            X.00H r0 = r3.A03
            java.lang.Object r6 = r0.get()
            X.6ot r6 = (X.C133516ot) r6
            X.00H r0 = r6.A00
            java.util.Iterator r8 = X.C17890vO.A0h(r0)
        L_0x01b4:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r5 = r8.next()
            X.6Uo r5 = (X.C123466Uo) r5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r5.A00()
            r1.append(r0)
            java.lang.String r0 = "/resolveOrphanMessagesForParentKey"
            X.C17890vO.A1A(r1, r0)
            java.util.LinkedHashSet r4 = X.C17880vN.A14()
            r3 = 1
            r0 = -1
        L_0x01d7:
            r2 = 200(0xc8, float:2.8E-43)
            java.util.ArrayList r1 = r5.A02(r7, r2, r0)
            r5.A03(r1, r4)
            int r0 = r1.size()
            if (r0 >= r2) goto L_0x01e7
            r3 = 0
        L_0x01e7:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01fe
            java.lang.Object r0 = X.C29431cG.A0d(r1)
            X.9tq r0 = (X.C195749tq) r0
            java.lang.Long r0 = r0.A07
            if (r0 == 0) goto L_0x01fe
            long r0 = r0.longValue()
            if (r3 == 0) goto L_0x01fe
            goto L_0x01d7
        L_0x01fe:
            r6.A01(r4)
            goto L_0x01b4
        L_0x0202:
            java.lang.Object r4 = r1.A01
            X.1ol r4 = (X.C36971ol) r4
            java.lang.Object r2 = r1.A02
            java.lang.Object r1 = r1.A03
            java.util.Set r1 = (java.util.Set) r1
            r0 = 2
            X.C18070vi.A0d(r1, r0)
            java.lang.ref.WeakReference r5 = X.AnonymousClass3MW.A0z(r2)
            java.util.Iterator r3 = r1.iterator()
            r1 = 0
        L_0x0219:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0244
            java.lang.Object r0 = r3.next()
            X.1q7 r0 = (X.C37781q7) r0
            java.lang.String r2 = "MarketingMessagesOptionsMenuAsyncLoader"
            X.0zA r1 = r0.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0239
            r1.A03()
            java.lang.String r0 = "shouldShowMarketingMessagesEntryPoint"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0239:
            java.lang.Boolean r1 = X.AnonymousClass000.A0h()
            java.util.concurrent.ConcurrentHashMap r0 = r4.A03
            r0.put(r2, r1)
            r1 = 1
            goto L_0x0219
        L_0x0244:
            if (r1 == 0) goto L_0x0019
            X.00H r0 = r4.A00
            X.1KB r7 = X.C108945cZ.A0a(r0)
            r0 = 30
            goto L_0x0e3d
        L_0x0250:
            java.lang.Object r0 = r1.A01
            X.21V r0 = (X.AnonymousClass21V) r0
            java.lang.Object r3 = r1.A02
            X.6xb r3 = (X.C138736xb) r3
            java.lang.Object r7 = r1.A03
            java.io.File r7 = (java.io.File) r7
            r2 = 0
            int r5 = r0.A0u
            java.lang.String r6 = r0.A06
            r4 = 3
            r1 = 2
            r0 = 1
            if (r6 == 0) goto L_0x02da
            java.lang.String r0 = "/"
            java.util.List r4 = X.C108965cb.A0v(r6, r0, r2)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x02d7
            java.util.ListIterator r1 = X.C108955ca.A18(r4)
        L_0x0276:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x02d7
            int r0 = X.C108985cd.A08(r1)
            if (r0 == 0) goto L_0x0276
            java.util.List r0 = X.C108985cd.A0t(r4, r1)
        L_0x0286:
            java.lang.String[] r0 = X.C108955ca.A1b(r0)
            r4 = r0[r2]
            int r1 = r4.hashCode()
            r0 = 93166550(0x58d9bd6, float:1.3316821E-35)
            if (r1 == r0) goto L_0x02ce
            r0 = 100313435(0x5faa95b, float:2.3572098E-35)
            if (r1 == r0) goto L_0x02c5
            r0 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r1 != r0) goto L_0x02a7
            java.lang.String r0 = "video"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x02e9
        L_0x02a7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaViewMenu/handleSave/Save media unsupported mime type = "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r5)
        L_0x02b1:
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x02b8
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x02b8:
            X.00H r0 = r3.A0H
            X.1KB r1 = X.C108945cZ.A0a(r0)
        L_0x02be:
            r0 = 2131895383(0x7f122457, float:1.9425597E38)
        L_0x02c1:
            r1.A09(r0, r2)
            return
        L_0x02c5:
            java.lang.String r0 = "image"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x02ed
            goto L_0x02a7
        L_0x02ce:
            java.lang.String r0 = "audio"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x02f1
            goto L_0x02a7
        L_0x02d7:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x0286
        L_0x02da:
            if (r5 == r0) goto L_0x02ed
            if (r5 == r1) goto L_0x02f1
            if (r5 == r4) goto L_0x02e9
            r0 = 13
            if (r5 == r0) goto L_0x02e9
            r0 = 29
            if (r5 == r0) goto L_0x02ed
            goto L_0x02a7
        L_0x02e9:
            r1 = 2
            java.lang.String r10 = android.os.Environment.DIRECTORY_MOVIES
            goto L_0x02f4
        L_0x02ed:
            r1 = 1
            java.lang.String r10 = android.os.Environment.DIRECTORY_PICTURES
            goto L_0x02f4
        L_0x02f1:
            r1 = 3
            java.lang.String r10 = android.os.Environment.DIRECTORY_MUSIC
        L_0x02f4:
            X.C18070vi.A0Z(r10)
            r0 = 1
            if (r1 == r0) goto L_0x0378
            r0 = 2
            if (r1 == r0) goto L_0x0375
            android.net.Uri r5 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        L_0x02ff:
            java.lang.String r4 = r7.getName()
            X.C18070vi.A0X(r4)
            r8 = 1
            java.io.File r1 = android.os.Environment.getExternalStoragePublicDirectory(r10)
            java.lang.String r0 = "WhatsApp"
            java.io.File r9 = X.C17880vN.A0e(r1, r0)
            boolean r0 = r9.exists()
            if (r0 != 0) goto L_0x0320
            boolean r0 = r9.mkdirs()
            if (r0 != 0) goto L_0x0320
        L_0x031d:
            java.lang.String r1 = "MediaViewMenu/handleSave/Save media destination file null."
            goto L_0x02b1
        L_0x0320:
            java.io.File r1 = X.C17880vN.A0e(r9, r4)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x037b
            java.lang.String r0 = "\\."
            X.1wr r1 = new X.1wr
            r1.<init>((java.lang.String) r0)
            r0 = 2
            java.util.List r0 = r1.A01(r4, r0)
            java.lang.String[] r4 = X.C108955ca.A1b(r0)
            int r0 = r4.length
            if (r0 == 0) goto L_0x031d
            r11 = r4[r2]
            if (r0 <= r8) goto L_0x0372
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r0 = 46
            r1.append(r0)
            r0 = r4[r8]
            java.lang.String r8 = X.AnonymousClass000.A0y(r0, r1)
        L_0x0350:
            r4 = 1
        L_0x0351:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r11)
            r0 = 40
            r1.append(r0)
            r1.append(r4)
            r0 = 41
            java.lang.String r0 = X.C17890vO.A0Z(r8, r1, r0)
            java.io.File r1 = X.C17880vN.A0e(r9, r0)
            boolean r0 = r1.exists()
            r0 = r0 ^ 1
            int r4 = r4 + 1
            if (r0 != 0) goto L_0x037b
            goto L_0x0351
        L_0x0372:
            java.lang.String r8 = ""
            goto L_0x0350
        L_0x0375:
            android.net.Uri r5 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            goto L_0x02ff
        L_0x0378:
            android.net.Uri r5 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto L_0x02ff
        L_0x037b:
            android.content.ContentValues r4 = X.C123996Wq.A00(r1, r10, r6)
            X.00H r1 = r3.A0b
            java.lang.Object r0 = r1.get()
            X.11C r0 = (X.AnonymousClass11C) r0
            X.11B r0 = r0.A0O()
            if (r5 == 0) goto L_0x03e3
            if (r0 == 0) goto L_0x03e3
            android.content.ContentResolver r0 = X.AnonymousClass11B.A00(r0)
            android.net.Uri r4 = r0.insert(r5, r4)
            if (r4 == 0) goto L_0x0019
            java.lang.Object r1 = X.C18070vi.A0E(r1)
            X.11C r1 = (X.AnonymousClass11C) r1
            boolean r6 = r3.A00
            r0 = 2
            X.C18070vi.A0d(r1, r0)
            java.io.FileInputStream r5 = X.C108945cZ.A18(r7)     // Catch:{ Exception -> 0x03cd }
            X.11B r0 = X.C108955ca.A0d(r1)     // Catch:{ all -> 0x03c6 }
            java.io.OutputStream r4 = r0.A08(r4)     // Catch:{ all -> 0x03c6 }
            if (r4 == 0) goto L_0x03c1
            X.C64062u9.A00(r5, r4)     // Catch:{ all -> 0x03ba }
            r4.close()     // Catch:{ all -> 0x03c6 }
            goto L_0x03c1
        L_0x03ba:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x03bc }
        L_0x03bc:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x03c6 }
            throw r0     // Catch:{ all -> 0x03c6 }
        L_0x03c1:
            r5.close()     // Catch:{ Exception -> 0x03cd }
            r4 = 1
            goto L_0x03d6
        L_0x03c6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x03c8 }
        L_0x03c8:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ Exception -> 0x03cd }
            throw r0     // Catch:{ Exception -> 0x03cd }
        L_0x03cd:
            r1 = move-exception
            if (r6 == 0) goto L_0x03d5
            java.lang.String r0 = "mediasave/save-media-io-exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x03d5:
            r4 = 0
        L_0x03d6:
            X.00H r0 = r3.A0H
            X.1KB r1 = X.C108945cZ.A0a(r0)
            r0 = 2131895384(0x7f122458, float:1.94256E38)
            if (r4 != 0) goto L_0x02c1
            goto L_0x02be
        L_0x03e3:
            java.lang.String r1 = "MediaViewMenu/handleSave/Save media context or media uri null."
            goto L_0x02b1
        L_0x03e7:
            java.lang.Object r2 = r1.A01
            X.7RT r2 = (X.AnonymousClass7RT) r2
            java.lang.Object r6 = r1.A02
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            java.lang.Object r5 = r1.A03
            X.6r9 r5 = (X.C134786r9) r5
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0019
            java.lang.Object r4 = r2.A03
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            X.1FL r0 = r4.A1D()
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0019
            if (r6 == 0) goto L_0x0417
            com.whatsapp.mediaview.PhotoView r3 = r5.A00
            X.21V r2 = r5.A01
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r4)
            X.5dL r0 = new X.5dL
            r0.<init>(r1, r6, r2)
            r3.A0B(r0)
        L_0x0417:
            X.21V r2 = r4.A0y
            if (r2 == 0) goto L_0x0019
            X.21V r0 = r5.A01
            X.205 r1 = r0.A0v
            X.205 r0 = r2.A0v
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0019
            r0 = 1
            r4.A1d = r0
            com.whatsapp.mediaview.MediaViewFragment.A0H(r4)
            return
        L_0x042e:
            java.lang.Object r0 = r1.A01
            X.1Nq r0 = (X.C25291Nq) r0
            java.lang.Object r6 = r1.A02
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.Object r1 = r1.A03
            java.io.File r1 = (java.io.File) r1
            java.lang.String r5 = "ReferenceCountedFileManager/deleteFileFromMediaProvider"
            if (r6 == 0) goto L_0x0019
            X.11C r0 = r0.A01
            X.11B r4 = r0.A0O()
            if (r4 != 0) goto L_0x0da2
            java.lang.String r0 = "ReferenceCountedFileManager/deleteFileFromMediaProvider content resolver is null"
            goto L_0x04ba
        L_0x0449:
            java.lang.Object r2 = r1.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r1.A02
            X.1L7 r0 = (X.AnonymousClass1L7) r0
            java.lang.Object r8 = r1.A03
            X.17y r8 = (X.C219317y) r8
            java.lang.String r1 = "Profile Pictures"
            java.io.File r7 = r0.A08(r1)
            java.io.File r0 = r2.getCacheDir()
            java.io.File r6 = X.C17880vN.A0e(r0, r1)
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x0019
            boolean r0 = r6.exists()
            if (r0 != 0) goto L_0x0472
            r6.mkdirs()
        L_0x0472:
            java.io.File[] r5 = r7.listFiles()
            if (r5 == 0) goto L_0x0019
            int r4 = r5.length
            r3 = 0
        L_0x047a:
            if (r3 >= r4) goto L_0x04a9
            r2 = r5[r3]
            java.lang.String r1 = r2.getName()
            java.lang.String r0 = ".jpg"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x04a6
            java.io.File r1 = X.C17880vN.A0e(r6, r1)
            r1.getAbsolutePath()
            r1.exists()
            r2.getAbsolutePath()
            r1.getAbsolutePath()
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x04a3
            X.C64062u9.A0P(r8, r2, r1)
        L_0x04a3:
            r2.delete()
        L_0x04a6:
            int r3 = r3 + 1
            goto L_0x047a
        L_0x04a9:
            java.lang.String r0 = ".nomedia"
            java.io.File r0 = X.C17880vN.A0e(r7, r0)
            r0.delete()
            boolean r0 = r7.delete()
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "app-init/moveprofilephotos/rmdir/failed"
        L_0x04ba:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x04be:
            java.lang.Object r3 = r1.A01
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            java.lang.Object r0 = r1.A02
            com.whatsapp.info.views.PhoneNumberPrivacyInfoView r0 = (com.whatsapp.info.views.PhoneNumberPrivacyInfoView) r0
            java.lang.Object r1 = r1.A03
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            if (r3 == 0) goto L_0x0019
            X.2iB r2 = r0.getPnhDailyActionLoggingStore$app_productinfra_chat_chat()
            X.1CJ r0 = r0.getChatsCache$app_productinfra_chat_chat()
            int r1 = r0.A06(r1)
            r0 = 3
            r2.A00(r3, r1, r0)
            return
        L_0x04dd:
            java.lang.Object r8 = r1.A03
            X.9fY r8 = (X.C187279fY) r8
            java.lang.Object r2 = r1.A02
            X.9tC r2 = (X.C195349tC) r2
            java.lang.Object r0 = r1.A01
            X.9Iv r0 = (X.C179659Iv) r0
            int r1 = r0.ordinal()
            r0 = 4
            if (r1 == r0) goto L_0x04f7
            r0 = 5
            if (r1 == r0) goto L_0x04f7
            r0 = 1
            if (r1 == r0) goto L_0x04f7
            return
        L_0x04f7:
            X.00H r0 = r8.A02
            java.lang.Object r5 = r0.get()
            X.9u7 r5 = (X.C195899u7) r5
            X.1EC r7 = r2.A01
            com.whatsapp.jid.UserJid r4 = r2.A04
            r2 = 0
            r1 = 1
            java.lang.String[] r3 = X.C17880vN.A1Z()
            java.lang.String r0 = r7.getRawString()
            r9 = 0
            r3[r2] = r0
            X.C17880vN.A1J(r4, r3, r1)
            X.1Lt r0 = r5.A00
            X.1at r6 = r0.get()
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0dd0 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0dd0 }
            java.lang.String r1 = "SELECT EXISTS ( SELECT 1 FROM group_membership_approval_requests WHERE group_jid = ? AND requester_jid = ?) AS request_exists"
            java.lang.String r0 = "GROUP_MEMBERSHIP_APPROVAL_REQUEST_EXISTS_SQL"
            android.database.Cursor r5 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x0dd0 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0dc9 }
            if (r0 == 0) goto L_0x0539
            java.lang.String r0 = "request_exists"
            long r3 = X.C17890vO.A06(r5, r0)     // Catch:{ all -> 0x0dc9 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0539
            r9 = 1
        L_0x0539:
            r5.close()     // Catch:{ all -> 0x0dd0 }
            r6.close()
            if (r9 == 0) goto L_0x0019
            X.00H r0 = r8.A01
            java.lang.Object r0 = r0.get()
            X.2xl r0 = (X.C66182xl) r0
            r0.A00(r7)
            return
        L_0x054d:
            java.lang.Object r0 = r1.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            java.lang.Object r2 = r1.A02
            X.1o3 r2 = (X.C36531o3) r2
            java.lang.Object r1 = r1.A03
            X.1FL r1 = (X.AnonymousClass1FL) r1
            if (r0 == 0) goto L_0x055e
            r0.run()
        L_0x055e:
            java.lang.String r0 = "chat-transfer-help"
            r2.A01(r1, r0)
            return
        L_0x0564:
            java.lang.Object r3 = r1.A01
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r3 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel) r3
            java.lang.Object r10 = r1.A02
            java.lang.Object r5 = r1.A03
            X.1FL r5 = (X.AnonymousClass1FL) r5
            X.00H r0 = r3.A0R
            X.1Ps r1 = X.AnonymousClass3MW.A0W(r0)
            X.1DT r0 = r3.A0E
            java.lang.Object r0 = r0.A06()
            X.6zo r0 = (X.C140016zo) r0
            if (r0 == 0) goto L_0x0582
            java.lang.String r8 = r0.A05
            if (r8 != 0) goto L_0x0584
        L_0x0582:
            java.lang.String r8 = ""
        L_0x0584:
            r0 = 41
            X.7S3 r2 = new X.7S3
            r2.<init>((java.lang.Object) r3, (int) r0)
            X.00H r0 = r1.A03
            java.lang.Object r6 = r0.get()
            X.6z3 r6 = (X.C139566z3) r6
            r4 = 0
            r9 = 1
            r7 = 2
            r0 = 0
            java.lang.ref.WeakReference r0 = X.AnonymousClass3MW.A0z(r0)
            X.7FK r1 = new X.7FK
            r1.<init>(r2, r0, r6, r4)
            X.1Lg r0 = r6.A00
            r0.registerObserver(r1)
            X.00H r0 = r6.A01
            java.lang.Object r3 = r0.get()
            X.6bK r3 = (X.C125586bK) r3
            r0 = 3
            X.1D6[] r2 = new X.AnonymousClass1D6[r0]
            java.lang.String r0 = "chat_jid"
            X.AnonymousClass1D6.A03(r0, r10, r2, r4)
            java.lang.String r1 = "message_key_id"
            java.lang.String r0 = ""
            X.AnonymousClass1D6.A03(r1, r0, r2, r9)
            java.lang.String r0 = "session_id"
            X.AnonymousClass1D6.A03(r0, r8, r2, r7)
            java.util.LinkedHashMap r1 = X.AnonymousClass1D7.A0B(r2)
            java.util.HashMap r0 = r3.A00
            r0.clear()
            r0.putAll(r1)
            X.00H r0 = r6.A02
            java.lang.Object r0 = r0.get()
            X.6ni r0 = (X.C132856ni) r0
            r0.A00(r5, r4)
            return
        L_0x05d9:
            java.lang.Object r0 = r1.A01
            X.6AT r0 = (X.AnonymousClass6AT) r0
            java.lang.Object r2 = r1.A02
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r6 = r1.A03
            X.02n r6 = (X.AnonymousClass02n) r6
            r5 = 1
            X.C18070vi.A0d(r2, r5)
            X.118 r0 = r0.A06
            android.content.Context r1 = r0.A00
            X.C18070vi.A0d(r1, r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            java.lang.String r3 = r2.getPath()
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.lang.String r0 = "com.whatsapp.contact.picker.ContactPicker"
            android.content.Intent r1 = X.C72483Me.A0B(r1, r0, r5)
            if (r3 == 0) goto L_0x0609
            java.lang.String r0 = "file_path"
            r1.putExtra(r0, r3)
        L_0x0609:
            java.lang.String r0 = "message_types"
            r1.putExtra(r0, r2)
            java.lang.String r0 = "forward"
            r1.putExtra(r0, r4)
            r0 = 0
            r6.A02(r0, r1)
            return
        L_0x0618:
            java.lang.Object r0 = r1.A01
            X.6k4 r0 = (X.C130826k4) r0
            java.lang.Object r2 = r1.A02
            com.whatsapp.bot.home.sync.discovery.DiscoveryBots r2 = (com.whatsapp.bot.home.sync.discovery.DiscoveryBots) r2
            java.lang.Object r1 = r1.A03
            X.6tO r1 = (X.C136176tO) r1
            X.00H r0 = r0.A06
            java.lang.Object r3 = r0.get()
            X.1iW r3 = (X.C33251iW) r3
            X.20Q r0 = r2.A01
            com.whatsapp.jid.UserJid r4 = r0.A00
            java.lang.String r7 = r1.A04
            java.lang.String r8 = r1.A05
            X.6R7 r5 = X.AnonymousClass6R7.VOICE
            java.lang.Integer r6 = r1.A01
            java.lang.String r9 = r1.A03
            r3.A0S(r4, r5, r6, r7, r8, r9)
            return
        L_0x063e:
            java.lang.Object r0 = r1.A03
            com.whatsapp.messaging.xmpp.XmppLifecycleWorker r0 = (com.whatsapp.messaging.xmpp.XmppLifecycleWorker) r0
            X.1fG r2 = r0.A04
            java.lang.Object r0 = r1.A02
            X.2mG r0 = (X.C59412mG) r0
            r2.A06(r0)
            java.lang.Object r1 = r1.A01
            X.1dr r1 = (X.C30391dr) r1
            X.1Wu r0 = X.C27621Wu.A00
            r1.resumeWith(r0)
            return
        L_0x0655:
            java.lang.Object r5 = r1.A01
            X.1PT r5 = (X.AnonymousClass1PT) r5
            java.lang.Object r0 = r1.A02
            X.2mp r0 = (X.C59752mp) r0
            java.lang.Object r4 = r1.A03
            X.2GG r4 = (X.AnonymousClass2GG) r4
            com.whatsapp.jid.Jid r2 = r0.A02
            boolean r0 = r2 instanceof X.AnonymousClass1E9
            if (r0 == 0) goto L_0x0695
            X.1E9 r2 = (X.AnonymousClass1E9) r2
            X.1MZ r1 = r5.A08
            X.1MW r0 = r1.A08
            int r3 = r0.A09(r2)
            int r0 = r1.A01(r2)
            if (r0 <= 0) goto L_0x0681
            int r0 = X.C64002u3.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A00 = r0
        L_0x0681:
            X.0ve r2 = r5.A0B
            r1 = 1861(0x745, float:2.608E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            X.18K r1 = r5.A0C
            if (r3 < r0) goto L_0x0697
            X.0vt r0 = X.C18180vt.A06
            r1.CC6(r4, r0)
            return
        L_0x0695:
            r3 = 0
            goto L_0x0681
        L_0x0697:
            r1.CC7(r4)
            return
        L_0x069b:
            java.lang.Object r3 = r1.A01
            X.6xa r3 = (X.C138726xa) r3
            java.lang.Object r2 = r1.A02
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            java.lang.Object r1 = r1.A03
            X.8X8 r1 = (X.AnonymousClass8X8) r1
            X.1Dv r0 = X.AnonymousClass1BI.A00
            X.1E9 r0 = X.C50242Tr.A00(r2)
            X.C17960vV.A07(r0)
            X.C138726xa.A00(r0, r3, r1)
            return
        L_0x06b4:
            java.lang.Object r7 = r1.A01
            X.2qF r7 = (X.C61782qF) r7
            java.lang.Object r6 = r1.A02
            X.1BI r6 = (X.AnonymousClass1BI) r6
            java.lang.Object r5 = r1.A03
            X.1E7 r5 = (X.AnonymousClass1E7) r5
            X.1Rj r4 = r7.A09
            boolean r3 = r4.A0E(r6)
            java.util.concurrent.ConcurrentHashMap r0 = r4.A0F
            java.lang.Object r2 = r0.get(r6)
            X.1zh r2 = (X.C43371zh) r2
            if (r2 != 0) goto L_0x06d8
            X.1zh r2 = new X.1zh
            r2.<init>()
            r0.put(r6, r2)
        L_0x06d8:
            r0 = 1
            r2.A05 = r0
            r0 = 1
            r2.A02 = r0
            r4.A0D(r6, r0)
            if (r3 != 0) goto L_0x06f4
            X.1BI r0 = r5.A0J
            if (r0 == 0) goto L_0x06f4
            X.1hK r0 = r7.A02
            android.os.Handler r2 = r0.A00
            r1 = 2
            X.1BI r0 = X.C32521hK.A00(r0, r6)
            r2.removeMessages(r1, r0)
        L_0x06f4:
            X.1mk r0 = r7.A04
            r0.A00(r6)
            return
        L_0x06fa:
            java.lang.Object r4 = r1.A01
            X.00H r4 = (X.AnonymousClass00H) r4
            java.lang.Object r3 = r1.A02
            X.206 r3 = (X.AnonymousClass206) r3
            java.lang.Object r2 = r1.A03
            X.00H r2 = (X.AnonymousClass00H) r2
            java.util.Set r0 = X.AnonymousClass4IG.A00
            java.lang.Object r1 = r4.get()
            X.1Lg r1 = (X.C24681Lg) r1
            r0 = 5
            r1.A02(r3, r0)
            java.lang.Object r1 = r2.get()
            X.1NN r1 = (X.AnonymousClass1NN) r1
            X.205 r0 = r3.A0v
            X.1BI r0 = r0.A00
            r1.A02(r0)
            return
        L_0x0720:
            java.lang.Object r4 = r1.A01
            X.206 r4 = (X.AnonymousClass206) r4
            java.lang.Object r3 = r1.A02
            X.6xb r3 = (X.C138736xb) r3
            java.lang.Object r2 = r1.A03
            com.whatsapp.mediaview.MediaViewFragment r2 = (com.whatsapp.mediaview.MediaViewFragment) r2
            boolean r0 = X.C20120A8f.A06(r4)
            if (r0 == 0) goto L_0x0748
            X.00H r0 = r3.A0F
            X.1W6 r1 = X.C17880vN.A0c(r0)
            X.205 r0 = r4.A0v
            X.206 r0 = X.C108945cZ.A0s(r0, r1)
            if (r0 == 0) goto L_0x0744
            r2.A2N(r0, r4)
            return
        L_0x0744:
            java.lang.String r0 = "MediaViewMenu/onOptionSelected/No main message to view in chat."
            goto L_0x0996
        L_0x0748:
            r0 = 0
            r2.A2N(r4, r0)
            return
        L_0x074d:
            java.lang.Object r2 = r1.A02
            X.6Ml r2 = (X.C122016Ml) r2
            java.lang.Object r0 = r1.A03
            java.io.File r0 = (java.io.File) r0
            long r0 = X.C26521Sl.A02(r0)
            r2.A00 = r0
            return
        L_0x075c:
            java.lang.Object r5 = r1.A01
            X.6yY r5 = (X.C139266yY) r5
            java.lang.Object r4 = r1.A02
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r1.A03
            X.1DS r3 = (X.AnonymousClass1DS) r3
            r0 = 2
            X.C18070vi.A0d(r3, r0)
            X.6gH r2 = new X.6gH
            r2.<init>(r5)
            java.util.Iterator r1 = r4.iterator()
        L_0x0775:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0783
            android.net.Uri r0 = X.C108945cZ.A0M(r1)
            X.C139266yY.A00(r0, r2, r5)
            goto L_0x0775
        L_0x0783:
            r3.A0E(r2)
            return
        L_0x0787:
            java.lang.Object r0 = r1.A01
            X.1hA r0 = (X.C32421hA) r0
            java.lang.Object r2 = r1.A02
            X.206 r2 = (X.AnonymousClass206) r2
            java.lang.Object r1 = r1.A03
            X.5ti r1 = (X.C115295ti) r1
            X.00H r0 = r0.A05
            goto L_0x07a4
        L_0x0796:
            java.lang.Object r0 = r1.A01
            X.1hY r0 = (X.C32661hY) r0
            java.lang.Object r2 = r1.A02
            X.206 r2 = (X.AnonymousClass206) r2
            java.lang.Object r1 = r1.A03
            X.5ti r1 = (X.C115295ti) r1
            X.00H r0 = r0.A0E
        L_0x07a4:
            java.lang.Object r0 = r0.get()
            X.2KB r0 = (X.AnonymousClass2KB) r0
            r0.A04(r1, r2)
            return
        L_0x07ae:
            java.lang.Object r3 = r1.A01
            X.1ha r3 = (X.C32681ha) r3
            java.lang.Object r2 = r1.A02
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            java.lang.Object r0 = r1.A03
            java.util.Random r0 = (java.util.Random) r0
            X.C32681ha.A01(r3, r2, r0)
            return
        L_0x07be:
            java.lang.Object r4 = r1.A01
            X.206 r4 = (X.AnonymousClass206) r4
            java.lang.Object r3 = r1.A02
            byte[] r3 = (byte[]) r3
            java.lang.Object r0 = r1.A03
            X.6zF r0 = (X.C139666zF) r0
            X.1So r2 = r0.A0A
            boolean r1 = r0.A0Z
            boolean r0 = X.C25291Nq.A06(r2)
            if (r0 != 0) goto L_0x07e2
            boolean r0 = X.C63972u0.A07(r2)
            if (r0 != 0) goto L_0x07e2
            boolean r0 = X.C63972u0.A04(r2)
            if (r0 == 0) goto L_0x07e7
            if (r1 == 0) goto L_0x07e7
        L_0x07e2:
            r0 = 1
        L_0x07e3:
            r4.A15(r3, r0)
            return
        L_0x07e7:
            r0 = 0
            goto L_0x07e3
        L_0x07e9:
            java.lang.Object r5 = r1.A01
            X.2sd r5 = (X.C63172sd) r5
            java.lang.Object r4 = r1.A02
            X.206 r4 = (X.AnonymousClass206) r4
            java.lang.Object r3 = r1.A03
            X.Af0 r3 = (X.C21132Af0) r3
            X.1W7 r2 = r5.A01
            long r0 = r4.A0x
            byte[] r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x0801
            r4.A1D = r0
        L_0x0801:
            X.6r1 r0 = X.C63172sd.A00(r5, r4)
            if (r0 == 0) goto L_0x080b
            r3.A0B(r0)
            return
        L_0x080b:
            X.6Sg r0 = new X.6Sg
            r0.<init>()
            r3.A0C(r0)
            return
        L_0x0814:
            java.lang.Object r0 = r1.A01
            X.1hs r0 = (X.C32861hs) r0
            java.lang.Object r2 = r1.A02
            X.2ln r2 = (X.C59122ln) r2
            java.lang.Object r1 = r1.A03
            X.34B r1 = (X.AnonymousClass34B) r1
            X.1SU r0 = r0.A0E
            r0.A01(r2)
            r1.A05()
            return
        L_0x0829:
            java.lang.Object r6 = r1.A01
            X.1h6 r6 = (X.C32381h6) r6
            java.lang.Object r0 = r1.A02
            X.6zF r0 = (X.C139666zF) r0
            java.lang.Object r5 = r1.A03
            X.64S r5 = (X.AnonymousClass64S) r5
            X.1h4 r1 = r6.A03
            java.lang.String r0 = r0.A0H
            long r3 = r1.A01(r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0849
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r5.A0R = r0
        L_0x0849:
            X.18K r1 = r6.A02
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.CC7(r5)
            r1.Bio()
            return
        L_0x0856:
            java.lang.Object r3 = r1.A01
            X.1T6 r3 = (X.AnonymousClass1T6) r3
            java.lang.Object r2 = r1.A02
            X.34B r2 = (X.AnonymousClass34B) r2
            java.lang.Object r0 = r1.A03
            X.2rU r0 = (X.C62492rU) r0
            r3.A0I(r2, r0)
            return
        L_0x0866:
            java.lang.Object r3 = r1.A01
            X.1T6 r3 = (X.AnonymousClass1T6) r3
            java.lang.Object r2 = r1.A02
            X.34B r2 = (X.AnonymousClass34B) r2
            java.lang.Object r0 = r1.A03
            X.2g5 r0 = (X.C55612g5) r0
            X.AnonymousClass1T6.A07(r3, r2, r0)
            return
        L_0x0876:
            java.lang.Object r3 = r1.A01
            byte[] r3 = (byte[]) r3
            java.lang.Object r2 = r1.A02
            X.206 r2 = (X.AnonymousClass206) r2
            java.lang.Object r0 = r1.A03
            X.7Jj r0 = (X.C144967Jj) r0
            r1 = -1
            if (r3 == 0) goto L_0x088e
            r2.A0p(r3)
            X.121 r0 = r0.A01
            r0.CQx(r2, r1)
            return
        L_0x088e:
            X.1Lg r0 = r0.A02
            r0.A02(r2, r1)
            return
        L_0x0894:
            java.lang.Object r4 = r1.A01
            com.whatsapp.lists.ListsRepository r4 = (com.whatsapp.lists.ListsRepository) r4
            java.lang.Object r3 = r1.A02
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r1.A03
            r1 = 0
            goto L_0x08ae
        L_0x08a0:
            java.lang.Object r4 = r1.A01
            com.whatsapp.lists.ListsRepository r4 = (com.whatsapp.lists.ListsRepository) r4
            java.lang.Object r3 = r1.A02
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r1.A03
            boolean r1 = X.C72453Mb.A1Z(r3)
        L_0x08ae:
            r0 = 2
            X.C18070vi.A0d(r2, r0)
            java.util.List r0 = X.C18070vi.A0M(r2)
            com.whatsapp.lists.ListsRepository.A00(r4, r3, r0, r1)
            return
        L_0x08ba:
            java.lang.Object r3 = r1.A01
            X.1BI r3 = (X.AnonymousClass1BI) r3
            java.lang.Object r2 = r1.A02
            X.4LM r2 = (X.AnonymousClass4LM) r2
            java.lang.Object r1 = r1.A03
            X.2jj r1 = (X.C57842jj) r1
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            boolean r0 = r3 instanceof X.AnonymousClass1E9     // Catch:{ Exception -> 0x08f3 }
            if (r0 == 0) goto L_0x08e6
            X.1E9 r3 = (X.AnonymousClass1E9) r3     // Catch:{ Exception -> 0x08f3 }
            X.4aY r0 = r2.A00     // Catch:{ Exception -> 0x08f3 }
            X.5cQ r0 = r0.A2Q     // Catch:{ Exception -> 0x08f3 }
            X.1MZ r0 = r0.getGroupParticipantsManager()     // Catch:{ Exception -> 0x08f3 }
            X.1MW r0 = r0.A08     // Catch:{ Exception -> 0x08f3 }
            X.2tp r0 = r0.A0B(r3)     // Catch:{ Exception -> 0x08f3 }
            X.10f r0 = r0.A0C()     // Catch:{ Exception -> 0x08f3 }
        L_0x08e2:
            r1.A00(r0)     // Catch:{ Exception -> 0x08f3 }
            goto L_0x08f2
        L_0x08e6:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r3, r0)     // Catch:{ Exception -> 0x08f3 }
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ Exception -> 0x08f3 }
            X.10f r0 = X.C199410f.of(r3)     // Catch:{ Exception -> 0x08f3 }
            goto L_0x08e2
        L_0x08f2:
            return
        L_0x08f3:
            r1 = move-exception
            java.lang.String r0 = "ConversationDelegate/requestMissingLidsOnChatOpen"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x08fa:
            java.lang.Object r5 = r1.A01
            java.lang.Object r4 = r1.A02
            X.10I r4 = (X.AnonymousClass10I) r4
            java.lang.Object r3 = r1.A03
            r0 = 1
            X.3NW r2 = new X.3NW
            r2.<init>(r5, r0)
            r1 = 35
            X.7Pj r0 = new X.7Pj
            r0.<init>(r3, r2, r1)
            r4.CGF(r0)
            return
        L_0x0913:
            java.lang.Object r2 = r1.A01
            X.1D6 r2 = (X.AnonymousClass1D6) r2
            java.lang.Object r4 = r1.A02
            com.whatsapp.labelitem.view.AddToListViewModel r4 = (com.whatsapp.labelitem.view.AddToListViewModel) r4
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r5 = 2
            int r1 = X.AnonymousClass3MZ.A04(r2)
            int r0 = X.C108955ca.A09(r2)
            if (r1 > 0) goto L_0x0951
            if (r0 > 0) goto L_0x0951
            X.00H r0 = r4.A0K
            boolean r0 = X.C72453Mb.A1W(r0)
            if (r0 == 0) goto L_0x093f
            X.00H r0 = r4.A0F
            java.lang.Object r0 = r0.get()
            X.1NN r0 = (X.AnonymousClass1NN) r0
        L_0x093c:
            r0.A01(r5)
        L_0x093f:
            X.00H r0 = r4.A0K
            r0.get()
            X.1KB r0 = r4.A04
            r0.A04()
            X.1wy r1 = r4.A0B
            X.1Wu r0 = X.C27621Wu.A00
            r1.A0F(r0)
            return
        L_0x0951:
            X.00H r0 = r4.A0H
            X.10T r1 = X.C17880vN.A0V(r0)
            r0 = 3
            X.C17890vO.A0q(r1, r0)
            X.6is r3 = r4.A00
            if (r3 == 0) goto L_0x0978
            java.util.Collection r0 = r3.A05
            java.util.Iterator r2 = r0.iterator()
        L_0x0965:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0975
            X.1BI r1 = X.C17880vN.A0Q(r2)
            X.1NN r0 = r3.A00
            r0.A02(r1)
            goto L_0x0965
        L_0x0975:
            X.1NN r0 = r3.A00
            goto L_0x093c
        L_0x0978:
            java.lang.String r0 = "addToListManager"
            goto L_0x0d26
        L_0x097c:
            java.lang.Object r2 = r1.A01
            X.6jq r2 = (X.C130686jq) r2
            java.lang.Object r6 = r1.A02
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.Object r5 = r1.A03
            java.lang.Integer r5 = (java.lang.Integer) r5
            r0 = 2
            X.C18070vi.A0d(r5, r0)
            X.1M9 r0 = r2.A01
            X.1E7 r7 = r0.A0E(r6)
            if (r7 != 0) goto L_0x099a
            java.lang.String r0 = "SurveyManager/validateContact contact is null"
        L_0x0996:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x099a:
            boolean r0 = r7.A0C()
            if (r0 != 0) goto L_0x09a3
            java.lang.String r0 = "SurveyManager/validateContact contact is not business"
            goto L_0x0996
        L_0x09a3:
            X.1yf r0 = r7.A0G
            if (r0 != 0) goto L_0x09aa
            java.lang.String r0 = "SurveyManager/validateContact verifiedNameDetails is null"
            goto L_0x0996
        L_0x09aa:
            X.00H r1 = r2.A04
            java.lang.Object r0 = r1.get()
            X.A5T r0 = (X.A5T) r0
            java.lang.Object r0 = r0.A02(r6)
            if (r0 == 0) goto L_0x09d2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SurveyManager/registerConversionEvent already existing conversion with business="
            r1.append(r0)
            java.lang.String r0 = r6.getRawString()
            r1.append(r0)
            java.lang.String r0 = " skipping"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
        L_0x09ce:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x09d2:
            java.lang.String r4 = X.C108985cd.A0f()
            java.lang.String r0 = X.C108985cd.A0f()
            X.6r0 r3 = new X.6r0
            r3.<init>(r4, r0)
            java.lang.Integer r13 = X.AnonymousClass00R.A00
            X.1yf r0 = r7.A0G
            if (r0 == 0) goto L_0x09ee
            boolean r4 = r0.A03()
            r0 = 1
            if (r4 != r0) goto L_0x09ee
            java.lang.Integer r13 = X.AnonymousClass00R.A01
        L_0x09ee:
            r6.getRawString()
            long r15 = java.lang.System.currentTimeMillis()
            X.9uJ r11 = new X.9uJ
            r12 = r6
            r14 = r5
            r11.<init>(r12, r13, r14, r15)
            X.00H r4 = r2.A06
            java.lang.Object r7 = r4.get()
            X.A6O r7 = (X.A6O) r7
            r0 = 0
            X.8rB r5 = new X.8rB
            r5.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r5.A02 = r8
            int r0 = X.A6O.A00(r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A01 = r0
            java.lang.String r14 = r3.A00
            r5.A05 = r14
            X.18K r7 = r7.A01
            r7.CC7(r5)
            X.8rJ r5 = new X.8rJ
            r5.<init>()
            r5.A02 = r8
            int r0 = X.A6O.A00(r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A01 = r0
            com.whatsapp.jid.UserJid r12 = r11.A01
            java.lang.String r0 = r12.user
            java.lang.Long r0 = X.C108965cb.A0m(r0)
            r5.A03 = r0
            java.lang.String r15 = r3.A01
            r5.A04 = r15
            r7.CC7(r5)
            java.lang.Object r0 = r1.get()
            X.A5T r0 = (X.A5T) r0
            r0.A07(r11)
            X.00H r5 = r2.A07
            java.lang.Object r0 = r5.get()
            X.A5T r0 = (X.A5T) r0
            java.lang.Object r0 = r0.A02(r6)
            if (r0 == 0) goto L_0x0a7d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SurveyManager/createSurveySession already existing survey with business={"
            r1.append(r0)
            java.lang.String r0 = r6.getRawString()
            r1.append(r0)
            java.lang.String r0 = " skipping"
            X.C17890vO.A1A(r1, r0)
            java.lang.Object r1 = r4.get()
            X.A6O r1 = (X.A6O) r1
            java.lang.String r0 = "SurveyManager/createSurveySession survey already exists with business skipping"
        L_0x0a79:
            r1.A03(r3, r11, r0)
            return
        L_0x0a7d:
            java.lang.Object r0 = r5.get()
            X.A5T r0 = (X.A5T) r0
            java.util.ArrayList r0 = r0.A04()
            boolean r0 = X.C17880vN.A1X(r0)
            if (r0 == 0) goto L_0x0a9b
            java.lang.String r0 = "SurveyManager/createSurveySession already existing surveys skipping"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r4.get()
            X.A6O r1 = (X.A6O) r1
            java.lang.String r0 = "SurveyManager/createSurveySession survey already exists"
            goto L_0x0a79
        L_0x0a9b:
            X.00H r7 = r2.A05
            java.lang.Object r9 = r7.get()
            X.6m0 r9 = (X.C131996m0) r9
            java.lang.String r1 = "force_pass_sampling_rate"
            r10 = 0
            X.0ve r8 = r9.A01
            r0 = 3982(0xf8e, float:5.58E-42)
            java.lang.String r8 = X.C108955ca.A0v(r8, r0)
            org.json.JSONObject r0 = X.C17880vN.A16(r8)     // Catch:{ JSONException -> 0x0aba }
            boolean r0 = r0.optBoolean(r1, r10)     // Catch:{ JSONException -> 0x0aba }
            if (r0 == 0) goto L_0x0ac1
            goto L_0x0b3a
        L_0x0aba:
            X.190 r1 = r9.A00
            java.lang.String r0 = "WABISurveyFeatureConfigParse"
            r1.A0G(r0, r8, r10)
        L_0x0ac1:
            X.1Ty r0 = r2.A00
            X.AEW r9 = r0.A08(r6)
            if (r9 != 0) goto L_0x0b31
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SurveyManager/createSurveySession business profile null "
            r1.append(r0)
            java.lang.String r0 = r6.getRawString()
            X.C17890vO.A19(r1, r0)
        L_0x0ad9:
            java.lang.Object r1 = r7.get()
            X.6m0 r1 = (X.C131996m0) r1
            java.lang.String r0 = "default_survey_sampling_rate"
            int r8 = r1.A00(r0, r10)
        L_0x0ae5:
            r6 = 1
            r1 = 100
            X.1JU r0 = X.AnonymousClass1JU.A01
            int r0 = r0.A03(r6, r1)
            if (r0 <= r8) goto L_0x0af1
            r6 = 0
        L_0x0af1:
            java.lang.Object r1 = r4.get()
            X.A6O r1 = (X.A6O) r1
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SurveyManager/passesSurveySamplingRate business profile_null="
            r7.append(r0)
            if (r9 != 0) goto L_0x0b03
            r10 = 1
        L_0x0b03:
            r7.append(r10)
            java.lang.String r0 = " profile_sample_rate="
            r7.append(r0)
            if (r9 == 0) goto L_0x0b2f
            java.lang.Integer r0 = r9.A0A
        L_0x0b0f:
            r7.append(r0)
            java.lang.String r0 = " sample_rate="
            r7.append(r0)
            r7.append(r8)
            java.lang.String r0 = " eval_pass={"
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = X.C17890vO.A0b(r7)
            r1.A03(r3, r11, r0)
            if (r6 != 0) goto L_0x0b45
            java.lang.String r0 = "SurveyManager/createSurveySession didn't pass survey sampling rate"
            goto L_0x09ce
        L_0x0b2f:
            r0 = 0
            goto L_0x0b0f
        L_0x0b31:
            java.lang.Integer r0 = r9.A0A
            if (r0 == 0) goto L_0x0ad9
            int r8 = r0.intValue()
            goto L_0x0ae5
        L_0x0b3a:
            java.lang.Object r1 = r4.get()
            X.A6O r1 = (X.A6O) r1
            java.lang.String r0 = "SurveyManager/passesSurveySamplingRate force_pass_sampling_rate=true"
            r1.A03(r3, r11, r0)
        L_0x0b45:
            long r16 = java.lang.System.currentTimeMillis()
            java.lang.String r13 = "ctwa_ace"
            X.9tI r10 = new X.9tI
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.lang.Object r0 = r5.get()
            X.A5T r0 = (X.A5T) r0
            r0.A07(r10)
            java.lang.Object r1 = r4.get()
            X.A6O r1 = (X.A6O) r1
            java.lang.String r0 = "SurveyManager/passesSurveySamplingRate before notifyObservers"
            r1.A03(r3, r11, r0)
            X.00H r0 = r2.A08
            X.10T r2 = X.C17880vN.A0V(r0)
            r1 = 17
            X.AWd r0 = new X.AWd
            r0.<init>(r10, r1)
            r2.notifyAllObservers(r0)
            return
        L_0x0b75:
            java.lang.Object r14 = r1.A01
            X.8uu r14 = (X.C173338uu) r14
            java.lang.Object r13 = r1.A02
            X.206 r13 = (X.AnonymousClass206) r13
            java.lang.Object r12 = r1.A03
            java.util.concurrent.CountDownLatch r12 = (java.util.concurrent.CountDownLatch) r12
            java.lang.String r11 = "initialize_player_end"
            r10 = 1
            r9 = 494342675(0x1d771213, float:3.2699522E-21)
            X.19T r1 = r14.A05     // Catch:{ Exception -> 0x0c60 }
            java.lang.String r0 = "initialize_player_start"
            r1.markerPoint(r9, r0)     // Catch:{ Exception -> 0x0c60 }
            r0 = 0
            r14.A07 = r0     // Catch:{ Exception -> 0x0c60 }
            X.6qC r7 = r14.A02     // Catch:{ Exception -> 0x0c60 }
            X.22l r13 = (X.C441822l) r13     // Catch:{ Exception -> 0x0c60 }
            X.1f4 r8 = r7.A02     // Catch:{ Exception -> 0x0c60 }
            boolean r0 = r8.A0D(r13)     // Catch:{ Exception -> 0x0c60 }
            if (r0 == 0) goto L_0x0bac
            X.7Mo r7 = r8.A00()     // Catch:{ Exception -> 0x0c60 }
            X.C17960vV.A07(r7)     // Catch:{ Exception -> 0x0c60 }
        L_0x0ba4:
            r14.A00 = r7     // Catch:{ Exception -> 0x0c60 }
            r0 = 0
            r7.A0G(r0)     // Catch:{ Exception -> 0x0c60 }
            goto L_0x0c68
        L_0x0bac:
            r6 = 1
            int r0 = X.C145777Mo.A15     // Catch:{ Exception -> 0x0c60 }
            X.118 r0 = r7.A04     // Catch:{ Exception -> 0x0c60 }
            r45 = r0
            X.0ve r0 = r7.A08     // Catch:{ Exception -> 0x0c60 }
            r26 = r0
            X.1KB r0 = r7.A01     // Catch:{ Exception -> 0x0c60 }
            r44 = r0
            X.190 r0 = r7.A00     // Catch:{ Exception -> 0x0c60 }
            r43 = r0
            X.10I r0 = r7.A0F     // Catch:{ Exception -> 0x0c60 }
            r35 = r0
            X.6uN r0 = r7.A0E     // Catch:{ Exception -> 0x0c60 }
            r34 = r0
            X.11C r0 = r7.A03     // Catch:{ Exception -> 0x0c60 }
            r42 = r0
            X.1Vg r0 = r7.A0D     // Catch:{ Exception -> 0x0c60 }
            r33 = r0
            X.1Lg r0 = r7.A07     // Catch:{ Exception -> 0x0c60 }
            r22 = r0
            X.00H r0 = r7.A0K     // Catch:{ Exception -> 0x0c60 }
            java.lang.Object r5 = r0.get()     // Catch:{ Exception -> 0x0c60 }
            X.6mI r5 = (X.C132156mI) r5     // Catch:{ Exception -> 0x0c60 }
            X.00H r0 = r7.A0M     // Catch:{ Exception -> 0x0c60 }
            java.lang.Object r4 = r0.get()     // Catch:{ Exception -> 0x0c60 }
            X.2LC r4 = (X.AnonymousClass2LC) r4     // Catch:{ Exception -> 0x0c60 }
            X.17x r0 = r7.A05     // Catch:{ Exception -> 0x0c60 }
            r23 = r0
            X.1L1 r0 = r7.A0A     // Catch:{ Exception -> 0x0c60 }
            r21 = r0
            X.00H r0 = r7.A0H     // Catch:{ Exception -> 0x0c60 }
            java.lang.Object r3 = r0.get()     // Catch:{ Exception -> 0x0c60 }
            X.2Kv r3 = (X.C48012Kv) r3     // Catch:{ Exception -> 0x0c60 }
            X.8CB r0 = r7.A0B     // Catch:{ Exception -> 0x0c60 }
            r20 = r0
            X.2tI r0 = r7.A09     // Catch:{ Exception -> 0x0c60 }
            r19 = r0
            X.1f2 r0 = r7.A0C     // Catch:{ Exception -> 0x0c60 }
            r18 = r0
            X.00H r0 = r7.A0I     // Catch:{ Exception -> 0x0c60 }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x0c60 }
            X.4aG r2 = (X.C88634aG) r2     // Catch:{ Exception -> 0x0c60 }
            X.00H r0 = r7.A0L     // Catch:{ Exception -> 0x0c60 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0c60 }
            X.6yb r1 = (X.C139296yb) r1     // Catch:{ Exception -> 0x0c60 }
            X.19r r0 = r7.A06     // Catch:{ Exception -> 0x0c60 }
            r17 = r0
            X.00H r15 = r7.A0J     // Catch:{ Exception -> 0x0c60 }
            X.00H r0 = r7.A0G     // Catch:{ Exception -> 0x0c60 }
            r16 = 0
            X.7Mo r7 = new X.7Mo     // Catch:{ Exception -> 0x0c60 }
            r41 = r10
            r24 = r17
            r25 = r22
            r27 = r2
            r28 = r19
            r29 = r21
            r30 = r20
            r31 = r18
            r32 = r1
            r36 = r5
            r37 = r4
            r38 = r15
            r39 = r0
            r40 = r10
            r15 = r7
            r17 = r43
            r18 = r44
            r19 = r3
            r20 = r8
            r21 = r42
            r22 = r45
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ Exception -> 0x0c60 }
            r7.A0K = r13     // Catch:{ Exception -> 0x0c60 }
            X.205 r0 = r13.A0v     // Catch:{ Exception -> 0x0c60 }
            boolean r0 = r0.A02     // Catch:{ Exception -> 0x0c60 }
            if (r0 != 0) goto L_0x0ba4
            int r1 = r13.A0D()     // Catch:{ Exception -> 0x0c60 }
            r0 = 9
            if (r1 == r0) goto L_0x0c5c
            r0 = 10
            if (r1 == r0) goto L_0x0c5c
            r6 = 0
        L_0x0c5c:
            r7.A0Q = r6     // Catch:{ Exception -> 0x0c60 }
            goto L_0x0ba4
        L_0x0c60:
            r1 = move-exception
            r14.A07 = r10     // Catch:{ all -> 0x0c71 }
            java.lang.String r0 = "PlayVoiceMessageRequest/ caught exception preparing and playing media player"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0c71 }
        L_0x0c68:
            X.19T r0 = r14.A05
            r0.markerPoint(r9, r11)
            r12.countDown()
            return
        L_0x0c71:
            r1 = move-exception
            X.19T r0 = r14.A05
            r0.markerPoint(r9, r11)
            r12.countDown()
            throw r1
        L_0x0c7b:
            java.lang.Object r5 = r1.A01
            X.8uu r5 = (X.C173338uu) r5
            java.lang.Object r9 = r1.A02
            java.util.concurrent.CountDownLatch r9 = (java.util.concurrent.CountDownLatch) r9
            java.lang.Object r7 = r1.A03
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.String r8 = "Service internal error! "
            java.lang.String r6 = "fail_reason"
            r4 = 3
            r2 = 494342675(0x1d771213, float:3.2699522E-21)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0cd5 }
            r0 = 3
            boolean r0 = r9.await(r0, r3)     // Catch:{ InterruptedException -> 0x0cd5 }
            if (r0 == 0) goto L_0x0cdb
            r3 = 3
            if (r7 == 0) goto L_0x0cdb
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x0ca8
            X.19T r1 = r5.A05
            java.lang.String r0 = "Media player failure"
            r1.markerAnnotate((int) r2, (java.lang.String) r6, (java.lang.String) r0)
            return
        L_0x0ca8:
            java.lang.String r0 = "error_message"
            java.lang.String r1 = r7.optString(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0cb9
            X.19T r0 = r5.A05
            r0.markerAnnotate((int) r2, (java.lang.String) r6, (java.lang.String) r1)
        L_0x0cb9:
            java.lang.String r0 = "success"
            boolean r1 = r7.getBoolean(r0)     // Catch:{ JSONException -> 0x0cc5 }
            X.19T r0 = r5.A05
            if (r1 == 0) goto L_0x0ccd
            r3 = 2
            goto L_0x0ccd
        L_0x0cc5:
            r1 = move-exception
            java.lang.String r0 = "PlayVoiceMessageRequest/ caught JSON exception reading result JSON"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0cd1 }
            X.19T r0 = r5.A05
        L_0x0ccd:
            r0.markerEnd(r2, r3)
            return
        L_0x0cd1:
            r1 = move-exception
            X.19T r0 = r5.A05
            goto L_0x0cea
        L_0x0cd5:
            r1 = move-exception
            java.lang.String r0 = "PlayVoiceMessageRequest/ caught InterruptedException"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0ce4 }
        L_0x0cdb:
            X.19T r0 = r5.A05
            r0.markerAnnotate((int) r2, (java.lang.String) r6, (java.lang.String) r8)
            r0.markerEnd(r2, r4)
            return
        L_0x0ce4:
            r1 = move-exception
            X.19T r0 = r5.A05
            r0.markerAnnotate((int) r2, (java.lang.String) r6, (java.lang.String) r8)
        L_0x0cea:
            r0.markerEnd(r2, r4)
            throw r1
        L_0x0cee:
            java.lang.Object r2 = r1.A01
            com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet r2 = (com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet) r2
            java.lang.Object r3 = r1.A02
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r1 = r1.A03
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            X.6gB r2 = r2.A03
            if (r2 == 0) goto L_0x0d24
            android.os.Bundle r5 = X.C17880vN.A0D()
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.suspendedEntityJid"
            X.AnonymousClass3MY.A15(r5, r1, r0)
            X.6mP r1 = r2.A00
            X.1MB r0 = r2.A01
            boolean r12 = r0.A00()
            r6 = 0
            java.lang.String r8 = "group-suspend-appeal"
            X.6np r4 = r1.A00
            r9 = r6
            r10 = r6
            r11 = r6
            r7 = r6
            android.content.Intent r0 = r4.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            r3.startActivity(r0)
            return
        L_0x0d24:
            java.lang.String r0 = "interactionHelper"
        L_0x0d26:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0d2b:
            java.lang.Object r4 = r1.A01
            X.1L9 r4 = (X.AnonymousClass1L9) r4
            java.lang.Object r2 = r1.A02
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r1.A03
            X.8Hs r1 = (X.C161778Hs) r1
            java.util.List r0 = X.C42011xT.A0I
            android.content.Context r3 = r2.getContext()
            android.content.Context r2 = r2.getContext()
            X.1EC r1 = r1.A00
            r0 = 4
            android.content.Intent r0 = X.AnonymousClass1LU.A0o(r2, r1, r0)
            r4.A08(r3, r0)
            return
        L_0x0d4c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Uri path is null: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0d5b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Uri lacks 'file' scheme: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0d6a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0d6c }
        L_0x0d6c:
            r1 = move-exception
            X.CDX.A00(r3, r0)
            throw r1
        L_0x0d71:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0d73 }
        L_0x0d73:
            r1 = move-exception
            X.CDX.A00(r2, r0)
            throw r1
        L_0x0d78:
            X.19Y r3 = X.C30151dT.A00(r2)
            int r1 = r0.intValue()
            java.lang.String r0 = "chatd_session_end"
            java.lang.String r2 = X.AnonymousClass2U8.A00(r1, r0)
            java.lang.String r1 = X.C17900vP.A08(r5)
            r0 = 125908665(0x78136b9, float:1.9441926E-34)
            r3.markerPoint((int) r0, (java.lang.String) r2, (java.lang.String) r1)
            java.util.Map r0 = r4.A07
            java.util.Map r0 = X.C41681wt.A03(r0)
            r0.remove(r6)
            return
        L_0x0d9a:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
            throw r1
        L_0x0d9f:
            r1 = move-exception
            monitor-exit(r9)
            throw r1
        L_0x0da2:
            java.lang.String r3 = "_data=?"
            java.lang.String[] r2 = X.C17880vN.A1Y()     // Catch:{ SQLiteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0dc4, RuntimeException -> 0x0db3 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ SQLiteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0dc4, RuntimeException -> 0x0db3 }
            r0 = 0
            r2[r0] = r1     // Catch:{ SQLiteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0dc4, RuntimeException -> 0x0db3 }
            r4.A01(r6, r3, r2)     // Catch:{ SQLiteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0dc4, RuntimeException -> 0x0db3 }
            return
        L_0x0db3:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            if (r1 == 0) goto L_0x0dc3
            java.lang.String r0 = "android.os.DeadSystemException"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0dc3
            goto L_0x0dc5
        L_0x0dc3:
            throw r2
        L_0x0dc4:
            r2 = move-exception
        L_0x0dc5:
            com.whatsapp.util.Log.e(r5, r2)
            return
        L_0x0dc9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0dcb }
        L_0x0dcb:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0dd0 }
            throw r0     // Catch:{ all -> 0x0dd0 }
        L_0x0dd0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0dd2 }
        L_0x0dd2:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        L_0x0dd7:
            java.lang.Object r3 = r1.A01
            java.lang.Object r2 = r1.A02
            X.6k4 r2 = (X.C130826k4) r2
            java.lang.Object r1 = r1.A03
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.00H r0 = r2.A04
            X.1KB r7 = X.C108945cZ.A0a(r0)
            r0 = 45
            X.7R0 r6 = new X.7R0
            r6.<init>(r2, r1, r3, r0)
            goto L_0x0efb
        L_0x0df2:
            java.lang.Object r4 = r1.A01
            X.6xb r4 = (X.C138736xb) r4
            java.lang.Object r7 = r1.A02
            java.lang.Object r5 = r1.A03
            r6 = 0
            X.00H r3 = r4.A0a
            java.lang.Object r1 = r3.get()
            X.1To r1 = (X.C26811To) r1
            java.util.Set r0 = X.C18070vi.A0P(r7)
            java.util.Set r2 = r1.A0E(r0, r6)
            X.C18070vi.A0X(r2)
            X.00H r0 = r4.A0X
            java.lang.Object r1 = r0.get()
            X.1aO r1 = (X.C28531aO) r1
            java.util.Set r0 = X.C18070vi.A0P(r7)
            boolean r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x0e43
            X.00H r0 = r4.A0H
            X.1KB r1 = X.C108945cZ.A0a(r0)
            r0 = 2131897360(0x7f122c10, float:1.9429607E38)
            r1.A09(r0, r6)
            java.lang.Object r0 = r3.get()
            X.1To r0 = (X.C26811To) r0
            r0.A0Q(r2)
        L_0x0e35:
            X.00H r0 = r4.A0H
            X.1KB r7 = X.C108945cZ.A0a(r0)
            r0 = 25
        L_0x0e3d:
            X.3Br r6 = X.C108945cZ.A0X(r5, r0)
            goto L_0x0efb
        L_0x0e43:
            java.lang.Object r0 = r3.get()
            X.1To r0 = (X.C26811To) r0
            r0.A0R(r2)
            goto L_0x0e35
        L_0x0e4d:
            java.lang.Object r4 = r1.A01
            X.6xb r4 = (X.C138736xb) r4
            java.lang.Object r8 = r1.A02
            java.lang.Object r5 = r1.A03
            X.00H r6 = r4.A0W
            java.lang.Object r0 = r6.get()
            X.2i4 r0 = (X.C56812i4) r0
            r7 = 1
            r0.A00(r7, r7)
            java.lang.Object r0 = r6.get()
            X.2i4 r0 = (X.C56812i4) r0
            X.19a r0 = r0.A00
            java.lang.String r2 = "update_star_message_store"
            r0.A07(r2)
            X.00H r0 = r4.A0X
            java.lang.Object r1 = r0.get()
            X.1aO r1 = (X.C28531aO) r1
            java.util.Set r0 = X.C18070vi.A0P(r8)
            r1.A00(r0)
            java.lang.Object r0 = r6.get()
            X.2i4 r0 = (X.C56812i4) r0
            X.19a r0 = r0.A00
            r0.A06(r2)
            java.lang.Object r0 = r6.get()
            X.2i4 r0 = (X.C56812i4) r0
            X.19a r0 = r0.A00
            java.lang.String r3 = "sync"
            r0.A07(r3)
            X.00H r2 = r4.A0a
            java.lang.Object r1 = r2.get()
            X.1To r1 = (X.C26811To) r1
            java.util.Set r0 = X.C18070vi.A0P(r8)
            java.util.Set r1 = r1.A0E(r0, r7)
            X.C18070vi.A0X(r1)
            java.lang.Object r0 = r2.get()
            X.1To r0 = (X.C26811To) r0
            r0.A0R(r1)
            java.lang.Object r0 = r6.get()
            X.2i4 r0 = (X.C56812i4) r0
            X.19a r0 = r0.A00
            r0.A06(r3)
            X.00H r0 = r4.A0H
            X.1KB r7 = X.C108945cZ.A0a(r0)
            r0 = 14
            X.3By r6 = new X.3By
            r6.<init>(r5, r4, r0)
            goto L_0x0efb
        L_0x0eca:
            java.lang.Object r0 = r1.A01
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            java.lang.Object r4 = r1.A02
            X.1gm r4 = (X.C32181gm) r4
            java.lang.Object r3 = r1.A03
            if (r0 == 0) goto L_0x0eff
            com.whatsapp.jid.UserJid r2 = r0.A0K
            if (r2 == 0) goto L_0x0eff
            X.00H r0 = r4.A02
            java.lang.Object r1 = r0.get()
            X.1Me r1 = (X.C24921Me) r1
            X.00H r0 = r4.A00
            java.lang.Object r0 = r0.get()
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            java.lang.String r1 = X.AnonymousClass3MY.A0p(r0, r1, r2)
        L_0x0eee:
            X.00H r0 = r4.A01
            X.1KB r7 = X.C108945cZ.A0a(r0)
            r0 = 20
            X.7Qs r6 = new X.7Qs
            r6.<init>(r0, r1, r3)
        L_0x0efb:
            r7.A0J(r6)
            return
        L_0x0eff:
            r1 = 0
            goto L_0x0eee
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7R0.run():void");
    }

    public AnonymousClass7R0(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }
}
