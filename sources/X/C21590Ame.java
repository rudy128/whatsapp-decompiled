package X;

import android.os.ConditionVariable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.Ame  reason: case insensitive filesystem */
public class C21590Ame extends Thread {
    public final ConditionVariable A00 = new ConditionVariable(true);
    public final /* synthetic */ A1G A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21590Ame(A1G a1g) {
        super("ReadyJobsProducer");
        this.A01 = a1g;
    }

    public void run() {
        boolean z;
        Job job;
        while (true) {
            ConditionVariable conditionVariable = this.A00;
            conditionVariable.block();
            conditionVariable.close();
            A1G a1g = this.A01;
            synchronized (a1g) {
                LinkedList linkedList = a1g.A01;
                z = false;
                job = null;
                if (!linkedList.isEmpty()) {
                    ListIterator listIterator = linkedList.listIterator();
                    HashMap A11 = C17880vN.A11();
                    while (true) {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        Job job2 = (Job) listIterator.next();
                        String str = job2.parameters.groupId;
                        if ((str == null || !a1g.A03.contains(str)) && job2.A0B()) {
                            if (a1g.A06 && !TextUtils.isEmpty(job2.parameters.groupId) && A11.containsKey(job2.parameters.groupId)) {
                                Job job3 = (Job) A11.get(job2.parameters.groupId);
                                if (job3.A0B()) {
                                    AnonymousClass9WO r0 = a1g.A00;
                                    if (r0 != null) {
                                        r0.A00.A01.A0G("JobQueue/DeterministicJobSelection/Fixed", (String) null, false);
                                    }
                                    while (listIterator.hasPrevious() && listIterator.previous() != job3) {
                                    }
                                    A11.remove(job2.parameters.groupId);
                                    job2 = job3;
                                } else if (a1g.A00 != null) {
                                    Log.e("JobQueue/DeterministicJobSelection/Broken");
                                }
                            }
                            listIterator.remove();
                            String str2 = job2.parameters.groupId;
                            if (str2 != null) {
                                a1g.A03.add(str2);
                                int A012 = a1g.A01(str2);
                                if (A012 != 0) {
                                    if (A012 == 1) {
                                        a1g.A02.remove(str2);
                                    } else {
                                        C17880vN.A1P(str2, a1g.A02, A012 - 1);
                                    }
                                }
                            }
                            if (!a1g.A04.offer(job2)) {
                                z = listIterator.hasNext();
                                job = job2;
                                break;
                            }
                        } else if (a1g.A06 && !TextUtils.isEmpty(job2.parameters.groupId) && !A11.containsKey(job2.parameters.groupId)) {
                            A11.put(job2.parameters.groupId, job2);
                        }
                    }
                }
            }
            if (job != null) {
                if (z) {
                    conditionVariable.open();
                }
                try {
                    a1g.A04.put(job);
                } catch (InterruptedException unused) {
                }
            }
        }
    }
}
