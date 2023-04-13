package bridge.after;

import bridge.before.Champion;

public class App {
    public static void main(String[] args) {
        Champion KDA아리 = new 아리(new KDA());
        KDA아리.move();
        KDA아리.skillQ();
        KDA아리.skillW();
        KDA아리.skillE();
        KDA아리.skillR();

        Champion 풀파티아리 = new 아리(new PoolParty());
        풀파티아리.move();
        풀파티아리.skillQ();
        풀파티아리.skillW();
        풀파티아리.skillE();
        풀파티아리.skillR();

        Champion KDA카이사 = new 카이사(new KDA());
        KDA카이사.move();
        KDA카이사.skillQ();
        KDA카이사.skillW();
        KDA카이사.skillE();
        KDA카이사.skillR();

        Champion 풀파티카이사 = new 카이사(new PoolParty());
        풀파티카이사.move();
        풀파티카이사.skillQ();
        풀파티카이사.skillW();
        풀파티카이사.skillE();
        풀파티카이사.skillR();

    }
}
