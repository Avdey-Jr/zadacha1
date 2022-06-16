public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int costOfOneMile = 20;
        return ticketPrice / costOfOneMile;
    }
}
