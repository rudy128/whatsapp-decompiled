package X;

import androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$5;
import androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1;
import java.util.Arrays;

/* renamed from: X.Cd2  reason: case insensitive filesystem */
public abstract class C25298Cd2 {
    public static final C17330uU A00(C17130tn r14, C23401Fx r15, C23381Fv r16, Object obj, C18560wh r18, C23421Fz r19) {
        C17130tn r6 = r14;
        r14.COB(1977777920);
        Object[] A1a = BE6.A1a();
        C23401Fx r12 = r15;
        C23381Fv r13 = r16;
        C18560wh r152 = r18;
        C23421Fz r0 = r19;
        C17900vP.A0O(r0, r13, r12, r152, A1a);
        FlowExtKt$collectAsStateWithLifecycle$1 flowExtKt$collectAsStateWithLifecycle$1 = new FlowExtKt$collectAsStateWithLifecycle$1(r12, r13, (C30391dr) null, r152, r0);
        r6.COB(490154582);
        Object A0u = AnonymousClass000.A0u(r6, -492369756);
        Object obj2 = AnonymousClass0MH.A00;
        if (A0u == obj2) {
            A0u = AnonymousClass0Q9.A02(obj);
            r6.CRH(A0u);
        }
        AnonymousClass0VR r8 = (AnonymousClass0VR) r6;
        AnonymousClass0VR.A0R(r8, false);
        C17330uU r9 = (C17330uU) A0u;
        Object[] copyOf = Arrays.copyOf(A1a, 4);
        SnapshotStateKt__ProduceStateKt$produceState$5 snapshotStateKt__ProduceStateKt$produceState$5 = new SnapshotStateKt__ProduceStateKt$produceState$5(r9, (C30391dr) null, flowExtKt$collectAsStateWithLifecycle$1);
        r6.COB(-139560008);
        C18560wh BN8 = r6.BN8();
        Object[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        r6.COB(-568225417);
        boolean z = false;
        for (Object BEf : copyOf2) {
            z |= r6.BEf(BEf);
        }
        Object CER = r6.CER();
        if (z || CER == obj2) {
            r6.CRH(new C05700Vj(BN8, snapshotStateKt__ProduceStateKt$produceState$5));
        }
        AnonymousClass0VR.A0R(r8, false);
        AnonymousClass0VR.A0R(r8, false);
        AnonymousClass0VR.A0R(r8, false);
        AnonymousClass0VR.A0R(r8, false);
        return r9;
    }

    public static final C17330uU A01(C17130tn r5, AnonymousClass1G1 r6) {
        C17130tn r1 = r5;
        r5.COB(743249048);
        C23401Fx r2 = C23401Fx.STARTED;
        AnonymousClass1OR r52 = AnonymousClass1OR.A00;
        C17330uU A00 = A00(r1, r2, ((AnonymousClass1F9) r5.BFh(AnonymousClass0PK.A03)).getLifecycle(), r6.getValue(), r52, r6);
        AnonymousClass0VR.A0U(r1);
        return A00;
    }
}
