package com.whatsapp.dobverification;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C1193667v;
import X.C17880vN;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.infra.graphql.generated.age_collection.enums.GraphQLXWA2AgeCollectionStatus;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.dobverification.AgeCollectionNotificationHandler$handleNotification$1$1", f = "AgeCollectionNotificationHandler.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
public final class AgeCollectionNotificationHandler$handleNotification$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ GraphQLXWA2AgeCollectionStatus $ageCollectionStatus;
    public int label;
    public final /* synthetic */ C1193667v this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AgeCollectionNotificationHandler$handleNotification$1$1(C1193667v r2, GraphQLXWA2AgeCollectionStatus graphQLXWA2AgeCollectionStatus, C30391dr r4) {
        super(2, r4);
        this.$ageCollectionStatus = graphQLXWA2AgeCollectionStatus;
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AgeCollectionNotificationHandler$handleNotification$1$1(this.this$0, this.$ageCollectionStatus, r5);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            DosaRepository dosaRepository = this.this$0.A00;
            GraphQLXWA2AgeCollectionStatus graphQLXWA2AgeCollectionStatus = this.$ageCollectionStatus;
            this.label = 1;
            GraphQLXWA2AgeCollectionStatus graphQLXWA2AgeCollectionStatus2 = GraphQLXWA2AgeCollectionStatus.COMPLETED;
            if (graphQLXWA2AgeCollectionStatus != graphQLXWA2AgeCollectionStatus2) {
                Log.e("DosaRepository/onNotificationReceived unexpected status through notification");
            }
            C17880vN.A1F(dosaRepository.A02().edit().putBoolean("dob_verified", AnonymousClass000.A1Z(graphQLXWA2AgeCollectionStatus, graphQLXWA2AgeCollectionStatus2)), "age_verification_status_fetched", true);
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AgeCollectionNotificationHandler$handleNotification$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
