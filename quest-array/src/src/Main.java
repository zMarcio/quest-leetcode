import src.ExclusiveTime;

void main() {
    int n = 2;
    ArrayList<String> logs = new ArrayList<>(Arrays.asList("0:start:0","1:start:2","1:end:5","0:end:6"));
//    ArrayList<String> logs = new ArrayList<>(Arrays.asList("0:start:0","0:start:2","0:end:5","0:start:6","0:end:6","0:end:7"));

    ExclusiveTime teste = new ExclusiveTime();
    teste.exclusiveTime(n , logs);
}