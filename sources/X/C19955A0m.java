package X;

import android.database.sqlite.SQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.A0m  reason: case insensitive filesystem */
public abstract class C19955A0m {
    public final C20076A6c A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C21828AtG(this));
    public final AtomicBoolean A02 = C108965cb.A0w();

    public void A02(BDc bDc) {
        C18070vi.A0d(bDc, 0);
        if (bDc == this.A01.getValue()) {
            this.A02.set(false);
        }
    }

    public static final C162128Jb A00(C19955A0m a0m) {
        String str;
        if (!(a0m instanceof AnonymousClass8JH)) {
            switch (((AnonymousClass8JE) a0m).A00) {
                case 0:
                    str = "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
                    break;
                case 1:
                    str = "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
                    break;
                case 2:
                    str = "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
                    break;
                case 3:
                    str = "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
                    break;
                case 4:
                    str = "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
                    break;
                case 5:
                    str = "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    break;
                default:
                    str = "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
                    break;
            }
        } else {
            switch (((AnonymousClass8JH) a0m).A00) {
                case 0:
                    str = "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
                    break;
                case 1:
                    str = "DELETE FROM SystemIdInfo where work_spec_id=?";
                    break;
                case 2:
                    str = "DELETE from WorkProgress where work_spec_id=?";
                    break;
                case 3:
                    str = "DELETE FROM WorkProgress";
                    break;
                case 4:
                    str = "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
                    break;
                case 5:
                    str = "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
                    break;
                case 6:
                    str = "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
                    break;
                case 7:
                    str = "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
                    break;
                case 8:
                    str = "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
                    break;
                case 9:
                    str = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
                    break;
                case 10:
                    str = "UPDATE workspec SET generation=generation+1 WHERE id=?";
                    break;
                case 11:
                    str = "UPDATE workspec SET stop_reason=? WHERE id=?";
                    break;
                case 12:
                    str = "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
                    break;
                case 13:
                    str = "DELETE FROM workspec WHERE id=?";
                    break;
                case 14:
                    str = "UPDATE workspec SET state=? WHERE id=?";
                    break;
                case 15:
                    str = "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
                    break;
                case 16:
                    str = "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
                    break;
                case 17:
                    str = "UPDATE workspec SET output=? WHERE id=?";
                    break;
                case 18:
                    str = "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
                    break;
                case 19:
                    str = "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
                    break;
                default:
                    str = "DELETE FROM worktag WHERE work_spec_id=?";
                    break;
            }
        }
        C20076A6c a6c = a0m.A00;
        a6c.A05();
        a6c.A06();
        SQLiteStatement compileStatement = C20076A6c.A00(a6c).compileStatement(str);
        C18070vi.A0X(compileStatement);
        return new C162128Jb(compileStatement);
    }

    public BDc A01() {
        this.A00.A05();
        if (AnonymousClass8BV.A1Z(this.A02)) {
            return (BDc) this.A01.getValue();
        }
        return A00(this);
    }

    public C19955A0m(C20076A6c a6c) {
        this.A00 = a6c;
    }
}
