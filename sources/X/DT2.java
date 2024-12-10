package X;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DT2 implements Runnable {
    public final /* synthetic */ C26697D9v A00;
    public final /* synthetic */ Path A01;

    public DT2(C26697D9v d9v, Path path) {
        this.A00 = d9v;
        this.A01 = path;
    }

    public void run() {
        try {
            Files.delete(this.A01);
        } catch (IOException unused) {
        }
    }
}
