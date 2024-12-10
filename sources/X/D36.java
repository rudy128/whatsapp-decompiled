package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.facebook.wearable.applinks.AppLinkDeviceMountState;
import com.facebook.wearable.applinks.AppLinkDevicePeakPowerState;
import java.util.ArrayList;
import java.util.Locale;

public class D36 implements Parcelable.Creator {
    public final int A00;

    public D36(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.view.View$BaseSavedState, X.BHJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.2ut, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v5, types: [android.view.View$BaseSavedState, java.lang.Object, X.BHM] */
    /* JADX WARNING: type inference failed for: r1v6, types: [X.2uw, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v18, types: [android.view.View$BaseSavedState, X.BHI, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                return AppLinkDeviceMountState.values()[parcel.readInt()];
            case 1:
                return AppLinkDevicePeakPowerState.values()[parcel.readInt()];
            case 2:
                return new C26549D3l(parcel);
            case 3:
                return new DUT(parcel);
            case 4:
                return new C26540D3b(parcel);
            case 5:
                return new C26541D3c(parcel);
            case 6:
                return new D3Z(parcel);
            case 7:
                return new C26554D3u(parcel);
            case 8:
                return new C26547D3i(parcel);
            case 9:
                ? obj = new Object();
                obj.A00 = 255;
                obj.A05 = -2;
                obj.A04 = -2;
                obj.A06 = AnonymousClass000.A0i();
                obj.A01 = parcel.readInt();
                obj.A0A = (Integer) parcel.readSerializable();
                obj.A0C = (Integer) parcel.readSerializable();
                obj.A00 = parcel.readInt();
                obj.A05 = parcel.readInt();
                obj.A04 = parcel.readInt();
                obj.A07 = parcel.readString();
                obj.A03 = parcel.readInt();
                obj.A0B = (Integer) parcel.readSerializable();
                obj.A0E = (Integer) parcel.readSerializable();
                obj.A0G = (Integer) parcel.readSerializable();
                obj.A0D = (Integer) parcel.readSerializable();
                obj.A0F = (Integer) parcel.readSerializable();
                obj.A08 = (Integer) parcel.readSerializable();
                obj.A09 = (Integer) parcel.readSerializable();
                obj.A06 = (Boolean) parcel.readSerializable();
                obj.A0H = (Locale) parcel.readSerializable();
                return obj;
            case 10:
                ? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.A00 = AnonymousClass000.A0M(parcel.readValue(baseSavedState.getClass().getClassLoader()));
                return baseSavedState;
            case 11:
                ? obj2 = new Object();
                obj2.A00 = parcel.readInt();
                obj2.A01 = (C22638BGy) AnonymousClass3Ma.A08(parcel, obj2.getClass());
                return obj2;
            case 12:
                ? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.A01 = parcel.readFloat();
                baseSavedState2.A02 = parcel.readFloat();
                ArrayList A13 = AnonymousClass000.A13();
                baseSavedState2.A03 = A13;
                parcel.readList(A13, Float.class.getClassLoader());
                baseSavedState2.A00 = parcel.readFloat();
                baseSavedState2.A04 = parcel.createBooleanArray()[0];
                return baseSavedState2;
            case 13:
                E6O e6o = (E6O) C25925Coo.A01(E6O.class, AnonymousClass8BT.A0i(parcel));
                if (e6o == null) {
                    AnonymousClass0CT r3 = AnonymousClass0CT.ERROR;
                    C18070vi.A0d(r3, 0);
                    AnonymousClass0MD.A00(r3, "CdsOpenScreenCallerDismissCallback", "Expected non-null CallerDismissCallbackRunnable from BloksDataStorage", (Throwable) null);
                    new DOW
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0160: CONSTRUCTOR  (r0v7 ? I:X.DOW) =  call: X.DOW.<init>():void type: CONSTRUCTOR in method: X.D36.createFromParcel(android.os.Parcel):java.lang.Object, dex: classes6.dex
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
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v7 ?
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 39 more
                        */
                    /*
                        this = this;
                        int r0 = r4.A00
                        switch(r0) {
                            case 0: goto L_0x0011;
                            case 1: goto L_0x001c;
                            case 2: goto L_0x0027;
                            case 3: goto L_0x002d;
                            case 4: goto L_0x0033;
                            case 5: goto L_0x0039;
                            case 6: goto L_0x003f;
                            case 7: goto L_0x0045;
                            case 8: goto L_0x004b;
                            case 9: goto L_0x0051;
                            case 10: goto L_0x00e2;
                            case 11: goto L_0x00fa;
                            case 12: goto L_0x0112;
                            case 13: goto L_0x0142;
                            default: goto L_0x0005;
                        }
                    L_0x0005:
                        X.BHI r1 = new X.BHI
                        r1.<init>(r5)
                        int r0 = r5.readInt()
                        r1.A00 = r0
                        return r1
                    L_0x0011:
                        com.facebook.wearable.applinks.AppLinkDeviceMountState[] r1 = com.facebook.wearable.applinks.AppLinkDeviceMountState.values()
                        int r0 = r5.readInt()
                        r1 = r1[r0]
                        return r1
                    L_0x001c:
                        com.facebook.wearable.applinks.AppLinkDevicePeakPowerState[] r1 = com.facebook.wearable.applinks.AppLinkDevicePeakPowerState.values()
                        int r0 = r5.readInt()
                        r1 = r1[r0]
                        return r1
                    L_0x0027:
                        X.D3l r1 = new X.D3l
                        r1.<init>(r5)
                        return r1
                    L_0x002d:
                        X.DUT r1 = new X.DUT
                        r1.<init>(r5)
                        return r1
                    L_0x0033:
                        X.D3b r1 = new X.D3b
                        r1.<init>(r5)
                        return r1
                    L_0x0039:
                        X.D3c r1 = new X.D3c
                        r1.<init>(r5)
                        return r1
                    L_0x003f:
                        X.D3Z r1 = new X.D3Z
                        r1.<init>(r5)
                        return r1
                    L_0x0045:
                        X.D3u r1 = new X.D3u
                        r1.<init>((android.os.Parcel) r5)
                        return r1
                    L_0x004b:
                        X.D3i r1 = new X.D3i
                        r1.<init>(r5)
                        return r1
                    L_0x0051:
                        X.2uw r1 = new X.2uw
                        r1.<init>()
                        r0 = 255(0xff, float:3.57E-43)
                        r1.A00 = r0
                        r0 = -2
                        r1.A05 = r0
                        r1.A04 = r0
                        java.lang.Boolean r0 = X.AnonymousClass000.A0i()
                        r1.A06 = r0
                        int r0 = r5.readInt()
                        r1.A01 = r0
                        java.io.Serializable r0 = r5.readSerializable()
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        r1.A0A = r0
                        java.io.Serializable r0 = r5.readSerializable()
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        r1.A0C = r0
                        int r0 = r5.readInt()
                        r1.A00 = r0
                        int r0 = r5.readInt()
                        r1.A05 = r0
                        int r0 = r5.readInt()
                        r1.A04 = r0
                        java.lang.String r0 = r5.readString()
                        r1.A07 = r0
                        int r0 = r5.readInt()
                        r1.A03 = r0
                        java.io.Serializable r0 = r5.readSerializable()
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        r1.A0B = r0
                        java.io.Serializable r0 = r5.readSerializable()
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        r1.A0E = r0
                        java.io.Serializable r0 = r5.readSerializable()
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        r1.A0G = r0
                        java.io.Serializable r0 = r5.readSerializable()
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        r1.A0D = r0
                        java.io.Serializable r0 = r5.readSerializable()
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        r1.A0F = r0
                        java.io.Serializable r0 = r5.readSerializable()
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        r1.A08 = r0
                        java.io.Serializable r0 = r5.readSerializable()
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        r1.A09 = r0
                        java.io.Serializable r0 = r5.readSerializable()
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        r1.A06 = r0
                        java.io.Serializable r0 = r5.readSerializable()
                        java.util.Locale r0 = (java.util.Locale) r0
                        r1.A0H = r0
                        return r1
                    L_0x00e2:
                        X.BHM r1 = new X.BHM
                        r1.<init>(r5)
                        java.lang.Class r0 = r1.getClass()
                        java.lang.ClassLoader r0 = r0.getClassLoader()
                        java.lang.Object r0 = r5.readValue(r0)
                        int r0 = X.AnonymousClass000.A0M(r0)
                        r1.A00 = r0
                        return r1
                    L_0x00fa:
                        X.2ut r1 = new X.2ut
                        r1.<init>()
                        int r0 = r5.readInt()
                        r1.A00 = r0
                        java.lang.Class r0 = r1.getClass()
                        android.os.Parcelable r0 = X.AnonymousClass3Ma.A08(r5, r0)
                        X.BGy r0 = (X.C22638BGy) r0
                        r1.A01 = r0
                        return r1
                    L_0x0112:
                        X.BHJ r1 = new X.BHJ
                        r1.<init>(r5)
                        float r0 = r5.readFloat()
                        r1.A01 = r0
                        float r0 = r5.readFloat()
                        r1.A02 = r0
                        java.util.ArrayList r2 = X.AnonymousClass000.A13()
                        r1.A03 = r2
                        java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
                        java.lang.ClassLoader r0 = r0.getClassLoader()
                        r5.readList(r2, r0)
                        float r0 = r5.readFloat()
                        r1.A00 = r0
                        boolean[] r2 = r5.createBooleanArray()
                        r0 = 0
                        boolean r0 = r2[r0]
                        r1.A04 = r0
                        return r1
                    L_0x0142:
                        java.lang.Integer r1 = X.AnonymousClass8BT.A0i(r5)
                        java.lang.Class<X.E6O> r0 = X.E6O.class
                        java.lang.Object r0 = X.C25925Coo.A01(r0, r1)
                        X.E6O r0 = (X.E6O) r0
                        if (r0 != 0) goto L_0x0163
                        X.0CT r3 = X.AnonymousClass0CT.ERROR
                        java.lang.String r2 = "CdsOpenScreenCallerDismissCallback"
                        java.lang.String r1 = "Expected non-null CallerDismissCallbackRunnable from BloksDataStorage"
                        r0 = 0
                        X.C18070vi.A0d(r3, r0)
                        r0 = 0
                        X.AnonymousClass0MD.A00(r3, r2, r1, r0)
                        X.DOW r0 = new X.DOW
                        r0.<init>()
                    L_0x0163:
                        X.D3L r1 = new X.D3L
                        r1.<init>(r0)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.D36.createFromParcel(android.os.Parcel):java.lang.Object");
                }

                public /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    switch (this.A00) {
                        case 0:
                            return new AppLinkDeviceMountState[i];
                        case 1:
                            return new AppLinkDevicePeakPowerState[i];
                        case 2:
                            return new C26549D3l[i];
                        case 3:
                            return new DUT[i];
                        case 4:
                            return new C26540D3b[i];
                        case 5:
                            return new C26541D3c[i];
                        case 6:
                            return new D3Z[i];
                        case 7:
                            return new C26554D3u[i];
                        case 8:
                            return new C26547D3i[i];
                        case 9:
                            return new C64542uw[i];
                        case 10:
                            return new BHM[i];
                        case 11:
                            return new C64512ut[i];
                        case 12:
                            return new BHJ[i];
                        case 13:
                            return new D3L[i];
                        default:
                            return new BHI[i];
                    }
                }
            }
