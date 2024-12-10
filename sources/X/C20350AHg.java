package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.AHg  reason: case insensitive filesystem */
public class C20350AHg implements C22398B6b {
    public static final String A05 = A5Z.A01("CommandHandler");
    public final Context A00;
    public final AnonymousClass9u6 A01;
    public final Object A02 = C17880vN.A0p();
    public final Map A03 = C17880vN.A11();
    public final E0T A04;

    public static void A00(Intent intent, C193279pp r3) {
        intent.putExtra("KEY_WORKSPEC_ID", r3.A01);
        intent.putExtra("KEY_WORKSPEC_GENERATION", r3.A00);
    }

    public void BtY(C193279pp r8, boolean z) {
        synchronized (this.A02) {
            C20358AHo aHo = (C20358AHo) this.A03.remove(r8);
            this.A01.A00(r8);
            if (aHo != null) {
                A5Z A002 = A5Z.A00();
                String str = C20358AHo.A0E;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("onExecuted ");
                C193279pp r2 = aHo.A08;
                A10.append(r2);
                A002.A03(str, C17900vP.A0D(", ", A10, z));
                C20358AHo.A00(aHo);
                if (z) {
                    Intent A07 = AnonymousClass8BR.A07(aHo.A04, SystemAlarmService.class);
                    A07.setAction("ACTION_SCHEDULE_WORK");
                    A00(A07, r2);
                    C21470Akb.A00(aHo.A06, A07, aHo.A09, aHo.A03, 5);
                }
                if (aHo.A02) {
                    Intent A072 = AnonymousClass8BR.A07(aHo.A04, SystemAlarmService.class);
                    A072.setAction("ACTION_CONSTRAINTS_CHANGED");
                    C21470Akb.A00(aHo.A06, A072, aHo.A09, aHo.A03, 5);
                }
            }
        }
    }

    public C20350AHg(Context context, E0T e0t, AnonymousClass9u6 r4) {
        this.A00 = context;
        this.A04 = e0t;
        this.A01 = r4;
    }

    public void A01(Intent intent, C20351AHh aHh, int i) {
        List<AnonymousClass9UL> list;
        Executor executor;
        int i2;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            AnonymousClass8BX.A12(A5Z.A00(), intent, "Handling constraints changed ", A05, AnonymousClass000.A10());
            Context context = this.A00;
            A7W a7w = aHh.A06;
            C189179ie r7 = new C189179ie(a7w.A09);
            ArrayList BYc = a7w.A04.A0E().BYc();
            Iterator it = BYc.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                C20078A6e a6e = ((A2t) it.next()).A0B;
                z |= a6e.A01;
                z2 |= a6e.A02;
                z3 |= a6e.A04;
                z4 |= AnonymousClass3Ma.A1Z(a6e.A00, AnonymousClass00R.A00);
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            Intent A0G = C108945cZ.A0G("androidx.work.impl.background.systemalarm.UpdateProxies");
            A0G.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
            A0G.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(A0G);
            ArrayList A0g = C108975cc.A0g(BYc);
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = BYc.iterator();
            while (it2.hasNext()) {
                A2t a2t = (A2t) it2.next();
                if (currentTimeMillis >= a2t.A00() && (!AnonymousClass8BR.A1T(C20078A6e.A08, a2t.A0B) || r7.A00(a2t))) {
                    A0g.add(a2t);
                }
            }
            Iterator it3 = A0g.iterator();
            while (it3.hasNext()) {
                A2t a2t2 = (A2t) it3.next();
                String str = a2t2.A0M;
                C193279pp A002 = AnonymousClass9OL.A00(a2t2);
                Intent A07 = AnonymousClass8BR.A07(context, SystemAlarmService.class);
                A07.setAction("ACTION_DELAY_MET");
                A00(A07, A002);
                A5Z A003 = A5Z.A00();
                String str2 = C182009Ss.A00;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Creating a delay_met command for workSpec with id (");
                A10.append(str);
                AnonymousClass8BW.A16(A003, ")", str2, A10);
                C21470Akb.A00(aHh, A07, ((C20367AHx) aHh.A09).A02, i, 5);
            }
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            A5Z A004 = A5Z.A00();
            String str3 = A05;
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Handling reschedule ");
            A102.append(intent);
            A004.A03(str3, AnonymousClass001.A1I(", ", A102, i));
            aHh.A06.A06();
        } else {
            Bundle extras = intent.getExtras();
            String[] A1Y = C17880vN.A1Y();
            A1Y[0] = "KEY_WORKSPEC_ID";
            if (extras == null || extras.isEmpty() || extras.get(A1Y[0]) == null) {
                A5Z A005 = A5Z.A00();
                String str4 = A05;
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append("Invalid request for ");
                A103.append(action);
                A103.append(" , requires ");
                A103.append("KEY_WORKSPEC_ID");
                A005.A04(str4, AnonymousClass000.A0y(" .", A103));
            } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                C193279pp r6 = new C193279pp(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                A5Z A006 = A5Z.A00();
                String str5 = A05;
                AnonymousClass8BX.A12(A006, r6, "Handling schedule work for ", str5, AnonymousClass000.A10());
                WorkDatabase workDatabase = aHh.A06.A04;
                workDatabase.A07();
                try {
                    A2t Bbs = workDatabase.A0E().Bbs(r6.A01);
                    if (Bbs == null) {
                        A5Z A007 = A5Z.A00();
                        StringBuilder A11 = AnonymousClass000.A11("Skipping scheduling ");
                        A11.append(r6);
                        A007.A06(str5, AnonymousClass000.A0y(" because it's no longer in the DB", A11));
                    } else if (C196349ut.A01(Bbs.A0G)) {
                        A5Z A008 = A5Z.A00();
                        StringBuilder A112 = AnonymousClass000.A11("Skipping scheduling ");
                        A112.append(r6);
                        A008.A06(str5, AnonymousClass000.A0y("because it is finished.", A112));
                    } else {
                        long A009 = Bbs.A00();
                        if (!AnonymousClass8BR.A1T(C20078A6e.A08, Bbs.A0B)) {
                            A5Z A0010 = A5Z.A00();
                            StringBuilder A104 = AnonymousClass000.A10();
                            A104.append("Setting up Alarms for ");
                            A104.append(r6);
                            A0010.A03(str5, C17890vO.A0a("at ", A104, A009));
                            C20090A6s.A01(this.A00, workDatabase, r6, A009);
                        } else {
                            A5Z A0011 = A5Z.A00();
                            StringBuilder A105 = AnonymousClass000.A10();
                            A105.append("Opportunistically setting an alarm for ");
                            A105.append(r6);
                            A0011.A03(str5, C17890vO.A0a("at ", A105, A009));
                            Context context2 = this.A00;
                            C20090A6s.A01(context2, workDatabase, r6, A009);
                            Intent A072 = AnonymousClass8BR.A07(context2, SystemAlarmService.class);
                            A072.setAction("ACTION_CONSTRAINTS_CHANGED");
                            C21470Akb.A00(aHh, A072, ((C20367AHx) aHh.A09).A02, i, 5);
                        }
                        workDatabase.A08();
                    }
                } finally {
                    C20076A6c.A02(workDatabase);
                }
            } else if ("ACTION_DELAY_MET".equals(action)) {
                synchronized (this.A02) {
                    C193279pp r5 = new C193279pp(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                    A5Z A0012 = A5Z.A00();
                    String str6 = A05;
                    AnonymousClass8BX.A12(A0012, r5, "Handing delay met for ", str6, AnonymousClass000.A10());
                    Map map = this.A03;
                    if (!map.containsKey(r5)) {
                        C20358AHo aHo = new C20358AHo(this.A00, this.A01.A01(r5), aHh, i);
                        map.put(r5, aHo);
                        String str7 = aHo.A08.A01;
                        Context context3 = aHo.A04;
                        StringBuilder A113 = AnonymousClass000.A11(str7);
                        A113.append(" (");
                        A113.append(aHo.A03);
                        aHo.A01 = C197059w5.A00(context3, AnonymousClass8BU.A0q(A113));
                        A5Z A0013 = A5Z.A00();
                        String str8 = C20358AHo.A0E;
                        StringBuilder A106 = AnonymousClass000.A10();
                        A106.append("Acquiring wakelock ");
                        A106.append(aHo.A01);
                        A106.append("for WorkSpec ");
                        AnonymousClass8BW.A16(A0013, str7, str8, A106);
                        aHo.A01.acquire();
                        A2t Bbs2 = aHo.A06.A06.A04.A0E().Bbs(str7);
                        if (Bbs2 == null) {
                            executor = aHo.A0A;
                            i2 = 21;
                        } else {
                            boolean A1T = AnonymousClass8BR.A1T(C20078A6e.A08, Bbs2.A0B);
                            aHo.A02 = A1T;
                            if (!A1T) {
                                A5Z A0014 = A5Z.A00();
                                StringBuilder A107 = AnonymousClass000.A10();
                                A107.append("No constraints for ");
                                AnonymousClass8BW.A16(A0014, str7, str8, A107);
                                executor = aHo.A0A;
                                i2 = 22;
                            } else {
                                aHo.A0D = C197029w2.A00(aHo, aHo.A07, Bbs2, aHo.A0B);
                            }
                        }
                        executor.execute(new C21466AkX((Object) aHo, i2));
                    } else {
                        A5Z A0015 = A5Z.A00();
                        StringBuilder A108 = AnonymousClass000.A10();
                        A108.append("WorkSpec ");
                        A108.append(r5);
                        AnonymousClass8BW.A16(A0015, " is is already being handled for ACTION_DELAY_MET", str6, A108);
                    }
                }
            } else if ("ACTION_STOP_WORK".equals(action)) {
                Bundle extras2 = intent.getExtras();
                String string = extras2.getString("KEY_WORKSPEC_ID");
                if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                    int i3 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                    ArrayList A0z = AnonymousClass8BT.A0z();
                    AnonymousClass9UL A0016 = this.A01.A00(new C193279pp(string, i3));
                    list = A0z;
                    if (A0016 != null) {
                        A0z.add(A0016);
                        list = A0z;
                    }
                } else {
                    list = this.A01.A02(string);
                }
                for (AnonymousClass9UL r4 : list) {
                    A5Z A0017 = A5Z.A00();
                    String str9 = A05;
                    StringBuilder A109 = AnonymousClass000.A10();
                    A109.append("Handing stopWork work for ");
                    AnonymousClass8BW.A16(A0017, string, str9, A109);
                    C22399B6c b6c = aHh.A05;
                    C18070vi.A0d(r4, 1);
                    b6c.COf(r4, -512);
                    Context context4 = this.A00;
                    WorkDatabase workDatabase2 = aHh.A06.A04;
                    C193279pp r72 = r4.A00;
                    BA3 A0B = workDatabase2.A0B();
                    C194169rH Ba3 = A0B.Ba3(r72);
                    if (Ba3 != null) {
                        C20090A6s.A02(context4, r72, Ba3.A01);
                        A5Z A0018 = A5Z.A00();
                        String str10 = C20090A6s.A00;
                        StringBuilder A1010 = AnonymousClass000.A10();
                        A1010.append("Removing SystemIdInfo for workSpecId (");
                        A1010.append(r72);
                        AnonymousClass8BW.A16(A0018, ")", str10, A1010);
                        String str11 = r72.A01;
                        int i4 = r72.A00;
                        C20362AHs aHs = (C20362AHs) A0B;
                        C20076A6c a6c = aHs.A00;
                        a6c.A06();
                        C19955A0m a0m = aHs.A01;
                        BDc A012 = a0m.A01();
                        A012.BDB(1, str11);
                        A012.BD9(2, (long) i4);
                        a6c.A07();
                        try {
                            AHW.A00(a6c, A012);
                        } finally {
                            C20076A6c.A02(a6c);
                            a0m.A02(A012);
                        }
                    }
                    aHh.BtY(r72, false);
                }
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                C193279pp r52 = new C193279pp(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                A5Z A0019 = A5Z.A00();
                String str12 = A05;
                StringBuilder A1011 = AnonymousClass000.A10();
                A1011.append("Handling onExecutionCompleted ");
                A1011.append(intent);
                A0019.A03(str12, AnonymousClass001.A1I(", ", A1011, i));
                BtY(r52, z5);
            } else {
                A5Z.A00().A06(A05, AnonymousClass001.A1E(intent, "Ignoring intent ", AnonymousClass000.A10()));
            }
        }
    }
}
