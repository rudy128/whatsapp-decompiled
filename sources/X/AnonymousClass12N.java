package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.12N  reason: invalid class name */
public class AnonymousClass12N implements C201511a {
    public final AnonymousClass190 A00;
    public final C18030ve A01;
    public final C25931Qe A02;
    public final C52182aV A03;
    public final C192249o3 A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final C18100vl A0A = new C18110vm(new C21918Aui(this));
    public final C18100vl A0B = new C18110vm(new AnonymousClass3HP(this));
    public final C19880zA A0C;
    public final C54462eB A0D;
    public final AnonymousClass00H A0E;

    public AnonymousClass12N(C19880zA r3, AnonymousClass190 r4, C18030ve r5, C25931Qe r6, C52182aV r7, C192249o3 r8, C54462eB r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r10, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r3, 4);
        C18070vi.A0d(r11, 5);
        C18070vi.A0d(r9, 6);
        C18070vi.A0d(r6, 7);
        C18070vi.A0d(r12, 8);
        C18070vi.A0d(r13, 10);
        C18070vi.A0d(r14, 11);
        C18070vi.A0d(r15, 12);
        this.A01 = r5;
        this.A0E = r10;
        this.A00 = r4;
        this.A0C = r3;
        this.A05 = r11;
        this.A0D = r9;
        this.A02 = r6;
        this.A09 = r12;
        this.A04 = r8;
        this.A08 = r13;
        this.A07 = r14;
        this.A06 = r15;
        this.A03 = r7;
    }

    public void A01(C19998A2m a2m, AnonymousClass206 r15) {
        Integer num;
        AnonymousClass1BI A0I;
        C165988cA r8;
        int i;
        AnonymousClass9Ja r0;
        AnonymousClass9Ja r02;
        C179699Jn r03;
        C18070vi.A0d(r15, 0);
        C25931Qe r2 = this.A02;
        boolean z = a2m.A05;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(AnonymousClass8BG.class);
        linkedHashSet.add(AnonymousClass22C.class);
        linkedHashSet.add(AnonymousClass22A.class);
        linkedHashSet.add(C693036r.class);
        linkedHashSet.add(C693136s.class);
        linkedHashSet.add(C692936q.class);
        if (z) {
            linkedHashSet.add(C693336u.class);
        }
        for (AnonymousClass25F A002 : r2.A04(r15, linkedHashSet)) {
            C25931Qe.A00(r2, A002);
        }
        AnonymousClass00H r7 = this.A09;
        C61612py r5 = (C61612py) r7.get();
        Object obj = r5.A03.get();
        C18070vi.A0X(obj);
        Iterator it = ((Iterable) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                num = AnonymousClass00R.A00;
                break;
            }
            AnonymousClass3L4 r22 = (AnonymousClass3L4) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append("ProtobufProcessorManager: proto-out, pre-processing with ");
            Class<?> cls = r22.getClass();
            Map map = AnonymousClass20F.A03;
            C18070vi.A0d(cls, 1);
            sb.append(C60662oP.A01(cls));
            sb.toString();
            C61612py.A00(r5);
            Integer C1P = r22.C1P(a2m, r15);
            num = AnonymousClass00R.A01;
            if (C1P == num) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ProtobufProcessorManager: proto-out, pre-processing stopped on ");
                sb2.append(C60662oP.A01(cls));
                sb2.toString();
                C61612py.A00(r5);
                break;
            }
        }
        if (num != AnonymousClass00R.A01) {
            C18100vl r1 = this.A0B;
            int i2 = r15.A0u;
            C436820m r23 = (C436820m) ((AnonymousClass20Z) r1.getValue()).A00(i2);
            AnonymousClass20A A003 = ((AnonymousClass20Z) r1.getValue()).A00(i2);
            if ((A003 instanceof C22575BDq) || !(A003 instanceof B85)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("message does not support serialization, key=");
                sb3.append(r15.A0v);
                sb3.append(", message_type=");
                sb3.append(i2);
                String obj2 = sb3.toString();
                C17960vV.A0F(false, obj2);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("FMessageProtobufSubsystem/buildProtobufMessage; ");
                sb4.append(obj2);
                Log.w(sb4.toString());
                this.A00.A0G("fmessage-protobuf-serialization-not-supported", String.valueOf(i2), false);
            } else {
                C18070vi.A0z(r23, "null cannot be cast to non-null type com.whatsapp.fmessage.protobuf.serialization.FMessageProtobufSerializer");
                try {
                    ((B85) r23).BDb(a2m, r15);
                } catch (AnonymousClass1T8 e) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("FMessageProtobufSubsystem/buildProtobufMessage; invalid message ");
                    sb5.append(r15.A0v);
                    Log.e(sb5.toString(), e);
                    if (a2m.A04) {
                        throw e;
                    }
                }
                C192249o3 r6 = this.A04;
                r6.A01(a2m, r15);
                C18030ve r52 = r6.A00;
                C692136i A004 = AnonymousClass2UX.A00(r15);
                if (A004 != null) {
                    AnonymousClass8X8 r24 = a2m.A00;
                    C166118cN r04 = r24.A0G().botMetadata_;
                    if (r04 == null) {
                        r04 = C166118cN.DEFAULT_INSTANCE;
                    }
                    C165988cA r82 = r04.pluginMetadata_;
                    if (r82 == null) {
                        r82 = C165988cA.DEFAULT_INSTANCE;
                    }
                    C23624Bmt A0N = C165988cA.DEFAULT_INSTANCE.A0N();
                    A0N.A0F(r82);
                    C179479Ic r05 = A004.A01;
                    if (r05 != null) {
                        int ordinal = r05.ordinal();
                        if (ordinal == 0) {
                            r03 = C179699Jn.BING;
                        } else if (ordinal == 1) {
                            r03 = C179699Jn.GOOGLE;
                        } else if (ordinal == 2) {
                            r03 = C179699Jn.SUPPORT;
                        } else {
                            throw new AnonymousClass3EW();
                        }
                        A0N.A0E();
                        C165988cA r83 = (C165988cA) A0N.A00;
                        r83.provider_ = r03.value;
                        r83.bitField0_ |= 1;
                    }
                    C179539Ij r84 = A004.A00;
                    if (r84 != null) {
                        if (r84 == C179539Ij.REELS || r84 == C179539Ij.SEARCH) {
                            if (r84.ordinal() != 0) {
                                r0 = AnonymousClass9Ja.SEARCH;
                            } else {
                                r0 = AnonymousClass9Ja.REELS;
                            }
                            A0N.A0E();
                            r8 = (C165988cA) A0N.A00;
                            r8.pluginType_ = r0.value;
                            i = r8.bitField0_ | 2;
                        } else {
                            int ordinal2 = r84.ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        if (ordinal2 != 3) {
                                            throw new AnonymousClass3EW();
                                        }
                                    }
                                }
                                r02 = AnonymousClass9Ja.SEARCH;
                                A0N.A0E();
                                r8 = (C165988cA) A0N.A00;
                                r8.parentPluginType_ = r02.value;
                                i = r8.bitField0_ | 512;
                            }
                            r02 = AnonymousClass9Ja.REELS;
                            A0N.A0E();
                            r8 = (C165988cA) A0N.A00;
                            r8.parentPluginType_ = r02.value;
                            i = r8.bitField0_ | 512;
                        }
                        r8.bitField0_ = i;
                    }
                    String str = A004.A07;
                    if (str != null) {
                        A0N.A0E();
                        C165988cA r85 = (C165988cA) A0N.A00;
                        r85.bitField0_ |= 4;
                        r85.thumbnailCdnUrl_ = str;
                    }
                    String str2 = A004.A04;
                    if (str2 != null) {
                        A0N.A0E();
                        C165988cA r86 = (C165988cA) A0N.A00;
                        r86.bitField0_ |= 8;
                        r86.profilePhotoCdnUrl_ = str2;
                    }
                    String str3 = A004.A05;
                    if (str3 != null) {
                        A0N.A0E();
                        C165988cA r87 = (C165988cA) A0N.A00;
                        r87.bitField0_ |= 16;
                        r87.searchProviderUrl_ = str3;
                    }
                    Integer num2 = A004.A02;
                    if (num2 != null) {
                        int intValue = num2.intValue();
                        A0N.A0E();
                        C165988cA r88 = (C165988cA) A0N.A00;
                        r88.bitField0_ |= 32;
                        r88.referenceIndex_ = intValue;
                    }
                    String str4 = A004.A03;
                    if (str4 != null) {
                        A0N.A0E();
                        C165988cA r4 = (C165988cA) A0N.A00;
                        r4.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                        r4.faviconCdnUrl_ = str4;
                    }
                    A0N.A0C();
                    C166118cN r42 = r24.A0G().botMetadata_;
                    if (r42 == null) {
                        r42 = C166118cN.DEFAULT_INSTANCE;
                    }
                    C23624Bmt A0N2 = C166118cN.DEFAULT_INSTANCE.A0N();
                    A0N2.A0F(r42);
                    A0N2.A0E();
                    C166118cN r43 = (C166118cN) A0N2.A00;
                    C165988cA r06 = (C165988cA) A0N.A0C();
                    r06.getClass();
                    r43.pluginMetadata_ = r06;
                    r43.bitField0_ |= 4;
                    C163938Wx r07 = a2m.A01;
                    r07.A0E();
                    C166048cG r12 = (C166048cG) r07.A00;
                    C166118cN r08 = (C166118cN) A0N2.A0C();
                    r08.getClass();
                    r12.botMetadata_ = r08;
                    r12.bitField0_ |= 64;
                    if (!C18020vd.A05(C18040vf.A01, r52, 7772)) {
                        C166048cG A0G = r24.A0G();
                        C23624Bmt A0N3 = C166048cG.DEFAULT_INSTANCE.A0N();
                        A0N3.A0F(A0G);
                        A0N3.A0E();
                        C166048cG r13 = (C166048cG) A0N3.A00;
                        C166118cN r09 = (C166118cN) A0N2.A0C();
                        r09.getClass();
                        r13.botMetadata_ = r09;
                        r13.bitField0_ |= 64;
                        r24.A0V((C166048cG) A0N3.A0C());
                    }
                }
                if (!AnonymousClass25A.A0j(r15)) {
                    AnonymousClass8X8 r010 = (AnonymousClass8X8) a2m.A00.clone();
                    C18070vi.A0b(r010);
                    C50122Tf.A00(r52, a2m, r010, r15);
                }
                r6.A00(a2m, r15);
                Integer num3 = a2m.A03;
                if (num3 != null && num3.intValue() == 1) {
                    C163938Wx r011 = a2m.A01;
                    r011.A0E();
                    C166048cG r14 = (C166048cG) r011.A00;
                    C166048cG r012 = C166048cG.DEFAULT_INSTANCE;
                    r14.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                    r14.capiCreatedGroup_ = true;
                    if (!C18020vd.A05(C18040vf.A01, r52, 7772)) {
                        AnonymousClass8X8 r44 = a2m.A00;
                        C166048cG A0G2 = r44.A0G();
                        C23624Bmt A0N4 = C166048cG.DEFAULT_INSTANCE.A0N();
                        A0N4.A0F(A0G2);
                        A0N4.A0E();
                        C166048cG r16 = (C166048cG) A0N4.A00;
                        r16.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                        r16.capiCreatedGroup_ = true;
                        r44.A0V((C166048cG) A0N4.A0C());
                    }
                }
                C61612py r53 = (C61612py) r7.get();
                Object obj3 = r53.A02.get();
                C18070vi.A0X(obj3);
                for (C53662ct r89 : (Iterable) obj3) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("ProtobufProcessorManager: proto-out, post-processing with ");
                    Class<?> cls2 = r89.getClass();
                    Map map2 = AnonymousClass20F.A03;
                    C18070vi.A0d(cls2, 1);
                    sb6.append(C60662oP.A01(cls2));
                    sb6.toString();
                    C61612py.A00(r53);
                    AnonymousClass00H r62 = r89.A01;
                    if (((C58682l5) r62.get()).A01(a2m, r15)) {
                        C693236t A005 = ((C58682l5) r62.get()).A00(r15);
                        C122766Rv r9 = (C122766Rv) C137736vw.A00.get(A005.A01);
                        if (r9 != null) {
                            C58682l5 r72 = (C58682l5) r62.get();
                            long j = A005.A00;
                            if (j >= 0) {
                                AnonymousClass206 A032 = ((AnonymousClass1W6) r72.A01.get()).A01.A03(j);
                                if (A032 != null) {
                                    AnonymousClass205 r013 = A032.A0v;
                                    C18070vi.A0W(r013);
                                    AnonymousClass205 A022 = ((C59392mE) r72.A02.get()).A02(r013);
                                    if (A022 != null) {
                                        if (r013.A02) {
                                            AnonymousClass11S r014 = r72.A00;
                                            r014.A0I();
                                            A0I = r014.A0E;
                                        } else {
                                            A0I = A032.A0I();
                                        }
                                        A51 a51 = new A51(A0I, A022);
                                        AnonymousClass8X8 r63 = a2m.A00;
                                        C164938aJ r17 = r63.A0G().messageAssociation_;
                                        if (r17 == null) {
                                            r17 = C164938aJ.DEFAULT_INSTANCE;
                                        }
                                        C23624Bmt A0N5 = C164938aJ.DEFAULT_INSTANCE.A0N();
                                        A0N5.A0F(r17);
                                        C166408cq r015 = ((C164938aJ) A0N5.A00).parentMessageKey_;
                                        if (r015 == null) {
                                            r015 = C166408cq.DEFAULT_INSTANCE;
                                        }
                                        AnonymousClass8X7 r25 = (AnonymousClass8X7) r015.A0O();
                                        AnonymousClass9AT.A02(a51.A00, r25, a51.A01);
                                        A0N5.A0E();
                                        C164938aJ r18 = (C164938aJ) A0N5.A00;
                                        r18.associationType_ = r9.value;
                                        r18.bitField0_ |= 1;
                                        A0N5.A0E();
                                        C164938aJ r19 = (C164938aJ) A0N5.A00;
                                        C166408cq r016 = (C166408cq) r25.A0C();
                                        r016.getClass();
                                        r19.parentMessageKey_ = r016;
                                        r19.bitField0_ |= 2;
                                        C163938Wx r017 = a2m.A01;
                                        r017.A0E();
                                        C166048cG r110 = (C166048cG) r017.A00;
                                        C164938aJ r018 = (C164938aJ) A0N5.A0C();
                                        r018.getClass();
                                        r110.messageAssociation_ = r018;
                                        r110.bitField0_ |= 512;
                                        if (!C18020vd.A05(C18040vf.A01, r89.A00, 7772)) {
                                            C166048cG A0G3 = r63.A0G();
                                            C23624Bmt A0N6 = C166048cG.DEFAULT_INSTANCE.A0N();
                                            A0N6.A0F(A0G3);
                                            A0N6.A0E();
                                            C166048cG r111 = (C166048cG) A0N6.A00;
                                            C164938aJ r019 = (C164938aJ) A0N5.A0C();
                                            r019.getClass();
                                            r111.messageAssociation_ = r019;
                                            r111.bitField0_ |= 512;
                                            r63.A0V((C166048cG) A0N6.A0C());
                                        }
                                    } else {
                                        Log.e("ParentAssociationProtobufHelper/something went wrong while finding the referential key");
                                        throw new AnonymousClass1T8(71, (String) null);
                                    }
                                } else {
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append("ParentAssociationProtobufHelper/parent message not found for the row id = ");
                                    sb7.append(j);
                                    sb7.append('\"');
                                    Log.e(sb7.toString());
                                    throw new AnonymousClass1T8(71, (String) null);
                                }
                            } else {
                                Log.e("ParentAssociationProtobufHelper/invalid parent row id");
                                throw new AnonymousClass1T8(0, "invalid parent row id");
                            }
                        } else {
                            Log.e("MessageAssociationProtobufProcessor/invalid association type");
                            throw new AnonymousClass1T8(0, "invalid association type");
                        }
                    }
                }
                C53462cZ r64 = (C53462cZ) this.A06.get();
                Object obj4 = r64.A01.get();
                C18070vi.A0X(obj4);
                for (C53652cs r26 : (Iterable) obj4) {
                    Class<?> cls3 = r26.getClass();
                    Map map3 = AnonymousClass20F.A03;
                    C18070vi.A0d(cls3, 1);
                    C60662oP.A01(cls3);
                    C19880zA r112 = r64.A00;
                    if (r112.A07()) {
                        r112.A03();
                        throw new NullPointerException("isTracingEnabled");
                    }
                    AnonymousClass00H r113 = r26.A01;
                    if (((C58682l5) r113.get()).A01(a2m, r15)) {
                        AnonymousClass6RT r3 = ((C58682l5) r113.get()).A00(r15).A01;
                        AnonymousClass1RV r73 = (AnonymousClass1RV) ((AnonymousClass1RU) r26.A00.get());
                        Object obj5 = r73.A04.get();
                        C18070vi.A0X(obj5);
                        Iterator it2 = ((Iterable) obj5).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (((AnonymousClass3MB) next).BNA() == r3) {
                                if (next != null) {
                                }
                            }
                        }
                        AnonymousClass8X8 r54 = a2m.A00;
                        C166048cG A0G4 = ((AnonymousClass8X8) r54.clone()).A0G();
                        C20133A8t.A09((C18030ve) r73.A00.get(), r54);
                        AnonymousClass8X6 r020 = (AnonymousClass8X6) C163988Xc.DEFAULT_INSTANCE.A0N();
                        r020.A0H(r54);
                        r54.A0D();
                        r54.A0E();
                        C166418cr r27 = (C166418cr) r54.A00;
                        C163988Xc r114 = (C163988Xc) r020.A0C();
                        C166418cr r021 = C166418cr.DEFAULT_INSTANCE;
                        r114.getClass();
                        r27.associatedChildMessage_ = r114;
                        r27.bitField2_ |= 256;
                        if (A0G4.A0J((EAO) null) > 0) {
                            r54.A0V(A0G4);
                        }
                    }
                }
            }
        }
        C166048cG r32 = (C166048cG) a2m.A01.A0C();
        if (r32.A0J((EAO) null) > 0) {
            if (C18020vd.A05(C18040vf.A01, this.A01, 7772)) {
                a2m.A00.A0V(r32);
            }
        }
        A9A a9a = (A9A) this.A0E.get();
        AnonymousClass8X8 r33 = a2m.A00;
        if (C18020vd.A05(C18040vf.A02, a9a.A00, 8556)) {
            A9A.A0T(a9a, (C166418cr) r33.A0C(), "serialized");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0159, code lost:
        r2 = r10.A07;
        r0 = X.C196709vV.A01(((X.AnonymousClass124) r2.get()).A00, r1);
        r9 = r11.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0173, code lost:
        if (X.AnonymousClass000.A1O(r0.bitField1_ & com.facebook.msys.mci.DefaultCrypto.BUFFER_SIZE) == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0175, code lost:
        r0 = 74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0178, code lost:
        r5 = r9.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0184, code lost:
        if (X.AnonymousClass000.A1O(r5.bitField1_ & X.A7Y.A0F) == false) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0186, code lost:
        r7 = r9.A04(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0195, code lost:
        if (X.AnonymousClass000.A1O(r5.bitField1_ & 4194304) == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0197, code lost:
        r0 = 80;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0199, code lost:
        r7 = r9.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x019f, code lost:
        r1 = ((java.util.List) r10.A0A.getValue()).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01af, code lost:
        if (r1.hasNext() == false) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01b1, code lost:
        r5 = (X.B83) ((X.AnonymousClass1D6) r1.next()).second;
        r7 = r5.CBG(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01bf, code lost:
        if (r7 == null) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01c1, code lost:
        new X.AnonymousClass20F(r7.getClass()).BZJ();
        new X.AnonymousClass20F(r5.getClass()).BZJ();
        r1 = ((java.util.Set) r10.A03.A00.get()).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01eb, code lost:
        if (r1.hasNext() == false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ed, code lost:
        ((X.AnonymousClass3L3) r1.next()).CRj(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01f7, code lost:
        ((X.AnonymousClass124) r2.get()).A00(r9, r7);
        r2.get();
        X.C50352Uc.A00(r7);
        r8 = (X.C61612py) r3.get();
        r0 = r8.A00.get();
        X.C18070vi.A0X(r0);
        r3 = ((java.lang.Iterable) r0).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0220, code lost:
        if (r3.hasNext() == false) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0222, code lost:
        r2 = (X.AnonymousClass3L1) r3.next();
        r1 = new java.lang.StringBuilder();
        r1.append("ProtobufProcessorManager: proto-in, post-processing with ");
        r0 = r2.getClass();
        X.C18070vi.A0d(r0, 1);
        r1.append(X.C60662oP.A01(r0));
        r1.toString();
        X.C61612py.A00(r8);
        r2.C19(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0257, code lost:
        throw new X.C32711hd(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass206 A00(X.C20077A6d r11) {
        /*
            r10 = this;
            X.0ve r1 = r10.A01
            r0 = 3692(0xe6c, float:5.174E-42)
            X.0vf r5 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r5, r1, r0)
            if (r0 == 0) goto L_0x00b5
            X.0vl r0 = r10.A0A
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x001d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            java.lang.Object r0 = r0.second
            X.B83 r0 = (X.B83) r0
            X.206 r0 = r0.CBG(r11)
            if (r0 == 0) goto L_0x001d
            r3.add(r1)
            goto L_0x001d
        L_0x0038:
            int r0 = r3.size()
            r7 = 1
            if (r0 <= r7) goto L_0x00b5
            java.lang.Object r4 = X.C29431cG.A0b(r3)
            X.1D6 r4 = (X.AnonymousClass1D6) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x004e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            java.lang.Object r0 = r0.second
            java.lang.Class r1 = r0.getClass()
            java.lang.Object r0 = r4.second
            java.lang.Class r0 = r0.getClass()
            if (r1 == r0) goto L_0x004e
            r6.add(r2)
            goto L_0x004e
        L_0x006d:
            boolean r0 = r6.isEmpty()
            r7 = r7 ^ r0
            if (r7 == 0) goto L_0x00b5
            java.lang.Object r0 = r4.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.util.Iterator r3 = r6.iterator()
        L_0x0084:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r2 = r3.next()
            X.1D6 r2 = (X.AnonymousClass1D6) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            goto L_0x0084
        L_0x00ad:
            X.190 r2 = r10.A00
            java.lang.String r1 = "fmessage-protobuf-deserialization-non-unique"
            r0 = 0
            r2.A0G(r1, r4, r0)
        L_0x00b5:
            X.00H r0 = r10.A0E
            java.lang.Object r3 = r0.get()
            X.A9A r3 = (X.A9A) r3
            X.8cr r1 = r11.A08
            X.0ve r2 = r3.A00
            r0 = 8556(0x216c, float:1.199E-41)
            boolean r0 = X.C18020vd.A05(r5, r2, r0)
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = "parsed"
            X.A9A.A0T(r3, r1, r0)
        L_0x00ce:
            X.2eB r6 = r10.A0D
            X.0ve r2 = r6.A01
            r0 = 1531(0x5fb, float:2.145E-42)
            int r2 = X.C18020vd.A00(r5, r2, r0)
            if (r2 != 0) goto L_0x00dc
            r4 = 0
            goto L_0x00ee
        L_0x00dc:
            X.10I r4 = r6.A02
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = (long) r2
            long r2 = r0.toMillis(r2)
            X.7RS r0 = new X.7RS
            r0.<init>((X.C54462eB) r6)
            X.25d r4 = r4.CGv(r0, r2)
        L_0x00ee:
            X.00H r3 = r10.A09     // Catch:{ all -> 0x0258 }
            java.lang.Object r5 = r3.get()     // Catch:{ all -> 0x0258 }
            X.2py r5 = (X.C61612py) r5     // Catch:{ all -> 0x0258 }
            X.00H r0 = r5.A01     // Catch:{ all -> 0x0258 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0258 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0258 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0258 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0258 }
        L_0x0105:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x0159
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x0258 }
            X.3L2 r8 = (X.AnonymousClass3L2) r8     // Catch:{ all -> 0x0258 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0258 }
            r7.<init>()     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = "ProtobufProcessorManager: proto-in, pre-processing with "
            r7.append(r0)     // Catch:{ all -> 0x0258 }
            java.lang.Class r2 = r8.getClass()     // Catch:{ all -> 0x0258 }
            X.20F r0 = new X.20F     // Catch:{ all -> 0x0258 }
            r0.<init>(r2)     // Catch:{ all -> 0x0258 }
            java.lang.Class r0 = r0.A00     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = X.C60662oP.A01(r0)     // Catch:{ all -> 0x0258 }
            r7.append(r0)     // Catch:{ all -> 0x0258 }
            r7.toString()     // Catch:{ all -> 0x0258 }
            X.C61612py.A00(r5)     // Catch:{ all -> 0x0258 }
            X.206 r7 = r8.C1N(r11)     // Catch:{ all -> 0x0258 }
            if (r7 == 0) goto L_0x0105
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0258 }
            r1.<init>()     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = "ProtobufProcessorManager: proto-in, pre-processing stopped on "
            r1.append(r0)     // Catch:{ all -> 0x0258 }
            X.20F r0 = new X.20F     // Catch:{ all -> 0x0258 }
            r0.<init>(r2)     // Catch:{ all -> 0x0258 }
            java.lang.Class r0 = r0.A00     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = X.C60662oP.A01(r0)     // Catch:{ all -> 0x0258 }
            r1.append(r0)     // Catch:{ all -> 0x0258 }
            r1.toString()     // Catch:{ all -> 0x0258 }
            X.C61612py.A00(r5)     // Catch:{ all -> 0x0258 }
            goto L_0x024a
        L_0x0159:
            X.00H r2 = r10.A07     // Catch:{ all -> 0x0258 }
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x0258 }
            X.124 r0 = (X.AnonymousClass124) r0     // Catch:{ all -> 0x0258 }
            X.0ve r0 = r0.A00     // Catch:{ all -> 0x0258 }
            X.8cr r0 = X.C196709vV.A01(r0, r1)     // Catch:{ all -> 0x0258 }
            X.A6d r9 = r11.A03(r0)     // Catch:{ all -> 0x0258 }
            int r0 = r0.bitField1_     // Catch:{ all -> 0x0258 }
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            boolean r0 = X.AnonymousClass000.A1O(r0)     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x0178
            r0 = 74
            goto L_0x0199
        L_0x0178:
            X.8cr r5 = r9.A08     // Catch:{ all -> 0x0258 }
            int r1 = r5.bitField1_     // Catch:{ all -> 0x0258 }
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)     // Catch:{ all -> 0x0258 }
            r8 = 0
            if (r0 == 0) goto L_0x018c
            X.23U r7 = r9.A04(r8)     // Catch:{ all -> 0x0258 }
            goto L_0x024a
        L_0x018c:
            int r1 = r5.bitField1_     // Catch:{ all -> 0x0258 }
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x019f
            r0 = 80
        L_0x0199:
            X.23U r7 = r9.A04(r0)     // Catch:{ all -> 0x0258 }
            goto L_0x024a
        L_0x019f:
            X.0vl r0 = r10.A0A     // Catch:{ all -> 0x0258 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0258 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0258 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0258 }
        L_0x01ab:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x0252
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0258 }
            X.1D6 r0 = (X.AnonymousClass1D6) r0     // Catch:{ all -> 0x0258 }
            java.lang.Object r5 = r0.second     // Catch:{ all -> 0x0258 }
            X.B83 r5 = (X.B83) r5     // Catch:{ all -> 0x0258 }
            X.206 r7 = r5.CBG(r9)     // Catch:{ all -> 0x0258 }
            if (r7 == 0) goto L_0x01ab
            java.lang.Class r1 = r7.getClass()     // Catch:{ all -> 0x0258 }
            X.20F r0 = new X.20F     // Catch:{ all -> 0x0258 }
            r0.<init>(r1)     // Catch:{ all -> 0x0258 }
            r0.BZJ()     // Catch:{ all -> 0x0258 }
            java.lang.Class r1 = r5.getClass()     // Catch:{ all -> 0x0258 }
            X.20F r0 = new X.20F     // Catch:{ all -> 0x0258 }
            r0.<init>(r1)     // Catch:{ all -> 0x0258 }
            r0.BZJ()     // Catch:{ all -> 0x0258 }
            X.2aV r0 = r10.A03     // Catch:{ all -> 0x0258 }
            X.00H r0 = r0.A00     // Catch:{ all -> 0x0258 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0258 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x0258 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0258 }
        L_0x01e7:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x01f7
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0258 }
            X.3L3 r0 = (X.AnonymousClass3L3) r0     // Catch:{ all -> 0x0258 }
            r0.CRj(r9, r7)     // Catch:{ all -> 0x0258 }
            goto L_0x01e7
        L_0x01f7:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x0258 }
            X.124 r0 = (X.AnonymousClass124) r0     // Catch:{ all -> 0x0258 }
            r0.A00(r9, r7)     // Catch:{ all -> 0x0258 }
            r2.get()     // Catch:{ all -> 0x0258 }
            X.C50352Uc.A00(r7)     // Catch:{ all -> 0x0258 }
            java.lang.Object r8 = r3.get()     // Catch:{ all -> 0x0258 }
            X.2py r8 = (X.C61612py) r8     // Catch:{ all -> 0x0258 }
            r5 = 1
            X.00H r0 = r8.A00     // Catch:{ all -> 0x0258 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0258 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0258 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0258 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0258 }
        L_0x021c:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x024a
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0258 }
            X.3L1 r2 = (X.AnonymousClass3L1) r2     // Catch:{ all -> 0x0258 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0258 }
            r1.<init>()     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = "ProtobufProcessorManager: proto-in, post-processing with "
            r1.append(r0)     // Catch:{ all -> 0x0258 }
            java.lang.Class r0 = r2.getClass()     // Catch:{ all -> 0x0258 }
            X.C18070vi.A0d(r0, r5)     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = X.C60662oP.A01(r0)     // Catch:{ all -> 0x0258 }
            r1.append(r0)     // Catch:{ all -> 0x0258 }
            r1.toString()     // Catch:{ all -> 0x0258 }
            X.C61612py.A00(r8)     // Catch:{ all -> 0x0258 }
            r2.C19(r9, r7)     // Catch:{ all -> 0x0258 }
            goto L_0x021c
        L_0x024a:
            if (r4 == 0) goto L_0x0251
            X.10I r0 = r6.A02
            r0.CEz(r4)
        L_0x0251:
            return r7
        L_0x0252:
            X.1hd r0 = new X.1hd     // Catch:{ all -> 0x0258 }
            r0.<init>((int) r8)     // Catch:{ all -> 0x0258 }
            throw r0     // Catch:{ all -> 0x0258 }
        L_0x0258:
            r1 = move-exception
            if (r4 == 0) goto L_0x0260
            X.10I r0 = r6.A02
            r0.CEz(r4)
        L_0x0260:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12N.A00(X.A6d):X.206");
    }
}
