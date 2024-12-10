package X;

import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public final class ATI implements AnonymousClass3L1, AnonymousClass3L4 {
    public final AnonymousClass12N A00;
    public final C18030ve A01;

    public Integer C1P(C19998A2m a2m, AnonymousClass206 r38) {
        C62572rc r0;
        InteractiveAnnotation[] interactiveAnnotationArr;
        int length;
        C164398Yr r02;
        AnonymousClass206 r1 = r38;
        if (!(r1 instanceof AnonymousClass21V) || (r0 = ((AnonymousClass21V) r1).A02) == null || (interactiveAnnotationArr = r0.A0b) == null || (length = interactiveAnnotationArr.length) == 0 || !C22971Dz.A0a(r1.A0v.A00)) {
            return AnonymousClass00R.A00;
        }
        int i = 0;
        do {
            InteractiveAnnotation interactiveAnnotation = interactiveAnnotationArr[i];
            C49482Qq r03 = interactiveAnnotation.type;
            if (r03 != null && r03.ordinal() == 2) {
                Object obj = interactiveAnnotation.data;
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.protocol.EmbeddedContentMessageInfo.ParsedEmbeddedContentMessageInfo");
                AnonymousClass97M r4 = (AnonymousClass97M) obj;
                AnonymousClass206 r3 = r4.A01;
                if (r3 == null) {
                    r02 = null;
                } else {
                    C23624Bmt A0N = C164398Yr.DEFAULT_INSTANCE.A0N();
                    C18070vi.A0X(A0N);
                    C23624Bmt A0N2 = C164408Ys.DEFAULT_INSTANCE.A0N();
                    C18070vi.A0X(A0N2);
                    AnonymousClass8X8 A002 = C166418cr.A00();
                    C163938Wx r12 = (C163938Wx) A002.A0G().A0O();
                    C18070vi.A0b(r12);
                    C19998A2m a2m2 = a2m;
                    boolean z = a2m2.A0B;
                    boolean z2 = a2m2.A06;
                    boolean z3 = a2m2.A05;
                    C29721cl r21 = a2m2.A02;
                    byte[] bArr = a2m2.A0G;
                    boolean z4 = a2m2.A0D;
                    boolean z5 = a2m2.A04;
                    boolean z6 = a2m2.A0C;
                    boolean z7 = a2m2.A0A;
                    boolean z8 = a2m2.A0F;
                    boolean z9 = a2m2.A08;
                    boolean z10 = a2m2.A09;
                    Integer num = a2m2.A03;
                    boolean z11 = a2m2.A07;
                    C18070vi.A0d(r12, 1);
                    this.A00.A01(new C19998A2m(A002, r12, r21, num, bArr, z, z2, z3, z4, z5, z6, z7, true, z8, z9, z10, z11), r3);
                    A002.A0U(r12);
                    C164408Ys r13 = (C164408Ys) C17880vN.A0G(A0N2);
                    C166418cr A0e = AnonymousClass8BR.A0e(A002);
                    A0e.getClass();
                    r13.message_ = A0e;
                    r13.bitField0_ |= 2;
                    String str = r3.A0v.A01;
                    C164408Ys r14 = (C164408Ys) C17880vN.A0G(A0N2);
                    str.getClass();
                    r14.bitField0_ |= 1;
                    r14.stanzaId_ = str;
                    C164398Yr r15 = (C164398Yr) C17880vN.A0G(A0N);
                    C23577Bm6 A0C = A0N2.A0C();
                    A0C.getClass();
                    r15.content_ = A0C;
                    r15.contentCase_ = 1;
                    r02 = (C164398Yr) A0N.A0C();
                }
                r4.A00 = r02;
            }
            i++;
        } while (i < length);
        return AnonymousClass00R.A00;
    }

    public void C19(C20077A6d a6d, AnonymousClass206 r23) {
        C62572rc r0;
        InteractiveAnnotation[] interactiveAnnotationArr;
        AnonymousClass97L r1;
        C164398Yr r8;
        C164408Ys r82;
        AnonymousClass97L r12;
        C164398Yr r13;
        C164408Ys r02;
        AnonymousClass206 r83 = r23;
        C20077A6d a6d2 = a6d;
        boolean A17 = C18070vi.A17(a6d2, r83);
        if (r83 instanceof AnonymousClass21V) {
            AnonymousClass205 r5 = r83.A0v;
            AnonymousClass1BI r4 = r5.A00;
            if (C22971Dz.A0a(r4)) {
                if (C18020vd.A05(C18040vf.A02, this.A01, 9522) && (r0 = ((AnonymousClass21V) r83).A02) != null && (interactiveAnnotationArr = r0.A0b) != null) {
                    ArrayList<InteractiveAnnotation> A13 = AnonymousClass000.A13();
                    for (InteractiveAnnotation interactiveAnnotation : interactiveAnnotationArr) {
                        Object obj = interactiveAnnotation.data;
                        if (!(!(obj instanceof AnonymousClass97L) || (r12 = (AnonymousClass97L) obj) == null || (r13 = r12.A00) == null)) {
                            if (r13.contentCase_ == A17) {
                                r02 = (C164408Ys) r13.content_;
                            } else {
                                r02 = C164408Ys.DEFAULT_INSTANCE;
                            }
                            if (!(r02 == null || (r02.bitField0_ & 2) == 0)) {
                                A13.add(interactiveAnnotation);
                            }
                        }
                    }
                    for (InteractiveAnnotation interactiveAnnotation2 : A13) {
                        Object obj2 = interactiveAnnotation2.data;
                        if (!(!(obj2 instanceof AnonymousClass97L) || (r1 = (AnonymousClass97L) obj2) == null || (r8 = r1.A00) == null)) {
                            if (r8.contentCase_ == 1) {
                                r82 = (C164408Ys) r8.content_;
                            } else {
                                r82 = C164408Ys.DEFAULT_INSTANCE;
                            }
                            if (r82 != null) {
                                AnonymousClass205 A012 = AnonymousClass205.A01(r4, r82.stanzaId_, r5.A02);
                                long j = a6d2.A03;
                                C166418cr r11 = r82.message_;
                                if (r11 == null) {
                                    r11 = C166418cr.DEFAULT_INSTANCE;
                                }
                                C18070vi.A0b(r11);
                                C18070vi.A0d(r11, 0);
                                try {
                                    AnonymousClass206 A002 = this.A00.A00(C196699vU.A00(r11, A012, j).A00());
                                    A002.A0S = 100;
                                    interactiveAnnotation2.data = new AnonymousClass97M(A002, (Long) null);
                                } catch (C172188t1 e) {
                                    AnonymousClass23U r14 = new AnonymousClass23U(A012, r11.A0M(), 2, 0, j);
                                    r14.A00 = e.futureMessageType;
                                    C60512o9.A01(r14, e.parentAssociationInfo);
                                    r14.A0S = 100;
                                    interactiveAnnotation2.data = new AnonymousClass97M(r14, (Long) null);
                                } catch (AnonymousClass98Y e2) {
                                    Log.e("FMessageInteractiveAnnotationProtoPostProcessor/onPostProcessDeserialization/Orphan message:", e2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public ATI(C18030ve r1, AnonymousClass12N r2) {
        C18070vi.A0j(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }
}
