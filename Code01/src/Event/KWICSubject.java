package Event;

/**
 * className:       KWICSubject
 * author:          wenhao2002
 * date:            2023/10/30 19:53
 */
public class KWICSubject extends Subject {
    public void startKWIC(){
        for (int i = 0;i<=3;i++){
            super.notifyOneObserver(i);
        }
    }
}

