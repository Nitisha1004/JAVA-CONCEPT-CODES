package ARRAY;
public class New {
        public static void main(String[] args) {
            
            // Create arrays to store the distances and airfares
            int[] distances = {1000, 300, 600, 1500, 1800, 600, 300};
            int[] airfares = {6000, 2000, 5000, 7000, 8000, 5000, 3000};
            
            // Calculate the means of the distances and airfares
            double distanceMean = getMean(distances);
            double airfareMean = getMean(airfares);
            
            // Calculate the variances of the distances and airfares
            double distanceVariance = getVariance(distances, distanceMean);
            double airfareVariance = getVariance(airfares, airfareMean);
            
            // Calculate the covariance of the distances and airfares
            double covariance = getCovariance(distances, airfares, distanceMean, airfareMean);
            
            // Calculate the slope and y-intercept of the linear regression line
            double slope = covariance / distanceVariance;
            double yIntercept = airfareMean - slope * distanceMean;
            
            // Print the slope and y-intercept with their respective units
            System.out.printf("Slope: %.2f Rs/km\n", slope);
            System.out.printf("Y-intercept: %.2f Rs\n", yIntercept);
            
            // Calculate and print the correlation coefficient (r)
            double r = covariance / (Math.sqrt(distanceVariance) * Math.sqrt(airfareVariance));
            System.out.printf("Correlation coefficient (r): %.2f\n", r);
        }
        
        // Helper method to calculate the mean of an array of integers
        private static double getMean(int[] arr) {
            int sum = 0;
            for (int x : arr) {
                sum += x;
            }
            return (double) sum / arr.length;
        }
        
        // Helper method to calculate the variance of an array of integers
        private static double getVariance(int[] arr, double mean) {
            double sum = 0;
            for (int x : arr) {
                sum += Math.pow(x - mean, 2);
            }
            return sum / (arr.length - 1);
        }
        
        // Helper method to calculate the covariance of two arrays of integers
        private static double getCovariance(int[] arr1, int[] arr2, double mean1, double mean2) {
            double sum = 0;
            for (int i = 0; i < arr1.length; i++) {
                sum += (arr1[i] - mean1) * (arr2[i] - mean2);
            }
            return sum / (arr1.length - 1);
        }
        
    }
    

