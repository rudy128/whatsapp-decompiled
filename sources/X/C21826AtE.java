package X;

import android.content.Context;
import androidx.work.impl.WorkDatabase;

/* renamed from: X.AtE  reason: case insensitive filesystem */
public final /* synthetic */ class C21826AtE extends AnonymousClass1JJ implements AnonymousClass20I {
    public static final C21826AtE A00 = new C21826AtE();

    public C21826AtE() {
        super(6, C180149Li.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        AnonymousClass00I r5 = (AnonymousClass00I) obj2;
        C71973Kb r9 = (C71973Kb) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        C186369e5 r8 = (C186369e5) obj5;
        C20359AHp aHp = (C20359AHp) obj6;
        C18070vi.A0d(context, 0);
        C18070vi.A0w(r5, r9, workDatabase, r8, aHp);
        C22531BBo[] bBoArr = new C22531BBo[2];
        bBoArr[0] = C20066A5p.A00(context, r5, workDatabase);
        return C18070vi.A0O(new C20355AHl(context, r5, aHp, new C20356AHm(aHp, r9), r8, r9), bBoArr, 1);
    }
}
