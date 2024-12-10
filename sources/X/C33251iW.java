package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1iW  reason: invalid class name and case insensitive filesystem */
public class C33251iW {
    public final AnonymousClass195 A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass1RB A02;
    public final AnonymousClass1KB A03;
    public final AnonymousClass11S A04;
    public final C25311Ns A05;
    public final AnonymousClass181 A06;
    public final C23651Hc A07;
    public final C32931hz A08;
    public final C28721an A09;
    public final C32541hM A0A;
    public final AnonymousClass1MC A0B;
    public final C26811To A0C;
    public final AnonymousClass1M9 A0D;
    public final C25111Mx A0E;
    public final AnonymousClass1PM A0F;
    public final C24921Me A0G;
    public final C25161Nd A0H;
    public final AnonymousClass1RW A0I;
    public final AnonymousClass1NM A0J;
    public final AnonymousClass11P A0K;
    public final AnonymousClass118 A0L;
    public final C219217x A0M;
    public final C18000vb A0N;
    public final C30781eV A0O;
    public final C30801eX A0P;
    public final C22621Co A0Q;
    public final AnonymousClass1CJ A0R;
    public final C25181Nf A0S;
    public final AnonymousClass1NN A0T;
    public final AnonymousClass122 A0U;
    public final C32481hG A0V;
    public final AnonymousClass1R3 A0W;
    public final C24681Lg A0X;
    public final C26111Qw A0Y;
    public final AnonymousClass1WN A0Z;
    public final AnonymousClass1RL A0a;
    public final C33231iU A0b;
    public final C18030ve A0c;
    public final AnonymousClass18K A0d;
    public final C25931Qe A0e;
    public final AnonymousClass12M A0f;
    public final AnonymousClass1D9 A0g;
    public final AnonymousClass1LU A0h;
    public final C27131Uv A0i;
    public final C26421Sb A0j;
    public final C32861hs A0k;
    public final AnonymousClass1SY A0l;
    public final C32571hP A0m;
    public final C32431hB A0n;
    public final AnonymousClass1SW A0o;
    public final C26061Qr A0p;
    public final C32781hk A0q;
    public final C25011Mn A0r;
    public final C33241iV A0s;
    public final C32291gx A0t;
    public final AnonymousClass1RU A0u;
    public final AnonymousClass1QJ A0v;
    public final AnonymousClass1QS A0w;
    public final AnonymousClass1PP A0x;
    public final C32721he A0y;
    public final C32801hm A0z;
    public final AnonymousClass1R0 A10;
    public final C32451hD A11;
    public final C32551hN A12;
    public final C24421Kg A13;
    public final AnonymousClass1Nb A14;
    public final C28531aO A15;
    public final C32741hg A16;
    public final AnonymousClass1SB A17;
    public final C26521Sl A18;
    public final AnonymousClass10I A19;
    public final JniBridge A1A;
    public final AnonymousClass00H A1B;
    public final AnonymousClass00H A1C;
    public final AnonymousClass00H A1D;
    public final AnonymousClass00H A1E;
    public final AnonymousClass00H A1F;
    public final AnonymousClass00H A1G;
    public final AnonymousClass00H A1H;
    public final AnonymousClass00H A1I;
    public final AnonymousClass00H A1J;
    public final AnonymousClass00H A1K;
    public final AnonymousClass00H A1L;
    public final AnonymousClass00H A1M;
    public final AnonymousClass00H A1N;
    public final AnonymousClass00H A1O;
    public final AnonymousClass00H A1P;
    public final AnonymousClass00H A1Q;
    public final AnonymousClass00H A1R;
    public final AnonymousClass00H A1S;
    public final AnonymousClass00H A1T;
    public final AnonymousClass00H A1U;
    public final AnonymousClass00H A1V;
    public final AnonymousClass00H A1W;
    public final AnonymousClass00H A1X;
    public final AnonymousClass00H A1Y;
    public final AnonymousClass00H A1Z;
    public final AnonymousClass00H A1a;
    public final AnonymousClass00H A1b;
    public final AnonymousClass00H A1c;
    public final AnonymousClass00H A1d;
    public final C32521hK A1e;
    public final AnonymousClass18O A1f;
    public final AnonymousClass1V3 A1g;
    public final C32531hL A1h;
    public final C26911Ty A1i;
    public final C32791hl A1j;
    public final AnonymousClass11C A1k;
    public final C19830z4 A1l;
    public final C32691hb A1m;
    public final C26141Qz A1n;
    public final AnonymousClass1MZ A1o;
    public final AnonymousClass1Q6 A1p;
    public final C32211gp A1q;
    public final C32491hH A1r;
    public final AnonymousClass126 A1s;
    public final C32011gU A1t;
    public final C26431Sc A1u;
    public final C26221Rh A1v;
    public final C18180vt A1w = new C18180vt(1, 10);
    public final C32731hf A1x;
    public final AnonymousClass00H A1y;
    public final AnonymousClass00H A1z;
    public final AnonymousClass00H A20;
    public final AnonymousClass00H A21;
    public final AnonymousClass00H A22;
    public final AnonymousClass00H A23;
    public final AnonymousClass00H A24;
    public final AnonymousClass00H A25;
    public final AnonymousClass00H A26;
    public final AnonymousClass00H A27;
    public final AnonymousClass00H A28;
    public final AnonymousClass00H A29;
    public final AnonymousClass00H A2A;
    public final AnonymousClass00H A2B;
    public final AnonymousClass00H A2C;

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, com.whatsapp.TextData] */
    public static AnonymousClass210 A02(C33251iW r9, C143887Fe r10, AnonymousClass1BI r11, C20941Abv abv, AnonymousClass206 r13, C693536w r14, C693536w r15, C692236j r16, String str, List list, boolean z, boolean z2, boolean z3) {
        long A012;
        AnonymousClass7PD r4;
        C32551hN r1;
        AnonymousClass1BI r2 = r11;
        String str2 = str;
        if (C22971Dz.A0a(r11)) {
            boolean A092 = AnonymousClass74F.A09(r10, AnonymousClass74F.A02(r9.A1t, str2));
            C129496ht r12 = new C129496ht(r10);
            r12.A02 = A092;
            r12.A01 = true;
            if (r12.A03 == null) {
                new C21320Ai5
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0023: CONSTRUCTOR  (r4v6 ? I:X.Ai5) =  call: X.Ai5.<init>():void type: CONSTRUCTOR in method: X.1iW.A02(X.1iW, X.7Fe, X.1BI, X.Abv, X.206, X.36w, X.36w, X.36j, java.lang.String, java.util.List, boolean, boolean, boolean):X.210, dex: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v6 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 39 more
                    */
                /*
                    r2 = r11
                    boolean r0 = X.C22971Dz.A0a(r11)
                    r5 = r17
                    if (r0 == 0) goto L_0x00a0
                    X.1gU r0 = r9.A1t
                    int r0 = X.AnonymousClass74F.A02(r0, r5)
                    boolean r0 = X.AnonymousClass74F.A09(r10, r0)
                    X.6ht r1 = new X.6ht
                    r1.<init>(r10)
                    r1.A02 = r0
                    r0 = 1
                    r1.A01 = r0
                    X.7Fe r0 = r1.A03
                    if (r0 != 0) goto L_0x009a
                    X.Ai5 r4 = new X.Ai5
                    r4.<init>()
                L_0x0026:
                    X.1hN r1 = r9.A12
                    X.11P r0 = r9.A0K
                    long r7 = X.AnonymousClass11P.A01(r0)
                L_0x002e:
                    r3 = r13
                    r6 = r18
                    X.210 r3 = r1.A00(r2, r3, r4, r5, r6, r7)
                    if (r14 == 0) goto L_0x003a
                    X.C60502o8.A01(r3, r14)
                L_0x003a:
                    if (r15 == 0) goto L_0x004a
                    boolean r0 = r3.A0w()
                    if (r0 != 0) goto L_0x004a
                    X.Ac6 r0 = new X.Ac6
                    r0.<init>(r15)
                    X.C196869vm.A01(r0, r3)
                L_0x004a:
                    if (r12 == 0) goto L_0x004f
                    X.C60532oB.A01(r12, r3)
                L_0x004f:
                    r9.A0b(r3)
                    if (r19 == 0) goto L_0x0059
                    r0 = 4
                    r3.A0b(r0)
                L_0x0059:
                    if (r20 == 0) goto L_0x0060
                    r0 = 2
                    r3.A0b(r0)
                L_0x0060:
                    boolean r0 = X.C22971Dz.A0a(r11)
                    if (r0 == 0) goto L_0x0095
                    com.whatsapp.TextData r2 = new com.whatsapp.TextData
                    r2.<init>()
                    int r0 = X.AnonymousClass74F.A00()
                    r2.backgroundColor = r0
                    r0 = -1
                    r2.textColor = r0
                    r1 = 0
                    r2.fontStyle = r1
                    r3.A18(r2)
                    java.lang.String r0 = r3.A0P()
                    java.lang.String r0 = X.AnonymousClass74F.A07(r0)
                    r3.A0i(r0)
                    r2 = r16
                    X.77K r0 = r2.A03
                    X.C17960vV.A07(r0)
                    X.C63672tV.A03(r3, r2)
                    X.1hg r0 = r9.A16
                    r0.A04 = r1
                    r0.A05 = r1
                L_0x0095:
                    r0 = r21
                    r3.A17 = r0
                    return r3
                L_0x009a:
                    X.7PD r4 = new X.7PD
                    r4.<init>(r1)
                    goto L_0x0026
                L_0x00a0:
                    X.11P r0 = r9.A0K
                    long r7 = X.AnonymousClass11P.A01(r0)
                    A08(r9, r7)
                    X.6ht r1 = new X.6ht
                    r1.<init>(r10)
                    X.7Fe r0 = r1.A03
                    if (r0 != 0) goto L_0x00bb
                    X.Ai5 r4 = new X.Ai5
                    r4.<init>()
                L_0x00b7:
                    X.1hN r1 = r9.A12
                    goto L_0x002e
                L_0x00bb:
                    X.7PD r4 = new X.7PD
                    r4.<init>(r1)
                    goto L_0x00b7
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C33251iW.A02(X.1iW, X.7Fe, X.1BI, X.Abv, X.206, X.36w, X.36w, X.36j, java.lang.String, java.util.List, boolean, boolean, boolean):X.210");
            }

            public static void A0C(C33251iW r5, AnonymousClass206 r6, Runnable runnable, Collection collection, byte[] bArr) {
                Collection collection2 = collection;
                if (bArr != null) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((AnonymousClass206) it.next()).A0p(bArr);
                    }
                }
                C33251iW r3 = r5;
                AnonymousClass206 r52 = r6;
                Runnable runnable2 = runnable;
                if (r52 == null) {
                    r3.A03.CGP(runnable);
                } else {
                    r3.A0e.A06(r52, new C21368Aix(r3, collection2, r52, runnable2, 25), Collections.emptySet());
                }
            }

            public C52642bF A0I(C63642tS r12, Long l, byte[] bArr, boolean z, boolean z2) {
                return A04(this, (AnonymousClass85B) null, (AnonymousClass21V) null, r12, (Integer) null, l, (Map) null, bArr, false, z, z2);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: X.229} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: X.229} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: X.229} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: X.229} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v52, resolved type: X.229} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: X.229} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.util.ArrayList A0J(X.C143887Fe r25, X.C61712q8 r26, X.C692336k r27, X.C20941Abv r28, X.AnonymousClass206 r29, X.C693536w r30, X.C693536w r31, X.C692236j r32, X.AnonymousClass3M1 r33, java.lang.Long r34, java.lang.String r35, java.util.List r36, java.util.List r37, int r38, boolean r39, boolean r40, boolean r41) {
                /*
                    r24 = this;
                    r3 = 0
                    int r0 = r36.size()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>(r0)
                    r11 = r24
                    X.00H r0 = r11.A1d
                    r0.get()
                    X.1Kq r0 = X.C24521Kq.$redex_init_class
                    java.util.Iterator r10 = r36.iterator()
                L_0x0017:
                    boolean r0 = r10.hasNext()
                    if (r0 == 0) goto L_0x016c
                    java.lang.Object r13 = r10.next()
                    X.1BI r13 = (X.AnonymousClass1BI) r13
                    r1 = r31
                    r17 = r1
                    r20 = r37
                    r23 = r41
                    r14 = r28
                    r12 = r25
                    r21 = r39
                    r22 = r40
                    r15 = r29
                    r16 = r30
                    r18 = r32
                    r19 = r35
                    X.210 r4 = A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                    r2.add(r4)
                    if (r31 == 0) goto L_0x0052
                    boolean r0 = r4.A0w()
                    if (r0 != 0) goto L_0x0052
                    X.Ac6 r0 = new X.Ac6
                    r0.<init>(r1)
                    X.C196869vm.A01(r0, r4)
                L_0x0052:
                    r0 = r27
                    if (r27 == 0) goto L_0x0059
                    X.C60472o5.A01(r0, r4)
                L_0x0059:
                    if (r34 == 0) goto L_0x0062
                    long r0 = r34.longValue()
                    r4.A0b(r0)
                L_0x0062:
                    r7 = r26
                    if (r26 == 0) goto L_0x00e2
                    java.lang.Class<X.Ac9> r0 = X.C20955Ac9.class
                    X.25F r1 = r4.A0M(r0)
                    X.C18070vi.A0X(r1)
                    X.Ac9 r0 = r7.A03
                    r1.A02(r0)
                    boolean r5 = r7.A06
                    java.lang.Class<X.Abu> r0 = X.C20940Abu.class
                    X.25F r1 = r4.A0M(r0)
                    if (r5 == 0) goto L_0x0169
                    X.Abu r0 = new X.Abu
                    r0.<init>()
                L_0x0083:
                    r1.A02(r0)
                    boolean r5 = r7.A05
                    java.lang.Class<X.Abt> r0 = X.C20939Abt.class
                    X.25F r1 = r4.A0M(r0)
                    if (r5 == 0) goto L_0x0166
                    X.Abt r0 = new X.Abt
                    r0.<init>()
                L_0x0095:
                    r1.A02(r0)
                    X.Ac3 r1 = r7.A02
                    if (r1 == 0) goto L_0x00a5
                    java.lang.Class<X.Ac3> r0 = X.C20949Ac3.class
                    X.25F r0 = r4.A0M(r0)
                    r0.A02(r1)
                L_0x00a5:
                    X.Aby r1 = r7.A00
                    if (r1 == 0) goto L_0x00b2
                    java.lang.Class<X.Aby> r0 = X.C20944Aby.class
                    X.25F r0 = r4.A0M(r0)
                    r0.A02(r1)
                L_0x00b2:
                    X.Abz r6 = r7.A01
                    if (r6 == 0) goto L_0x00d3
                    X.00H r0 = r11.A1G
                    java.lang.Object r0 = r0.get()
                    X.1UD r0 = (X.AnonymousClass1UD) r0
                    X.0ve r5 = r0.A00
                    X.0vf r1 = X.C18040vf.A01
                    r0 = 12318(0x301e, float:1.7261E-41)
                    boolean r0 = X.C18020vd.A05(r1, r5, r0)
                    if (r0 == 0) goto L_0x00d3
                    java.lang.Class<X.Abz> r0 = X.C20945Abz.class
                    X.25F r0 = r4.A0M(r0)
                    r0.A02(r6)
                L_0x00d3:
                    boolean r0 = r7.A04
                    if (r0 == 0) goto L_0x00e2
                    r0 = 1
                    r4.A06 = r0
                    r0 = 3
                    r4.A09 = r0
                    r0 = 1
                    r4.A0b(r0)
                L_0x00e2:
                    X.0ve r5 = r11.A0c
                    r0 = 10242(0x2802, float:1.4352E-41)
                    X.0vf r1 = X.C18040vf.A02
                    boolean r0 = X.C18020vd.A05(r1, r5, r0)
                    if (r0 == 0) goto L_0x00fc
                    r0 = 11637(0x2d75, float:1.6307E-41)
                    boolean r0 = X.C18020vd.A05(r1, r5, r0)
                    if (r0 == 0) goto L_0x00fc
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r38)
                    r4.A14 = r0
                L_0x00fc:
                    r9 = r33
                    if (r33 == 0) goto L_0x014c
                    boolean r0 = r9.CLo()
                    if (r0 == 0) goto L_0x014c
                    boolean r0 = r4.A0w()
                    if (r0 == 0) goto L_0x0145
                    X.00H r0 = r11.A1S
                    java.lang.Object r6 = r0.get()
                    X.2rF r6 = (X.C62342rF) r6
                    X.00H r0 = r6.A03
                    java.lang.Object r5 = r0.get()
                    X.1gM r5 = (X.C31931gM) r5
                    r0 = 24
                    X.AkP r1 = new X.AkP
                    r1.<init>(r6, r4, r0)
                    r0 = 73
                    r5.A01(r1, r0)
                L_0x0128:
                    r9.ByS(r4)
                    long r7 = r9.BaQ()
                    r5 = 0
                    int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                    if (r0 <= 0) goto L_0x0017
                    X.1KB r6 = r11.A03
                    X.AkM r5 = new X.AkM
                    r5.<init>(r11, r9, r4, r3)
                    long r0 = r9.BaQ()
                    r6.A0K(r5, r0)
                    goto L_0x0017
                L_0x0145:
                    X.122 r1 = r11.A0U
                    r0 = 1
                    r1.BBN(r4, r0)
                    goto L_0x0128
                L_0x014c:
                    boolean r0 = X.C22971Dz.A0V(r13)
                    if (r0 == 0) goto L_0x015f
                    X.00H r0 = r11.A1S
                    java.lang.Object r0 = r0.get()
                    X.2rF r0 = (X.C62342rF) r0
                    r0.A02(r4)
                    goto L_0x0017
                L_0x015f:
                    X.122 r0 = r11.A0U
                    r0.BBM(r4)
                    goto L_0x0017
                L_0x0166:
                    r0 = 0
                    goto L_0x0095
                L_0x0169:
                    r0 = 0
                    goto L_0x0083
                L_0x016c:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C33251iW.A0J(X.7Fe, X.2q8, X.36k, X.Abv, X.206, X.36w, X.36w, X.36j, X.3M1, java.lang.Long, java.lang.String, java.util.List, java.util.List, int, boolean, boolean, boolean):java.util.ArrayList");
            }

            public void A0O(C143887Fe r19, AnonymousClass206 r20, C692236j r21, String str, List list, List list2, boolean z, boolean z2) {
                A0J(r19, (C61712q8) null, (C692336k) null, (C20941Abv) null, r20, (C693536w) null, (C693536w) null, r21, (AnonymousClass3M1) null, (Long) null, str, list, list2, 0, z, z2, false);
            }

            /* JADX WARNING: type inference failed for: r0v1, types: [X.2jx, java.lang.Object] */
            public void A0S(AnonymousClass1BI r19, AnonymousClass6R7 r20, Integer num, String str, String str2, String str3) {
                C20949Ac3 ac3;
                C20945Abz abz = null;
                String str4 = str2;
                if (str2 != null) {
                    ac3 = new C20949Ac3(r20, str4);
                } else {
                    ac3 = null;
                }
                Integer num2 = num;
                if (num != null) {
                    String str5 = str3;
                    if (str3 != null) {
                        abz = new C20945Abz(str5, num2);
                    }
                }
                List singletonList = Collections.singletonList(r19);
                ? obj = new Object();
                obj.A02 = ac3;
                obj.A01 = abz;
                A0J((C143887Fe) null, obj.A00(), (C692336k) null, (C20941Abv) null, (AnonymousClass206) null, (C693536w) null, (C693536w) null, (C692236j) null, (AnonymousClass3M1) null, (Long) null, str, singletonList, (List) null, 0, false, false, false);
            }

            /* JADX WARNING: type inference failed for: r0v0, types: [X.2jx, java.lang.Object] */
            public void A0T(AnonymousClass1BI r20, Integer num, Integer num2, String str, String str2, String str3) {
                C20955Ac9 ac9;
                C20945Abz abz = null;
                Integer num3 = num;
                if (num != null) {
                    ac9 = new C20955Ac9(num3, str2, (List) null, (Map) null, false);
                } else {
                    ac9 = null;
                }
                Integer num4 = num2;
                if (num2 != null) {
                    String str4 = str3;
                    if (str3 != null) {
                        abz = new C20945Abz(str4, num4);
                    }
                }
                List singletonList = Collections.singletonList(r20);
                ? obj = new Object();
                obj.A03 = ac9;
                obj.A02 = null;
                obj.A01 = abz;
                A0J((C143887Fe) null, obj.A00(), (C692336k) null, (C20941Abv) null, (AnonymousClass206) null, (C693536w) null, (C693536w) null, (C692236j) null, (AnonymousClass3M1) null, (Long) null, str, singletonList, (List) null, 0, false, false, false);
            }

            /* JADX WARNING: type inference failed for: r4v1, types: [X.ADF, java.lang.Object] */
            public void A0f(AnonymousClass206 r8, String str, String str2, String str3, String str4, List list, byte[] bArr) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AnonymousClass21L r2 = new AnonymousClass21L(this.A0x.A01((AnonymousClass1BI) it.next(), true), AnonymousClass11P.A01(this.A0K));
                    AEE aee = new AEE((C20275AEi) null, str2, str3, bArr);
                    C18070vi.A0d(str, 1);
                    ? obj = new Object();
                    obj.A02 = str;
                    obj.A00 = 1;
                    obj.A01 = 1;
                    r2.CIS(C20285AEt.A0G.A00(aee, obj, str4, 4));
                    A0b(r2);
                    if (r8 != null) {
                        this.A10.A00(r2, r8);
                    }
                    this.A0U.BBM(r2);
                    AnonymousClass2FF r4 = new AnonymousClass2FF();
                    r4.A00 = 6;
                    r4.A01 = 33;
                    this.A0d.CC0(r4, new C18180vt(1, 1), false);
                }
            }

            public void A0i(AnonymousClass205 r9, C49552Qx r10, Integer num) {
                if (C18020vd.A05(C18040vf.A02, ((C88194Yr) this.A1K.get()).A02, 5563)) {
                    this.A19.CGF(new C21368Aix(this, r9, r10, num, 23));
                }
            }

            public void A0n(C63642tS r7, byte[] bArr, boolean z, boolean z2) {
                A0I(r7, (Long) null, bArr, z, z2);
            }

            public static Pair A00(List list) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                Jid jid = null;
                while (it.hasNext()) {
                    Jid jid2 = (Jid) it.next();
                    if (C22971Dz.A0a(jid2)) {
                        jid = jid2;
                    } else {
                        arrayList.add(jid2);
                    }
                }
                return new Pair(arrayList, jid);
            }

            /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private X.C441322g A01(X.AnonymousClass1BI r24, X.AnonymousClass206 r25, X.C1418377d r26, java.lang.Integer r27, boolean r28, boolean r29) {
                /*
                    r23 = this;
                    X.2rc r10 = new X.2rc
                    r10.<init>()
                    r6 = r23
                    X.0ve r2 = r6.A0c
                    r7 = 0
                    X.C18070vi.A0d(r2, r7)
                    r1 = 11628(0x2d6c, float:1.6294E-41)
                    X.0vf r0 = X.C18040vf.A02
                    boolean r0 = X.C18020vd.A05(r0, r2, r1)
                    r1 = r26
                    if (r0 == 0) goto L_0x0024
                    X.00H r0 = r6.A2C
                    java.lang.Object r0 = r0.get()
                    X.72H r0 = (X.AnonymousClass72H) r0
                    r0.A05(r1)
                L_0x0024:
                    java.lang.String r3 = r1.A0B
                    r8 = 0
                    if (r3 == 0) goto L_0x0055
                    int r2 = r1.A01
                    r0 = 3
                    if (r2 != r0) goto L_0x004e
                    android.net.Uri r9 = android.net.Uri.parse(r3)
                L_0x0032:
                    int r0 = r1.A00
                    long r4 = (long) r0
                    r2 = 1048576(0x100000, double:5.180654E-318)
                    int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                    if (r0 <= 0) goto L_0x0057
                    X.118 r0 = r6.A0L
                    android.content.Context r1 = r0.A00
                    r0 = 2131896409(0x7f122859, float:1.9427678E38)
                    java.lang.String r2 = r1.getString(r0)
                    X.1KB r1 = r6.A03
                    r0 = 1
                    r1.A0H(r2, r0)
                    return r8
                L_0x004e:
                    java.io.File r0 = new java.io.File
                    r0.<init>(r3)
                    r10.A0G = r0
                L_0x0055:
                    r9 = r8
                    goto L_0x0032
                L_0x0057:
                    int r0 = r1.A03
                    r10.A08 = r0
                    int r0 = r1.A02
                    r10.A06 = r0
                    X.1Sb r8 = r6.A0j
                    r13 = 0
                    r18 = 20
                    r15 = r13
                    r16 = r13
                    r17 = r13
                    r20 = r7
                    r11 = r24
                    r12 = r25
                    r21 = r28
                    r22 = r29
                    r14 = r13
                    r19 = r7
                    X.21V r4 = r8.A03(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                    X.22g r4 = (X.C441322g) r4
                    java.lang.String r0 = r1.A0F
                    r4.A05 = r0
                    java.lang.String r0 = r1.A0E
                    r4.A06 = r0
                    if (r0 != 0) goto L_0x008a
                    java.lang.String r0 = "image/webp"
                    r4.A06 = r0
                L_0x008a:
                    X.73B r0 = r1.A04
                    r4.A05 = r0
                    r0 = r27
                    r4.A06 = r0
                    boolean r3 = r1.A02()
                    boolean r2 = r1.A0J
                    boolean r1 = r1.A0N
                    r0 = 0
                    if (r3 == 0) goto L_0x009e
                    r0 = 1
                L_0x009e:
                    if (r2 == 0) goto L_0x00a2
                    r0 = r0 | 2
                L_0x00a2:
                    if (r1 == 0) goto L_0x00a6
                    r0 = r0 | 4
                L_0x00a6:
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r4.A01 = r0
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C33251iW.A01(X.1BI, X.206, X.77d, java.lang.Integer, boolean, boolean):X.22g");
            }

            public static final C52642bF A03() {
                C52642bF r2 = new C52642bF();
                C18460wS r1 = C18460wS.A00;
                C18070vi.A0d(r1, 0);
                r2.A00.A0B(r1);
                return r2;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
                if (r0 != null) goto L_0x0043;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x008f, code lost:
                if (r2 != 0) goto L_0x0091;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private void A06(X.C34531kd r15, X.C692236j r16, java.lang.String r17, java.util.List r18, java.util.List r19, boolean r20) {
                /*
                    r14 = this;
                    r3 = r19
                    r6 = r14
                    X.00H r0 = r14.A26
                    java.lang.Object r0 = r0.get()
                    X.1c4 r0 = (X.AnonymousClass1c4) r0
                    X.0ve r2 = r0.A02
                    r0 = 12347(0x303b, float:1.7302E-41)
                    X.0vf r1 = X.C18040vf.A02
                    boolean r0 = X.C36301nf.A02(r2, r1, r0)
                    r9 = r17
                    r10 = r18
                    if (r0 != 0) goto L_0x0060
                    r0 = 12348(0x303c, float:1.7303E-41)
                    boolean r0 = X.C36301nf.A02(r2, r1, r0)
                    if (r0 != 0) goto L_0x0060
                    if (r17 == 0) goto L_0x005b
                    int r1 = r10.size()
                    r0 = 1
                    if (r1 > r0) goto L_0x005b
                    X.1BI r0 = X.C22971Dz.A01(r3)
                    if (r0 == 0) goto L_0x005b
                    android.util.Pair r0 = A00(r3)
                    java.lang.Object r3 = r0.first
                    java.util.List r3 = (java.util.List) r3
                    java.util.ArrayList r11 = new java.util.ArrayList
                    r11.<init>()
                    java.lang.Object r0 = r0.second
                    if (r0 == 0) goto L_0x0046
                L_0x0043:
                    r11.add(r0)
                L_0x0046:
                    r13 = 0
                    r7 = r15
                    r8 = r16
                    r12 = r20
                    r6.A07(r7, r8, r9, r10, r11, r12, r13)
                    r11 = 1
                    r4 = r14
                    r5 = r15
                    r6 = r8
                    r7 = r9
                    r8 = r10
                    r9 = r3
                    r10 = r12
                    r4.A07(r5, r6, r7, r8, r9, r10, r11)
                    return
                L_0x005b:
                    java.util.List r11 = java.util.Collections.emptyList()
                    goto L_0x0046
                L_0x0060:
                    android.util.Pair r5 = A00(r3)
                    java.lang.Object r3 = r5.first
                    java.util.List r3 = (java.util.List) r3
                    java.util.ArrayList r11 = new java.util.ArrayList
                    r11.<init>()
                    java.lang.Object r0 = r5.second
                    if (r0 == 0) goto L_0x0046
                    boolean r0 = r10.isEmpty()
                    if (r0 != 0) goto L_0x0046
                    int r4 = r10.size()
                    r0 = 0
                    java.lang.Object r0 = r10.get(r0)
                    X.206 r0 = (X.AnonymousClass206) r0
                    int r2 = r0.A0u
                    if (r17 == 0) goto L_0x0099
                    boolean r0 = android.text.TextUtils.isEmpty(r9)
                    if (r0 != 0) goto L_0x0099
                    r1 = 1
                    if (r4 != r1) goto L_0x0099
                    if (r2 == 0) goto L_0x0099
                L_0x0091:
                    java.lang.Object r0 = r5.second
                    if (r1 != 0) goto L_0x0043
                    r3.add(r0)
                    goto L_0x0046
                L_0x0099:
                    r1 = 0
                    goto L_0x0091
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C33251iW.A06(X.1kd, X.36j, java.lang.String, java.util.List, java.util.List, boolean):void");
            }

            private void A07(C34531kd r22, C692236j r23, String str, List list, List list2, boolean z, boolean z2) {
                C692236j r10;
                String str2;
                boolean z3;
                List list3 = list2;
                if (list3.size() != 0) {
                    boolean z4 = false;
                    if (list.size() > 1) {
                        z4 = true;
                    }
                    int size = list.size();
                    Iterator it = list.iterator();
                    C52642bF r2 = null;
                    while (true) {
                        r10 = r23;
                        str2 = str;
                        if (!it.hasNext()) {
                            break;
                        }
                        AnonymousClass206 r9 = (AnonymousClass206) it.next();
                        C34531kd r7 = r22;
                        boolean z5 = z;
                        if (r9 instanceof AnonymousClass247) {
                            this.A19.CGF(new AnonymousClass3CP(r7, this, (AnonymousClass247) r9, r10, list3, size, z5));
                        } else {
                            if (!z4) {
                                z3 = z5;
                            } else if (!z || (AnonymousClass9RY.A00(r9) == null && !r9.A0w())) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            r2 = A0G(r7, r9, r10, str2, list3, size, z3);
                            if (C18020vd.A05(C18040vf.A02, this.A0c, 8783)) {
                                r2.A00.A09(new C145977Ni(r9, list3, r7, this, 0));
                            }
                        }
                    }
                    if (z2 && !TextUtils.isEmpty(str2) && r2 != null) {
                        r2.A00.A09(new C98314qv(this, r10, list3, str2, 0));
                    }
                }
            }

            public static void A09(C33251iW r3, AnonymousClass1BI r4) {
                AnonymousClass1Nb r2 = r3.A14;
                if (r2.A0y(r4)) {
                    C26811To r1 = r3.A0C;
                    Set A062 = r1.A06(r4, false);
                    r2.A0b(r4);
                    r1.A0R(A062);
                }
            }

            public static void A0A(C33251iW r4, AnonymousClass206 r5) {
                C18030ve r1 = ((C56972iK) r4.A1Z.get()).A00;
                C18040vf r3 = C18040vf.A02;
                if (C18020vd.A05(r3, r1, 1860) && C18020vd.A05(r3, r1, 2755)) {
                    r5.A0b(262144);
                }
                C18030ve r2 = r4.A0c;
                if (C18020vd.A05(r3, r2, 8742) && !C18020vd.A05(r3, r2, 7497)) {
                    C63672tV.A01(r5).A07 = true;
                }
                if (C18020vd.A05(r3, r2, 9453)) {
                    C63672tV.A01(r5).A06 = true;
                }
            }

            public static void A0D(C33251iW r10, AnonymousClass206 r11, boolean z) {
                if (z) {
                    ((C60152nT) r10.A28.get()).A03(r11, true, 0L, (Long) null, (String) null, AnonymousClass11P.A01(r10.A0K), false, false);
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:10:0x002f A[ORIG_RETURN, RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static boolean A0E(X.C33251iW r2, X.AnonymousClass1BI r3, X.AnonymousClass206 r4) {
                /*
                    X.00H r0 = r2.A26
                    java.lang.Object r0 = r0.get()
                    X.1c4 r0 = (X.AnonymousClass1c4) r0
                    X.0ve r2 = r0.A02
                    r1 = 12805(0x3205, float:1.7944E-41)
                    X.0vf r0 = X.C18040vf.A02
                    boolean r0 = X.C18020vd.A05(r0, r2, r1)
                    r2 = 0
                    if (r0 == 0) goto L_0x0030
                    if (r3 == 0) goto L_0x0030
                    boolean r0 = X.AnonymousClass25A.A0t(r4)
                    if (r0 == 0) goto L_0x0030
                    X.36w r0 = X.C60502o8.A00(r4)
                    if (r0 == 0) goto L_0x0030
                    boolean r1 = r4.A0w()
                    boolean r0 = X.C22971Dz.A0V(r3)
                    if (r1 != 0) goto L_0x0031
                    if (r0 == 0) goto L_0x0030
                L_0x002f:
                    r2 = 1
                L_0x0030:
                    return r2
                L_0x0031:
                    if (r0 != 0) goto L_0x0030
                    goto L_0x002f
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C33251iW.A0E(X.1iW, X.1BI, X.206):boolean");
            }

            private boolean A0F(AnonymousClass206 r4) {
                if ((r4.A11(1) || !r4.A0v.A02 || r4.A0w() || ((AnonymousClass1PW) this.A1F.get()).A0B(r4)) && r4.A0u != 20) {
                    return true;
                }
                return false;
            }

            public C52642bF A0H(C1418377d r13, List list, int i, int i2) {
                C441322g A012;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass1BI r6 = (AnonymousClass1BI) it.next();
                    if (!(r6 == null || (A012 = A01(r6, (AnonymousClass206) null, r13, Integer.valueOf(i), false, false)) == null)) {
                        arrayList.add(A012);
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("UserActions/userActionSendStickerMessages/message list size ");
                sb.append(arrayList.size());
                Log.i(sb.toString());
                if (arrayList.isEmpty()) {
                    return null;
                }
                C19830z4 r3 = this.A1l;
                if (!((SharedPreferences) r3.A00.get()).getBoolean("sticker_maker_upsell_dismissed", false)) {
                    C19830z4.A00(r3).putBoolean("sticker_maker_upsell_dismissed", true).apply();
                }
                return A0I(new C63642tS(arrayList, i2), (Long) null, (byte[]) null, false, false);
            }

            public void A0K(Activity activity, AnonymousClass1L9 r13, AnonymousClass206 r14) {
                String str;
                File file;
                if (!(r14 instanceof AnonymousClass21V)) {
                    str = "UserActions/userActionShare/app/share/message-is-not-media-message";
                } else {
                    AnonymousClass21V r9 = (AnonymousClass21V) r14;
                    C62572rc r0 = r9.A02;
                    if (r0 == null || (file = r0.A0G) == null || !file.exists()) {
                        str = "UserActions/userActionShare/app/share/media-does-not-exist";
                    } else {
                        AnonymousClass10I r4 = this.A19;
                        r4.CGF(new AnonymousClass3C0(this, r14, 15));
                        WeakReference weakReference = new WeakReference(activity);
                        AnonymousClass1KB r3 = this.A03;
                        r3.A07(0, 2131891797);
                        AnonymousClass190 r2 = this.A01;
                        C32211gp r02 = this.A1q;
                        C21120Aeo aeo = new C21120Aeo(weakReference, this, r13, r9, 0);
                        C45792Br r1 = new C45792Br(r2, r02, r9);
                        r1.A0A(aeo, r3.A05);
                        r4.CGF(r1);
                        return;
                    }
                }
                Log.w(str);
                this.A03.A08(((C139956zi) this.A25.get()).A01(), 0);
            }

            public /* synthetic */ void A0L(Uri uri, AnonymousClass1L9 r12, AnonymousClass21V r13, WeakReference weakReference) {
                String str;
                String A182;
                Intent intent;
                int i;
                this.A03.A04();
                if (weakReference.get() != null) {
                    Context context = (Context) weakReference.get();
                    boolean A0m2 = AnonymousClass25A.A0m(r13);
                    boolean A052 = C18020vd.A05(C18040vf.A02, this.A0c, 7721);
                    AnonymousClass11S r6 = this.A04;
                    int i2 = r13.A0u;
                    if (i2 == 23) {
                        str = ((AnonymousClass22Q) r13).A0A;
                    } else if (i2 != 44) {
                        if (i2 == 1) {
                            i = 2131896084;
                        } else if (i2 == 2) {
                            i = 2131896080;
                        } else if (i2 == 3) {
                            i = 2131896085;
                        } else if (i2 != 9) {
                            i = 2131896083;
                            if (i2 != 13) {
                                i = 2131896082;
                            }
                        } else {
                            i = 2131896081;
                        }
                        str = context.getString(i, new Object[]{r6.A0D()});
                    } else {
                        str = ((AnonymousClass22U) r13).A09;
                    }
                    C18000vb r1 = this.A0N;
                    if (C20097A7a.A05(r13)) {
                        A182 = C20097A7a.A01(r13);
                    } else if (i2 == 44) {
                        A182 = C63752td.A02(r1, (AnonymousClass22U) r13);
                    } else {
                        A182 = r13.A18();
                    }
                    String A002 = C50562Ux.A00(this.A01, r13);
                    Intent intent2 = new Intent("android.intent.action.SEND");
                    intent2.setType(A002);
                    if (!TextUtils.isEmpty(str)) {
                        intent2.putExtra("android.intent.extra.SUBJECT", str);
                    }
                    if (A052) {
                        StringBuilder sb = new StringBuilder();
                        if (A182 != null) {
                            sb.append(A182);
                            sb.append(System.getProperty("line.separator"));
                        }
                        sb.append(context.getString(2131896125, new Object[]{context.getString(2131899103)}));
                        sb.append(System.getProperty("line.separator"));
                        sb.append("https://whatsapp.com/dl/source=sfw");
                        A182 = sb.toString();
                    }
                    if (!TextUtils.isEmpty(A182)) {
                        intent2.putExtra("android.intent.extra.TEXT", A182);
                    }
                    intent2.putExtra("origin", 3);
                    intent2.putExtra("android.intent.extra.STREAM", uri);
                    intent2.setFlags(1);
                    intent2.setClipData(ClipData.newRawUri("", uri));
                    if (Build.VERSION.SDK_INT >= 29 || !A0m2) {
                        intent = Intent.createChooser(intent2, (CharSequence) null);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent2, 0);
                        if (queryIntentActivities != null) {
                            for (ResolveInfo resolveInfo : queryIntentActivities) {
                                ActivityInfo activityInfo = resolveInfo.activityInfo;
                                String str2 = activityInfo.name;
                                String str3 = activityInfo.applicationInfo.packageName;
                                Intent intent3 = new Intent(intent2);
                                intent3.setClassName(str3, str2);
                                intent3.setPackage(str3);
                                arrayList.add(intent3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Intent intent4 = (Intent) it.next();
                            if ("com.whatsapp".equals(intent4.getPackage()) || "com.whatsapp.w4b".equals(intent4.getPackage())) {
                                intent4.putExtra("enforce_hfm_limit", true);
                            }
                        }
                        intent = AnonymousClass4aU.A01((IntentSender) null, (CharSequence) null, arrayList);
                    }
                    intent.setFlags(1);
                    r12.A08(context, intent);
                }
            }

            public void A0M(AnonymousClass1FU r11, AnonymousClass21V r12, Runnable runnable, boolean z, boolean z2) {
                C144787Ir r2;
                AnonymousClass00H r22 = this.A1c;
                AnonymousClass1KB r4 = this.A03;
                AnonymousClass1FU r3 = r11;
                AnonymousClass7Ek r0 = new AnonymousClass7Ek(r11, r4, (AnonymousClass11Z) r22.get());
                AnonymousClass1NM r6 = this.A0J;
                if (r6.A04(r0)) {
                    if (z) {
                        boolean z3 = r12 instanceof AnonymousClass22Q;
                        AnonymousClass18K r9 = this.A0d;
                        AnonymousClass11Z r7 = (AnonymousClass11Z) r22.get();
                        C24921Me r5 = this.A0G;
                        AnonymousClass1E7 A052 = AnonymousClass25A.A05(this.A0S, r12);
                        if (z3) {
                            r2 = new C144787Ir(r3, r4, r5, r6, r7, A052, r9);
                        } else {
                            r2 = new C144787Ir(r3, r4, r5, r6, r7, A052, r9);
                        }
                    } else {
                        r2 = null;
                    }
                    if (!C22781De.A03() || !z2) {
                        this.A0n.A0D(r2, r12, 0);
                        if (runnable != null) {
                            r4.CGP(runnable);
                            return;
                        }
                        return;
                    }
                    this.A19.CGF(new C21368Aix(this, r2, r12, runnable, 22));
                }
            }

            public void A0N(C34531kd r18, C692236j r19, String str, List list, List list2, boolean z) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    Jid jid = (Jid) it.next();
                    if (C22971Dz.A0V(jid)) {
                        arrayList.add(jid);
                    } else {
                        arrayList2.add(jid);
                    }
                }
                C34531kd r4 = r18;
                C692236j r5 = r19;
                String str2 = str;
                List list3 = list;
                boolean z2 = z;
                if (!arrayList.isEmpty()) {
                    if (C18020vd.A05(C18040vf.A02, this.A0c, 6323)) {
                        A06(r4, r5, str2, list3, arrayList, z2);
                    }
                }
                A06(r4, r5, str2, list3, arrayList2, z2);
            }

            public void A0P(AnonymousClass1BI r5) {
                if (r5 != null && !C42701yb.A01(r5) && !C22971Dz.A0N(r5) && !C22971Dz.A0V(r5) && !C22971Dz.A0S(r5) && !this.A04.A0O(r5)) {
                    C32521hK r0 = this.A1e;
                    r0.A00.obtainMessage(1, 0, 0, C32521hK.A00(r0, r5)).sendToTarget();
                }
            }

            public void A0Q(AnonymousClass1BI r4, int i) {
                if (r4 != null && !C22971Dz.A0N(r4) && !C22971Dz.A0V(r4) && !this.A04.A0O(r4)) {
                    C32521hK r0 = this.A1e;
                    r0.A00.obtainMessage(0, 0, i, C32521hK.A00(r0, r4)).sendToTarget();
                }
            }

            public void A0U(AnonymousClass1BI r6, Integer num, String str, String str2, String str3, String str4, long j) {
                C20268AEb aEb;
                int i;
                C438721g r2 = new C438721g(this.A0x.A01(r6, true), AnonymousClass11P.A01(this.A0K));
                AnonymousClass206 A032 = ((AnonymousClass1W6) this.A1L.get()).A01.A03(j);
                if (A032 != null) {
                    this.A10.A00(r2, A032);
                }
                if (str4 == null || str4.equals("1")) {
                    aEb = new C20268AEb((AnonymousClass9Je) null, new AE2(1, str2, str3), str);
                } else {
                    String A012 = this.A0L.A01(2131890459);
                    if (num != null) {
                        if (C18020vd.A05(C18040vf.A02, this.A0c, 9157)) {
                            i = num.intValue();
                            aEb = new C20268AEb(AnonymousClass9Je.EXTENSIONS_1, new AE2(Integer.valueOf(i), str2, str3), A012);
                        }
                    }
                    i = 2;
                    aEb = new C20268AEb(AnonymousClass9Je.EXTENSIONS_1, new AE2(Integer.valueOf(i), str2, str3), A012);
                }
                r2.A00 = aEb;
                this.A0U.BBM(r2);
            }

            public void A0V(AnonymousClass1BI r7, Integer num, boolean z) {
                String A0K2;
                StringBuilder sb = new StringBuilder();
                sb.append("UserActions/userActionSetChatArchived; jid=");
                sb.append(r7);
                sb.append("; archive=");
                sb.append(z);
                Log.i(sb.toString());
                this.A0Q.A08(r7, num, z, false);
                if (z) {
                    A0K2 = this.A0L.A00.getString(2131888968);
                } else {
                    A0K2 = this.A0N.A0K(new Object[]{1}, 2131755079, 1);
                }
                AnonymousClass1KB r2 = this.A03;
                r2.A0G(A0K2, 0);
                r2.A0J(new AnonymousClass3C0(this, r7, 13));
            }

            public void A0X(AnonymousClass1BI r6, boolean z, boolean z2) {
                C88654aI r4 = (C88654aI) this.A21.get();
                C22941Dw r0 = UserJid.Companion;
                UserJid A012 = C22941Dw.A01(r6);
                if (C18020vd.A05(C18040vf.A02, r4.A03, 2805)) {
                    C88654aI.A03(r4, A012, (String) null, 24, true);
                }
                A0Y(r6, z, true, z2);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:30:0x0144, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x0145, code lost:
                X.CDX.A00(r10, r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:32:0x0148, code lost:
                throw r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:69:0x0323, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:70:0x0324, code lost:
                X.CDX.A00(r6, r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:71:0x0327, code lost:
                throw r1;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void A0Y(X.AnonymousClass1BI r29, boolean r30, boolean r31, boolean r32) {
                /*
                    r28 = this;
                    r1 = r28
                    X.1MC r2 = r1.A0B
                    r0 = 6
                    r13 = r29
                    r2.A00(r13, r0)
                    X.00H r0 = r1.A1H
                    java.lang.Object r3 = r0.get()
                    X.A74 r3 = (X.A74) r3
                    r0 = 11
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                    r0 = 6
                    r14 = 0
                    X.A74.A01(r3, r13, r2, r14, r0)
                    X.00H r0 = r1.A1D
                    java.lang.Object r12 = r0.get()
                    X.A5M r12 = (X.A5M) r12
                    r2 = 0
                    r3 = 0
                    r18 = 5
                    r16 = r14
                    r17 = r3
                    r20 = r32
                    r15 = r14
                    r19 = r3
                    r12.A03(r13, r14, r15, r16, r17, r18, r19, r20)
                    X.1M9 r0 = r1.A0D
                    X.1E7 r6 = r0.A0E(r13)
                    X.1gx r5 = r1.A0t
                    r5.A0A(r13, r14)
                    X.2pC r0 = X.C61142pC.A01
                    X.C18070vi.A0d(r13, r3)
                    X.1BI r0 = X.C61142pC.A00
                    boolean r0 = X.C18070vi.A18(r0, r13)
                    if (r0 == 0) goto L_0x004f
                    X.C61142pC.A00 = r14
                L_0x004f:
                    java.util.Set r0 = X.C61142pC.A04
                    r0.remove(r13)
                    java.util.Set r0 = X.C61142pC.A03
                    r0.remove(r13)
                    X.1V3 r7 = r1.A1g
                    r8 = r30
                    if (r31 == 0) goto L_0x0119
                    X.1To r0 = r7.A01
                    java.util.Set r4 = r0.A07(r13, r8)
                L_0x0065:
                    X.121 r0 = r7.A03
                    r0.BIE(r13, r8)
                    X.1To r0 = r7.A00
                    r0.A0R(r4)
                    X.00H r0 = r1.A20
                    java.lang.Object r0 = r0.get()
                    X.2Zw r0 = (X.C51852Zw) r0
                    java.util.HashMap r0 = r0.A00
                    r0.remove(r13)
                    if (r6 == 0) goto L_0x0219
                    boolean r0 = r6.A0F()
                    if (r0 != 0) goto L_0x008c
                    X.1BI r0 = r6.A0J
                    boolean r0 = X.C22971Dz.A0N(r0)
                    if (r0 == 0) goto L_0x0091
                L_0x008c:
                    X.1hL r0 = r1.A1h
                    r0.A06(r6)
                L_0x0091:
                    X.1hL r0 = r1.A1h
                    r0.A07(r13)
                    X.1Nb r4 = r1.A14
                    boolean r0 = r6.A0F()
                    r4.A0r(r13, r0)
                    A09(r1, r13)
                    X.1CJ r0 = r1.A0R
                    java.util.HashSet r0 = r0.A01
                    r0.remove(r13)
                    X.1hl r4 = r1.A1j
                    java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
                    com.whatsapp.jid.Jid r0 = r6.A06(r0)
                    X.1BI r0 = (X.AnonymousClass1BI) r0
                    r11 = 1
                    r24 = 3
                    r25 = r11
                    r26 = r11
                    r21 = r4
                    r22 = r0
                    r23 = r11
                    r27 = r20
                    r21.A00(r22, r23, r24, r25, r26, r27)
                    r5.A08()
                    X.126 r7 = r1.A1s
                    X.1V3 r0 = r7.A06
                    r0.A00(r6)
                    java.lang.Class<X.1EC> r5 = X.AnonymousClass1EC.class
                    com.whatsapp.jid.Jid r0 = r6.A06(r5)
                    if (r0 == 0) goto L_0x00f8
                    X.1CJ r4 = r7.A0I
                    java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
                    com.whatsapp.jid.Jid r0 = r6.A06(r0)
                    com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
                    int r0 = r4.A06(r0)
                    if (r0 != r11) goto L_0x00f8
                    X.00H r0 = r7.A0m
                    java.lang.Object r4 = r0.get()
                    X.1kb r4 = (X.C34511kb) r4
                    com.whatsapp.jid.Jid r0 = r6.A06(r5)
                    X.1EC r0 = (X.AnonymousClass1EC) r0
                    r4.A0M(r0)
                L_0x00f8:
                    java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
                    com.whatsapp.jid.Jid r5 = r6.A06(r0)
                    com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
                    if (r5 == 0) goto L_0x016d
                    X.0ve r7 = r1.A0c
                    r4 = 4991(0x137f, float:6.994E-42)
                    X.0vf r0 = X.C18040vf.A02
                    boolean r0 = X.C18020vd.A05(r0, r7, r4)
                    if (r0 != 0) goto L_0x016d
                    X.1Mx r9 = r1.A0E
                    X.1My r0 = r9.A01
                    X.1Lt r0 = r0.A00
                    X.1au r10 = r0.A06()
                    goto L_0x011f
                L_0x0119:
                    java.util.Set r4 = java.util.Collections.emptySet()
                    goto L_0x0065
                L_0x011f:
                    java.lang.String r8 = "wa_trusted_contacts"
                    java.lang.String r7 = "wa_trusted_contacts.jid = ?"
                    java.lang.String[] r4 = new java.lang.String[r11]     // Catch:{ all -> 0x0142 }
                    java.lang.String r0 = r5.getRawString()     // Catch:{ all -> 0x0142 }
                    r4[r3] = r0     // Catch:{ all -> 0x0142 }
                    X.C24861Ly.A02(r10, r8, r7, r4)     // Catch:{ all -> 0x0142 }
                    java.lang.String r8 = "wa_trusted_contacts_send"
                    java.lang.String r7 = "wa_trusted_contacts_send.jid = ?"
                    java.lang.String[] r4 = new java.lang.String[r11]     // Catch:{ all -> 0x0142 }
                    java.lang.String r0 = r5.getRawString()     // Catch:{ all -> 0x0142 }
                    r4[r3] = r0     // Catch:{ all -> 0x0142 }
                    X.C24861Ly.A02(r10, r8, r7, r4)     // Catch:{ all -> 0x0142 }
                    goto L_0x0149
                L_0x0142:
                    r0 = move-exception
                    throw r0     // Catch:{ all -> 0x0144 }
                L_0x0144:
                    r1 = move-exception
                    X.CDX.A00(r10, r0)
                    throw r1
                L_0x0149:
                    r10.close()
                    X.0vl r0 = r9.A05
                    java.lang.Object r0 = r0.getValue()
                    X.C18070vi.A0X(r0)
                    java.util.Map r0 = (java.util.Map) r0
                    r0.remove(r5)
                    X.0vl r0 = r9.A06
                    java.lang.Object r0 = r0.getValue()
                    X.C18070vi.A0X(r0)
                    java.util.Map r0 = (java.util.Map) r0
                    r0.remove(r5)
                    X.1Mz r0 = r9.A00
                    r0.A0E(r5)
                L_0x016d:
                    boolean r0 = r6.A0C()
                    if (r0 == 0) goto L_0x0219
                    X.1Ty r0 = r1.A1i
                    X.AEW r0 = r0.A08(r5)
                    if (r0 == 0) goto L_0x0219
                    boolean r0 = r0.A0Y
                    if (r0 == 0) goto L_0x0219
                    X.00H r0 = r1.A22
                    java.lang.Object r7 = r0.get()
                    X.A2z r7 = (X.C20009A2z) r7
                    r5 = r13
                    X.00H r0 = r7.A0D
                    java.lang.Object r4 = r0.get()
                    X.4S5 r4 = (X.AnonymousClass4S5) r4
                    boolean r0 = r13 instanceof com.whatsapp.jid.UserJid
                    if (r0 == 0) goto L_0x019a
                    com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
                    com.whatsapp.jid.UserJid r5 = r4.A00(r5)
                L_0x019a:
                    java.lang.String r6 = r5.getRawString()
                    X.0z4 r7 = r7.A06
                    r7.A1U(r6)
                    r7.A1S(r6)
                    r7.A1T(r6)
                    android.content.SharedPreferences$Editor r5 = X.C19830z4.A00(r7)
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r0 = "dc_user_postcode_"
                    r4.append(r0)
                    r4.append(r6)
                    java.lang.String r0 = r4.toString()
                    android.content.SharedPreferences$Editor r0 = r5.remove(r0)
                    r0.apply()
                    android.content.SharedPreferences$Editor r5 = X.C19830z4.A00(r7)
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r0 = "dc_location_name_"
                    r4.append(r0)
                    r4.append(r6)
                    java.lang.String r0 = r4.toString()
                    android.content.SharedPreferences$Editor r0 = r5.remove(r0)
                    r0.apply()
                    android.content.SharedPreferences$Editor r5 = X.C19830z4.A00(r7)
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r0 = "dc_default_postcode_"
                    r4.append(r0)
                    r4.append(r6)
                    java.lang.String r0 = r4.toString()
                    android.content.SharedPreferences$Editor r0 = r5.remove(r0)
                    r0.apply()
                    android.content.SharedPreferences$Editor r5 = X.C19830z4.A00(r7)
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r0 = "dc_business_domain_"
                    r4.append(r0)
                    r4.append(r6)
                    java.lang.String r0 = r4.toString()
                    android.content.SharedPreferences$Editor r0 = r5.remove(r0)
                    r0.apply()
                L_0x0219:
                    boolean r0 = X.C22971Dz.A0O(r13)
                    if (r0 == 0) goto L_0x02a9
                    X.1Rh r8 = r1.A1v
                    X.1NN r4 = r1.A0T
                    r0 = r13
                    X.2Jo r0 = (X.C47712Jo) r0
                    r18 = 60
                    X.3dM r7 = new X.3dM
                    r7.<init>(r4, r0)
                    java.lang.String r0 = "BroadcastXmppMethods/sendDeleteBroadcastList"
                    com.whatsapp.util.Log.i((java.lang.String) r0)
                    X.00H r10 = r8.A01
                    java.lang.Object r0 = r10.get()
                    X.1OZ r0 = (X.AnonymousClass1OZ) r0
                    java.lang.String r6 = r0.A0B()
                    X.2Jo r11 = r7.A01
                    r5 = 1
                    java.lang.String r4 = "id"
                    if (r11 == 0) goto L_0x0302
                    X.1MD[] r9 = new X.AnonymousClass1MD[r5]
                    X.1MD r0 = new X.1MD
                    r0.<init>((com.whatsapp.jid.Jid) r11, (java.lang.String) r4)
                    r9[r3] = r0
                    java.lang.String r0 = "list"
                    X.1ca r11 = new X.1ca
                    r11.<init>(r0, r9)
                L_0x0255:
                    java.lang.String r0 = "delete"
                    X.1ca r9 = new X.1ca
                    r9.<init>((X.C29621ca) r11, (java.lang.String) r0, (X.AnonymousClass1MD[]) r14)
                    r0 = 4
                    X.1MD[] r11 = new X.AnonymousClass1MD[r0]
                    X.1MD r0 = new X.1MD
                    r0.<init>((java.lang.String) r4, (java.lang.String) r6)
                    r11[r3] = r0
                    java.lang.String r12 = "xmlns"
                    java.lang.String r4 = "w:b"
                    X.1MD r0 = new X.1MD
                    r0.<init>((java.lang.String) r12, (java.lang.String) r4)
                    r11[r5] = r0
                    java.lang.String r12 = "type"
                    java.lang.String r0 = "set"
                    X.1MD r4 = new X.1MD
                    r4.<init>((java.lang.String) r12, (java.lang.String) r0)
                    r0 = 2
                    r11[r0] = r4
                    java.lang.String r12 = "to"
                    X.8v4 r0 = X.C173438v4.A00
                    X.1MD r4 = new X.1MD
                    r4.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r12)
                    r0 = 3
                    r11[r0] = r4
                    java.lang.String r4 = "iq"
                    X.1ca r0 = new X.1ca
                    r0.<init>((X.C29621ca) r9, (java.lang.String) r4, (X.AnonymousClass1MD[]) r11)
                    java.lang.Object r14 = r10.get()
                    X.1OZ r14 = (X.AnonymousClass1OZ) r14
                    X.7LL r15 = new X.7LL
                    r15.<init>(r8, r7, r7, r5)
                    r19 = 32000(0x7d00, double:1.581E-319)
                    r17 = r6
                    r16 = r0
                    r14.A0I(r15, r16, r17, r18, r19)
                L_0x02a9:
                    X.1hL r0 = r1.A1h
                    r0.A03()
                    java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
                    java.util.Map r0 = X.AnonymousClass2VZ.A00
                    r0.put(r13, r4)
                    X.0z4 r5 = r1.A1l
                    X.00H r0 = r5.A00
                    java.lang.Object r0 = r0.get()
                    android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
                    java.lang.String r4 = "1on1_invite_sender"
                    java.lang.String r2 = r0.getString(r4, r2)
                    X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
                    com.whatsapp.jid.UserJid r0 = r0.A04(r2)
                    if (r0 == 0) goto L_0x02e1
                    boolean r0 = r0.equals(r13)
                    if (r0 == 0) goto L_0x02e1
                    android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r5)
                    android.content.SharedPreferences$Editor r0 = r0.remove(r4)
                    r0.apply()
                L_0x02e0:
                    return
                L_0x02e1:
                    X.00H r1 = r1.A2A
                    java.lang.Object r0 = r1.get()
                    X.2kd r0 = (X.C58402kd) r0
                    com.whatsapp.jid.UserJid r7 = X.C22941Dw.A01(r13)
                    boolean r0 = r0.A01(r7)
                    if (r0 == 0) goto L_0x02e0
                    java.lang.Object r0 = r1.get()
                    X.2kd r0 = (X.C58402kd) r0
                    if (r7 == 0) goto L_0x02e0
                    X.1Lt r0 = r0.A00
                    X.1au r6 = r0.A06()
                    goto L_0x0305
                L_0x0302:
                    r11 = r14
                    goto L_0x0255
                L_0x0305:
                    r0 = r6
                    X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0321 }
                    X.1Ev r5 = r0.A02     // Catch:{ all -> 0x0321 }
                    java.lang.String r4 = "recently_accepted_deeplink_invites"
                    java.lang.String r2 = "user_jid=?"
                    r0 = 1
                    java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0321 }
                    java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x0321 }
                    r1[r3] = r0     // Catch:{ all -> 0x0321 }
                    java.lang.String r0 = "delete_invite"
                    r5.A04(r4, r2, r0, r1)     // Catch:{ all -> 0x0321 }
                    r6.close()
                    return
                L_0x0321:
                    r0 = move-exception
                    throw r0     // Catch:{ all -> 0x0323 }
                L_0x0323:
                    r1 = move-exception
                    X.CDX.A00(r6, r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C33251iW.A0Y(X.1BI, boolean, boolean, boolean):void");
            }

            /* JADX WARNING: type inference failed for: r2v2, types: [X.22v, X.206] */
            public void A0Z(UserJid userJid, Boolean bool, int i, int i2) {
                C29721cl A0D2 = this.A0R.A0D(userJid);
                if (A0D2 == null || A0D2.expiration != i) {
                    long A012 = AnonymousClass11P.A01(this.A0K);
                    C18070vi.A0d(userJid, 0);
                    ? r2 = new AnonymousClass206(((C52142aR) this.A23.get()).A00.A01(userJid, true), 36, A012);
                    r2.A0d(userJid);
                    r2.A17(Integer.valueOf(i));
                    if (i > 0) {
                        r2.A04 = i2;
                        if (bool != null) {
                            r2.A0Q = bool;
                        }
                    }
                    A0b(r2);
                    this.A0U.BBM(r2);
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:18:0x007c, code lost:
                if (r5.A0R(X.C42941yz.A00(r3)) != false) goto L_0x007e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:60:0x0161, code lost:
                if (X.C18020vd.A05(r1, r2, 11869) == false) goto L_0x007e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:62:0x0167, code lost:
                if ((r10 instanceof X.C445823z) != false) goto L_0x007e;
             */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x0096  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void A0b(X.AnonymousClass206 r10) {
                /*
                    r9 = this;
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r0 = "UserActions/prepareSendMessage msg="
                    r1.append(r0)
                    r1.append(r10)
                    java.lang.String r0 = r1.toString()
                    com.whatsapp.util.Log.i((java.lang.String) r0)
                    X.205 r0 = r10.A0v
                    X.1BI r3 = r0.A00
                    boolean r0 = X.C22971Dz.A0a(r3)
                    if (r0 == 0) goto L_0x016b
                    X.0ve r2 = r9.A0c
                    r1 = 5477(0x1565, float:7.675E-42)
                    X.0vf r0 = X.C18040vf.A02
                    boolean r0 = X.C18020vd.A05(r0, r2, r1)
                    if (r0 != 0) goto L_0x002f
                    X.1E5 r0 = X.AnonymousClass1E5.A00
                    r10.A0d(r0)
                L_0x002f:
                    A0A(r9, r10)
                L_0x0032:
                    X.00H r0 = r9.A1G
                    java.lang.Object r0 = r0.get()
                    X.1UD r0 = (X.AnonymousClass1UD) r0
                    boolean r0 = r0.A06()
                    if (r0 == 0) goto L_0x0054
                    X.00H r0 = r9.A1F
                    java.lang.Object r1 = r0.get()
                    X.1PW r1 = (X.AnonymousClass1PW) r1
                    java.util.List r0 = r10.A0h
                    com.whatsapp.jid.UserJid r0 = r1.A03(r0)
                    if (r0 == 0) goto L_0x0054
                    r0 = 1
                    r10.A0n(r0)
                L_0x0054:
                    X.0ve r7 = r9.A0c
                    X.1CJ r5 = r9.A0R
                    X.00H r4 = r9.A1F
                    X.00H r0 = r9.A1J
                    java.lang.Object r1 = r0.get()
                    X.2iE r1 = (X.C56912iE) r1
                    X.00H r2 = r9.A1X
                    boolean r0 = r10 instanceof X.AnonymousClass22H
                    if (r0 != 0) goto L_0x007e
                    boolean r0 = r1.A00(r10)
                    if (r0 != 0) goto L_0x007e
                    boolean r0 = r10 instanceof X.AnonymousClass212
                    if (r0 != 0) goto L_0x00df
                    android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
                    X.1EC r0 = X.C42941yz.A00(r3)
                    boolean r0 = r5.A0R(r0)
                    if (r0 == 0) goto L_0x00df
                L_0x007e:
                    r0 = 1
                    r10.A0o = r0
                    r0 = 32
                    byte[] r1 = new byte[r0]
                    java.security.SecureRandom r0 = X.C22691Cv.A00()
                    r0.nextBytes(r1)
                    r10.A1D = r1
                L_0x008e:
                    X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
                    com.whatsapp.jid.UserJid r2 = X.C22941Dw.A01(r3)
                    if (r2 == 0) goto L_0x0226
                    X.1eV r0 = r9.A0O
                    X.Abw r4 = r0.A00(r2)
                    java.util.Map r1 = r0.A02
                    int r0 = r4.A00
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    java.lang.Object r3 = r1.get(r0)
                    X.C17960vV.A07(r3)
                    X.1eR r3 = (X.C30741eR) r3
                    boolean r0 = r3 instanceof X.C30751eS
                    if (r0 == 0) goto L_0x01e8
                    X.1eS r3 = (X.C30751eS) r3
                    X.8oR r4 = (X.AnonymousClass8oR) r4
                    r0 = 1
                    X.C18070vi.A0d(r4, r0)
                    X.00H r0 = r3.A03
                    java.lang.Object r0 = r0.get()
                    X.2id r0 = (X.C57162id) r0
                    boolean r0 = r0.A00(r4)
                    if (r0 == 0) goto L_0x0226
                    X.00H r0 = r3.A01
                    java.lang.Object r0 = r0.get()
                    X.4R8 r0 = (X.AnonymousClass4R8) r0
                    boolean r0 = r0.A00(r4)
                    if (r0 == 0) goto L_0x01fb
                    boolean r0 = r4.A0B
                    if (r0 == 0) goto L_0x01b7
                    r0 = 1
                    java.lang.Object r1 = r10.A0w
                    monitor-enter(r1)
                    goto L_0x01aa
                L_0x00df:
                    int r0 = r10.A05
                    if (r0 <= 0) goto L_0x00ee
                    r1 = 3146(0xc4a, float:4.408E-42)
                    X.0vf r0 = X.C18040vf.A02
                    boolean r0 = X.C18020vd.A05(r0, r7, r1)
                    if (r0 == 0) goto L_0x00ee
                    goto L_0x007e
                L_0x00ee:
                    if (r3 == 0) goto L_0x008e
                    java.lang.Object r0 = r4.get()
                    X.1PW r0 = (X.AnonymousClass1PW) r0
                    boolean r0 = r0.A0D(r10)
                    if (r0 != 0) goto L_0x007e
                    boolean r0 = X.C22971Dz.A0e(r3)
                    if (r0 == 0) goto L_0x010e
                    r1 = 3143(0xc47, float:4.404E-42)
                    X.0vf r0 = X.C18040vf.A02
                    boolean r0 = X.C18020vd.A05(r0, r7, r1)
                    if (r0 == 0) goto L_0x010e
                    goto L_0x007e
                L_0x010e:
                    boolean r0 = X.C22971Dz.A0O(r3)
                    if (r0 == 0) goto L_0x0120
                    r1 = 3144(0xc48, float:4.406E-42)
                    X.0vf r0 = X.C18040vf.A02
                    boolean r0 = X.C18020vd.A05(r0, r7, r1)
                    if (r0 == 0) goto L_0x0120
                    goto L_0x007e
                L_0x0120:
                    boolean r0 = X.C22971Dz.A0a(r3)
                    if (r0 == 0) goto L_0x0132
                    r1 = 3145(0xc49, float:4.407E-42)
                    X.0vf r0 = X.C18040vf.A02
                    boolean r0 = X.C18020vd.A05(r0, r7, r1)
                    if (r0 == 0) goto L_0x0132
                    goto L_0x007e
                L_0x0132:
                    X.36k r0 = X.C60472o5.A00(r10)
                    if (r0 == 0) goto L_0x0143
                    r0 = 16777216(0x1000000, double:8.289046E-317)
                    boolean r0 = r10.A11(r0)
                    if (r0 == 0) goto L_0x0143
                    goto L_0x007e
                L_0x0143:
                    java.lang.Object r4 = r2.get()
                    X.A16 r4 = (X.A16) r4
                    X.0ve r2 = r4.A01
                    r0 = 8860(0x229c, float:1.2416E-41)
                    X.0vf r1 = X.C18040vf.A02
                    int r0 = X.C18020vd.A00(r1, r2, r0)
                    if (r0 == 0) goto L_0x0165
                    boolean r0 = r4.A01(r10)
                    if (r0 == 0) goto L_0x0165
                    r0 = 11869(0x2e5d, float:1.6632E-41)
                    boolean r0 = X.C18020vd.A05(r1, r2, r0)
                    if (r0 != 0) goto L_0x0165
                    goto L_0x007e
                L_0x0165:
                    boolean r0 = r10 instanceof X.C445823z
                    if (r0 == 0) goto L_0x008e
                    goto L_0x007e
                L_0x016b:
                    boolean r0 = X.C22971Dz.A0N(r3)
                    if (r0 == 0) goto L_0x0032
                    r0 = 1
                    r10.A0l = r0
                    X.1MZ r0 = r9.A1o
                    r1 = r3
                    X.1E9 r1 = (X.AnonymousClass1E9) r1
                    X.1MW r0 = r0.A08
                    X.2tp r1 = r0.A0C(r1)
                    X.1Nf r0 = r9.A0S
                    X.1E7 r0 = r0.A01(r3)
                    java.lang.String r0 = r0.A0K()
                    r10.A0e = r0
                    X.10f r0 = r1.A07()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>(r0)
                    X.11S r1 = r9.A04
                    r1.A0I()
                    com.whatsapp.jid.PhoneUserJid r0 = r1.A0E
                    r2.remove(r0)
                    X.1E2 r0 = r1.A09()
                    r2.remove(r0)
                    r10.A0m(r2)
                    goto L_0x0032
                L_0x01aa:
                    r10.A0k = r0     // Catch:{ all -> 0x01ae }
                    monitor-exit(r1)     // Catch:{ all -> 0x01ae }
                    goto L_0x01b1
                L_0x01ae:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x01ae }
                    throw r0
                L_0x01b1:
                    r0 = 1073741824(0x40000000, double:5.304989477E-315)
                    r10.A0b(r0)
                L_0x01b7:
                    java.lang.Class<X.Abw> r0 = X.C20942Abw.class
                    X.25F r0 = r10.A0M(r0)
                    r0.A02(r4)
                    com.whatsapp.jid.UserJid r4 = r4.A00
                    X.00H r0 = r3.A06
                    java.lang.Object r1 = r0.get()
                    X.4Qj r1 = (X.C86144Qj) r1
                    r0 = 0
                    r1.A00(r4, r0)
                    X.00H r0 = r3.A05
                    java.lang.Object r5 = r0.get()
                    X.4aI r5 = (X.C88654aI) r5
                    X.2a8 r0 = r5.A02
                    X.0ve r3 = r0.A00
                    r1 = 9064(0x2368, float:1.2701E-41)
                    X.0vf r0 = X.C18040vf.A02
                    boolean r0 = X.C18020vd.A05(r0, r3, r1)
                    if (r0 == 0) goto L_0x0226
                    r3 = 0
                    r1 = 36
                    goto L_0x0222
                L_0x01e8:
                    boolean r0 = r3 instanceof X.C30761eT
                    if (r0 != 0) goto L_0x01f1
                    boolean r0 = r3 instanceof X.C30791eW
                    if (r0 == 0) goto L_0x01f1
                    goto L_0x0226
                L_0x01f1:
                    java.lang.Class<X.Abw> r0 = X.C20942Abw.class
                    X.25F r0 = r10.A0M(r0)
                    r0.A02(r4)
                    goto L_0x0226
                L_0x01fb:
                    com.whatsapp.jid.UserJid r4 = r4.A00
                    X.00H r0 = r3.A06
                    java.lang.Object r1 = r0.get()
                    X.4Qj r1 = (X.C86144Qj) r1
                    r0 = 1
                    r1.A00(r4, r0)
                    X.00H r0 = r3.A05
                    java.lang.Object r5 = r0.get()
                    X.4aI r5 = (X.C88654aI) r5
                    X.2a8 r0 = r5.A02
                    X.0ve r3 = r0.A00
                    r1 = 9064(0x2368, float:1.2701E-41)
                    X.0vf r0 = X.C18040vf.A02
                    boolean r0 = X.C18020vd.A05(r0, r3, r1)
                    if (r0 == 0) goto L_0x0226
                    r3 = 0
                    r1 = 35
                L_0x0222:
                    r0 = 1
                    X.C88654aI.A03(r5, r4, r3, r1, r0)
                L_0x0226:
                    r0 = 0
                    X.C18070vi.A0d(r7, r0)
                    r0 = 508(0x1fc, float:7.12E-43)
                    X.0vf r8 = X.C18040vf.A02
                    boolean r0 = X.C18020vd.A05(r8, r7, r0)
                    if (r0 == 0) goto L_0x0270
                    if (r2 == 0) goto L_0x0270
                    X.1eX r0 = r9.A0P
                    X.2nM r6 = r0.A03(r2)
                    r0 = 6122(0x17ea, float:8.579E-42)
                    boolean r0 = X.C18020vd.A05(r8, r7, r0)
                    if (r0 == 0) goto L_0x0271
                    if (r6 != 0) goto L_0x0273
                    X.1eV r1 = r9.A0O
                    X.Abw r0 = r1.A00(r2)
                    boolean r0 = r0 instanceof X.AnonymousClass2DX
                    if (r0 == 0) goto L_0x0270
                    X.Abw r2 = r1.A00(r2)
                    X.2DX r2 = (X.AnonymousClass2DX) r2
                    java.lang.String r1 = r2.A03
                    java.lang.String r0 = r2.A02
                    long r4 = r2.A00
                    r10.A0d = r1
                    r10.A0a = r0
                    java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
                    long r1 = java.lang.System.currentTimeMillis()
                    long r1 = r1 - r4
                    java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                    long r1 = r3.convert(r1, r0)
                    int r0 = (int) r1
                    r10.A03 = r0
                L_0x0270:
                    return
                L_0x0271:
                    if (r6 == 0) goto L_0x0270
                L_0x0273:
                    boolean r0 = r6.A0A
                    if (r0 != 0) goto L_0x0270
                    java.lang.String r1 = r6.A08
                    java.lang.String r0 = r6.A05
                    long r4 = r6.A01
                    r10.A0d = r1
                    r10.A0a = r0
                    java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
                    long r1 = java.lang.System.currentTimeMillis()
                    long r1 = r1 - r4
                    java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                    long r1 = r3.convert(r1, r0)
                    int r0 = (int) r1
                    r10.A03 = r0
                    r0 = 9568(0x2560, float:1.3408E-41)
                    boolean r0 = X.C18020vd.A05(r8, r7, r0)
                    if (r0 == 0) goto L_0x0270
                    java.lang.String r0 = r6.A07
                    r10.A0c = r0
                    java.lang.String r0 = r6.A06
                    r10.A0b = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C33251iW.A0b(X.206):void");
            }

            public void A0c(AnonymousClass206 r5) {
                int i = r5.A0u;
                C17960vV.A0D(!AnonymousClass25A.A0H(i));
                C17960vV.A0D(!AnonymousClass25A.A0I(i));
                boolean z = false;
                if (i == 82) {
                    z = true;
                }
                C17960vV.A0D(!z);
                C203911y r3 = (C203911y) this.A2B.get();
                C130816k3 r2 = new C130816k3(r3.A08, r5);
                r2.A07 = false;
                r2.A06 = true;
                C203911y.A00(r3, new C136506tv(r2), (C26981Ug) null, (Runnable) null);
                if (r5 instanceof AnonymousClass212) {
                    r5 = ((AnonymousClass1W6) this.A1L.get()).A01.A05(((AnonymousClass212) r5).A18());
                }
                this.A0X.A02(r5, -1);
            }

            /* JADX WARNING: type inference failed for: r0v14, types: [X.212, X.22A, X.206] */
            public void A0d(AnonymousClass206 r20, int i, boolean z, boolean z2) {
                boolean z3;
                int i2;
                long j;
                int i3 = 0;
                AnonymousClass206 r9 = r20;
                boolean z4 = z;
                try {
                    r9.A07 = z4 ? 1 : 0;
                    this.A1n.A09(r9);
                    C32491hH r5 = this.A1r;
                    AnonymousClass2HB r4 = new AnonymousClass2HB();
                    AnonymousClass22A A022 = C63892tr.A02(r9);
                    if (A022 != null) {
                        r4.A09 = Long.valueOf((long) A022.A00);
                    }
                    boolean z5 = false;
                    if (z) {
                        r4.A04 = 1;
                    } else {
                        r4.A04 = 2;
                        Long l = r9.A0U;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (l != null) {
                            long longValue = l.longValue();
                            boolean z6 = false;
                            if (longValue <= System.currentTimeMillis()) {
                                z6 = true;
                            }
                            r4.A03 = Boolean.valueOf(z6);
                            if (longValue <= currentTimeMillis) {
                                j = 0;
                            } else {
                                j = longValue - currentTimeMillis;
                            }
                            r4.A0B = Long.valueOf(j);
                        }
                        if (A022 != null) {
                            r4.A0A = Long.valueOf((long) Math.round((((float) (currentTimeMillis - A022.A02)) / 1000.0f) / 3600.0f));
                        }
                    }
                    r4.A06 = Integer.valueOf(i);
                    r4.A0D = 1L;
                    r4.A07 = Integer.valueOf(((C62242r5) r5.A08.get()).A01(r9));
                    AnonymousClass205 r10 = r9.A0v;
                    AnonymousClass1BI r2 = r10.A00;
                    if (r2 != null) {
                        AnonymousClass1CJ r0 = r5.A03;
                        AnonymousClass1M9 r3 = r5.A02;
                        r4.A08 = Long.valueOf((long) C43391zj.A00(r3, r0, r2));
                        if (C22971Dz.A0e(r2)) {
                            GroupJid groupJid = (GroupJid) r2;
                            AnonymousClass1MZ r02 = r5.A04;
                            boolean A0J2 = r02.A0J(groupJid);
                            boolean A0K2 = r02.A0K(groupJid);
                            if (A0J2 && A0K2) {
                                z5 = true;
                            }
                            r4.A02 = Boolean.valueOf(z5);
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        r4.A01 = z3;
                        if (r10.A02) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        r4.A05 = i2;
                        AnonymousClass1E7 A0E2 = r3.A0E(r2);
                        if (C22971Dz.A0W(r2) && A0E2 != null) {
                            r4.A00 = Boolean.valueOf(r5.A07.A0X.A00(A0E2, (AnonymousClass1EC) r2));
                        }
                        r4.A0E = r5.A06.A05(r2.getRawString());
                    }
                    r5.A05.CC7(r4);
                    A51 a51 = new A51(r9.A0I(), r10);
                    long j2 = r9.A0x;
                    C17960vV.A07(r2);
                    AnonymousClass11P r1 = this.A0K;
                    long A012 = AnonymousClass11P.A01(r1);
                    AnonymousClass205 A013 = this.A0x.A01(r2, true);
                    long A014 = AnonymousClass11P.A01(r1);
                    ? r03 = new AnonymousClass212(A013, 68, A012);
                    r03.A05 = a51;
                    r03.A04 = null;
                    r03.A02 = j2;
                    r03.A01 = z4;
                    r03.A02 = A014;
                    if (z2 && !z) {
                        r03.A18 = true;
                    }
                    if (r10.A02 && !z) {
                        i3 = 7;
                    }
                    r03.A01 = i3;
                    C63892tr.A05(r9, r03);
                    this.A0b.A01(r03);
                } catch (SQLiteException e) {
                    r9.A07 = z ^ true ? 1 : 0;
                    e.getMessage();
                    this.A03.A0J(new AnonymousClass7RK(3, (Object) this, z4));
                }
            }

            public void A0e(AnonymousClass206 r4, AnonymousClass23N r5) {
                UserJid userJid;
                if (!r4.A11(1)) {
                    AnonymousClass00H r1 = this.A1F;
                    if (((AnonymousClass1PW) r1.get()).A0B(r4)) {
                        AnonymousClass1PW r12 = (AnonymousClass1PW) r1.get();
                        if (r4.A0q()) {
                            userJid = r12.A03(r4.A0h);
                        } else {
                            userJid = null;
                        }
                        r5.A0l(Collections.singletonList(new C70503Bi(userJid, (String) null)));
                    }
                }
            }

            /* JADX WARNING: type inference failed for: r2v2, types: [X.22p, X.206] */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
                r3 = r9.A0L;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void A0g(X.AnonymousClass206 r18, java.lang.String r19, java.lang.String r20, java.util.List r21, boolean r22) {
                /*
                    r17 = this;
                    r13 = r19
                    r11 = 0
                    r9 = r17
                    r12 = r18
                    r4 = r20
                    r10 = r21
                    r16 = r22
                    if (r20 == 0) goto L_0x0016
                    java.lang.String r0 = X.C19620yd.A0A     // Catch:{ UnsupportedEncodingException -> 0x0056 }
                    byte[] r11 = r4.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x0056 }
                    goto L_0x0056
                L_0x0016:
                    java.util.Iterator r6 = r10.iterator()
                L_0x001a:
                    boolean r0 = r6.hasNext()
                    if (r0 == 0) goto L_0x0073
                    java.lang.Object r2 = r6.next()
                    X.1BI r2 = (X.AnonymousClass1BI) r2
                    X.1PP r1 = r9.A0x
                    r0 = 1
                    X.205 r5 = r1.A01(r2, r0)
                    X.11P r0 = r9.A0K
                    long r0 = X.AnonymousClass11P.A01(r0)
                    r3 = 4
                    X.22p r2 = new X.22p
                    r2.<init>(r5, r3, r0)
                    r0 = 0
                    r2.A02 = r0
                    r2.A18(r4)
                    r2.A00 = r13
                    X.1R0 r0 = r9.A10
                    r0.A00(r2, r12)
                    if (r22 == 0) goto L_0x004d
                    r0 = 4
                    r2.A0b(r0)
                L_0x004d:
                    r9.A0b(r2)
                    X.122 r0 = r9.A0U
                    r0.BBM(r2)
                    goto L_0x001a
                L_0x0056:
                    if (r11 == 0) goto L_0x0016
                    int r0 = r11.length
                    long r2 = (long) r0
                    X.18O r8 = r9.A1f
                    X.18Q r0 = X.AnonymousClass18O.A1K
                    int r0 = r8.A04(r0)
                    long r0 = (long) r0
                    r6 = 1024(0x400, double:5.06E-321)
                    long r0 = r0 * r6
                    int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                    if (r5 <= 0) goto L_0x0074
                    X.1KB r2 = r9.A03
                    r1 = 2131896156(0x7f12275c, float:1.9427165E38)
                    r0 = 1
                    r2.A09(r1, r0)
                L_0x0073:
                    return
                L_0x0074:
                    X.18Q r0 = X.AnonymousClass18O.A1L
                    int r0 = r8.A04(r0)
                    long r0 = (long) r0
                    long r0 = r0 * r6
                    r6 = 0
                    int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                    if (r5 <= 0) goto L_0x0016
                    int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                    if (r5 <= 0) goto L_0x0016
                    if (r19 != 0) goto L_0x009f
                    X.118 r3 = r9.A0L
                    X.1M9 r2 = r9.A0D
                    X.11C r1 = r9.A1k
                    X.0vb r0 = r9.A0N
                    java.lang.String r13 = X.AnonymousClass73Y.A00(r2, r1, r3, r0, r4)
                    if (r13 != 0) goto L_0x009f
                    android.content.Context r1 = r3.A00
                    r0 = 2131888741(0x7f120a65, float:1.9412126E38)
                    java.lang.String r13 = r1.getString(r0)
                L_0x009f:
                    r14 = 1
                    X.10I r0 = r9.A19
                    X.3CT r8 = new X.3CT
                    r15 = r14
                    r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
                    r0.CGF(r8)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C33251iW.A0g(X.206, java.lang.String, java.lang.String, java.util.List, boolean):void");
            }

            public void A0h(AnonymousClass206 r26, List list, List list2, boolean z) {
                String str;
                String A022;
                List list3 = list2;
                String join = TextUtils.join("\n", list3);
                byte[] bArr = null;
                if (join != null) {
                    try {
                        bArr = join.getBytes(C19620yd.A0A);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                AnonymousClass206 r15 = r26;
                List<AnonymousClass1BI> list4 = list;
                boolean z2 = z;
                if (bArr != null) {
                    int length = bArr.length;
                    int size = list3.size();
                    long j = (long) length;
                    AnonymousClass18O r12 = this.A1f;
                    if (j > ((long) r12.A04(AnonymousClass18O.A1K)) * 1024) {
                        int i = 2131892345;
                        if (size == 1) {
                            i = 2131896156;
                        }
                        this.A03.A09(i, 1);
                        return;
                    }
                    long A042 = ((long) r12.A04(AnonymousClass18O.A1L)) * 1024;
                    if (A042 > 0 && j > A042 && list3.size() > 0) {
                        AnonymousClass118 r13 = this.A0L;
                        AnonymousClass1M9 r1 = this.A0D;
                        AnonymousClass11C r0 = this.A1k;
                        C18000vb r11 = this.A0N;
                        int size2 = list3.size();
                        AnonymousClass73Y r122 = new AnonymousClass73Y(r1, r0, r13, r11);
                        C128926gu A002 = AnonymousClass73C.A00((String) list3.get(0));
                        C136406tl r9 = null;
                        if (A002 != null) {
                            Iterator it = A002.A02.iterator();
                            C136406tl r6 = null;
                            C136406tl r5 = null;
                            while (it.hasNext()) {
                                C136406tl r4 = (C136406tl) it.next();
                                String str2 = r4.A01;
                                if (!TextUtils.isEmpty(r4.A02)) {
                                    if ("FN".equals(str2)) {
                                        r9 = r4;
                                    } else if ("NAME".equals(str2)) {
                                        r6 = r4;
                                    } else if ("ORG".equals(str2) && r5 == null) {
                                        r5 = r4;
                                    }
                                }
                            }
                            if (r9 != null) {
                                A022 = r9.A02;
                            } else if (r6 != null) {
                                A022 = r6.A02;
                            } else if (r5 != null) {
                                A022 = AnonymousClass73Y.A01(r5.A03);
                            } else {
                                AnonymousClass73Y r02 = new AnonymousClass73Y(r122.A00, r122.A01, r122.A02, r122.A03);
                                try {
                                    r02.A06(A002);
                                    A022 = r02.A04.A02();
                                } catch (C33281iZ unused2) {
                                }
                            }
                            if (A022 != null) {
                                str = r11.A0K(new Object[]{A022, Integer.valueOf(size2 - 1)}, 2131755076, (long) (size2 - 1));
                                this.A19.CGF(new AnonymousClass3CT(this, list4, bArr, r15, str, size, 1, z2));
                                return;
                            }
                        }
                        str = r13.A00.getString(2131888885);
                        this.A19.CGF(new AnonymousClass3CT(this, list4, bArr, r15, str, size, 1, z2));
                        return;
                    }
                }
                for (AnonymousClass1BI A012 : list4) {
                    String A0K2 = this.A0N.A0K(new Object[]{Integer.valueOf(list3.size())}, 2131755251, (long) list3.size());
                    C442022n r42 = new C442022n(this.A0x.A01(A012, true), AnonymousClass11P.A01(this.A0K));
                    r42.A00 = A0K2;
                    r42.A18(list3);
                    this.A10.A00(r42, r15);
                    if (z) {
                        r42.A0b(4);
                    }
                    A0b(r42);
                    this.A0U.BBM(r42);
                }
            }

            public void A0j(AnonymousClass205 r3, String str) {
                AnonymousClass206 A052 = ((AnonymousClass1W6) this.A1L.get()).A01.A05(r3);
                if (A052 != null) {
                    A0r(A052, str, false);
                }
            }

            public void A0k(C692236j r23, String str, List list) {
                ((C31931gM) this.A1B.get()).A01(new AnonymousClass3C0(this, A0J((C143887Fe) null, (C61712q8) null, (C692336k) null, (C20941Abv) null, (AnonymousClass206) null, (C693536w) null, (C693536w) null, r23, new AnonymousClass3AK(), (Long) null, str, list, (List) null, 0, false, false, false), 16), 69);
            }

            public void A0l(AnonymousClass218 r16) {
                AnonymousClass10I r1 = this.A19;
                AnonymousClass11P r7 = this.A0K;
                AnonymousClass190 r3 = this.A01;
                AnonymousClass181 r5 = this.A06;
                AnonymousClass122 r9 = this.A0U;
                C24681Lg r10 = this.A0X;
                AnonymousClass1D9 r12 = this.A0g;
                C219217x r8 = this.A0M;
                r1.CGD(new C49282Pw(r3, this.A02, r5, this.A0I, r7, r8, r9, r10, this.A0Y, r12, this.A0i, r16), new Void[0]);
            }

            public void A0m(AnonymousClass725 r27, File file, String str, List list, byte[] bArr) {
                byte[] bArr2;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    bArr2 = bArr;
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass1BI r14 = (AnonymousClass1BI) it.next();
                    if (r14 != null) {
                        C62572rc r13 = new C62572rc();
                        r13.A0G = file;
                        C441522i r4 = (C441522i) this.A0j.A03((Uri) null, r13, r14, (AnonymousClass206) null, (C692236j) null, (String) null, (String) null, (List) null, (List) null, 105, 0, 0, false, false);
                        AnonymousClass725 r5 = r27;
                        r4.A05 = r5.A0K;
                        r4.A04 = r5.A0D;
                        r4.A06 = r5.A0H;
                        r4.A03 = r5.A04;
                        r4.A07 = str;
                        String str2 = r5.A0I;
                        if (!TextUtils.isEmpty(str2)) {
                            r4.A02 = str2;
                        }
                        r4.A0p(bArr2);
                        ArrayList arrayList2 = new ArrayList();
                        for (C1418377d r7 : r5.A07) {
                            boolean z = r5.A0O;
                            C18070vi.A0d(r7, 1);
                            String str3 = r7.A0B;
                            String str4 = null;
                            if (!TextUtils.isEmpty(str3)) {
                                int lastIndexOf = str3.lastIndexOf("/");
                                if (lastIndexOf != -1) {
                                    if (lastIndexOf != str3.length() - 1) {
                                        str3 = str3.substring(lastIndexOf + 1);
                                    }
                                }
                                str4 = str3;
                            }
                            Boolean valueOf = Boolean.valueOf(z);
                            String str5 = r7.A09;
                            String str6 = r7.A06;
                            String str7 = str6;
                            arrayList2.add(new C136276tY(valueOf, Boolean.valueOf(r7.A02()), str4, str5, str7, r7.A0E));
                        }
                        r4.A01 = Long.valueOf(r5.A02);
                        r4.A00 = 1;
                        r4.A08 = arrayList2;
                        arrayList.add(r4);
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("UserActions/userActionSendStickerPackMessage/list size ");
                sb.append(arrayList.size());
                Log.i(sb.toString());
                if (!arrayList.isEmpty()) {
                    A0I(new C63642tS(arrayList, 0), (Long) null, bArr2, false, false);
                }
            }

            public void A0o(Collection collection, boolean z, boolean z2) {
                StringBuilder sb = new StringBuilder();
                sb.append("UserActions/userActionDeleteMessages ");
                sb.append(collection.size());
                Log.i(sb.toString());
                ArrayList A052 = A05(this, collection);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("UserActions/userActionDeleteMessages messagesToDeleteIncludingAssociatedMessages=");
                sb2.append(A052.size());
                Log.i(sb2.toString());
                Iterator it = A052.iterator();
                while (it.hasNext()) {
                    AnonymousClass206 r2 = (AnonymousClass206) it.next();
                    if (r2 != null) {
                        A74.A03((A74) this.A1H.get(), r2, 6);
                        r2.A18 = true;
                        if ((r2 instanceof AnonymousClass21V) && r2.A0v.A02) {
                            this.A0k.A07(r2, false);
                        }
                        this.A1p.A0C(r2.A0v);
                    }
                }
                ((C31931gM) this.A1B.get()).A01(new C70753Cj(this, A052, 2, z2, z), 20);
                this.A19.CGF(new AnonymousClass3C0(this, A052, 11));
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [X.2jx, java.lang.Object] */
            public void A0p(List list, String str) {
                ? obj = new Object();
                obj.A04 = true;
                A0J((C143887Fe) null, obj.A00(), (C692336k) null, (C20941Abv) null, (AnonymousClass206) null, (C693536w) null, (C693536w) null, (C692236j) null, (AnonymousClass3M1) null, 1L, str, list, (List) null, 0, false, false, false);
            }

            public void A0q(Set set, boolean z) {
                this.A19.CGN(new AnonymousClass7RF(this, set, 6, z));
            }

            /* JADX WARNING: type inference failed for: r7v1, types: [X.212, X.227, X.206] */
            public boolean A0r(AnonymousClass206 r14, String str, boolean z) {
                AnonymousClass205 r3 = r14.A0v;
                AnonymousClass1BI r6 = r3.A00;
                C22941Dw r0 = UserJid.Companion;
                boolean z2 = false;
                if (((C37551pj) this.A1y.get()).A0P(C22941Dw.A01(r6)) && !TextUtils.isEmpty(str)) {
                    return false;
                }
                C17960vV.A07(r6);
                if (r14.A0w()) {
                    C17960vV.A07(r6);
                    if (!AnonymousClass4aS.A08(this.A0R, (C29681ch) r6, (AnonymousClass1c4) this.A26.get())) {
                        return false;
                    }
                }
                A51 a51 = new A51(r14.A0I(), r3);
                A51 A012 = AnonymousClass9AT.A01(r14);
                long j = r14.A0x;
                AnonymousClass11P r7 = this.A0K;
                long A013 = AnonymousClass11P.A01(r7);
                AnonymousClass205 A014 = this.A0x.A01(r6, true);
                long A015 = AnonymousClass11P.A01(r7);
                ? r72 = new AnonymousClass212(A014, 56, A013);
                r72.A05 = a51;
                r72.A04 = A012;
                r72.A02 = j;
                r72.A1E(str);
                r72.A00 = A015;
                this.A0b.A01(r72);
                if (TextUtils.isEmpty(str)) {
                    C32731hf r02 = this.A1x;
                    r02.A00.CC7(C32731hf.A00(((C62242r5) r02.A01.get()).A01(r14), C64002u3.A05(r72), 2));
                    Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
                    AnonymousClass1EC A002 = C42941yz.A00(r6);
                    if (A002 != null && this.A0R.A06(A002) == 3) {
                        this.A19.CGF(new AnonymousClass3C0(this, A002, 5));
                    }
                } else if (!z) {
                    z2 = true;
                } else {
                    C32731hf r03 = this.A1x;
                    r03.A00.CC7(C32731hf.A00(((C62242r5) r03.A01.get()).A01(r14), C64002u3.A05(r72), 3));
                }
                if ((r14 instanceof C440922c) && z2) {
                    AnonymousClass10I r32 = this.A19;
                    Object obj = this.A29.get();
                    obj.getClass();
                    r32.CGF(new C70603Bt(obj, 42));
                }
                this.A19.CGF(new AnonymousClass3C0(this, r14, 20));
                return true;
            }

            public static ArrayList A05(C33251iW r11, Collection collection) {
                List list;
                C692136i A002;
                ArrayList arrayList = new ArrayList(collection.size());
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AnonymousClass206 r4 = (AnonymousClass206) it.next();
                    if (r4 != null) {
                        if (AnonymousClass2UW.A00(r4) != null) {
                            AnonymousClass00H r3 = r11.A1F;
                            r3.get();
                            if ((r4 instanceof AnonymousClass210) && C87494Vu.A00(r4) && AnonymousClass2UX.A00(r4) != null && AnonymousClass2UW.A00(r4) != null && ((A002 = AnonymousClass2UX.A00(r4)) == null || A002.A00 == null)) {
                                Iterator it2 = ((C58702l7) r11.A1z.get()).A00(AnonymousClass2UW.A00(r4).A02).iterator();
                                while (it2.hasNext()) {
                                    AnonymousClass206 r1 = (AnonymousClass206) it2.next();
                                    if (((AnonymousClass1PW) r3.get()).A0C(r1)) {
                                        arrayList.add(r1);
                                    }
                                }
                            }
                        }
                        AnonymousClass1RV r7 = (AnonymousClass1RV) r11.A0u;
                        if (!C18020vd.A05(C18040vf.A02, (C18020vd) r7.A00.get(), 8783)) {
                            list = C18460wS.A00;
                        } else {
                            ArrayList A012 = ((C58262kP) r7.A05.get()).A01(r4.A0x);
                            ArrayList<AnonymousClass1D6> arrayList2 = new ArrayList<>();
                            Iterator it3 = A012.iterator();
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                if (((AbstractCollection) r7.A07.getValue()).contains(((AnonymousClass1D6) next).second)) {
                                    arrayList2.add(next);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (AnonymousClass1D6 r12 : arrayList2) {
                                AnonymousClass206 A032 = ((AnonymousClass1W6) r7.A02.get()).A01.A03(((Number) r12.first).longValue());
                                if (A032 != null) {
                                    arrayList3.add(A032);
                                }
                            }
                            list = arrayList3;
                        }
                        arrayList.addAll(list);
                        arrayList.add(r4);
                    }
                }
                return arrayList;
            }

            public static void A0B(C33251iW r6, AnonymousClass206 r7, AnonymousClass206 r8) {
                AnonymousClass205 r1;
                if (C60492o7.A00(r7) != null) {
                    r1 = C60492o7.A00(r7).A02;
                } else {
                    r1 = r7.A0v;
                }
                AnonymousClass11P r0 = r6.A0K;
                C60492o7.A01(r8, new C691536c(r1, AnonymousClass11P.A01(r0), AnonymousClass11P.A01(r0)));
                r8.A0b(131072);
                r8.A11 = r7.A11;
                C32691hb r5 = r6.A1m;
                try {
                    if (r8 instanceof C445823z) {
                        if (!C18020vd.A05(C18040vf.A01, r5.A0Q, 7357)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid edited message ");
                            sb.append(r8);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    AnonymousClass206 A002 = C32691hb.A00(r5, r8, true, false);
                    if (A002 != null) {
                        r8.A0x = A002.A0x;
                        ((C203911y) r5.A0h.get()).A01(A002);
                        return;
                    }
                    Log.e("EditedMessageManager/handleOutgoingEditedMessage message failed to store");
                } catch (IllegalArgumentException e) {
                    Log.e("EditedMessageManager/handleOutgoingEditedMessage", e);
                    r5.A01.A0G("EditedMessageManager/handleOutgoingEditedMessage/invalidMessage", (String) null, false);
                } catch (AnonymousClass1R1 e2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("EditedMessageManager/handleOutgoingEditedMessage; messageType=");
                    int i = r8.A0u;
                    sb2.append(i);
                    Log.e(sb2.toString(), e2);
                    r5.A01.A0G("EditedMessageManager/handleOutgoingEditedMessage/cloningNotSupported", Integer.toString(i), false);
                } catch (C32711hd e3) {
                    Log.e("EditedMessageManager/handleIncomingEditedMessage", e3);
                    r5.A0S.A0F(r8, Integer.valueOf(e3.e2eFailureReason), 17);
                }
            }

            public void A0R(AnonymousClass1BI r4, AnonymousClass206 r5, C1418377d r6, Integer num, boolean z, boolean z2) {
                C441322g A012 = A01(r4, r5, r6, num, z, z2);
                if (A012 != null) {
                    A0n(new C63642tS(Collections.singletonList(A012)), (byte[]) null, false, false);
                }
            }

            public void A0W(AnonymousClass1BI r19, String str) {
                A0J((C143887Fe) null, (C61712q8) null, (C692336k) null, (C20941Abv) null, (AnonymousClass206) null, (C693536w) null, (C693536w) null, (C692236j) null, (AnonymousClass3M1) null, (Long) null, str, Collections.singletonList(r19), (List) null, 0, false, false, false);
            }

            public void A0a(AnonymousClass85B r12, AnonymousClass21V r13) {
                A04(this, r12, (AnonymousClass21V) null, new C63642tS(Collections.singletonList(r13)), (Integer) null, (Long) null, (Map) null, (byte[]) null, false, false, false);
            }

            public static void A08(C33251iW r4, long j) {
                if (j < 946684800000L || j > 2208988800000L) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("UserActions/reportIfBadTime: time=");
                    C18000vb r2 = r4.A0N;
                    sb.append(A87.A03(r2, AnonymousClass11X.A00.A0B(r2, j), A8I.A00(r2, j)));
                    Log.e(sb.toString());
                    if (r4.A1w.A00()) {
                        r4.A01.A0G("UserActions/badTime", (String) null, false);
                    }
                }
            }

            public C33251iW(AnonymousClass195 r4, AnonymousClass190 r5, AnonymousClass1RB r6, AnonymousClass1KB r7, C32521hK r8, AnonymousClass11S r9, C25311Ns r10, AnonymousClass18O r11, AnonymousClass181 r12, AnonymousClass1V3 r13, C32531hL r14, C23651Hc r15, C32931hz r16, C28721an r17, C26911Ty r18, C32541hM r19, AnonymousClass1MC r20, C26811To r21, AnonymousClass1M9 r22, C25111Mx r23, AnonymousClass1PM r24, C24921Me r25, C32791hl r26, C25161Nd r27, AnonymousClass1RW r28, AnonymousClass1NM r29, AnonymousClass11C r30, AnonymousClass11P r31, AnonymousClass118 r32, C219217x r33, C19830z4 r34, C18000vb r35, C30781eV r36, C30801eX r37, C22621Co r38, AnonymousClass1CJ r39, C25181Nf r40, AnonymousClass1NN r41, AnonymousClass122 r42, C32481hG r43, C32691hb r44, C26141Qz r45, AnonymousClass1MZ r46, AnonymousClass1R3 r47, AnonymousClass1Q6 r48, C24681Lg r49, C26111Qw r50, AnonymousClass1WN r51, AnonymousClass1RL r52, C33231iU r53, C32211gp r54, C32491hH r55, C18030ve r56, AnonymousClass18K r57, C25931Qe r58, AnonymousClass126 r59, AnonymousClass12M r60, AnonymousClass1D9 r61, AnonymousClass1LU r62, C32011gU r63, C27131Uv r64, C26421Sb r65, C32861hs r66, AnonymousClass1SY r67, C32571hP r68, C32431hB r69, C26431Sc r70, AnonymousClass1SW r71, C26061Qr r72, C32781hk r73, C25011Mn r74, C26221Rh r75, C33241iV r76, C32291gx r77, AnonymousClass1RU r78, AnonymousClass1QJ r79, AnonymousClass1QS r80, AnonymousClass1PP r81, C32721he r82, C32801hm r83, AnonymousClass1R0 r84, C32451hD r85, C32551hN r86, C32731hf r87, C24421Kg r88, AnonymousClass1Nb r89, C28531aO r90, C32741hg r91, AnonymousClass1SB r92, C26521Sl r93, AnonymousClass10I r94, JniBridge jniBridge, AnonymousClass00H r96, AnonymousClass00H r97, AnonymousClass00H r98, AnonymousClass00H r99, AnonymousClass00H r100, AnonymousClass00H r101, AnonymousClass00H r102, AnonymousClass00H r103, AnonymousClass00H r104, AnonymousClass00H r105, AnonymousClass00H r106, AnonymousClass00H r107, AnonymousClass00H r108, AnonymousClass00H r109, AnonymousClass00H r110, AnonymousClass00H r111, AnonymousClass00H r112, AnonymousClass00H r113, AnonymousClass00H r114, AnonymousClass00H r115, AnonymousClass00H r116, AnonymousClass00H r117, AnonymousClass00H r118, AnonymousClass00H r119, AnonymousClass00H r120, AnonymousClass00H r121, AnonymousClass00H r122, AnonymousClass00H r123, AnonymousClass00H r124, AnonymousClass00H r125, AnonymousClass00H r126, AnonymousClass00H r127, AnonymousClass00H r128, AnonymousClass00H r129, AnonymousClass00H r130, AnonymousClass00H r131, AnonymousClass00H r132, AnonymousClass00H r133, AnonymousClass00H r134, AnonymousClass00H r135, AnonymousClass00H r136, AnonymousClass00H r137, AnonymousClass00H r138, AnonymousClass00H r139) {
                this.A0L = r32;
                this.A0K = r31;
                this.A0c = r56;
                this.A25 = r96;
                this.A03 = r7;
                this.A01 = r5;
                this.A04 = r9;
                this.A0h = r62;
                this.A19 = r94;
                this.A0R = r39;
                this.A1A = jniBridge;
                this.A1t = r63;
                this.A06 = r12;
                this.A0d = r57;
                this.A0Q = r38;
                this.A0r = r74;
                this.A1f = r11;
                this.A0C = r21;
                this.A0j = r65;
                this.A1c = r97;
                this.A0g = r61;
                this.A1G = r100;
                this.A1H = r105;
                this.A1P = r98;
                this.A13 = r88;
                this.A09 = r17;
                this.A1N = r108;
                this.A1F = r101;
                this.A0D = r22;
                this.A18 = r93;
                this.A1a = r99;
                this.A1k = r30;
                this.A1u = r70;
                this.A0G = r25;
                this.A0N = r35;
                this.A1Y = r102;
                this.A0w = r80;
                this.A1y = r103;
                this.A0B = r20;
                this.A0U = r42;
                this.A0V = r43;
                this.A1L = r104;
                this.A0f = r60;
                this.A1r = r55;
                this.A0W = r47;
                this.A0X = r49;
                this.A26 = r106;
                this.A27 = r107;
                this.A1s = r59;
                this.A07 = r15;
                this.A14 = r89;
                this.A1e = r8;
                this.A0J = r29;
                this.A17 = r92;
                this.A1h = r14;
                this.A1B = r109;
                this.A1D = r110;
                this.A1E = r111;
                this.A0x = r81;
                this.A0o = r71;
                this.A2B = r113;
                this.A1R = r135;
                this.A0F = r24;
                this.A0A = r19;
                this.A1K = r112;
                this.A12 = r86;
                this.A0m = r68;
                this.A1p = r48;
                this.A0t = r77;
                this.A0E = r23;
                this.A1q = r54;
                this.A1Z = r114;
                this.A0M = r33;
                this.A1l = r34;
                this.A1v = r75;
                this.A1I = r115;
                this.A0H = r27;
                this.A1m = r44;
                this.A0y = r82;
                this.A02 = r6;
                this.A0n = r69;
                this.A29 = r116;
                this.A15 = r90;
                this.A1Q = r117;
                this.A1X = r122;
                this.A1x = r87;
                this.A0Y = r50;
                this.A16 = r91;
                this.A0l = r67;
                this.A0Z = r51;
                this.A0T = r41;
                this.A1n = r45;
                this.A10 = r84;
                this.A0q = r73;
                this.A1J = r118;
                this.A1O = r119;
                this.A0v = r79;
                this.A1C = r120;
                this.A11 = r85;
                this.A0i = r64;
                this.A1i = r18;
                this.A0a = r52;
                this.A1W = r134;
                this.A1z = r124;
                this.A00 = r4;
                this.A1j = r26;
                this.A22 = r121;
                this.A0e = r58;
                this.A0p = r72;
                this.A0z = r83;
                this.A0k = r66;
                this.A08 = r16;
                this.A23 = r123;
                this.A1o = r46;
                this.A1S = r126;
                this.A1U = r125;
                this.A0S = r40;
                this.A1V = r127;
                this.A1b = r128;
                this.A0P = r37;
                this.A0b = r53;
                this.A05 = r10;
                this.A2A = r129;
                this.A28 = r130;
                this.A0O = r36;
                this.A21 = r131;
                this.A0u = r78;
                this.A0I = r28;
                this.A1g = r13;
                this.A0s = r76;
                this.A1d = r132;
                this.A1M = r133;
                this.A20 = r136;
                this.A1T = r137;
                this.A24 = r138;
                this.A2C = r139;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0065, code lost:
                if (((java.lang.Boolean) r8.A0A(r1.A01, (long) r1.A0D).first).booleanValue() != false) goto L_0x0067;
             */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x00a5  */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x0123  */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x0157  */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x0174  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static X.C52642bF A04(X.C33251iW r21, X.AnonymousClass85B r22, X.AnonymousClass21V r23, X.C63642tS r24, java.lang.Integer r25, java.lang.Long r26, java.util.Map r27, byte[] r28, boolean r29, boolean r30, boolean r31) {
                /*
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r0 = "UserActions/userActionSendMediaMessages/size = "
                    r1.append(r0)
                    r5 = r24
                    java.util.concurrent.CopyOnWriteArrayList r7 = r5.A03
                    int r0 = r7.size()
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    com.whatsapp.util.Log.i((java.lang.String) r0)
                    boolean r4 = r5.A01
                    if (r26 == 0) goto L_0x0038
                    long r1 = r26.longValue()
                    java.util.Iterator r3 = r7.iterator()
                L_0x0028:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L_0x0038
                    java.lang.Object r0 = r3.next()
                    X.206 r0 = (X.AnonymousClass206) r0
                    r0.A0b(r1)
                    goto L_0x0028
                L_0x0038:
                    r6 = r21
                    X.1Sc r8 = r6.A1u
                    X.21V r0 = r5.A01()
                    boolean r0 = r8.A0H(r0)
                    if (r0 != 0) goto L_0x0067
                    X.21V r1 = r5.A01()
                    X.1So r0 = X.C63972u0.A02(r1)
                    boolean r0 = X.C63972u0.A09(r0)
                    if (r0 == 0) goto L_0x008d
                    long r2 = r1.A01
                    int r0 = r1.A0D
                    long r0 = (long) r0
                    android.util.Pair r0 = r8.A0A(r2, r0)
                    java.lang.Object r0 = r0.first
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto L_0x008d
                L_0x0067:
                    X.21V r0 = r5.A01()
                    X.1So r1 = X.C63972u0.A02(r0)
                    X.2rc r0 = r0.A02
                    X.C17960vV.A07(r0)
                    java.io.File r0 = r0.A0G
                    boolean r0 = X.C26431Sc.A08(r1, r0)
                    if (r0 != 0) goto L_0x008d
                    X.1KB r2 = r6.A03
                    r1 = 40
                    X.3Bt r0 = new X.3Bt
                    r0.<init>(r6, r1)
                    r2.CGP(r0)
                    X.2bF r5 = A03()
                    return r5
                L_0x008d:
                    java.util.ArrayList r9 = new java.util.ArrayList
                    r9.<init>()
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r8.<init>()
                    java.util.List r0 = X.C29431cG.A0t(r7)
                    java.util.Iterator r16 = r0.iterator()
                L_0x009f:
                    boolean r0 = r16.hasNext()
                    if (r0 == 0) goto L_0x0113
                    java.lang.Object r10 = r16.next()
                    X.21V r10 = (X.AnonymousClass21V) r10
                    r6.A0b(r10)
                    X.0ve r2 = r6.A0c
                    int r0 = r10.A0D
                    long r0 = (long) r0
                    r14 = 1000(0x3e8, double:4.94E-321)
                    long r0 = r0 * r14
                    int r13 = X.AnonymousClass6XV.A00(r2, r0)
                    X.205 r0 = r10.A0v
                    X.1BI r12 = r0.A00
                    boolean r0 = X.C22971Dz.A0a(r12)
                    if (r0 == 0) goto L_0x010f
                    int r1 = r10.A0u
                    r0 = 3
                    if (r1 != r0) goto L_0x010f
                    int r0 = r10.A0D
                    if (r0 <= r13) goto L_0x010f
                    r10.A0D = r13
                    X.2rc r11 = r10.A02
                    X.C17960vV.A07(r11)
                    long r2 = r11.A0D
                    long r0 = (long) r13
                    long r0 = r0 * r14
                    long r2 = r2 + r0
                    r11.A0E = r2
                    r8.add(r10)
                L_0x00de:
                    boolean r0 = X.C22971Dz.A0a(r12)
                    if (r0 == 0) goto L_0x0109
                    X.00H r0 = r6.A1Z
                    java.lang.Object r0 = r0.get()
                    X.2iK r0 = (X.C56972iK) r0
                    boolean r0 = r0.A00()
                    if (r0 == 0) goto L_0x0109
                    X.1hg r2 = r6.A16
                    int r0 = r10.A0B
                    long r0 = (long) r0
                    X.00H r2 = r2.A0N
                    java.lang.Object r3 = r2.get()
                    X.2tc r3 = (X.C63742tc) r3
                    java.lang.Long r2 = java.lang.Long.valueOf(r0)
                    r1 = 0
                    r0 = 13
                    r3.A04(r10, r2, r1, r0)
                L_0x0109:
                    X.1hk r0 = r6.A0q
                    r0.A01(r10)
                    goto L_0x009f
                L_0x010f:
                    r9.add(r10)
                    goto L_0x00de
                L_0x0113:
                    X.21V r0 = r5.A01()
                    X.2rc r0 = r0.A02
                    X.C17960vV.A07(r0)
                    X.C18070vi.A0X(r0)
                    java.io.File r10 = r0.A0G
                    if (r10 == 0) goto L_0x0139
                    int r3 = r7.size()
                    boolean r0 = X.C22781De.A03()
                    if (r0 == 0) goto L_0x01f5
                    X.10I r2 = r6.A19
                    r1 = 12
                    X.Akb r0 = new X.Akb
                    r0.<init>((java.lang.Object) r6, (int) r3, (int) r1, (java.lang.Object) r10)
                    r2.CGF(r0)
                L_0x0139:
                    X.2bF r24 = A03()
                    X.2bF r12 = A03()
                    boolean r0 = r9.isEmpty()
                    r10 = r22
                    r3 = r23
                    r14 = r25
                    r15 = r27
                    r2 = r28
                    r17 = r29
                    r18 = r30
                    r19 = r31
                    if (r0 != 0) goto L_0x016e
                    int r0 = r5.A00
                    X.2tS r7 = new X.2tS
                    r7.<init>(r0, r9, r4)
                    java.util.concurrent.CopyOnWriteArrayList r1 = r7.A03
                    java.util.List r0 = X.C29431cG.A0t(r1)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L_0x01d7
                    X.2bF r24 = A03()
                L_0x016e:
                    boolean r0 = r8.isEmpty()
                    if (r0 != 0) goto L_0x018b
                    int r0 = r5.A00
                    X.2tS r5 = new X.2tS
                    r5.<init>(r0, r8, r4)
                    java.util.concurrent.CopyOnWriteArrayList r1 = r5.A03
                    java.util.List r0 = X.C29431cG.A0t(r1)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L_0x01bb
                    X.2bF r12 = A03()
                L_0x018b:
                    r0 = 2
                    X.2bF[] r4 = new X.C52642bF[r0]
                    r0 = 0
                    r4[r0] = r24
                    r0 = 1
                    r4[r0] = r12
                    X.2bF r5 = new X.2bF
                    r5.<init>()
                    r2 = 2
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>(r2)
                    r1 = 0
                L_0x01a0:
                    r0 = r4[r1]
                    X.Af0 r0 = r0.A00
                    r3.add(r0)
                    int r1 = r1 + 1
                    if (r1 < r2) goto L_0x01a0
                    X.8fc r2 = new X.8fc
                    r2.<init>(r3)
                    r1 = 27
                    X.7Nc r0 = new X.7Nc
                    r0.<init>(r5, r1)
                    r2.A09(r0)
                    return r5
                L_0x01bb:
                    X.2bF r12 = new X.2bF
                    r12.<init>()
                    java.util.List r1 = X.C29431cG.A0t(r1)
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>(r1)
                    X.3Ca r8 = new X.3Ca
                    r11 = r3
                    r13 = r5
                    r16 = r2
                    r9 = r6
                    r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                    A0C(r6, r3, r8, r0, r2)
                    goto L_0x018b
                L_0x01d7:
                    X.2bF r24 = new X.2bF
                    r24.<init>()
                    java.util.List r0 = X.C29431cG.A0t(r1)
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>(r0)
                    X.3Ca r0 = new X.3Ca
                    r20 = r0
                    r25 = r7
                    r26 = r14
                    r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                    A0C(r6, r3, r0, r1, r2)
                    goto L_0x016e
                L_0x01f5:
                    X.1Ns r2 = r6.A05     // Catch:{ IOException -> 0x0205 }
                    r1 = 0
                    X.17r r0 = r2.A00     // Catch:{ IOException -> 0x0205 }
                    boolean r0 = r0.A0m(r10)     // Catch:{ IOException -> 0x0205 }
                    if (r0 == 0) goto L_0x0139
                    X.C25311Ns.A01(r2, r10, r3, r1)     // Catch:{ IOException -> 0x0205 }
                    goto L_0x0139
                L_0x0205:
                    r1 = move-exception
                    java.lang.String r0 = "UserActions/userActionSendMediaMessages/addManagedFileReferencesIfExternalShared"
                    com.whatsapp.util.Log.e(r0, r1)
                    goto L_0x0139
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C33251iW.A04(X.1iW, X.85B, X.21V, X.2tS, java.lang.Integer, java.lang.Long, java.util.Map, byte[], boolean, boolean, boolean):X.2bF");
            }

            /* JADX WARNING: type inference failed for: r3v49, types: [java.lang.Object, com.whatsapp.TextData] */
            /* JADX WARNING: Code restructure failed: missing block: B:111:0x024c, code lost:
                if (r18 != false) goto L_0x024e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:112:0x024e, code lost:
                if (r7 == false) goto L_0x025b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:113:0x0250, code lost:
                r20 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:114:0x0259, code lost:
                if (((X.AnonymousClass21X) r0).A1I() != false) goto L_0x025d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:115:0x025b, code lost:
                r20 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:116:0x025d, code lost:
                r18 = r0.A0w();
                r17 = r32.iterator();
                r16 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:118:0x026b, code lost:
                if (r17.hasNext() == false) goto L_0x0614;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:119:0x026d, code lost:
                r5 = (X.AnonymousClass1BI) r17.next();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
                r39 = r1.A0x.A01(r5, true);
                r41 = X.AnonymousClass11P.A01(r1.A0K);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:122:0x0280, code lost:
                if (r21 != false) goto L_0x0290;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:123:0x0282, code lost:
                if (r20 != false) goto L_0x0290;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:124:0x0284, code lost:
                if (r18 == false) goto L_0x028d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:126:0x028a, code lost:
                if (A0E(r1, r5, r0) != false) goto L_0x028d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:128:0x028d, code lost:
                r43 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:129:0x0290, code lost:
                r43 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:130:0x0292, code lost:
                r7 = ((X.C32911hx) r34.get()).A00(new X.C59652mf(r39, r40, r41, r43, r44), r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:131:0x02a8, code lost:
                if (X.C22971Dz.A0a(r5) == false) goto L_0x02c2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:132:0x02aa, code lost:
                r10 = r7.A0u;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:133:0x02ac, code lost:
                if (r52 == null) goto L_0x02c2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:135:0x02b2, code lost:
                if (android.text.TextUtils.isEmpty(r52) != false) goto L_0x02c2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:137:0x02b7, code lost:
                if (r46 != 1) goto L_0x02c2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:138:0x02b9, code lost:
                if (r10 == 0) goto L_0x02c2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:139:0x02bb, code lost:
                r7.A0j(r52.trim());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c6, code lost:
                if (X.C22971Dz.A0a(r5) == false) goto L_0x033f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:143:0x02ca, code lost:
                if ((r7 instanceof X.AnonymousClass210) == false) goto L_0x033f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:144:0x02cc, code lost:
                r3 = new java.lang.Object();
                r3.backgroundColor = X.AnonymousClass74F.A00();
                r3.textColor = -1;
                r3.fontStyle = 0;
                ((X.AnonymousClass210) r7).A18(r3);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:145:0x02e6, code lost:
                if (X.C20097A7a.A05(r7) == false) goto L_0x0351;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:146:0x02e8, code lost:
                r10 = new java.lang.StringBuilder();
                r2 = r7.A0P();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:147:0x02f5, code lost:
                if (android.text.TextUtils.isEmpty(r2) != false) goto L_0x02fa;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:148:0x02f7, code lost:
                r10.append(r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:149:0x02fa, code lost:
                r2 = X.C20097A7a.A02(r7);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
                if (X.C18020vd.A05(X.C18040vf.A02, ((X.AnonymousClass1c4) r1.A26.get()).A02, 12805) == false) goto L_0x0051;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:150:0x0304, code lost:
                if (android.text.TextUtils.isEmpty(r2) != false) goto L_0x0312;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:152:0x030a, code lost:
                if (android.text.TextUtils.isEmpty(r10) != false) goto L_0x030f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:153:0x030c, code lost:
                r10.append("\n\n");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:154:0x030f, code lost:
                r10.append(r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:155:0x0312, code lost:
                r2 = r7.A0L().A00;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:156:0x0318, code lost:
                if (r2 == null) goto L_0x032e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:157:0x031a, code lost:
                r2 = r2.A01;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:158:0x0320, code lost:
                if (android.text.TextUtils.isEmpty(r2) != false) goto L_0x032e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:160:0x0326, code lost:
                if (android.text.TextUtils.isEmpty(r10) != false) goto L_0x032b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:161:0x0328, code lost:
                r10.append("\n\n");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:162:0x032b, code lost:
                r10.append(r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:163:0x032e, code lost:
                r3 = r10.toString();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:164:0x0336, code lost:
                if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x033f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:165:0x0338, code lost:
                r7.A0i(X.AnonymousClass74F.A07(r3));
             */
            /* JADX WARNING: Code restructure failed: missing block: B:167:0x0343, code lost:
                if (X.C22971Dz.A0a(r5) == false) goto L_0x038e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:169:0x0347, code lost:
                if ((r7 instanceof X.C441822l) == false) goto L_0x038e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:170:0x0349, code lost:
                r3 = (X.C441722k) r7;
                r10 = r3.A00;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:172:0x0359, code lost:
                if (android.text.TextUtils.isEmpty(r0.A0P()) != false) goto L_0x033f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:173:0x035b, code lost:
                r7.A0i(X.AnonymousClass74F.A07(r7.A0P()));
             */
            /* JADX WARNING: Code restructure failed: missing block: B:174:0x0367, code lost:
                if (r10.A02 == null) goto L_0x036a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:176:0x036a, code lost:
                r10 = null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:177:0x036c, code lost:
                r10 = ((X.AnonymousClass7LG) r10.A02).A08;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:178:0x0372, code lost:
                r29 = X.AnonymousClass74F.A00();
                r26 = X.C24127Bvt.A00;
                r24 = X.C24100BvS.A00;
                r3.A1H(new X.AnonymousClass7LG(r24, r24, r26, (java.lang.String) null, r10, r29, 0, false));
             */
            /* JADX WARNING: Code restructure failed: missing block: B:180:0x0392, code lost:
                if (r0.A0w() == false) goto L_0x03b1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:181:0x0394, code lost:
                r2 = X.AnonymousClass9RY.A00(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:182:0x0398, code lost:
                if (r2 == null) goto L_0x039f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:183:0x039a, code lost:
                r3 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:184:0x039d, code lost:
                if (r2.A01 != r5) goto L_0x03a0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:185:0x039f, code lost:
                r3 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:187:0x03a4, code lost:
                if (A0F(r0) == false) goto L_0x046a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:188:0x03a6, code lost:
                if (r3 != false) goto L_0x03b7;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:190:0x03aa, code lost:
                if (r8.A00 != r5) goto L_0x03b7;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:192:0x03ae, code lost:
                if ((r0 instanceof X.AnonymousClass22G) == false) goto L_0x046a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:195:0x03b5, code lost:
                if (A0F(r0) == false) goto L_0x046a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:196:0x03b7, code lost:
                r7.A0b(1);
                r7.A06 = r13;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:197:0x03c2, code lost:
                if (X.AnonymousClass9RY.A00(r0) == null) goto L_0x03df;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:198:0x03c4, code lost:
                r2 = X.AnonymousClass9RY.A00(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:199:0x03c8, code lost:
                r7.A0M(X.C20947Ac1.class).A02(r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:200:0x03d5, code lost:
                if (r0.A0w() != false) goto L_0x0414;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:201:0x03d7, code lost:
                r3 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:202:0x03dc, code lost:
                if (X.AnonymousClass9RY.A00(r0) == null) goto L_0x0415;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:205:0x03e3, code lost:
                if (r0.A0w() == false) goto L_0x0412;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:206:0x03e5, code lost:
                r11 = r8.A00;
                r10 = (X.C46162Dk) r1.A0R.A0A(r11);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:207:0x03ef, code lost:
                if (r10 == null) goto L_0x0412;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:208:0x03f1, code lost:
                r11 = (X.C29681ch) r11;
                r3 = r10.A0T;
                X.C18070vi.A0d(r11, 1);
                X.C18070vi.A0d(r3, 3);
                r23 = new X.C20947Ac1(r11, (X.AnonymousClass9Id) null, r3, (java.lang.String) null, (int) r0.A0y);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:209:0x0412, code lost:
                r2 = null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:210:0x0414, code lost:
                r3 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:211:0x0415, code lost:
                r2 = X.AnonymousClass9RY.A00(r7);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:212:0x0419, code lost:
                if (r2 == null) goto L_0x041e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:213:0x041b, code lost:
                r2 = r2.A02;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:214:0x041e, code lost:
                r2 = null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:215:0x041f, code lost:
                if (r3 == false) goto L_0x044d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:216:0x0421, code lost:
                r12 = (X.AnonymousClass74D) r1.A27.get();
                r11 = X.AnonymousClass1PT.A02(r7.A0v.A00);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:217:0x0431, code lost:
                if (r2 == null) goto L_0x043d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:218:0x0433, code lost:
                r10 = r2.ordinal();
                r3 = 1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:219:0x0438, code lost:
                if (r10 == 1) goto L_0x043e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:221:0x043b, code lost:
                if (r10 == 2) goto L_0x043e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:222:0x043d, code lost:
                r3 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:223:0x043e, code lost:
                r12.A0K(r7, r11, r3, ((X.C62242r5) r1.A1Q.get()).A01(r0));
             */
            /* JADX WARNING: Code restructure failed: missing block: B:225:0x0455, code lost:
                if (X.C18020vd.A05(X.C18040vf.A02, r6, 4513) == false) goto L_0x046a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:227:0x045b, code lost:
                if (X.AnonymousClass2UY.A00(r0) == null) goto L_0x046a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:228:0x045d, code lost:
                r7.A0M(X.C691936g.class).A02(X.AnonymousClass2UY.A00(r0));
             */
            /* JADX WARNING: Code restructure failed: missing block: B:230:0x046c, code lost:
                if ((r7 instanceof X.C441322g) == false) goto L_0x0478;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:231:0x046e, code lost:
                ((X.C441322g) r7).A06 = 2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:232:0x0478, code lost:
                A0b(r7);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:233:0x047f, code lost:
                if (X.C22971Dz.A0a(r5) == false) goto L_0x048c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:234:0x0481, code lost:
                X.C63672tV.A03(r7, r47);
                r2 = r1.A16;
                r2.A04 = false;
                r2.A05 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:236:0x049a, code lost:
                if (((X.AnonymousClass1PW) r1.A1F.get()).A03(r0.A0h) == null) goto L_0x04a0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:237:0x049c, code lost:
                r7.A1D = null;
                r7.A0o = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:238:0x04a0, code lost:
                if (r16 != false) goto L_0x04aa;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
                if (X.C18020vd.A05(X.C18040vf.A02, ((X.AnonymousClass1c4) r1.A26.get()).A02, 12805) == false) goto L_0x0078;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:240:0x04a6, code lost:
                if (A0E(r1, r5, r0) == false) goto L_0x04aa;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:241:0x04a8, code lost:
                r16 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:242:0x04aa, code lost:
                r15.add(r7);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:263:0x050f, code lost:
                if (r2 == false) goto L_0x0511;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:308:0x05aa, code lost:
                if (r16 < r2) goto L_0x05ac;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:309:0x05ac, code lost:
                r21 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:310:0x05ae, code lost:
                if (r4 == false) goto L_0x024e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:318:0x05d1, code lost:
                if (r2.A02() != false) goto L_0x05ac;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:321:0x05da, code lost:
                if (r3.A02() != false) goto L_0x05ac;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:327:0x05ed, code lost:
                if (r2.A06 != null) goto L_0x021c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:330:0x05f5, code lost:
                if (r3.A06 != null) goto L_0x021c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:332:0x05fd, code lost:
                r2 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:333:0x05fe, code lost:
                com.whatsapp.util.Log.e("UserActions/userActionForwardMessage ", r2);
                r1.A01.A0G("UserActions/userActionForwardMessage", r2.getMessage(), true);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:334:0x0613, code lost:
                return A03();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:336:0x0618, code lost:
                if (X.AnonymousClass25A.A0H(r33) == false) goto L_0x06b9;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:337:0x061a, code lost:
                if (r21 != false) goto L_0x06b9;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:338:0x061c, code lost:
                X.C17960vV.A0D(r14);
                r11 = X.C42701yb.A01(r8.A00);
                r10 = r0.A0x();
                r8 = r32.iterator();
                r7 = false;
                r6 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:340:0x0633, code lost:
                if (r8.hasNext() == false) goto L_0x065c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:341:0x0635, code lost:
                r5 = (X.AnonymousClass1BI) r8.next();
                r4 = r1.A0F;
                r2 = com.whatsapp.jid.UserJid.Companion;
                r3 = X.C22941Dw.A01(r5);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:342:0x0643, code lost:
                if (r3 == null) goto L_0x0651;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:344:0x064e, code lost:
                if (new X.C63852tn(r4, (X.C25491Ok) null, r3).A03() == false) goto L_0x0651;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:345:0x0650, code lost:
                r6 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:347:0x0655, code lost:
                if (X.C42701yb.A01(r5) == false) goto L_0x0658;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:348:0x0657, code lost:
                r7 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:349:0x0658, code lost:
                if (r6 == false) goto L_0x062f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:350:0x065a, code lost:
                if (r7 == false) goto L_0x062f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:351:0x065c, code lost:
                if (r10 != false) goto L_0x0661;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:352:0x065e, code lost:
                r4 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:353:0x065f, code lost:
                if (r6 == false) goto L_0x0662;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:354:0x0661, code lost:
                r4 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:355:0x0662, code lost:
                if (r20 == false) goto L_0x0679;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:356:0x0664, code lost:
                r6 = new X.C52642bF();
                r45.CGF(new X.C21368Aix(r1, r15, r0, r6, 28));
             */
            /* JADX WARNING: Code restructure failed: missing block: B:357:0x0678, code lost:
                return r6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:358:0x0679, code lost:
                r5 = new java.util.ArrayList(r32.size());
                r3 = r15.iterator();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:360:0x068a, code lost:
                if (r3.hasNext() == false) goto L_0x0694;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:361:0x068c, code lost:
                r5.add(r3.next());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:362:0x0694, code lost:
                if (r11 != false) goto L_0x0699;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:363:0x0696, code lost:
                r2 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:364:0x0697, code lost:
                if (r7 == false) goto L_0x069a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:365:0x0699, code lost:
                r2 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:366:0x069a, code lost:
                if (r4 != false) goto L_0x069f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:367:0x069c, code lost:
                r4 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:368:0x069d, code lost:
                if (r2 == false) goto L_0x06a0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:369:0x069f, code lost:
                r4 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:371:0x06b8, code lost:
                return A04(r1, (X.AnonymousClass85B) null, (X.AnonymousClass21V) r0, new X.C63642tS(r46, r5, r4), (java.lang.Integer) null, (java.lang.Long) null, (java.util.Map) null, r19, false, false, false);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:373:0x06bb, code lost:
                if (r16 == false) goto L_0x06ce;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:374:0x06bd, code lost:
                r6 = new X.C52642bF();
                A0C(r1, r0, new X.C21368Aix(r1, r0, r15, r6, 24), r15, (byte[]) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:375:0x06cd, code lost:
                return r6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:376:0x06ce, code lost:
                r6 = new X.C52642bF();
                A0C(r1, r0, new X.C21368Aix(r1, r15, r0, r6, 26), r15, r19);
                r4 = r8.A00;
                r2 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:377:0x06e9, code lost:
                if (r32.size() > 1) goto L_0x06ec;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:378:0x06eb, code lost:
                r2 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:379:0x06ec, code lost:
                r45.CGF(new X.C21470Akb((java.lang.Object) r1, X.A8F.A01(r4, r2), 13, (java.lang.Object) r0));
             */
            /* JADX WARNING: Code restructure failed: missing block: B:380:0x06fc, code lost:
                return r6;
             */
            /* JADX WARNING: Removed duplicated region for block: B:103:0x0228  */
            /* JADX WARNING: Removed duplicated region for block: B:266:0x0514  */
            /* JADX WARNING: Removed duplicated region for block: B:279:0x054d  */
            /* JADX WARNING: Removed duplicated region for block: B:307:0x05a8  */
            /* JADX WARNING: Removed duplicated region for block: B:317:0x05cd  */
            /* JADX WARNING: Removed duplicated region for block: B:320:0x05d6  */
            /* JADX WARNING: Removed duplicated region for block: B:324:0x05e1  */
            /* JADX WARNING: Removed duplicated region for block: B:385:0x04dc A[SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:85:0x01db  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public X.C52642bF A0G(X.C34531kd r49, X.AnonymousClass206 r50, X.C692236j r51, java.lang.String r52, java.util.List r53, int r54, boolean r55) {
                /*
                    r48 = this;
                    r0 = r50
                    java.lang.String r22 = "UserActions/userActionForwardMessage"
                    r1 = r48
                    boolean r2 = r1.A0F(r0)
                    r4 = 0
                    if (r2 == 0) goto L_0x00c0
                    X.205 r2 = r0.A0v
                    boolean r5 = r2.A02
                    r3 = 1
                    int r2 = r0.A06
                    if (r5 == 0) goto L_0x00b3
                    int r13 = java.lang.Math.max(r3, r2)
                L_0x001a:
                    X.10I r2 = r1.A19
                    r45 = r2
                    r2 = 12
                    X.3C0 r3 = new X.3C0
                    r3.<init>(r1, r0, r2)
                    r2 = r45
                    r2.CGF(r3)
                    boolean r2 = r0.A0w()
                    r9 = 0
                    if (r2 == 0) goto L_0x005a
                    boolean r2 = r0 instanceof X.C438421d
                    if (r2 != 0) goto L_0x0051
                    boolean r2 = r0 instanceof X.AnonymousClass21Y
                    if (r2 != 0) goto L_0x0051
                    boolean r2 = r0 instanceof X.AnonymousClass210
                    if (r2 == 0) goto L_0x005a
                    X.00H r2 = r1.A26
                    java.lang.Object r2 = r2.get()
                    X.1c4 r2 = (X.AnonymousClass1c4) r2
                    X.0ve r5 = r2.A02
                    r3 = 12805(0x3205, float:1.7944E-41)
                    X.0vf r2 = X.C18040vf.A02
                    boolean r2 = X.C18020vd.A05(r2, r5, r3)
                    if (r2 != 0) goto L_0x005a
                L_0x0051:
                    X.36w r2 = X.C60502o8.A00(r0)
                    if (r2 == 0) goto L_0x005a
                    X.C60502o8.A01(r0, r9)
                L_0x005a:
                    X.Ac1 r2 = X.AnonymousClass9RY.A00(r0)
                    if (r2 == 0) goto L_0x008b
                    boolean r2 = r0 instanceof X.AnonymousClass210
                    if (r2 == 0) goto L_0x0078
                    X.00H r2 = r1.A26
                    java.lang.Object r2 = r2.get()
                    X.1c4 r2 = (X.AnonymousClass1c4) r2
                    X.0ve r5 = r2.A02
                    r3 = 12805(0x3205, float:1.7944E-41)
                    X.0vf r2 = X.C18040vf.A02
                    boolean r2 = X.C18020vd.A05(r2, r5, r3)
                    if (r2 != 0) goto L_0x008b
                L_0x0078:
                    X.36w r3 = X.C60502o8.A00(r0)
                    boolean r2 = r0.A0w()
                    if (r2 != 0) goto L_0x008b
                    if (r3 == 0) goto L_0x008b
                    java.lang.String r2 = r3.A06
                    if (r2 != 0) goto L_0x008b
                    X.C60502o8.A01(r0, r9)
                L_0x008b:
                    boolean r2 = r0 instanceof X.C438421d
                    r5 = 1
                    r47 = r51
                    r32 = r53
                    r46 = r54
                    r44 = r55
                    if (r2 == 0) goto L_0x0130
                    r7 = r0
                    X.21V r7 = (X.AnonymousClass21V) r7
                    X.2rc r2 = r7.A02
                    if (r2 == 0) goto L_0x014b
                    java.io.File r6 = r2.A0G
                    if (r6 == 0) goto L_0x014b
                    X.C17960vV.A07(r6)
                    r2 = 14
                    X.3C0 r3 = new X.3C0
                    r3.<init>(r1, r0, r2)
                    r2 = r45
                    r2.CGF(r3)
                    goto L_0x00c3
                L_0x00b3:
                    int r2 = r2 + 1
                    int r13 = java.lang.Math.max(r3, r2)
                    r2 = 5
                    if (r13 < r2) goto L_0x001a
                    r13 = 127(0x7f, float:1.78E-43)
                    goto L_0x001a
                L_0x00c0:
                    r13 = 0
                    goto L_0x001a
                L_0x00c3:
                    java.lang.String r3 = r6.getAbsolutePath()     // Catch:{ IOException -> 0x012e, OutOfMemoryError -> 0x012c, 1iX -> 0x0145, SecurityException -> 0x012a }
                    X.CxM r2 = new X.CxM     // Catch:{ IOException -> 0x012e, OutOfMemoryError -> 0x012c, 1iX -> 0x0145, SecurityException -> 0x012a }
                    r2.<init>((java.lang.String) r3)     // Catch:{ IOException -> 0x012e, OutOfMemoryError -> 0x012c, 1iX -> 0x0145, SecurityException -> 0x012a }
                    int r2 = r2.A0Z(r5)     // Catch:{ IOException -> 0x012e, OutOfMemoryError -> 0x012c, 1iX -> 0x0145, SecurityException -> 0x012a }
                    if (r2 == r5) goto L_0x014b
                    if (r2 == 0) goto L_0x014b
                    if (r55 == 0) goto L_0x00d7
                    goto L_0x00db
                L_0x00d7:
                    r3 = r9
                    r30 = r9
                    goto L_0x00e1
                L_0x00db:
                    java.util.List r3 = r0.A0h     // Catch:{ IOException -> 0x012e, OutOfMemoryError -> 0x012c, 1iX -> 0x0145, SecurityException -> 0x012a }
                    java.lang.String r30 = r7.A18()     // Catch:{ IOException -> 0x012e, OutOfMemoryError -> 0x012c, 1iX -> 0x0145, SecurityException -> 0x012a }
                L_0x00e1:
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x012e, OutOfMemoryError -> 0x012c, 1iX -> 0x0145, SecurityException -> 0x012a }
                    r7.<init>()     // Catch:{ IOException -> 0x012e, OutOfMemoryError -> 0x012c, 1iX -> 0x0145, SecurityException -> 0x012a }
                    java.lang.String r2 = "SendMedia/sendImage jids:"
                    r7.append(r2)     // Catch:{ IOException -> 0x012e, OutOfMemoryError -> 0x012c, 1iX -> 0x0145, SecurityException -> 0x012a }
                    java.lang.Object[] r2 = r32.toArray()     // Catch:{ IOException -> 0x012e, OutOfMemoryError -> 0x012c, 1iX -> 0x0145, SecurityException -> 0x012a }
                    java.lang.String r2 = java.util.Arrays.deepToString(r2)     // Catch:{ IOException -> 0x012e, OutOfMemoryError -> 0x012c, 1iX -> 0x0145, SecurityException -> 0x012a }
                    r7.append(r2)     // Catch:{ IOException -> 0x012e, OutOfMemoryError -> 0x012c, 1iX -> 0x0145, SecurityException -> 0x012a }
                    java.lang.String r2 = r7.toString()     // Catch:{ IOException -> 0x012e, OutOfMemoryError -> 0x012c, 1iX -> 0x0145, SecurityException -> 0x012a }
                    com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IOException -> 0x012e, OutOfMemoryError -> 0x012c, 1iX -> 0x0145, SecurityException -> 0x012a }
                    android.net.Uri r24 = android.net.Uri.fromFile(r6)     // Catch:{ IOException -> 0x012e, OutOfMemoryError -> 0x012c, 1iX -> 0x0145, SecurityException -> 0x012a }
                    r36 = 3
                    r26 = r9
                    r28 = r9
                    r29 = r9
                    r31 = r9
                    r34 = r9
                    r35 = r9
                    r40 = r4
                    r41 = r4
                    r42 = r4
                    r43 = r4
                    r23 = r49
                    r25 = r9
                    r27 = r47
                    r33 = r3
                    r37 = r13
                    r38 = r46
                    r39 = r4
                    X.2bF r6 = r23.A04(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ IOException -> 0x012e, OutOfMemoryError -> 0x012c, 1iX -> 0x0145, SecurityException -> 0x012a }
                    return r6
                L_0x012a:
                    r3 = move-exception
                    goto L_0x0146
                L_0x012c:
                    r3 = move-exception
                    goto L_0x0146
                L_0x012e:
                    r3 = move-exception
                    goto L_0x0146
                L_0x0130:
                    boolean r2 = r0 instanceof X.C441322g
                    if (r2 == 0) goto L_0x014b
                    r2 = r0
                    X.21V r2 = (X.AnonymousClass21V) r2
                    long r2 = r2.A01
                    r7 = 1048576(0x100000, double:5.180654E-318)
                    int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                    if (r6 <= 0) goto L_0x014b
                    X.1KB r3 = r1.A03
                    r2 = 41
                    goto L_0x015f
                L_0x0145:
                    r3 = move-exception
                L_0x0146:
                    r2 = r22
                    com.whatsapp.util.Log.e(r2, r3)
                L_0x014b:
                    X.00H r2 = r1.A1M
                    r34 = r2
                    java.lang.Object r2 = r34.get()
                    X.1hx r2 = (X.C32911hx) r2
                    boolean r2 = r2.A01(r0)
                    if (r2 != 0) goto L_0x016c
                    X.1KB r3 = r1.A03
                    r2 = 43
                L_0x015f:
                    X.3Bt r0 = new X.3Bt
                    r0.<init>(r1, r2)
                    r3.CGP(r0)
                    X.2bF r6 = A03()
                    return r6
                L_0x016c:
                    X.AW0 r2 = X.AnonymousClass25B.A00(r0)
                    if (r2 == 0) goto L_0x0177
                    X.1KB r3 = r1.A03
                    r2 = 44
                    goto L_0x015f
                L_0x0177:
                    X.00H r2 = r1.A1H
                    java.lang.Object r3 = r2.get()
                    X.A74 r3 = (X.A74) r3
                    r2 = 2
                    X.A74.A03(r3, r0, r2)
                    X.205 r8 = r0.A0v
                    int r2 = r32.size()
                    java.util.ArrayList r15 = new java.util.ArrayList
                    r15.<init>(r2)
                    int r2 = r32.size()
                    if (r2 <= r5) goto L_0x01bf
                    X.1Sb r2 = r1.A0j
                    X.11P r3 = r2.A06
                    X.11S r2 = r2.A03
                    java.lang.String r40 = X.AnonymousClass1PP.A00(r2, r3, r4)
                L_0x019e:
                    int r2 = r0.A0u
                    r33 = r2
                    boolean r2 = X.AnonymousClass25A.A0K(r33)
                    if (r2 == 0) goto L_0x01d5
                    int r2 = r0.A0B()
                    if (r2 != 0) goto L_0x01d5
                    boolean r2 = r0.A0r()
                    if (r2 == 0) goto L_0x01d5
                    java.lang.String r2 = r0.A0P()
                    int r2 = r2.length()
                    if (r2 <= 0) goto L_0x01d5
                    goto L_0x01c2
                L_0x01bf:
                    r40 = r9
                    goto L_0x019e
                L_0x01c2:
                    java.lang.String r2 = r0.A0P()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01cd, StringIndexOutOfBoundsException -> 0x01cf, IllegalArgumentException -> 0x01cb }
                    byte[] r19 = android.util.Base64.decode(r2, r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01cd, StringIndexOutOfBoundsException -> 0x01cf, IllegalArgumentException -> 0x01cb }
                    goto L_0x01d7
                L_0x01cb:
                    r3 = move-exception
                    goto L_0x01d0
                L_0x01cd:
                    r3 = move-exception
                    goto L_0x01d0
                L_0x01cf:
                    r3 = move-exception
                L_0x01d0:
                    java.lang.String r2 = "UserActions/userActionForwardMessage/base64-decode/error"
                    com.whatsapp.util.Log.e(r2, r3)
                L_0x01d5:
                    r19 = r9
                L_0x01d7:
                    boolean r7 = r0 instanceof X.AnonymousClass21Y
                    if (r7 == 0) goto L_0x020f
                    X.0ve r6 = r1.A0c
                    r3 = 695(0x2b7, float:9.74E-43)
                    X.0vf r2 = X.C18040vf.A02
                    boolean r2 = X.C18020vd.A05(r2, r6, r3)
                    if (r2 == 0) goto L_0x020f
                    r5 = r0
                    X.21V r5 = (X.AnonymousClass21V) r5
                    int r2 = r5.A0D
                    long r2 = (long) r2
                    r10 = 1000(0x3e8, double:4.94E-321)
                    long r2 = r2 * r10
                    int r3 = X.AnonymousClass6XV.A00(r6, r2)
                    int r2 = r5.A0D
                    if (r2 <= r3) goto L_0x020f
                    java.util.Iterator r3 = r32.iterator()
                L_0x01fc:
                    boolean r2 = r3.hasNext()
                    if (r2 == 0) goto L_0x020f
                    java.lang.Object r2 = r3.next()
                    com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
                    boolean r2 = X.C22971Dz.A0a(r2)
                    if (r2 == 0) goto L_0x01fc
                    r4 = 1
                L_0x020f:
                    X.0ve r6 = r1.A0c
                    boolean r14 = r0 instanceof X.AnonymousClass21V
                    if (r14 == 0) goto L_0x05dd
                    r2 = r0
                    X.21V r2 = (X.AnonymousClass21V) r2
                    java.lang.String r2 = r2.A08
                    if (r2 == 0) goto L_0x05dd
                L_0x021c:
                    r18 = 1
                L_0x021e:
                    java.util.Iterator r11 = r32.iterator()
                L_0x0222:
                    boolean r2 = r11.hasNext()
                    if (r2 == 0) goto L_0x04dc
                    java.lang.Object r10 = r11.next()
                    X.1BI r10 = (X.AnonymousClass1BI) r10
                    boolean r2 = X.C22971Dz.A0a(r10)
                    boolean r2 = X.C63652tT.A03(r6, r0, r2)
                    if (r2 == 0) goto L_0x04af
                    X.36w r3 = X.C60502o8.A00(r0)
                    boolean r2 = r0.A16()
                    if (r2 == 0) goto L_0x04af
                    if (r3 == 0) goto L_0x024a
                    boolean r2 = r3.A02()
                    if (r2 != 0) goto L_0x04af
                L_0x024a:
                    r21 = 0
                    if (r18 == 0) goto L_0x025b
                L_0x024e:
                    if (r7 == 0) goto L_0x025b
                    r2 = r0
                    X.21X r2 = (X.AnonymousClass21X) r2
                    boolean r2 = r2.A1I()
                    r20 = 1
                    if (r2 != 0) goto L_0x025d
                L_0x025b:
                    r20 = 0
                L_0x025d:
                    boolean r18 = r0.A0w()
                    java.util.Iterator r17 = r32.iterator()
                    r16 = 0
                L_0x0267:
                    boolean r2 = r17.hasNext()
                    if (r2 == 0) goto L_0x0614
                    java.lang.Object r5 = r17.next()
                    X.1BI r5 = (X.AnonymousClass1BI) r5
                    X.1PP r3 = r1.A0x     // Catch:{ 1iY -> 0x05fd }
                    r2 = 1
                    X.205 r39 = r3.A01(r5, r2)     // Catch:{ 1iY -> 0x05fd }
                    X.11P r2 = r1.A0K     // Catch:{ 1iY -> 0x05fd }
                    long r41 = X.AnonymousClass11P.A01(r2)     // Catch:{ 1iY -> 0x05fd }
                    if (r21 != 0) goto L_0x0290
                    if (r20 != 0) goto L_0x0290
                    if (r18 == 0) goto L_0x028d
                    boolean r2 = A0E(r1, r5, r0)     // Catch:{ 1iY -> 0x05fd }
                    if (r2 != 0) goto L_0x028d
                    goto L_0x0290
                L_0x028d:
                    r43 = 0
                    goto L_0x0292
                L_0x0290:
                    r43 = 1
                L_0x0292:
                    r4 = 0
                    X.2mf r2 = new X.2mf     // Catch:{ 1iY -> 0x05fd }
                    r38 = r2
                    r38.<init>(r39, r40, r41, r43, r44)     // Catch:{ 1iY -> 0x05fd }
                    java.lang.Object r3 = r34.get()     // Catch:{ 1iY -> 0x05fd }
                    X.1hx r3 = (X.C32911hx) r3     // Catch:{ 1iY -> 0x05fd }
                    X.206 r7 = r3.A00(r2, r0)     // Catch:{ 1iY -> 0x05fd }
                    boolean r2 = X.C22971Dz.A0a(r5)     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x02c2
                    int r10 = r7.A0u     // Catch:{ 1iY -> 0x05fd }
                    if (r52 == 0) goto L_0x02c2
                    boolean r2 = android.text.TextUtils.isEmpty(r52)     // Catch:{ 1iY -> 0x05fd }
                    if (r2 != 0) goto L_0x02c2
                    r3 = 1
                    r2 = r46
                    if (r2 != r3) goto L_0x02c2
                    if (r10 == 0) goto L_0x02c2
                    java.lang.String r2 = r52.trim()     // Catch:{ 1iY -> 0x05fd }
                    r7.A0j(r2)     // Catch:{ 1iY -> 0x05fd }
                L_0x02c2:
                    boolean r2 = X.C22971Dz.A0a(r5)     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x033f
                    boolean r2 = r7 instanceof X.AnonymousClass210     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x033f
                    r10 = r7
                    X.210 r10 = (X.AnonymousClass210) r10     // Catch:{ 1iY -> 0x05fd }
                    com.whatsapp.TextData r3 = new com.whatsapp.TextData     // Catch:{ 1iY -> 0x05fd }
                    r3.<init>()     // Catch:{ 1iY -> 0x05fd }
                    int r2 = X.AnonymousClass74F.A00()     // Catch:{ 1iY -> 0x05fd }
                    r3.backgroundColor = r2     // Catch:{ 1iY -> 0x05fd }
                    r2 = -1
                    r3.textColor = r2     // Catch:{ 1iY -> 0x05fd }
                    r3.fontStyle = r4     // Catch:{ 1iY -> 0x05fd }
                    r10.A18(r3)     // Catch:{ 1iY -> 0x05fd }
                    boolean r2 = X.C20097A7a.A05(r7)     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x0351
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ 1iY -> 0x05fd }
                    r10.<init>()     // Catch:{ 1iY -> 0x05fd }
                    java.lang.String r2 = r7.A0P()     // Catch:{ 1iY -> 0x05fd }
                    boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ 1iY -> 0x05fd }
                    if (r3 != 0) goto L_0x02fa
                    r10.append(r2)     // Catch:{ 1iY -> 0x05fd }
                L_0x02fa:
                    java.lang.String r2 = X.C20097A7a.A02(r7)     // Catch:{ 1iY -> 0x05fd }
                    boolean r11 = android.text.TextUtils.isEmpty(r2)     // Catch:{ 1iY -> 0x05fd }
                    java.lang.String r3 = "\n\n"
                    if (r11 != 0) goto L_0x0312
                    boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ 1iY -> 0x05fd }
                    if (r11 != 0) goto L_0x030f
                    r10.append(r3)     // Catch:{ 1iY -> 0x05fd }
                L_0x030f:
                    r10.append(r2)     // Catch:{ 1iY -> 0x05fd }
                L_0x0312:
                    X.2b7 r2 = r7.A0L()     // Catch:{ 1iY -> 0x05fd }
                    X.9rz r2 = r2.A00     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x032e
                    java.lang.String r2 = r2.A01     // Catch:{ 1iY -> 0x05fd }
                    boolean r11 = android.text.TextUtils.isEmpty(r2)     // Catch:{ 1iY -> 0x05fd }
                    if (r11 != 0) goto L_0x032e
                    boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ 1iY -> 0x05fd }
                    if (r11 != 0) goto L_0x032b
                    r10.append(r3)     // Catch:{ 1iY -> 0x05fd }
                L_0x032b:
                    r10.append(r2)     // Catch:{ 1iY -> 0x05fd }
                L_0x032e:
                    java.lang.String r3 = r10.toString()     // Catch:{ 1iY -> 0x05fd }
                    boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 1iY -> 0x05fd }
                    if (r2 != 0) goto L_0x033f
                    java.lang.String r2 = X.AnonymousClass74F.A07(r3)     // Catch:{ 1iY -> 0x05fd }
                    r7.A0i(r2)     // Catch:{ 1iY -> 0x05fd }
                L_0x033f:
                    boolean r2 = X.C22971Dz.A0a(r5)     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x038e
                    boolean r2 = r7 instanceof X.C441822l     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x038e
                    r3 = r7
                    X.22k r3 = (X.C441722k) r3     // Catch:{ 1iY -> 0x05fd }
                    X.25F r10 = r3.A00     // Catch:{ 1iY -> 0x05fd }
                    X.229 r2 = r10.A02     // Catch:{ 1iY -> 0x05fd }
                    goto L_0x0367
                L_0x0351:
                    java.lang.String r2 = r0.A0P()     // Catch:{ 1iY -> 0x05fd }
                    boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ 1iY -> 0x05fd }
                    if (r2 != 0) goto L_0x033f
                    java.lang.String r2 = r7.A0P()     // Catch:{ 1iY -> 0x05fd }
                    java.lang.String r2 = X.AnonymousClass74F.A07(r2)     // Catch:{ 1iY -> 0x05fd }
                    r7.A0i(r2)     // Catch:{ 1iY -> 0x05fd }
                    goto L_0x033f
                L_0x0367:
                    if (r2 == 0) goto L_0x036a
                    goto L_0x036c
                L_0x036a:
                    r10 = r9
                    goto L_0x0372
                L_0x036c:
                    X.229 r2 = r10.A02     // Catch:{ 1iY -> 0x05fd }
                    X.7LG r2 = (X.AnonymousClass7LG) r2     // Catch:{ 1iY -> 0x05fd }
                    byte[] r10 = r2.A08     // Catch:{ 1iY -> 0x05fd }
                L_0x0372:
                    int r29 = X.AnonymousClass74F.A00()     // Catch:{ 1iY -> 0x05fd }
                    X.Bvt r26 = X.C24127Bvt.A00     // Catch:{ 1iY -> 0x05fd }
                    X.BvS r24 = X.C24100BvS.A00     // Catch:{ 1iY -> 0x05fd }
                    X.7LG r2 = new X.7LG     // Catch:{ 1iY -> 0x05fd }
                    r31 = r4
                    r23 = r2
                    r25 = r24
                    r27 = r9
                    r28 = r10
                    r30 = r4
                    r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ 1iY -> 0x05fd }
                    r3.A1H(r2)     // Catch:{ 1iY -> 0x05fd }
                L_0x038e:
                    boolean r2 = r0.A0w()     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x03b1
                    X.Ac1 r2 = X.AnonymousClass9RY.A00(r0)     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x039f
                    X.1ch r2 = r2.A01     // Catch:{ 1iY -> 0x05fd }
                    r3 = 1
                    if (r2 != r5) goto L_0x03a0
                L_0x039f:
                    r3 = 0
                L_0x03a0:
                    boolean r2 = r1.A0F(r0)     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x046a
                    if (r3 != 0) goto L_0x03b7
                    X.1BI r2 = r8.A00     // Catch:{ 1iY -> 0x05fd }
                    if (r2 != r5) goto L_0x03b7
                    boolean r2 = r0 instanceof X.AnonymousClass22G     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x046a
                    goto L_0x03b7
                L_0x03b1:
                    boolean r2 = r1.A0F(r0)     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x046a
                L_0x03b7:
                    r2 = 1
                    r7.A0b(r2)     // Catch:{ 1iY -> 0x05fd }
                    r7.A06 = r13     // Catch:{ 1iY -> 0x05fd }
                    X.Ac1 r2 = X.AnonymousClass9RY.A00(r0)     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x03df
                    X.Ac1 r2 = X.AnonymousClass9RY.A00(r0)     // Catch:{ 1iY -> 0x05fd }
                L_0x03c8:
                    java.lang.Class<X.Ac1> r3 = X.C20947Ac1.class
                    X.25F r3 = r7.A0M(r3)     // Catch:{ 1iY -> 0x05fd }
                    r3.A02(r2)     // Catch:{ 1iY -> 0x05fd }
                    boolean r2 = r0.A0w()     // Catch:{ 1iY -> 0x05fd }
                    if (r2 != 0) goto L_0x0414
                    X.Ac1 r2 = X.AnonymousClass9RY.A00(r0)     // Catch:{ 1iY -> 0x05fd }
                    r3 = 0
                    if (r2 == 0) goto L_0x0415
                    goto L_0x0414
                L_0x03df:
                    boolean r2 = r0.A0w()     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x0412
                    X.1BI r11 = r8.A00     // Catch:{ 1iY -> 0x05fd }
                    X.1CJ r2 = r1.A0R     // Catch:{ 1iY -> 0x05fd }
                    X.1ci r10 = r2.A0A(r11)     // Catch:{ 1iY -> 0x05fd }
                    X.2Dk r10 = (X.C46162Dk) r10     // Catch:{ 1iY -> 0x05fd }
                    if (r10 == 0) goto L_0x0412
                    X.1ch r11 = (X.C29681ch) r11     // Catch:{ 1iY -> 0x05fd }
                    long r2 = r0.A0y     // Catch:{ 1iY -> 0x05fd }
                    int r12 = (int) r2     // Catch:{ 1iY -> 0x05fd }
                    java.lang.String r3 = r10.A0T     // Catch:{ 1iY -> 0x05fd }
                    r2 = 1
                    X.C18070vi.A0d(r11, r2)     // Catch:{ 1iY -> 0x05fd }
                    r2 = 3
                    X.C18070vi.A0d(r3, r2)     // Catch:{ 1iY -> 0x05fd }
                    X.Ac1 r2 = new X.Ac1     // Catch:{ 1iY -> 0x05fd }
                    r27 = r9
                    r23 = r2
                    r24 = r11
                    r25 = r9
                    r26 = r3
                    r28 = r12
                    r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ 1iY -> 0x05fd }
                    goto L_0x03c8
                L_0x0412:
                    r2 = 0
                    goto L_0x03c8
                L_0x0414:
                    r3 = 1
                L_0x0415:
                    X.Ac1 r2 = X.AnonymousClass9RY.A00(r7)     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x041e
                    X.9Id r2 = r2.A02     // Catch:{ 1iY -> 0x05fd }
                    goto L_0x041f
                L_0x041e:
                    r2 = r9
                L_0x041f:
                    if (r3 == 0) goto L_0x044d
                    X.00H r3 = r1.A27     // Catch:{ 1iY -> 0x05fd }
                    java.lang.Object r12 = r3.get()     // Catch:{ 1iY -> 0x05fd }
                    X.74D r12 = (X.AnonymousClass74D) r12     // Catch:{ 1iY -> 0x05fd }
                    X.205 r3 = r7.A0v     // Catch:{ 1iY -> 0x05fd }
                    X.1BI r3 = r3.A00     // Catch:{ 1iY -> 0x05fd }
                    java.lang.Integer r11 = X.AnonymousClass1PT.A02(r3)     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x043d
                    int r10 = r2.ordinal()     // Catch:{ 1iY -> 0x05fd }
                    r3 = 1
                    if (r10 == r3) goto L_0x043e
                    r2 = 2
                    if (r10 == r2) goto L_0x043e
                L_0x043d:
                    r3 = 0
                L_0x043e:
                    X.00H r2 = r1.A1Q     // Catch:{ 1iY -> 0x05fd }
                    java.lang.Object r2 = r2.get()     // Catch:{ 1iY -> 0x05fd }
                    X.2r5 r2 = (X.C62242r5) r2     // Catch:{ 1iY -> 0x05fd }
                    int r2 = r2.A01(r0)     // Catch:{ 1iY -> 0x05fd }
                    r12.A0K(r7, r11, r3, r2)     // Catch:{ 1iY -> 0x05fd }
                L_0x044d:
                    r3 = 4513(0x11a1, float:6.324E-42)
                    X.0vf r2 = X.C18040vf.A02     // Catch:{ 1iY -> 0x05fd }
                    boolean r2 = X.C18020vd.A05(r2, r6, r3)     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x046a
                    X.36g r2 = X.AnonymousClass2UY.A00(r0)     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x046a
                    X.36g r3 = X.AnonymousClass2UY.A00(r0)     // Catch:{ 1iY -> 0x05fd }
                    java.lang.Class<X.36g> r2 = X.C691936g.class
                    X.25F r2 = r7.A0M(r2)     // Catch:{ 1iY -> 0x05fd }
                    r2.A02(r3)     // Catch:{ 1iY -> 0x05fd }
                L_0x046a:
                    boolean r2 = r7 instanceof X.C441322g     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x0478
                    r3 = r7
                    X.22g r3 = (X.C441322g) r3     // Catch:{ 1iY -> 0x05fd }
                    r2 = 2
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ 1iY -> 0x05fd }
                    r3.A06 = r2     // Catch:{ 1iY -> 0x05fd }
                L_0x0478:
                    r1.A0b(r7)     // Catch:{ 1iY -> 0x05fd }
                    boolean r2 = X.C22971Dz.A0a(r5)     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x048c
                    r2 = r47
                    X.C63672tV.A03(r7, r2)     // Catch:{ 1iY -> 0x05fd }
                    X.1hg r2 = r1.A16     // Catch:{ 1iY -> 0x05fd }
                    r2.A04 = r4     // Catch:{ 1iY -> 0x05fd }
                    r2.A05 = r4     // Catch:{ 1iY -> 0x05fd }
                L_0x048c:
                    X.00H r2 = r1.A1F     // Catch:{ 1iY -> 0x05fd }
                    java.lang.Object r3 = r2.get()     // Catch:{ 1iY -> 0x05fd }
                    X.1PW r3 = (X.AnonymousClass1PW) r3     // Catch:{ 1iY -> 0x05fd }
                    java.util.List r2 = r0.A0h     // Catch:{ 1iY -> 0x05fd }
                    com.whatsapp.jid.UserJid r2 = r3.A03(r2)     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x04a0
                    r7.A1D = r9     // Catch:{ 1iY -> 0x05fd }
                    r7.A0o = r4     // Catch:{ 1iY -> 0x05fd }
                L_0x04a0:
                    if (r16 != 0) goto L_0x04aa
                    boolean r2 = A0E(r1, r5, r0)     // Catch:{ 1iY -> 0x05fd }
                    if (r2 == 0) goto L_0x04aa
                    r16 = 1
                L_0x04aa:
                    r15.add(r7)     // Catch:{ 1iY -> 0x05fd }
                    goto L_0x0267
                L_0x04af:
                    X.1PM r5 = r1.A0F
                    X.1Dw r2 = com.whatsapp.jid.UserJid.Companion
                    com.whatsapp.jid.UserJid r3 = X.C22941Dw.A01(r10)
                    if (r3 == 0) goto L_0x04c6
                    X.2tn r2 = new X.2tn
                    r2.<init>((X.AnonymousClass1PM) r5, (X.C25491Ok) r9, (com.whatsapp.jid.UserJid) r3)
                    boolean r2 = r2.A03()
                    if (r2 == 0) goto L_0x04c6
                    goto L_0x024a
                L_0x04c6:
                    boolean r2 = r0.A0w()
                    if (r2 != 0) goto L_0x04d4
                    boolean r2 = X.C22971Dz.A0V(r10)
                    if (r2 == 0) goto L_0x04d4
                    goto L_0x024a
                L_0x04d4:
                    boolean r2 = X.C42701yb.A01(r10)
                    if (r2 == 0) goto L_0x0222
                    goto L_0x024a
                L_0x04dc:
                    X.1BI r2 = r8.A00
                    r20 = r2
                    boolean r2 = X.C42701yb.A01(r20)
                    if (r2 != 0) goto L_0x024a
                    if (r14 == 0) goto L_0x0554
                    r3 = r0
                    X.21V r3 = (X.AnonymousClass21V) r3
                    X.2rc r2 = r3.A02
                    X.C17960vV.A07(r2)
                    long r11 = r3.A0I
                    byte[] r10 = r2.A0a
                    long r2 = r2.A0B
                    if (r10 == 0) goto L_0x0511
                    r16 = 0
                    int r5 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
                    if (r5 > 0) goto L_0x04ff
                    r2 = r11
                L_0x04ff:
                    X.2pa r5 = new X.2pa
                    r5.<init>(r10, r2)
                L_0x0504:
                    X.11P r2 = r1.A0K
                    long r2 = X.AnonymousClass11P.A01(r2)
                    boolean r2 = X.C61382pa.A00(r5, r2)
                    r5 = 1
                    if (r2 != 0) goto L_0x0512
                L_0x0511:
                    r5 = 0
                L_0x0512:
                    if (r14 == 0) goto L_0x054d
                    r2 = r0
                    X.21V r2 = (X.AnonymousClass21V) r2
                    java.lang.String r2 = r2.A07
                    boolean r2 = android.text.TextUtils.isEmpty(r2)
                    r3 = r2 ^ 1
                L_0x051f:
                    if (r18 == 0) goto L_0x024a
                    if (r5 == 0) goto L_0x024a
                    if (r3 == 0) goto L_0x024a
                    X.11S r3 = r1.A04
                    X.11P r2 = r1.A0K
                    long r16 = X.AnonymousClass11P.A01(r2)
                    boolean r2 = r0.A0x()
                    if (r2 != 0) goto L_0x024a
                    if (r14 == 0) goto L_0x058a
                    boolean r2 = X.C22971Dz.A0a(r20)
                    if (r2 != 0) goto L_0x024a
                    boolean r2 = X.C22971Dz.A0Z(r20)
                    if (r2 == 0) goto L_0x058a
                    r5 = 1844(0x734, float:2.584E-42)
                    X.0vf r2 = X.C18040vf.A02
                    boolean r2 = X.C18020vd.A05(r2, r6, r5)
                    if (r2 == 0) goto L_0x058a
                    goto L_0x024a
                L_0x054d:
                    boolean r2 = r0 instanceof X.AnonymousClass210
                    r3 = 0
                    if (r2 == 0) goto L_0x051f
                    r3 = 1
                    goto L_0x051f
                L_0x0554:
                    boolean r2 = r0 instanceof X.AnonymousClass210
                    if (r2 == 0) goto L_0x0511
                    X.36w r2 = X.C60502o8.A00(r0)
                    X.36w r3 = X.C50372Ue.A00(r6, r0)
                    if (r2 == 0) goto L_0x057d
                    boolean r5 = r2.A02()
                    if (r5 == 0) goto L_0x057d
                    byte[] r10 = r2.A0B
                    long r2 = r2.A02
                L_0x056c:
                    long r11 = r0.A0I
                    if (r10 == 0) goto L_0x0511
                    r16 = 0
                    int r5 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
                    if (r5 > 0) goto L_0x0577
                    r2 = r11
                L_0x0577:
                    X.2pa r5 = new X.2pa
                    r5.<init>(r10, r2)
                    goto L_0x0504
                L_0x057d:
                    if (r3 == 0) goto L_0x0511
                    boolean r2 = r3.A02()
                    if (r2 == 0) goto L_0x0511
                    byte[] r10 = r3.A0B
                    long r2 = r3.A02
                    goto L_0x056c
                L_0x058a:
                    boolean r2 = X.AnonymousClass25A.A0J(r33)
                    if (r2 != 0) goto L_0x024a
                    boolean r2 = X.AnonymousClass25A.A0H(r33)
                    if (r2 == 0) goto L_0x05b2
                    boolean r2 = X.AnonymousClass25A.A0T(r3, r0)
                    if (r2 != 0) goto L_0x05b2
                    long r2 = r0.A0I
                    r10 = 432000000(0x19bfcc00, double:2.13436359E-315)
                    long r2 = r2 + r10
                    r10 = 0
                    int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                    if (r5 == 0) goto L_0x05b2
                    int r5 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
                    if (r5 >= 0) goto L_0x05b2
                L_0x05ac:
                    r21 = 1
                    if (r4 == 0) goto L_0x024e
                    goto L_0x024a
                L_0x05b2:
                    boolean r2 = X.AnonymousClass25A.A0t(r0)
                    if (r2 == 0) goto L_0x024a
                    long r2 = r0.A0I
                    r10 = 432000000(0x19bfcc00, double:2.13436359E-315)
                    long r16 = r16 - r10
                    int r5 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
                    if (r5 <= 0) goto L_0x024a
                    X.36w r2 = X.C60502o8.A00(r0)
                    X.36w r3 = X.C50372Ue.A00(r6, r0)
                    if (r2 == 0) goto L_0x05d4
                    boolean r2 = r2.A02()
                    if (r2 == 0) goto L_0x05d4
                    goto L_0x05ac
                L_0x05d4:
                    if (r3 == 0) goto L_0x024a
                    boolean r2 = r3.A02()
                    if (r2 == 0) goto L_0x024a
                    goto L_0x05ac
                L_0x05dd:
                    boolean r2 = r0 instanceof X.AnonymousClass210
                    if (r2 == 0) goto L_0x05f9
                    X.36w r2 = X.C60502o8.A00(r0)
                    X.36w r3 = X.C50372Ue.A00(r6, r0)
                    if (r2 == 0) goto L_0x05f1
                    java.lang.String r2 = r2.A06
                    if (r2 == 0) goto L_0x05f1
                    goto L_0x021c
                L_0x05f1:
                    if (r3 == 0) goto L_0x05f9
                    java.lang.String r2 = r3.A06
                    if (r2 == 0) goto L_0x05f9
                    goto L_0x021c
                L_0x05f9:
                    r18 = 0
                    goto L_0x021e
                L_0x05fd:
                    r2 = move-exception
                    java.lang.String r0 = "UserActions/userActionForwardMessage "
                    com.whatsapp.util.Log.e(r0, r2)
                    X.190 r3 = r1.A01
                    java.lang.String r2 = r2.getMessage()
                    r1 = 1
                    r0 = r22
                    r3.A0G(r0, r2, r1)
                    X.2bF r0 = A03()
                    return r0
                L_0x0614:
                    boolean r2 = X.AnonymousClass25A.A0H(r33)
                    if (r2 == 0) goto L_0x06b9
                    if (r21 != 0) goto L_0x06b9
                    X.C17960vV.A0D(r14)
                    X.1BI r2 = r8.A00
                    boolean r11 = X.C42701yb.A01(r2)
                    boolean r10 = r0.A0x()
                    java.util.Iterator r8 = r32.iterator()
                    r7 = 0
                    r6 = 0
                L_0x062f:
                    boolean r2 = r8.hasNext()
                    if (r2 == 0) goto L_0x065c
                    java.lang.Object r5 = r8.next()
                    X.1BI r5 = (X.AnonymousClass1BI) r5
                    X.1PM r4 = r1.A0F
                    X.1Dw r2 = com.whatsapp.jid.UserJid.Companion
                    com.whatsapp.jid.UserJid r3 = X.C22941Dw.A01(r5)
                    if (r3 == 0) goto L_0x0651
                    X.2tn r2 = new X.2tn
                    r2.<init>((X.AnonymousClass1PM) r4, (X.C25491Ok) r9, (com.whatsapp.jid.UserJid) r3)
                    boolean r2 = r2.A03()
                    if (r2 == 0) goto L_0x0651
                    r6 = 1
                L_0x0651:
                    boolean r2 = X.C42701yb.A01(r5)
                    if (r2 == 0) goto L_0x0658
                    r7 = 1
                L_0x0658:
                    if (r6 == 0) goto L_0x062f
                    if (r7 == 0) goto L_0x062f
                L_0x065c:
                    if (r10 != 0) goto L_0x0661
                    r4 = 0
                    if (r6 == 0) goto L_0x0662
                L_0x0661:
                    r4 = 1
                L_0x0662:
                    if (r20 == 0) goto L_0x0679
                    X.2bF r6 = new X.2bF
                    r6.<init>()
                    r7 = 28
                    X.Aix r2 = new X.Aix
                    r3 = r1
                    r4 = r15
                    r5 = r0
                    r2.<init>(r3, r4, r5, r6, r7)
                    r0 = r45
                    r0.CGF(r2)
                    return r6
                L_0x0679:
                    int r2 = r32.size()
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>(r2)
                    java.util.Iterator r3 = r15.iterator()
                L_0x0686:
                    boolean r2 = r3.hasNext()
                    if (r2 == 0) goto L_0x0694
                    java.lang.Object r2 = r3.next()
                    r5.add(r2)
                    goto L_0x0686
                L_0x0694:
                    if (r11 != 0) goto L_0x0699
                    r2 = 0
                    if (r7 == 0) goto L_0x069a
                L_0x0699:
                    r2 = 1
                L_0x069a:
                    if (r4 != 0) goto L_0x069f
                    r4 = 0
                    if (r2 == 0) goto L_0x06a0
                L_0x069f:
                    r4 = 1
                L_0x06a0:
                    X.2tS r3 = new X.2tS
                    r2 = r46
                    r3.<init>(r2, r5, r4)
                    X.21V r0 = (X.AnonymousClass21V) r0
                    r12 = 0
                    r8 = r9
                    r10 = r9
                    r14 = r12
                    r4 = r1
                    r5 = r9
                    r6 = r0
                    r7 = r3
                    r11 = r19
                    r13 = r12
                    X.2bF r6 = A04(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                    return r6
                L_0x06b9:
                    X.2bF r6 = new X.2bF
                    if (r16 == 0) goto L_0x06ce
                    r6.<init>()
                    r7 = 24
                    X.Aix r2 = new X.Aix
                    r3 = r1
                    r4 = r0
                    r5 = r15
                    r2.<init>(r3, r4, r5, r6, r7)
                    A0C(r1, r0, r2, r15, r9)
                    return r6
                L_0x06ce:
                    r6.<init>()
                    r14 = 26
                    X.Aix r3 = new X.Aix
                    r9 = r3
                    r10 = r1
                    r11 = r15
                    r12 = r0
                    r13 = r6
                    r9.<init>(r10, r11, r12, r13, r14)
                    r2 = r19
                    A0C(r1, r0, r3, r15, r2)
                    X.1BI r4 = r8.A00
                    int r3 = r32.size()
                    r2 = 1
                    if (r3 > r2) goto L_0x06ec
                    r2 = 0
                L_0x06ec:
                    int r4 = X.A8F.A01(r4, r2)
                    r3 = 13
                    X.Akb r2 = new X.Akb
                    r2.<init>((java.lang.Object) r1, (int) r4, (int) r3, (java.lang.Object) r0)
                    r0 = r45
                    r0.CGF(r2)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C33251iW.A0G(X.1kd, X.206, X.36j, java.lang.String, java.util.List, int, boolean):X.2bF");
            }
        }
